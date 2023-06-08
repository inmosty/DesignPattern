package chainofresposibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCaclulator();

        plus.setNextCalculator(sub);
        Request request1 = new Request(1,2,"+");
        Request request2 = new Request(10,2,"-");

        plus.process(request1);
        plus.process(request2);


    }
}
