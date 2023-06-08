package chainofresposibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlusCalculator extends Calculator {
    @Override
    protected boolean operator(Request request) {
        if(request.getOperator().equals("+")){
            int a = request.getA();
            int b = request.getB();
            log.info("{} + {} = {}", a, b, a+b);
            return true;
        }
        return false;
    }
}
