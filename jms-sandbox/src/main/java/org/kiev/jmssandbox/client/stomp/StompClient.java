package org.kiev.jmssandbox.client.stomp;

import org.apache.activemq.transport.stomp.Stomp;
import org.apache.activemq.transport.stomp.StompConnection;
import org.apache.activemq.transport.stomp.StompFrame;

public class StompClient {
    public static void main(String[] args) throws Exception {
        final StompConnection connection = new StompConnection();
        connection.open("localhost", 61613);
        connection.connect("system", "manager");

        connection.begin("tx1");
        connection.send("/queue/test", "message1", "tx1", null);
        connection.send("/queue/test", "message2", "tx1", null);
        connection.commit("tx1");

        connection.subscribe("/queue/test", Stomp.Headers.Subscribe.AckModeValues.CLIENT);

        connection.begin("tx2");

        StompFrame message = connection.receive();
        System.out.println(message.getBody());
        System.out.println(message.getAction());
        message.getHeaders().forEach((key, value) -> System.out.println(key +" : "+ value));
        connection.ack(message, "tx2");

        message = connection.receive();
        System.out.println(message.getBody());
        connection.ack(message, "tx2");

        connection.commit("tx2");

        connection.disconnect();

    }
}
