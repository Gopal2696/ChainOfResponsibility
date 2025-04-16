public class infoLoggerImplementation extends Logger {

    infoLoggerImplementation(final Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String logLevel, String message) {
        if (logLevel.equals("INFO")) {
            System.out.println("info level logged: " + message);
        }
        else {
            System.out.println("moving onto debug level");
            this.nextLogger.log(logLevel, message);
        }
    }
}
