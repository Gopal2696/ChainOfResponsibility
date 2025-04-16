//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final Logger log = new infoLoggerImplementation(new debugLoggerImplementation(new errorLoggerImplementation(null)));
        log.log("INFO", "log info level message");
        log.log("ERROR", "log error level message");
        log.log("DEBUG", "log debug level message");
    }
}