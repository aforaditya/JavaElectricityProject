import java.util.logging.*;

public class Logger {
    private static final Logger logger = Logger.getLogger(Logger.class.getName());

    // Singleton pattern
    private static Logger instance;

    private Logger() {
        // Private constructor to enforce Singleton pattern
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logger.log(Level.INFO, message);
    }
}
