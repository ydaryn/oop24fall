package iiidshapes;

public class TestShapes {
	public static void main(String[] args) {
		Shape3D cylinder =new Cylinder(2,5);
		Shape3D sphere= new Sphere(2);
		Shape3D cube = new Cube(2);
		
		System.out.println("C.Volume: " + cylinder.volume());
		System.out.println("C.SA: " + cylinder.SurfaceArea());
		System.out.println("S.Volume: " + sphere.volume());
		System.out.println("S.SA: " + sphere.volume());
		System.out.println("Cb.Volume: " + cube.volume());
		System.out.println("Cb.SA: " + cube.volume());

	}
}
