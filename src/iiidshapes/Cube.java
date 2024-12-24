package iiidshapes;

public class Cube extends Shape3D {
	private double side;
	 public Cube(double a) {
		 this.side=a;
	 }
	 
	 @Override
	 public double volume() {
		 return Math.pow(side,3);
	 }
	 @Override 
	 public double SurfaceArea() {
		 return Math.pow(side, 2)*6;
	 }
}
