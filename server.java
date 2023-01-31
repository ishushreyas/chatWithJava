import java.net.*;
import java.io.*;

public class Server implements Runnable {

      private ArrayList<ConnectionHandler> connections;
  @Override
   public void run() {
      try{
        ServerSocket server= new ServerSocket(port 9999);
        Socket client = server.accept();
        ConnectionHandler handler = new ConnectionHandler(client);
         connections.add(handler);
        } catch(IOException e){
         
         }
    }
       class ConnectionHandler implements Runnable {
           private Socket client;
           private BufferedReader in;
           private PrintWriter out;
           private nickname;
        }
      
        class ConnectionHandler(Socket client) {
            this.client = client;
           }
      @Override
       public void run() {
          try{
            out = new PrintWriter(client.getOutputStream(), autoFlush: true);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out.println("Please enter your name");
            nickname = in.readLine();
            System.out.println(nickname + "connected!");
            String message;
            while((message = in.readLine()) != null){
               if(message.starts with("/nick ")) {
                 String [] messageSplit = message.split(regex:" ", limit: 2);
                 if(messageSplit.length == 2){
                    System.out.println(nickname + "renamed to " + messageSplit[1]);
                     nickname= messageSplit[1];
                    }
                  else{
                     }
                  
            }catch(IOException e){
         
         }
    }

            public void sendMessage(string message){
             System.out.println(message);
           }
    }
 }
