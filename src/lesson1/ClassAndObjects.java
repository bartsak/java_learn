package lesson1;

public class ClassAndObjects {
    public static void main(String[] args) {
        Point A = new Point();
    }
}

class Point {
    private int x; // поле класса
    private int y;

    // инициализатор
    {
        x = 0;
        y = 0;
    }

    //конструктор
    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}