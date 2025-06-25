public class TestClass {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        logger1.log("First log message.");
        logger2.log("Second log message.");

        System.out.println("Logger1 hashcode: " + logger1.hashCode());
        System.out.println("Logger2 hashcode: " + logger2.hashCode());
        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
