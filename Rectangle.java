/**
 * Represents a rectangle. Every rectangle created using this class has a positive length and width.
 *
 * @author Kyle Vu
 * @version 1
 */
public class Rectangle
{
    private double len;
    private double wid;

    /**
     * Creates a rectangle with length and width both of 1.0.
     */
    public Rectangle()
    {
        this(1.0);
    }

    /**
     * Creates a rectangle with length and width both of the given value.
     * 
     * @param len The length and width of the new rectangle. This should be a positive number.
     */
    public Rectangle(final double len)
    {
        this(len, len);
    }

    /**
     * Creates a rectangle with length and width of the given values.
     * 
     * @param len The length of the new rectangle. This should be a positive number.
     * @param wid The width of the new rectangle. This should be a positive number.
     */
    public Rectangle(final double len, final double wid)
    {
        setLength(len);
        setWidth(wid);
    }

    /**
     * Sets the length of the rectangle to the specified length.
     * 
     * @param len the proposed new length. This should be a positive number.
     */
    public void setLength(final double len)
    {
        if (len > 0) {
            this.len = len;
        } else {
            throw new IllegalArgumentException("Length must be positive.");
        }
    }

    /**
     * Sets the width of the rectangle to the specified width.
     * 
     * @param wid the proposed new width. This should be a positive number.
     */
    public void setWidth(final double wid)
    {
        if (wid > 0) {
            this.wid = wid;
        } else {
            throw new IllegalArgumentException("Width must be positive.");
        }
    }

    /**
     * Used to get the length of the rectangle, which will be a positive number.
     * 
     * @return the length of the rectangle.
     */
    public double getLength()
    {
        return len;
    }

    /**
     * Used to get the width of the rectangle, which will be a positive number.
     * 
     * @return the width of the rectangle.
     */
    public double getWidth()
    {
        return wid;
    }

    /**
     * Calculates the area of this rectangle as a double.
     * 
     * @return the area of the rectangle.
     */
    public double getArea()
    {
        return len * wid;
    }

    /**
     * Calculates the perimeter of this rectangle as a double.
     * 
     * @return the perimeter of the rectangle.
     */
    public double getPerimeter()
    {
        return 2 * (len + wid);
    }

    /**
     * Compares this rectangle to the specified object. The result is true if and only if the argument is not null and is a Rectangle object with the same length and width as this object.
     * 
     * @override equals in class java.lang.Object
     * @return true if the given object represents a Rectangle with the same length and width as this one, false otherwise
     */
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }

        if (!(other instanceof Rectangle))
        {
            return false;
        }

        Rectangle otherRectangle = (Rectangle) other;

        // Use Double.compare to avoid precision issues with floating-point numbers
        return Double.compare(this.len, otherRectangle.len) == 0
                && Double.compare(this.wid, otherRectangle.wid) == 0;
    }

    /**
     * A String representation of this rectangle. This is in the form "rectangle with length l, width w", where l and w are the doubles representing the length and width of the rectangle to the nearest hundredth.
     * 
     * @override toString in class java.lang.Object
     * @return a String representation of this rectangle.
     */
    @Override
    public String toString()
    {
        return String.format("rectangle with length %.2f, width %.2f", len, wid);
    }
}