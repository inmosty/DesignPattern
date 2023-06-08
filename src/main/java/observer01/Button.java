package observer01;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Button {
    public void onClick() {
        //이벤트 처리
        if(onclickListener != null) {
            onclickListener.onClick(this);
        }

    }
    public interface OnclickListener {
        void onClick(Button button);
    }

    private OnclickListener onclickListener;

    public void setOnclickListener(OnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }
}
