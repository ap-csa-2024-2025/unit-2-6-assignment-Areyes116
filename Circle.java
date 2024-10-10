import java.util.Scanner;

// Class to represent a Circle
class Circle
{
    private double radius;

    // Constructor to create a circle with a given radius
    public Circle(double radius)
    {
        this.radius = radius;
    }

    // Method to get the radius of the circle
    public double getRadius() 

        return radius;
    }

    // Method to calculate the circumference of the circle
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the area of the circle
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the radius
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        // Create a circle object with the given radius
        Circle circle = new Circle(radius);

        // Output the results using the Circle methods for circumference and area
        System.out.println("A circle with a radius of " + circle.getRadius() +
                " has a circumference of " + circle.getCircumference() +
                " and an area of " + circle.getArea());
    }
}