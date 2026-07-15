public abstract class Robot {
    protected String id;
    protected int battery;

    protected Robot() {
    }

    protected Robot(String id, int battery) {
        this.id = id;
        this.battery = battery;
    }

    protected abstract String work();

    protected abstract String charge();

}
