package carrentalmanagement.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        System.out.println("starting form server...");
        new Server().start();
    }

    private void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(9000);

            while(true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(socket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
