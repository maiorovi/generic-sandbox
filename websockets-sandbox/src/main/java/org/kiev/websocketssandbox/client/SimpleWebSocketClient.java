package org.kiev.websocketssandbox.client;


import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

public class SimpleWebSocketClient extends WebSocketClient {
    public SimpleWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    public static void main(String[] args) throws URISyntaxException {
        WebSocketClient client = new SimpleWebSocketClient(new URI("ws://localhost:8080/marco"));
        client.connect();
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        send("Hello, it is me. Mario :)");
        System.out.println("new connection opened");
    }

    @Override
    public void onMessage(String message) {
        System.out.println("received message: " + message);
        send("Hello, it is me. Mario :)");
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {

    }

    @Override
    public void onError(Exception ex) {
        System.err.println("an error occurred:" + ex);
    }
}
