package lesson1;

public class Team {
    private final String teamName;
    private final Players[] team;

    public Team(String teamName, Players[] team) {
        this.teamName = teamName;
        this.team = team;
    }

    public void showResults() {
        System.out.println("_______________");
        for (int i = 0; i < getTeam().length; i++) {
            if (getTeam()[i].isPassed()) {
                System.out.println("Winner is " + getTeam()[i].getName() + "!");
            }
        }
        System.out.println("_______________");
    }

    public void printInfo(){
        System.out.println("___________________________________");
        System.out.println("Full information about the players: ");
        System.out.println("___________________________________");
        int i = 1;
        for (Players player : team) {

            System.out.println("№" + i++ + ". " + player.printPlayerInfo() + "\n");
        }
        System.out.println();
    }

    public Players[] getTeam() {
        return team;
    }

    public String getTeamName() {
        return "Team: " + "\"" + teamName + "\"";
    }

}
