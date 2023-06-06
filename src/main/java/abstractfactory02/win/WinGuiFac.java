package abstractfactory02.win;

import abstractfactory02.abst.Button;
import abstractfactory02.abst.GuiFac;
import abstractfactory02.abst.TextArea;
import abstractfactory02.mac.MacButton;
import abstractfactory02.mac.MacTextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WinGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
