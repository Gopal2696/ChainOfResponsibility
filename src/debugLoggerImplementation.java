public class debugLoggerImplementation extends Logger {

    debugLoggerImplementation(final Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String logLevel, String message) {
        if (logLevel.equals("DEBUG")) {
            System.out.println("debug level logged: " + message);
        }
        else {
            System.out.println("moving onto error level");
            this.nextLogger.log(logLevel, message);
        }
    }

}
