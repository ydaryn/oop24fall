package iiidshapes;
public class Cylinder extends Shape3D {
	private double radius, height;
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}

	@Override
	public double SurfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
}
