package ROBOTHW;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot coffeRobot = new CoffeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCoocker();
        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCooker.work();
        Robot[] robots = new Robot[]{robot, coffeRobot, robotCooker, robotDancer};
        System.out.println();

    }
}
