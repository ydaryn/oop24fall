class Circle extends Shape {
    private int radius;

    public Circle(int position, Color color, int radius) {
        super(position, color);
        this.radius = radius;
    }


    @Override
    void draw() {
        System.out.println("Circle:");
        for (int i = 0; i <= radius * 2; i++) {
        	System.out.print(" ".repeat(position));
            for (int j = 0; j <= radius * 2; j++) {
                
                if (Math.pow(i - radius, 2) + Math.pow(j - radius, 2) <= Math.pow(radius, 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
