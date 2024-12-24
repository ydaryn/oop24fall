class Triangle extends Shape {
    private int base;

    public Triangle(int position, Color color, int base) {
        super(position, color);
        this.base = base;
    }

    @Override
    void draw() {
        System.out.println("Triangle:");
        for (int i = 0; i < base; i++) {  // Loop through each row (height)
            for (int j = 0; j < base; j++) {  // Loop through each column (width)
                if (j >= base / 2 - i && j <= base / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
