import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String message = "";

    public String handleRequest(URI url) throws IOException {
        String query = url.getQuery();
        if (url.getPath().contains("/add-message")) {
            if (query.startsWith("s=")) {
                String toAdd = query.substring(2);
                message += "\n" + toAdd;
                return message;
            }
            else {
              return "/add-message requires a query parameter s\n";
            }
        }
        else {
            return "invalid";
        }
    }
}

class StringServer {
  public static void main(String[] args) throws IOException {
    if(args.length == 0){
      System.out.println("Missing port number! Try any number between 1024 to 49151");
      return;
    }

    int port = Integer.parseInt(args[0]);

    Server.start(port, new Handler());
  }
}