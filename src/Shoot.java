import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;
import java.util.RandomAccess;

public class Shoot {
    public void shoot(int[][] data) throws InterruptedException {
        Random random = new Random();
        Thread.sleep(2000);
        Point p  = MouseInfo.getPointerInfo().getLocation();
        System.out.println(p.getX() + "---" +p.getY());
        Robot robot = null;
        try {
            robot = new Robot();

        } catch (AWTException e) {
            e.printStackTrace();
        }
        int width = (int) p.getX();
        int height = (int) p.getY();
        int oldI = 0;
        int oldJ = 0;
        for (int i = 0; i < data.length; i+=1) {
            for (int j = 0; j < data[0].length; j+=1) {
                if(data[i][j] == 1){
                    robot.mouseMove(width+(i-oldI)*25,height+(j-oldJ)*25);
                    Thread.sleep(100);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    oldI = i;
                    oldJ = j;
                    Thread.sleep(100);
                }
            }
        }
    }
}
