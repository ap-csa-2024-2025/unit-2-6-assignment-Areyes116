import java.util.Scanner;

// Class to represent a Regular Polygon
class RegularPolygon
{
    private int numSides;
    private double sideLength;

    // Constructor for RegularPolygon
    public RegularPolygon(int numSides, double sideLength)
    {
        this.numSides = numSides;
        this.sideLength = sideLength;
    }

    // Method to get the number of sides
    public int getNumSides()
    {
        return numSides;
    }

    // Method to set the number of sides
    public void setNumSides(int numSides)
    {
        this.numSides = numSides;
    }

    // Method to calculate the area of the regular polygon
    public double getArea()
    {
        double angle = Math.PI / numSides;
        return (numSides * sideLength * sideLength) / (4 * Math.tan(angle));
    }
}

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get the number of sides from the user
        System.out.println("Enter number of sides:");
        int numSides = scanner.nextInt();

        // Get the side length from the user
        System.out.println("Enter the side length:");
        double sideLength = scanner.nextDouble();

        // Create a RegularPolygon object
        RegularPolygon polygon = new RegularPolygon(numSides, sideLength);

        // Calculate and print the area
        System.out.println("Area with " + numSides + " sides: " + polygon.getArea());

        // Increment the number of sides by 2
        System.out.println("Incrementing the number of sides by two");
        polygon.setNumSides(numSides + 2);

        // Calculate and print the new area
        System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());
    }
}