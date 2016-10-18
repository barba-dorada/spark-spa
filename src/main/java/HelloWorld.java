import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");
        System.out.println("http://localhost:4567/hello");
        System.out.println("http://localhost:4567");
    }
}