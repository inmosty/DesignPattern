package abstractfactory02.win;

import abstractfactory02.abst.TextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "WinTextArea";
    }
}
