public class Complex {
    private int real;
    private int image;

    public Complex() {
        this(0, 0);
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    // Геттеры и сеттеры для real и image
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "(" + real + ", " + image + "i)";
    }
}
