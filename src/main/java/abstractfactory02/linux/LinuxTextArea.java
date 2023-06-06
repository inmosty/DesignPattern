package abstractfactory02.linux;

import abstractfactory02.abst.TextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "LinuxTextArea";
    }
}
