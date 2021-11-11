package creational.singleton;

/**
 * 使用 同步锁 解决延迟初始化带来的线程安全问题
 */
public class LazySafeSingleton1 {
    private static LazySafeSingleton1 lazySingleton;

    private LazySafeSingleton1() {}

    public static synchronized LazySafeSingleton1 getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazySafeSingleton1();

        return lazySingleton;
    }
}
