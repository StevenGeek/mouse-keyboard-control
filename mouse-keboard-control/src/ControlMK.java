import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlMK {
    public static void main(String[] args) throws AWTException, ParseException, InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date date = simpleDateFormat.parse("2017-03-17 15:19:30:00");
        Thread.sleep(3000);
        while (true) {
            Thread.sleep(50);
            if (date.before(new Date())) {
                break;
            }
        }
        System.out.println("Start at    " + simpleDateFormat.format(new Date()));
        Robot robot = new Robot();
        System.out.println("left press at  " + simpleDateFormat.format(new Date()));
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(3500);
        System.out.println("left release at    " + simpleDateFormat.format(new Date()));
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        System.out.println("End at  " + simpleDateFormat.format(new Date()));
    }

}
