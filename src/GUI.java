import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JLabel label;
    JLabel label2;
    JLabel cost2;
    JLabel cost4;
    JLabel cost5;
    JLabel cost6;
    JLabel cost7;
    JLabel cost8;
    JLabel cost9;
    JLabel cost10;
    JLabel cost11;
    JLabel cost12;
    JLabel cost13;
    JButton cookieButton;
    JButton upgradeButton2;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    JButton upgradeButton8;
    JButton upgradeButton9;
    JButton upgradeButton10;
    JButton upgradeButton11;
    JButton upgradeButton12;
    JButton upgradeButton13;
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
        label.setForeground(Color.WHITE);
    label2 = new JLabel("Combo: " + cookies.combo + " X " + cookies.comboMultiplier);
        label2.setForeground(Color.WHITE);
    cost2 = new JLabel("SLOW COOK COST: " + cookies.upgrade2Cost);
        cost2.setForeground(Color.WHITE);
    cost4 = new JLabel("HEISENBERG COOKIE COOK COST:"+ cookies.upgrade4Cost);
        cost4.setForeground(Color.WHITE);
    cost5 = new JLabel("DINO CLICK COST:" + cookies.upgrade5Cost);
        cost5.setForeground(Color.WHITE);
    cost6 = new JLabel("SUPER CLICK COST:" + cookies.upgrade6Cost);
        cost6.setForeground(Color.WHITE);
    cost7 = new JLabel("COOKIE MONSTER CLICK COST:" + cookies.upgrade7Cost);
        cost7.setForeground(Color.WHITE);
    cost8 = new JLabel("GORDON RAMSAY'S OVEN COOK COST:" + cookies.upgrade8Cost);
        cost8.setForeground(Color.WHITE);
    cost9 = new JLabel("SHREK CLICK COST" + cookies.upgrade9Cost);
        cost9.setForeground(Color.WHITE);
    cost10 = new JLabel("SPONGEBOB SQUARPANTS KRABBY COOKIE COOK COST:" + cookies.upgrade10Cost);
        cost10.setForeground(Color.WHITE);
    cost11 = new JLabel("UPGRADE DISCOUNT COST:" + cookies.upgrade11Cost);
        cost11.setForeground(Color.WHITE);
    cost12 = new JLabel("COOKIE CASINO COST: " + cookies.upgrade12Cost);
        cost12.setForeground(Color.WHITE);
    cost13 = new JLabel("FINAL BOSS COST: " + cookies.upgrade13Cost) ;
        cost13.setForeground(Color.WHITE);

    ImageIcon cookieIcon = new ImageIcon("src/Images/ccookie.gif");
    cookieButton = new JButton(cookieIcon);
        cookieButton.setBorderPainted(false);
        cookieButton.setContentAreaFilled(false);
        cookieButton.setFocusPainted(false);

        ImageIcon slowIcon = new ImageIcon("src/Images/cook.jpg");
        Image scaledSlow = slowIcon.getImage().getScaledInstance(460,80, Image.SCALE_SMOOTH);
        slowIcon = new ImageIcon(scaledSlow);
    upgradeButton2 = new JButton("SLOW COOK", slowIcon);
        upgradeButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton2.setVerticalTextPosition(SwingConstants.CENTER);
        upgradeButton2.setForeground(Color.WHITE);

        ImageIcon walterWhiteIcon = new ImageIcon("src/Images/white.jpg");
        Image scaledW = walterWhiteIcon.getImage().getScaledInstance(460,120, Image.SCALE_SMOOTH);
            walterWhiteIcon = new ImageIcon(scaledW);
            upgradeButton4 = new JButton("HEISENBERG COOKIE COOK", walterWhiteIcon);
            upgradeButton4.setHorizontalTextPosition(SwingConstants.CENTER);
            upgradeButton4.setVerticalTextPosition(SwingConstants.CENTER);
            upgradeButton4.setForeground(Color.WHITE);

        ImageIcon dinoIcon = new ImageIcon("src/Images/JP.jpg");
        Image scaledDino = dinoIcon.getImage().getScaledInstance(460,130, Image.SCALE_SMOOTH);
            dinoIcon = new ImageIcon(scaledDino);
        upgradeButton5 = new JButton("DINO CLICK", dinoIcon);
        upgradeButton5.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton5.setVerticalTextPosition(SwingConstants.CENTER);
        upgradeButton5.setForeground(new Color(36, 250, 4));

        ImageIcon superIcon = new ImageIcon("src/Images/super.png");
        Image scaledSuper = superIcon.getImage().getScaledInstance(460,70, Image.SCALE_SMOOTH);
            superIcon = new ImageIcon(scaledSuper);
    upgradeButton6 = new JButton("SUPER CLICK", superIcon);
        upgradeButton6.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton6.setVerticalTextPosition(SwingConstants.CENTER);
            upgradeButton6.setForeground(Color.WHITE);

    ImageIcon cookieMonsterIcon = new ImageIcon("src/Images/cookie_monster.jpg");
    Image scaledMonster = cookieMonsterIcon.getImage().getScaledInstance(470,80, Image.SCALE_SMOOTH);
        cookieMonsterIcon = new ImageIcon(scaledMonster);
        upgradeButton7 = new JButton("COOKIE MONSTER CLICK", cookieMonsterIcon);
        upgradeButton7.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton7.setVerticalTextPosition(SwingConstants.CENTER);
        upgradeButton7.setForeground(Color.WHITE);

        ImageIcon gordonIcon = new ImageIcon("src/Images/hells-kitchen.jpg");
        Image scaledGordon = gordonIcon.getImage().getScaledInstance(470,90, Image.SCALE_SMOOTH);
            gordonIcon = new ImageIcon(scaledGordon);
            upgradeButton8 = new JButton("GORDON RAMSAY'S OVEN COOK", gordonIcon);
            upgradeButton8.setHorizontalTextPosition(SwingConstants.CENTER);
            upgradeButton8.setVerticalTextPosition(SwingConstants.CENTER);
            upgradeButton8.setForeground(new Color(241, 3, 3));

            ImageIcon shrekIcon = new ImageIcon("src/Images/shrek.jpg");
        Image scaledShrek = shrekIcon.getImage().getScaledInstance(470,80, Image.SCALE_SMOOTH);
        shrekIcon = new ImageIcon(scaledShrek);
     upgradeButton9 = new JButton("SHREK CLICK", shrekIcon);
        upgradeButton9.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton9.setVerticalTextPosition(SwingConstants.CENTER);
        upgradeButton9.setForeground(Color.WHITE);

        ImageIcon spongebobIcon = new ImageIcon("src/Images/spongebob.jpg");
        Image scaledSpongebob = spongebobIcon.getImage().getScaledInstance(470,100, Image.SCALE_SMOOTH);
        spongebobIcon = new ImageIcon(scaledSpongebob);
        upgradeButton10 = new JButton("SPONGEBOB SQUAREPANTS KRABBY COOKIE COOK", spongebobIcon);
        upgradeButton10.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton10.setVerticalTextPosition(SwingConstants.CENTER);
        upgradeButton10.setForeground(new Color(193, 145, 246));

        ImageIcon moneyIcon = new ImageIcon("src/Images/money.jpg");
    upgradeButton11 = new JButton("UPGRADE DISCOUNT", moneyIcon);
        upgradeButton11.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton11.setVerticalTextPosition(SwingConstants.CENTER);

        ImageIcon casinoIcon = new ImageIcon("src/Images/gold.jfif");
        Image scaledCasino = casinoIcon.getImage().getScaledInstance(470,125, Image.SCALE_SMOOTH);
        casinoIcon = new ImageIcon(scaledCasino);
        upgradeButton12 = new JButton("COOKIE CASINO", casinoIcon);
        upgradeButton12.setHorizontalTextPosition(SwingConstants.CENTER);
        upgradeButton12.setVerticalTextPosition(SwingConstants.CENTER);
        upgradeButton12.setForeground(Color.BLACK);

        ImageIcon bossIcon = new ImageIcon("src/Images/boss.jpg");
        Image scaledBoss = bossIcon.getImage().getScaledInstance(470,125, Image.SCALE_SMOOTH);
        bossIcon = new ImageIcon(scaledBoss);
        upgradeButton13 = new JButton("FINAL BOSS", bossIcon);
            upgradeButton13.setHorizontalTextPosition(SwingConstants.CENTER);
            upgradeButton13.setVerticalTextPosition(SwingConstants.CENTER);
            upgradeButton13.setForeground((Color.WHITE));

        cookieButton.addActionListener( this);
    upgradeButton2.addActionListener(e ->{
            cookies.buyUpgrade2();
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
    upgradeButton11.addActionListener( e -> {
        cookies.buyUpgrade11();
            });
    upgradeButton12.addActionListener(e ->{
        cookies.buyUpgrade12();
    });
    upgradeButton13.addActionListener(e ->{
        cookies.buyUpgrade13();
            });

    guiUpdate = new ActionListener ()  {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("                                                         Cookies: " +cookies.cookieCounter + "    ");
            label2.setText("                                                      Combo: " + cookies.combo + " X " + cookies.comboMultiplier);
            cost2.setText("SLOW COOK COST: " + cookies.upgrade2Cost);
            cost4.setText("HEISENBERG COOKIE COOK COST: " + cookies.upgrade4Cost);
            cost5.setText("DINO CLICK COST: " + cookies.upgrade5Cost);
            cost6.setText("SUPER CLICK COST: " + cookies.upgrade6Cost);
            cost7.setText("COOKIE MONSTER CLICK COST: " + cookies.upgrade7Cost);
            cost8.setText("GORDON RAMSAY'S OVEN COOK COST: " + cookies.upgrade8Cost);
            cost9.setText("SHREK CLICK COST: " + cookies.upgrade9Cost);
            cost10.setText("SPONGEBOB SQUAREPANTS KRABBY COOKIE COOK COST: " + cookies.upgrade10Cost);
            cost11.setText("UPGRADE DISCOUNT COST: " + cookies.upgrade11Cost);
            cost12.setText("COOKIE CASINO COST: " + cookies.upgrade12Cost);
            cost13.setText("FINAL BOSS COST: " + cookies.upgrade13Cost);
            }
        };
        updateTimer = new Timer(500, guiUpdate);// delay, the thing to do
        updateTimer.start();

        panel.setBackground(Color.BLACK);
        panel.setSize(400,400);
        panel2.add(label);
        panel2.add(label2);
        panel.add(cookieButton);
        panel3.add(upgradeButton5);
        panel3.add(cost5);
        panel3.add(upgradeButton2);
        panel3.add(cost2);
        panel3.add(upgradeButton6);
        panel3.add(cost6);
        panel3.add(upgradeButton4);
        panel3.add(cost4);
        panel3.add(upgradeButton7);
        panel3.add(cost7);
        panel3.add(upgradeButton8);
        panel3.add(cost8);
        panel2.add(upgradeButton9);
            panel2.add(cost9);
        panel2.add(upgradeButton10);
            panel2.add(cost10);
        panel2.add(upgradeButton11);
            panel2.add(cost11);
        panel2.add(upgradeButton12);
            panel2.add(cost12);
        panel2.add(upgradeButton13);
            panel2.add(cost13);
    panel2.setBackground(Color.BLACK);
    panel3.setBackground(Color.BLACK);

    frame.add(panel3);
        frame.add(panel);
        frame.add(panel2);

    frame.setSize( 1600, 875);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setLayout(new GridLayout(1,1));
    panel2.setLayout(new GridLayout(12,1));
    panel3.setLayout(new GridLayout(12,1));
    frame.setLayout(new GridLayout(1,3));
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cookies.click();
        cookies.clicker();
        label.setText("                                                         Cookies: "+ cookies.cookieCounter + "    ");
        label2.setText("                                                      Combo: " + cookies.combo + " X " + cookies.comboMultiplier);
    }
}
