public class App {
    public static void main(String[] args) throws Exception {
        Robot forkliftRobot = new ForkliftRobot("01", 100);
        System.out.println(forkliftRobot.work());
        System.out.println(forkliftRobot.charge());
        System.out.println(new ForkliftRobot().move());
        System.out.println("_______________________");

        Robot cameraDrone = new CameraDrone("02", 70);
        System.out.println(cameraDrone.work());
        System.out.println(cameraDrone.charge());
        System.out.println(new CameraDrone().move());
        System.out.println("_______________________");

        Robot weldingRobot = new WeldingRobot("03", 30);
        System.out.println(weldingRobot.work());
        System.out.println(weldingRobot.charge());
        System.out.println("- This robot cant move !!!");
    }
}
