public class Client implements Runnable {

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    private boolean done;

   @Override
    public void run (){
       try{
       Socket client = new Socket(host:"127.0.0.1", port:9999);
        out = new PrintWriter(client.getOutputStream(), autoFlush: true);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
      } catch(IOException e){
        
     }
     
   }

  class InputHandler implements Runnable {
  @Override
    public void run(){
     try{
        BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
         while(!done){
            String message = inReader.readline();
               if(message.equals("/quit"))
         }
       } catch(IOException e){}
  }

  }
}
