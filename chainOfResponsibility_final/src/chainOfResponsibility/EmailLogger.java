package chainOfResponsibility;

public class EmailLogger extends Logger {

    public EmailLogger(LogLevel mask) {
        super(mask);
    }

    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }

}
