import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Problem 2
		Scanner sc = new Scanner(System.in);
		int numSide;
		double sideLength;
		RegularPolygon rp;

		System.out.println("Enter number of sides:");
		numSide = sc.nextInt();

		System.out.println("Enter the side length:");
		sideLength = sc.nextDouble();

		rp = new RegularPolygon(numSide, sideLength);

		System.out.println("Area with " + rp.getNumSides() + " sides: " + rp.getArea());
		
		rp.addSides(2);
		System.out.println("Incrementing the number of sides by two");
		
		System.out.println("Area with " + rp.getNumSides() + " sides: " + rp.getArea());
	}
}