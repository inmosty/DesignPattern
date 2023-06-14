package command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringPrintCommand implements Command {
    protected String string;
    public StringPrintCommand(String s) {
        this.string = s;
    }

    @Override
    public void excute() {
        log.info(string);
    }

    @Override
    public int compareTo(Command o) {
        StringPrintCommand other = (StringPrintCommand) o;
        return this.string.length() - other.string.length();
    }
}
