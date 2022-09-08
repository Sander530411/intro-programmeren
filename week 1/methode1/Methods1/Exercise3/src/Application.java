import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {

        SaxionApp.drawLine(100, 100, 200, 100);
        SaxionApp.drawLine(100, 150, 200, 150);
        SaxionApp.drawLine(100, 100, 100, 150);
        SaxionApp.drawLine(200, 100, 200, 150);

        SaxionApp.drawRectangle(120, 120, 20,30);

        SaxionApp.drawLine(100, 100, 150, 75);
        SaxionApp.drawLine(150, 75, 200, 100);

    }

}
