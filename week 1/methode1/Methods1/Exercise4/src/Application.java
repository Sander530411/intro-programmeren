import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {

        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(100, 100, 20);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(200, 200, 20);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(200, 100, 20);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(100, 200, 20);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(150, 150, 20);

    }

}
