/**
 * Created by b_nop on 11.11.2016.
 */
import java.io.*;
import java.net.*;
public class Client {

    public static void main(String[] args){
        Socket socket=null;
        PrintWriter out=null;
        BufferedReader in=null;
        BufferedReader userInputStream=null;
        String ip="localhost";
        try{
            socket = new Socket(ip, 9999);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.out.println("Unknown host:" + ip);
            System.exit(1);
        } catch  (IOException e) {
            System.out.println("I can't connect to server...");
            System.exit(1);
        }
        String userInput, fromServer;
        try{
            userInputStream = new BufferedReader(new InputStreamReader(System.in));
            while ((fromServer = in.readLine()) != null) {
                System.out.println("Server: " + fromServer);
                if (fromServer.equals("Exit"))
                    break;

                userInput = userInputStream.readLine();
                if (userInput != null) {
                    System.out.println("> " + userInput);
                    out.println(userInput);
                }
            }

        }catch(IOException e){
            System.out.println("Bad I/O");
            System.exit(1);
        }
        try{
            out.close();
            in.close();
            userInputStream.close();
            socket.close();
            System.out.println("Terminating client...");
        }catch(IOException e){
            System.out.println("Bad I/O");
            System.exit(1);
        }catch(Exception e){
            System.out.println("Bad I/O");
            System.exit(1);
        }
    }
}