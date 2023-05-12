import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.JLabel;


//Java main class, starting point of the java code
class DigitalClockUsingJava{
    public static void main(String [] args){
       new Window();
    }
}


class Window extends JFrame{
    private JLabel heading;
    private JLabel clocklable;
    private Font font = new Font("", Font.BOLD, 20);

    Window(){
        super.setTitle("Myclock");
        super.setSize(300, 200);
        super.setLocation(300, 50);
        this.GUI();
        this.startclock();

        super.setVisible(true);
    }

    public void GUI(){
        heading = new JLabel(" My Digital clock");
        clocklable = new JLabel("clock");

        heading.setFont(font);
        clocklable.setFont(font);

        this.setLayout(new GridLayout(2,1));

        this.add(heading);
        this.add(clocklable);
    }

    public void startclock(){
        Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // String datetime = new Date().toString();
                // clocklable.setText(datetime);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat(" hh : mm : ss a");
                String datetime = sdf.format(d);

                clocklable.setText(datetime);

               // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        timer.start();
}

}