package visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VisitorA implements Visitor {
    private int ageSum;

    public VisitorA(){
        ageSum = 0;
    }
    @Override
    public void visit(Visitable visitable) {
        log.info("visiting {}", visitable);
        if (visitable instanceof VisitableA) {
            ageSum += ((VisitableA) visitable).getAge();
        }else{
            //
        }
    }

    public int getAgeSum() {
        return ageSum;
    }
}
