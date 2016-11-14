/**
 * Created by b_nop on 11.11.2016.
 */
import java.io.*;
import java.net.*;
public class ClientWork extends Thread{
    Socket cwsocket=null;

    public ClientWork(Socket cwsocket){
        super("ClientWork");
        this.cwsocket=cwsocket;
    }

    public void run(){
        try {
            PrintWriter out = new PrintWriter(cwsocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cwsocket.getInputStream()));

            String serverinput, serveroutput="";

            out.println(serveroutput);

            while ((serverinput = in.readLine()) != null) {
                out.println(serveroutput);
                if (serveroutput.equals("Terminate"))
                    break;
            }
            out.close();
            in.close();
            cwsocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}