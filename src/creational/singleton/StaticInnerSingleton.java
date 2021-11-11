package creational.singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {}

    private static class SingletonHolder {
        private static final StaticInnerSingleton singleton = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.singleton;
    }
}
