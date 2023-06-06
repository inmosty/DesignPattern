package decorator;

import decorator.abst.IBeverage;
import decorator.concrete.Base;
import decorator.concrete.Espresso;
import decorator.concrete.Milk;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IBeverage beverage = new Base();
        boolean done = false;

        while (!done) {
            log.info("음료 현재가격 : {}", beverage.getTotalPrice());
            log.info("선택 : 1:샷 추가 / 2: 우유 추가");
            switch (sc.nextInt()) {
                case 0:
                    done = true;    break;
                case 1:
                    beverage = new Espresso(beverage);    break;
                case 2:
                    beverage = new Milk(beverage);    break;

            }
        }
        log.info("음료 가격 : {}" , beverage.getTotalPrice());
        sc.close();
    }
}
