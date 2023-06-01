package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AObj {

    Ainterface ainterface;

    public AObj() {
        this.ainterface = new AinterfaceImpl();
    }

    public void funcAA(){

        //위임하다
        ainterface.funcA();
        ainterface.funcA();
    }
}
