import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Handler implements URLHandler {
    String message = "";

    public String handleRequest(URI url) throws IOException {
        String query = url.getQuery();
        if (url.getPath().contains("/add-message")) {
            if (query.startsWith("s=")) {
                String toAdd = query.split("=")[1];
                this.message.add(toAdd);
                return String.format(message + "\n");
            }
        }
        else {
            return "/add-message requires a query parameter s\n";
        }
    }
}

class StringServer {
  public static void main(String[] args) throws IOException {
    if(args.length == 0){
      System.out.println("Missing port number! Try any number between 1024 to 49151");
      return;
    }
    if(args.length == 1){
      System.out.println("Missing file path! Give a path to a text file as the second argument.");
      return;
    }

    int port = Integer.parseInt(args[0]);

    Server.start(port, new StringHandler(args[1]));
  }
}