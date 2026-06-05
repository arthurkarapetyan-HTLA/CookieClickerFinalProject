import java.util.Timer;
import java.util.TimerTask;

public class Game {
    protected int cookieCounter;
    private int cookiesPerClick;
    private int cookiesPerSecond;
    protected int upgrade1Cost;
    protected int upgrade2Cost;
    protected int upgrade3Cost;
    protected int upgrade4Cost;
    protected int upgrade5Cost;
    protected int upgrade6Cost;
    protected int upgrade7Cost;
    protected int upgrade8Cost;
    protected int upgrade9Cost;
    protected int upgrade10Cost;
    protected int combo;
    protected int comboMultiplier;

    public Game() {
        this.cookieCounter = 0;
        this.cookiesPerClick = 1;
        this.cookiesPerSecond = 0;
        this.upgrade1Cost = 15;
        this.upgrade2Cost = 25;
        this.upgrade3Cost = 250;
        this.upgrade4Cost = 500;
        this.upgrade5Cost = 150;
        this.upgrade6Cost = 300;
        this.upgrade7Cost = 3000;
        this.upgrade8Cost = 5000;
        this.upgrade9Cost = 15000;
        this.upgrade10Cost = 25000;
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

    public void buyUpgrade1() {
        if (cookieCounter >= upgrade1Cost) {
            cookieCounter -= upgrade1Cost;
            cookiesPerClick++;
            upgrade1Cost += cookiesPerClick;
        }
    }


    public void buyUpgrade2() {
        if (cookieCounter >= upgrade2Cost) {
            cookieCounter -= upgrade2Cost;
            cookiesPerSecond++;
            upgrade2Cost += cookiesPerSecond;
        }
    }

    public void buyUpgrade3() {
        if (cookieCounter >= upgrade3Cost) {
            cookieCounter -= upgrade3Cost;
            cookiesPerSecond = cookiesPerSecond * 2;
            upgrade3Cost += cookiesPerSecond;
        }
    }

    public void buyUpgrade4() {
        if (cookieCounter >= upgrade4Cost) {
            cookieCounter -= upgrade4Cost;
            cookiesPerSecond = cookiesPerSecond * 5;
            upgrade4Cost += cookiesPerSecond;
        }
    }

    public void buyUpgrade5() {
        if (cookieCounter >= upgrade5Cost) {
            cookieCounter -= upgrade5Cost;
            cookiesPerClick = cookiesPerClick * 2;
            upgrade5Cost += cookiesPerClick;
        }
    }

    public void buyUpgrade6() {
        if (cookieCounter >= upgrade6Cost) {
            cookieCounter -= upgrade6Cost;
            cookiesPerClick = cookiesPerClick * 5;
            upgrade6Cost += cookiesPerClick;
        }
    }

    public void buyUpgrade7() {
        if (cookieCounter >= upgrade7Cost) {
            cookieCounter -= upgrade7Cost;
            cookiesPerClick = cookiesPerClick * 10;
            upgrade7Cost += cookiesPerClick;
        }
    }

    public void buyUpgrade8() {
        if (cookieCounter >= upgrade8Cost) {
            cookieCounter -= upgrade8Cost;
            cookiesPerSecond = cookiesPerSecond * 10;
            upgrade8Cost += cookiesPerSecond;
        }
    }

    public void buyUpgrade9() {
        if (cookieCounter >= upgrade9Cost) {
            cookieCounter -= upgrade9Cost;
            cookiesPerClick = cookiesPerClick * 20;
            upgrade9Cost += cookiesPerClick;
        }
    }

    public void buyUpgrade10() {
        if (cookieCounter >= upgrade10Cost) {
            cookieCounter -= upgrade10Cost;
            cookiesPerSecond = cookiesPerSecond * 20;
            upgrade10Cost += cookiesPerSecond;
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