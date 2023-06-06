package abstractfactory02;

import abstractfactory02.abst.Button;
import abstractfactory02.abst.GuiFac;
import abstractfactory02.abst.TextArea;
import abstractfactory02.concrete.FactoryInstance;
import abstractfactory02.linux.LinuxGuiFac;
import abstractfactory02.mac.MacGuiFac;
import abstractfactory02.win.WinGuiFac;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //GuiFac guiFac = new WinGuiFac();
        GuiFac guiFac = FactoryInstance.getGuiFac();
        Button button = guiFac.createButton();
        TextArea textArea = guiFac.createTextArea();
        button.click();

        log.info(textArea.getText());
    }
}
