import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
    protected double cookieCounter;
    private double cookiesPerClick;
    private double cookiesPerSecond;
    protected double upgrade2Cost;
    protected double upgrade4Cost;
    protected double upgrade5Cost;
    protected double  upgrade6Cost;
    protected double  upgrade7Cost;
    protected double  upgrade8Cost;
    protected double  upgrade9Cost;
    protected double  upgrade10Cost;
    protected double  upgrade11Cost;
    protected double upgrade12Cost;
    protected double upgrade13Cost;
    protected double  combo;
    protected double  comboMultiplier;

    public Game() {
        this.cookieCounter = 0;
        this.cookiesPerClick = 1;
        this.cookiesPerSecond = 0;
        this.upgrade2Cost = 25;
        this.upgrade4Cost = 500;
        this.upgrade5Cost = 15;
        this.upgrade6Cost = 300;
        this.upgrade7Cost = 3000;
        this.upgrade8Cost = 5000;
        this.upgrade9Cost = 15000;
        this.upgrade10Cost = 25000;
        this.upgrade11Cost = 30000;
        this.upgrade12Cost = 45000;
        this.upgrade13Cost = 1000000;
        this.combo = 0;
        this.comboMultiplier = 0;

        Timer timer = new Timer();
        TimerTask slow = new TimerTask() {
            @Override
            public void run() {
                slowCookie();
            }
        };
        timer.schedule(slow, 0, 1000);

    }

    public void slowCookie() {
        this.cookieCounter += cookiesPerSecond;
    }

    public void click() {
        cookieCounter += cookiesPerClick;
    }

    public void buyUpgrade2() {
        if (cookieCounter >= upgrade2Cost) {
            cookieCounter -= upgrade2Cost;
            cookiesPerSecond++;
            upgrade2Cost += cookiesPerSecond;
            upgrade2Cost = upgrade2Cost *5;
        }
    }
    public void buyUpgrade4() {
        if (cookieCounter >= upgrade4Cost) {
            cookieCounter -= upgrade4Cost;
            cookiesPerSecond = cookiesPerSecond * 2;
            upgrade4Cost += cookiesPerSecond;
            upgrade4Cost = upgrade4Cost *5;
        }
    }

    public void buyUpgrade5() {
       if (cookieCounter >= upgrade5Cost) {
           cookieCounter -= upgrade5Cost;
            cookiesPerClick++;
           upgrade5Cost += cookiesPerClick;
           upgrade5Cost = upgrade5Cost *5;
        }
    }

    public void buyUpgrade6() {
        if (cookieCounter >= upgrade6Cost) {
            cookieCounter -= upgrade6Cost;
            cookiesPerClick = cookiesPerClick * 2;
            upgrade6Cost += cookiesPerClick;
            upgrade6Cost = upgrade6Cost *5;
        }
    }

    public void buyUpgrade7() {
        if (cookieCounter >= upgrade7Cost) {
            cookieCounter -= upgrade7Cost;
            cookiesPerClick = cookiesPerClick * 5;
            upgrade7Cost += cookiesPerClick;
            upgrade7Cost = upgrade7Cost *5;
        }
    }

    public void buyUpgrade8() {
        if (cookieCounter >= upgrade8Cost) {
            cookieCounter -= upgrade8Cost;
            cookiesPerSecond = cookiesPerSecond * 5;
            upgrade8Cost += cookiesPerSecond;
            upgrade8Cost = upgrade8Cost *5;
        }
    }

    public void buyUpgrade9() {
        if (cookieCounter >= upgrade9Cost) {
            cookieCounter -= upgrade9Cost;
            cookiesPerClick = cookiesPerClick * 10;
            upgrade9Cost += cookiesPerClick;
            upgrade9Cost = upgrade9Cost *5;
        }
    }

    public void buyUpgrade10() {
        if (cookieCounter >= upgrade10Cost) {
            cookieCounter -= upgrade10Cost;
            cookiesPerSecond = cookiesPerSecond * 10;
            upgrade10Cost += cookiesPerSecond;
            upgrade10Cost = upgrade10Cost *5;
        }
    }
    public void buyUpgrade11() {
        if (cookieCounter >= upgrade11Cost) {
            cookieCounter -= upgrade11Cost;
            upgrade2Cost = upgrade2Cost / 2;
            upgrade4Cost = upgrade4Cost / 2;
            upgrade5Cost = upgrade5Cost / 2;
            upgrade6Cost = upgrade6Cost / 2;
            upgrade7Cost = upgrade7Cost / 2;
            upgrade8Cost = upgrade8Cost / 2;
            upgrade9Cost = upgrade9Cost / 2;
            upgrade10Cost = upgrade10Cost / 2;
            upgrade12Cost = upgrade12Cost /2;
            upgrade11Cost += upgrade4Cost;
            upgrade11Cost = upgrade11Cost *5;
        }
    }
    public void buyUpgrade12(){
        if(cookieCounter >= upgrade12Cost) {
            cookieCounter -= upgrade12Cost;
            cookiesPerSecond = cookiesPerSecond /2;
            upgrade12Cost = upgrade9Cost;
        } else if (cookieCounter >= 90000) {
            cookieCounter -= upgrade12Cost;
            cookieCounter = cookieCounter *2;
            upgrade12Cost = upgrade2Cost;
        } else if (cookieCounter >= 75000) {
            cookieCounter -= upgrade12Cost;
            cookieCounter = cookieCounter *1;
            upgrade12Cost = upgrade10Cost;
        } else if(cookieCounter>=60000) {
            cookieCounter -= upgrade12Cost;
            cookieCounter = cookieCounter /2;
            upgrade12Cost = upgrade2Cost;
        }
    }
    public void buyUpgrade13() {
        if (cookieCounter >= upgrade13Cost) {
           cookieCounter = 0;
            upgrade2Cost = 25;
            upgrade4Cost = 500;
            upgrade5Cost = 15;
            upgrade6Cost = 300;
            upgrade7Cost = 3000;
            upgrade8Cost = 5000;
            upgrade9Cost = 15000;
            upgrade10Cost = 25000;
            upgrade11Cost = 30000;
            upgrade12Cost = 45000;
            upgrade13Cost = 1000000;
            cookiesPerSecond = cookiesPerSecond *15;
            cookiesPerClick = cookiesPerClick * 15;
            upgrade13Cost += upgrade10Cost;
            upgrade13Cost = upgrade13Cost *5;
        }
    }
    public void clicker() {
        combo++;
        if (combo >= 2500) {
            comboMultiplier = 10;
        } else if (combo >= 2250) {
            comboMultiplier = 9;
        } else if (combo >= 2000) {
            comboMultiplier = 8;
        } else if (combo >= 1750) {
            comboMultiplier = 7;
        } else if (combo >= 1500) {
            comboMultiplier = 6;
        } else if (combo >= 1250) {
            comboMultiplier = 5;
        } else if (combo >= 1000) {
            comboMultiplier = 4;
        } else if (combo >= 750) {
            comboMultiplier = 3;
        } else if (combo >= 500) {
            comboMultiplier = 2;
        } else if (combo >= 250) {
            comboMultiplier = 1;
        }
        cookieCounter += comboMultiplier;
    }
}
