import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    JFrame frame;// It's a window
    JPanel panel;
    JPanel panel2;// A rectangular region inside
    JPanel panel3;
    JLabel label;
    JLabel label2;
    JLabel cost1;
    JLabel cost2;
    JLabel cost3;
    JLabel cost4;
    JLabel cost5;
    JLabel cost6;
    JLabel cost7;
    JLabel cost8;
    JLabel cost9;
    JLabel cost10;
    JButton cookieButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    JButton upgradeButton8;
    JButton upgradeButton9;
    JButton upgradeButton10;
    int counter = 0;
    Game cookies;
    ActionListener guiUpdate;
    Timer updateTimer;

    public GUI() {
    this.cookies = new Game();
    frame = new JFrame("COOKIE CLICKER");
    panel = new JPanel();
    panel2 = new JPanel();
    panel3 = new JPanel();

    label = new JLabel("Cookies:" +cookies.cookieCounter + "    ");
    label2 = new JLabel("Combo: " + cookies.combo + " X " + cookies.comboMultiplier);
    cost1 = new JLabel("MORE CLICKS: " + cookies.upgrade1Cost);
    cost2 = new JLabel("SLOW COOK COST: " + cookies.upgrade2Cost);
    cost3 = new JLabel("FLAME COOK COST:" + cookies.upgrade3Cost);
    cost4 = new JLabel("HEISENBERG COOKIE COOK COST:"+ cookies.upgrade4Cost);
    cost5 = new JLabel("MEGA CLICK COST:" + cookies.upgrade5Cost);
    cost6 = new JLabel("SUPER CLICK COST:" + cookies.upgrade6Cost);
    cost7 = new JLabel("COOKIE MONSTER CLICK COST:" + cookies.upgrade7Cost);
    cost8 = new JLabel("GORDON RAMSAY'S OVEN COOK COST:" + cookies.upgrade8Cost);
    cost9 = new JLabel("SHREK CLICK COST" + cookies.upgrade9Cost);
    cost10 = new JLabel("SPONGEBOB SQUARPANTS KRABBY COOKIE COOK COST:" + cookies.upgrade10Cost);



    cookieButton = new JButton("COOKIES!");
        cookieButton.setBackground(Color.ORANGE);
    upgradeButton1 = new JButton("MORE CLICKS");
        upgradeButton1.setBackground(new Color(232, 136, 57));
    upgradeButton2 = new JButton("SLOW COOK");
        upgradeButton2.setBackground(Color.yellow);
    upgradeButton3 = new JButton("FLAME COOK");
        upgradeButton3.setBackground(Color.RED);
    upgradeButton4 = new JButton("HEISENBERG COOKIE COOK");
        upgradeButton4.setBackground (new Color(100, 188, 98));
    upgradeButton5 = new JButton("MEGA CLICK");
        upgradeButton5.setBackground(Color.CYAN);
    upgradeButton6 = new JButton("SUPER CLICK");
        upgradeButton6.setBackground(new Color(102, 181, 228));
     upgradeButton7 = new JButton("COOKIE MONSTER CLICK");
        upgradeButton7.setBackground(new Color(91, 116, 241));
     upgradeButton8 = new JButton("GORDON RAMSAY'S OVEN COOK");
        upgradeButton8.setBackground(new Color(248, 201, 78));
     upgradeButton9 = new JButton("SHREK CLICK");
        upgradeButton9.setBackground(Color.GREEN);
    upgradeButton10 = new JButton("SPONGEBOB SQUARPANTS KRABBY COOKIE COOK");
        upgradeButton10.setBackground(new Color(244, 224, 4));
    cookieButton.addActionListener( this);
    upgradeButton1.addActionListener(e -> {
        cookies.buyUpgrade1();
    });
    upgradeButton2.addActionListener(e ->{
            cookies.buyUpgrade2();
    });
    upgradeButton3.addActionListener(e -> {
        cookies.buyUpgrade3();
            });
    upgradeButton4.addActionListener(e ->{
        cookies.buyUpgrade4();
        });
    upgradeButton5.addActionListener(e -> {
        cookies.buyUpgrade5();
            });
    upgradeButton6.addActionListener(e ->{
        cookies.buyUpgrade6();
        });
    upgradeButton7.addActionListener( e -> {
        cookies.buyUpgrade7();
            });
    upgradeButton8.addActionListener(e -> {
        cookies.buyUpgrade8();
            });
    upgradeButton9.addActionListener(e -> {
        cookies.buyUpgrade9();
            });
    upgradeButton10.addActionListener(e ->{
        cookies.buyUpgrade10();
            });
    guiUpdate = new ActionListener ()  {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Cookies: " +cookies.cookieCounter + "    ");
            label2.setText("Combo: " + cookies.combo + " X " + cookies.comboMultiplier);
            cost1.setText("MORE CLICKS COST: " + cookies.upgrade1Cost);
            cost2.setText("SLOW COOK COST: " + cookies.upgrade2Cost);
            cost3.setText("FLAME COOK COST: " + cookies.upgrade3Cost);
            cost4.setText("HEISENBERG COOKIE COOK COST: " + cookies.upgrade4Cost);
            cost5.setText("MEGA CLICK COST: " + cookies.upgrade5Cost);
            cost6.setText("SUPER CLICK COST: " + cookies.upgrade6Cost);
            cost7.setText("COOKIE MONSTER CLICK COST: " + cookies.upgrade7Cost);
            cost8.setText("GORDON RAMSAY'S OVEN COOK COST: " + cookies.upgrade8Cost);
            cost9.setText("SHREK CLICK COST: " + cookies.upgrade9Cost);
            cost10.setText("SPONGEBOB SQUAREPANTS KRABBY COOKIE COOK COST: " + cookies.upgrade10Cost);
            }
        };
        updateTimer = new Timer(500, guiUpdate);// delay, the thing to do
        updateTimer.start();



    //first need to add the label to the panel
        // each element needs to be added to our panel after creating
   //PROPERTIES


        panel.setSize(400,400);
    panel.add(cookieButton);
    panel.setLayout(new GridLayout(2,3));
    //ADDING STUFF
    panel2.add(upgradeButton1);
            panel2.add(cost1);
        panel2.add(upgradeButton2);
           panel2.add(cost2);
        panel2.add(upgradeButton5);
            panel2.add(cost5);
        panel2.add(upgradeButton3);
            panel2.add(cost3);
        panel2.add(upgradeButton6);
            panel2.add(cost6);
        panel2.add(upgradeButton4);
            panel2.add(cost4);
        panel2.add(upgradeButton7);
            panel2.add(cost7);
        panel2.add(upgradeButton8);
            panel2.add(cost8);
        panel2.add(upgradeButton9);
            panel2.add(cost9);
        panel2.add(upgradeButton10);
            panel2.add(cost10);
        panel3.add(label);
        panel3.add(label2);
    panel.setBackground(Color.GREEN);
    panel2.setBackground(Color.lightGray);
    panel3.setBackground(Color.lightGray);

    //next, we add the panel to the frame
    frame.add(panel3);
        frame.add(panel);
        frame.add(panel2);

    frame.setSize( 1600, 875);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setLayout(new GridLayout(1,1));
    panel2.setLayout(new GridLayout(20,1));
    frame.setLayout(new GridLayout(1,3));
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cookies.click();
        cookies.clicker();
        label.setText("Cookies: "+ cookies.cookieCounter + "    ");
        label2.setText("Combo: " + cookies.combo + " X " + cookies.comboMultiplier);
    }
}

/*
TODO:
Change the button colors DONE
Add 5-10 more upgrades (you'll need to change your grid) DONE
They need to be unique and do different things DONE

BONUS POINTS**
Change your buttons to a cookie image or some other image
 */