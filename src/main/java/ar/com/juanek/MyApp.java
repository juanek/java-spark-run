package ar.com.juanek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.get;


public class MyApp {
    private static final Logger LOG = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
