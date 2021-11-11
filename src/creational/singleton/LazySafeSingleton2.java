package creational.singleton;

/**
 * 使用 双重检查锁 解决延迟初始化带来的线程安全问题
 */
public class LazySafeSingleton2 {
    private static volatile LazySafeSingleton2 lazySingleton;

    private LazySafeSingleton2() {}

    public static LazySafeSingleton2 getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySafeSingleton2.class) {
                if (lazySingleton == null)
                    lazySingleton = new LazySafeSingleton2();
            }
        }

        return lazySingleton;
    }
}
