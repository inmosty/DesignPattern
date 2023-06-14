package command;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

@Slf4j
public class Application02 {
    public static void main(String[] args) {
        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("AAA"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("ABCDD"));

        queue.forEach(Command::excute);


    }
}
