package iiidshapes;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double SurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}