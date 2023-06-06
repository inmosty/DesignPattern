package abstractfactory02.linux;

import abstractfactory02.abst.Button;
import abstractfactory02.abst.GuiFac;
import abstractfactory02.abst.TextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
