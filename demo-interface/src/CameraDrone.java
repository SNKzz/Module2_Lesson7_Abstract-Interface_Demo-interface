public class CameraDrone extends Robot implements Actions {
    private String id;
    private int battery;

    public CameraDrone() {
    }

    public CameraDrone(String id, int battery) {
        super(id, battery);
        this.id = id;
        this.battery = battery;
    }

    @Override
    protected String work() {
        return "- Take photos about product to scan bug.";
    }

    @Override
    public String move() {
        return "- Use fan to fly on air. ";
    }

    @Override
    public String charge() {
        return "- Use dock charging with out pipeline.";
    }
}
