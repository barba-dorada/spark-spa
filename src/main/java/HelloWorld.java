import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        boolean devMode = true;
        if (devMode) {
            String projectDir = ".";//System.getProperty("user.dir");
            String staticDir = "/src/main/resources/public";
            staticFiles.externalLocation(projectDir + staticDir);
        } else {
            staticFiles.location("/public");
        }
        get("/hello", (req, res) -> "Hello World");
        System.out.println("http://localhost:4567/hello");
        System.out.println("http://localhost:4567");
    }
}