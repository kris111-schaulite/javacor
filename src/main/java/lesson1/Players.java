package lesson1;

public class Players {
    private final String name;
    private final String country;
    private final int canRun;
    private final int canSwim;

    private boolean passed;

    public Players(String name, String country, int canSwim, int canRun) {
        this.name = name;
        this.country = country;
        this.canSwim = canSwim;
        this.canRun = canRun;
        this.passed = true;
    }

    public String printPlayerInfo() {
        return "Name: " + name + ", Country: " + country + "\nCan swim: " + canSwim + " м, " + "Can run: " + canRun + " м";
    }

    public static void swimming(Players player, int swimDistance) {
        if (player.canSwim >= swimDistance) {
            System.out.println("Swimming: " + player.name + " win!");
        } else {
            System.out.println("Swimming: " + player.name + " didn't swim to the finish line.");
            player.setPassed(false);
        }
    }

    public static void running(Players player, int runDistance) {
        if (player.canRun >= runDistance) {
            System.out.println("Running: " + player.name + " win!");
        } else {
            System.out.println("Running: " + player.name + " didn't run to the finish line.");
            player.setPassed(false);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
