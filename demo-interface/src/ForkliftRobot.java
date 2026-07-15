public class ForkliftRobot extends Robot implements Actions {
    private String id;
    private int battery;

    public ForkliftRobot() {
    }

    public ForkliftRobot(String id, int battery) {
        super(id, battery);
        this.id = id;
        this.battery = battery;
    }

    @Override
    protected String work() {
        return "- Lift product.";
    }

    @Override
    public String move() {
        return "- Move on surfaces with wheels";
    }

    @Override
    public String charge() {
        return "- Use dock charging which places on surface.";
    }

}
