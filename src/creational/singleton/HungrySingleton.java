package creational.singleton;

public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
