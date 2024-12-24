class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int position, Color color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Rectangle:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}