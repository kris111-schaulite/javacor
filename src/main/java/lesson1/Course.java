package lesson1;

public class Course {

    private final int run;
    private final int swim;

    public Course(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public void doIt(Team team, int runDistance, int swimDistance) {
        System.out.println("_____________________________________________________________");
        System.out.println("Competitions: swimming distance - " + getSwim() + ", running distance - " + getRun());
        System.out.println("_____________________________________________________________");

        for (int i = 0; i < team.getTeam().length; i++) {
            Players.swimming(team.getTeam()[i], swimDistance);
            Players.running(team.getTeam()[i], runDistance);
        }
        System.out.println();
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

}
