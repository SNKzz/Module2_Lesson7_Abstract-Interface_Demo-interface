public abstract class Robot implements Actions {
    protected String id;
    protected int battery;

    protected Robot() {
    }

    protected Robot(String id, int battery) {
        this.id = id;
        this.battery = battery;
    }

    protected abstract String work();

}
