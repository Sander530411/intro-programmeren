import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 200, 200);
    }

    public void run() {

        System.out.println("Hello world!");
    }

}
