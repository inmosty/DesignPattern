package abstractfactory02.abst;

import lombok.extern.slf4j.Slf4j;

public interface GuiFac {
    public Button createButton();
    public TextArea createTextArea();

}
