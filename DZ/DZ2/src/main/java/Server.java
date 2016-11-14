/**
 * Created by b_nop on 11.11.2016.
 */
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[]args)throws IOException{
        ServerSocket serversocket=null;
        final int port=9999;
        boolean trig=true;
        try{
            System.out.println("Server started");
            serversocket=new ServerSocket(port);
        }catch(IOException e){
            System.out.println("Not listen to port: " + port);
            System.exit(-1);
        }
        while(trig){
            new ClientWork(serversocket.accept()).start();
        }
        System.out.println("Terminating server...");
        serversocket.close();
    }

}

