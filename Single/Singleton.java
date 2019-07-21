public class Singleton {
  /* Recommended method */
  private static Singleton uniqueInstance = new Singleton();
  private Singleton() {}
  public static Singleton getInstance() {
    return uniqueInstance;
  }
  /* Delay Construct and thread sync */
  private volatile static Singleton uniqueInstance;
  private Singleton() {}
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Singleton();
    return uniqueInstance;
  }
  /* Delay Construct without thread sync */
  private volatile static Singleton uniqueInstance;
  private Singleton() {}
  public static Singleton getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Singleton();
    return uniqueInstance;
  }
  /* double checked locking */
  private volatile static Singleton uniqueInstance;
  private Singleton() {}
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
  }
}
