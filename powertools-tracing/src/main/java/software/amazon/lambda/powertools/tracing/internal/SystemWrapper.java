package software.amazon.lambda.powertools.tracing.internal;

public class SystemWrapper {
    private SystemWrapper() {
        // avoid instantiation, static methods
    }

    public static String getenv(String name) {
        return System.getenv(name);
    }

    public static boolean containsKey(String key) {
        return System.getenv().containsKey(key);
    }
}