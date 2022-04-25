package dongho;

import javax.swing.*;

import java.awt.FlowLayout;
import java.text.*;
import java.util.*;

class DigitalWatch implements Runnable {

  JFrame f;
  Thread t = null;
  String timeString = "";
  JButton b;
  JButton b2;

  DigitalWatch() {
    f = new JFrame();

    t = new Thread(this);
    t.start();

    b = new JButton();
    b2 = new JButton();
    b.setBounds(100, 100, 100, 50);
    b2.setBounds(50, 200, 100, 100);

    f.add(b);
    f.add(b2);
    f.setSize(300, 400);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
  }

  public void run() {
    try {
      while (true) {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        timeString = formatter.format(new Date());

        printTime();

        t.sleep(1000);  // interval given in milliseconds  
      }
    } catch (Exception e) {
    	
    }
  }

  public void printTime() {
    b.setText(timeString);
    b2.setText(timeString);
  }
}

public class Main {
	public static void main(String[] args) {
		new DigitalWatch();
		new DigitalWatch();
	}	
}
