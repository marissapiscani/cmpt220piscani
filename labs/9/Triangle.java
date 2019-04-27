package lab9;

import lab8.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        
        if((side1+side2)<=side3) {
            throw new IllegalTriangleException("Invalid Triangle.It violates triangle property!");
        }
        else if((side1+side3)<=side2) {
            throw new IllegalTriangleException("Invalid Triangle.It violates triangle property!");
        }
        else if((side2+side3)<=side1) {
            throw new IllegalTriangleException("Invalid Triangle.It violates triangle property!");
        }
        else {
            System.out.println("Valid Triangle!");
    
        }
    }
        
    /**  returns the sides of each triangle*/
    public double setSide1() {
        return side1;
    }

    public double setSide2() {
        return side2;
    }

    public double setSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }
    /** returns the area of the triangle */
    public double getArea() {
    	double s = (side1 + side2 + side3) / 2;
    	double area = java.lang.Math.sqrt(s*(s - side1)*(s - side2)*(s- side3));
    	return area;
    			
    }
    private double sqrt(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** returns the perimeter of the triangle */

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    /** returns a string description for the triangle */
    public String toString() {
    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }
}
