public class WeldingRobot extends Robot {
    private String id;
    private int battery;

    public WeldingRobot() {
    }

    public WeldingRobot(String id, int battery) {
        super(id, battery);
        this.id = id;
        this.battery = battery;
    }

    @Override
    protected String work() {
        return "- Fixing mainboard for electricities";
    }

    @Override
    public String move() {
        return "- Stay only, cant move.";
    }

    @Override
    public String charge() {
        return "- Use 220W to connect with device, no battery.";
    }

}
