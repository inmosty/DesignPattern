package abstractfactory02.mac;

import abstractfactory02.abst.Button;
import abstractfactory02.abst.GuiFac;
import abstractfactory02.abst.TextArea;
import abstractfactory02.linux.LinuxButton;
import abstractfactory02.linux.LinuxTextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
