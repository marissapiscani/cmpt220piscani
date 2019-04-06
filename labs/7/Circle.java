package lab7;

public class Circle {

		   /** x-coordinate of the center of the circle */
	    private double x = 0;

	    /** y-coordinate of the center of the circle */
	    private double y = 0;

	    /** the radius of the circle */
	    private double r = 1.0;

	    /** Default constructor */
	    public Circle() {
	    	this.x=0;
	    	this.y = 0;
	    	this.r= 1;
	    }

	    /** Constructor with given x, y, and radius */
	    public Circle(double x, double y, double r) {
	        this.x = x;
	        this.y = y;
	        this.r = r;
	    }

	    /** Return the x-coordinate of the center of this circle */
	    public double getX() {return x;}

	    /** Return the y-coordinate of the center of this circle */
	    public double getY() {return y;}

	    /** Return the radius of this circle */
	    public double getRadius() {return r;}

	    /** Return the area of this circle */
	    public double getArea() {
	        return Math.PI * r * r;
	    }

	    /** Return the perimeter of this circle */
	    public double getPerimeter() {
	        return 2 * Math.PI * r;
	    }

	    /** Return true if the point given is contained in this circle */
	    public boolean contains(double x, double y) {
	        // return true if distance(c.x,c.y) from this center <= r
	        return distance(this.x, x, this.y, y) <= r;
	    }

	    /** Return true if the circle given is contained in this circle */
	    public boolean contains(Circle c) {
	        // return true if distance(c.x,c.y) plus c.r from this center <= r
	        return distance(x, c.getX(), y, c.getY()) + c.getRadius() <= r;
	    }

	    /** Return true if the circle given overlaps this circle */
	    public boolean overlaps(Circle c) {
	        // return true if distance(c.x,c.y) minus c.r from this center <= r
	        return distance(x, c.getX(), y, c.getY()) - c.getRadius() <= r;
	    }

	    /** Return the distance between two points */
	    private static double distance(double x1, double x2, double y1, double y2) {
	        double dx = x2-x1, dy = y2-y1;
	        return Math.sqrt(dx*dx + dy*dy);
	    }
	}

