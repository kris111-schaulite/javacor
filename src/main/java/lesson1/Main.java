package lesson1;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(450, 450);

        Team managers = new Team("Managers", new Players[] {
                new Players("Max", "UK", 200, 400),
                new Players("Nick", "USA", 500, 500),
                new Players("Alice","RUS", 250, 400),
                new Players("lisa", "BEL", 350, 300)
        });

        managers.printInfo();

        course.doIt(managers, course.getRun(), course.getSwim());

        managers.showResults();



    }
}
