import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    List<String> lines;
    String path;
    StringHandler(String path) throws IOException {
        this.path = path;
        this.lines = Files.readAllLines(Paths.get(path));
    
    
    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                return String.format("\n + parameters[1]");
            }
        }
    }
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}