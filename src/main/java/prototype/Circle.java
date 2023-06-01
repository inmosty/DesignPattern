package prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle extends Shape{
    private int x,y,r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle clone = (Circle) clone();
        clone.x = this.x +1;
        clone.y = this.y +1;
        clone.r = this.r +1;
        return clone;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
