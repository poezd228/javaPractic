import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public void draw(Graphics g) {

    }
}
// Аналогичным образом можно реализовать другие фигуры, например, прямоугольники.
