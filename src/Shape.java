enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE
}
abstract class Shape {
    protected int position;
    protected Color color;

    public Shape(int position, Color color) {
        this.position = position;
        this.color = color;
    }

    abstract void draw();
}
