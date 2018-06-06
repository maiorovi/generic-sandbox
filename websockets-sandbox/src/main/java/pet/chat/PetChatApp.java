package pet.chat;

import org.kiev.websocketssandbox.WebsocketsSandboxApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class PetChatApp {

    public static void main(String[] args) {
        SpringApplication.run(PetChatApp.class, args);
    }
}
