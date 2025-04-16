public class errorLoggerImplementation extends Logger {

    errorLoggerImplementation(final Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String logLevel, String message) {
        if (logLevel.equals("ERROR")) {
            System.out.println("error level logged: " + message);
        }
        else {
            this.nextLogger.log(logLevel, message);
        }
    }
}
