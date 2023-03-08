package domain;

import utils.Utils;

import java.io.PrintStream;
import java.time.LocalDateTime;

public class MessageTask extends Task{
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(Long taskID, String description, String from, String to, LocalDateTime date) {
        super(taskID, description);
        this.from = from;
        this.to = to;
        this.date = date;
    }

    @Override
    public void execute() {
        PrintStream var10000 = System.out;
        String var10001 = super.toString();
        var10000.println("Taskul " + var10001 + " \n a fost executat la data de: " + this.date.format(Utils.formatter));
    }
}
