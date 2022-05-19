import java.awt.*;

class Gui extends Thread {
    Label l;
    boolean flag = true;

    public Gui() {

        Frame f = new Frame();

        f.setTitle("Thread Demo");
        f.setSize(300, 300);

        l = new Label("Welcome");
        f.add(l);

        f.setVisible(true);
    }

    public void run() {
        if(flag == true) {
            l.setVisible(true);
            flag = false;
        }
        else {
            if(flag == false) {
                l.setVisible(false);
                flag = true;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run();
    }
}


public class guithreaddemo {
    public static void main(String[] args) {
        Gui gui1 = new Gui();
        gui1.start();
    }
}