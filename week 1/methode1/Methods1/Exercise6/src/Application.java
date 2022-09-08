import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        // 2 horizontal lines
        SaxionApp.drawLine(0, SaxionApp.getHeight()/3, SaxionApp.getWidth(), SaxionApp.getHeight()/3);
        SaxionApp.drawLine(0, (SaxionApp.getHeight()/3)*2, SaxionApp.getWidth(), (SaxionApp.getHeight()/3)*2);

        // 2 vertical lines
        SaxionApp.drawLine(SaxionApp.getWidth()/3, 0, SaxionApp.getWidth()/3, SaxionApp.getHeight());
        SaxionApp.drawLine((SaxionApp.getWidth()/3)*2, 0, (SaxionApp.getWidth()/3)*2, SaxionApp.getHeight());

        // [Optional] Remove the border from the texts
        SaxionApp.setBorderSize(0);

        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        SaxionApp.drawBorderedText("x", 50, 25, SaxionApp.getHeight()/4);
        SaxionApp.drawBorderedText("o", 150, 125, SaxionApp.getHeight()/4);
        SaxionApp.drawBorderedText("x", 250, 225, SaxionApp.getHeight()/4);

        SaxionApp.saveImage("Exercise6/sample_output.png");
    }

}
