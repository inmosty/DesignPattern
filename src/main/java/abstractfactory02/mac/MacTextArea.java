package abstractfactory02.mac;

import abstractfactory02.abst.TextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "MacTextArea";
    }
}
