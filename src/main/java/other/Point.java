package other;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
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

    public Point pointChange(int i, int j){
        return new Point(x+i,y+j);
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Point point = (Point)o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
