package visitor;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Application {
    public static void main(String[] args) {
        List<Visitable> visitables = new ArrayList<>();
        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();
        for(Visitable visitable : visitables){
            visitable.accept(visitor);
        }
        log.info("Sum of ages: {}", ((VisitorA) visitor).getAgeSum());
    }
}
