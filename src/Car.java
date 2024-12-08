
public class Car implements Comparable<Car>{
    //-----------------------------------------------------
    // Title: Car Class
    //Author: Poyraz Koca
    // Description: This class compares car objects
    //based on their model years, facilitating sorting and comparison operations in a car management system.
    //-----------------------------------------------------

    private String brand;
    private String modelname;
    private  long modelyear;


    //constructor
    public Car(String b, String mn, long y)
    { brand = b; modelname = mn; modelyear = y;
    }

    public String day() { return brand; }

    public String month() {
        return modelname;
    }
    public long year() {
        return modelyear;
    }

    //--------------------------------------------------------
    // Summary: Compares this Car object with another Car object based on their model years.
    // Precondition: 'that' is a Car object to compare with.
    // Postcondition: Returns +1 if this Car's model year is greater than 'that' Car's model year,
    // -1 if this Car's model year is less than 'that' Car's model year, and 0 if both Car objects
    // have the same model year.
    //--------------------------------------------------------
    public int compareTo(Car that)
    {
        if (this.modelyear > that.modelyear ) return +1;
        if (this.modelyear < that.modelyear ) return -1;
	 
	 
	/* if (this.month > that.month) return +1;
	 if (this.month < that.month) return -1;
	 
	 if (this.day > that.day ) return +1;
	 if (this.day < that.day ) return -1; */


        return 0;
    }
    public String toString()
    { return Long.toString(modelyear);


    }
    //--------------------------------------------------------
//Summary: Compares this Car object with another Car object based on their model years in descending order.
//Precondition: 'other' is a Car object to compare with.
//Postcondition: Returns the result of comparing the model years of 'other' and this Car object using
//the Long.compare method, which compares two long values numerically.
//--------------------------------------------------------
    public int compareTo1(Car other) {
        return Long.compare(other.modelyear, this.modelyear);
    }

}