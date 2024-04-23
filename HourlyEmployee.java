/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monthlypay_test_driver;

/**
 *
 * @author Gül
 */
public class HourlyEmployee extends Employee{
      private double wageRate;
    private double hours; //for the month

    public HourlyEmployee( )
    {
        super( );
        wageRate = 0;
        hours = 0;
    }

    /**
     Precondition: Neither theName nor theDate are null;
     theWageRate and theHours are nonnegative.
     * @param theName
     * @param theDate
     * @param theWageRate
     * @param theHours
    */
    public HourlyEmployee(String theName, Date theDate,
                       double theWageRate, double theHours)
    {
         super(theName, theDate);
         if ((theWageRate >= 0) && (theHours >= 0))
         {
             wageRate = theWageRate;
             hours = theHours;
         }
         else
         {
             System.out.println(
                       "Fatal Error: creating an illegal hourly employee.");
             System.exit(0);
         }
    }

    public HourlyEmployee(HourlyEmployee originalObject)
    {
         super(originalObject);
         wageRate = originalObject.wageRate;
         hours = originalObject.hours;
    }

    public double getRate( )
    {
        return wageRate;
    }

    public double getHours( )
    {
        return hours;
    }

    /**
     Returns the pay for the month.
    */
    
      @Override
    public double getPay( )
    {
        return wageRate*hours;
    }

    /**
     Precondition: hoursWorked is nonnegative.
     * @param hoursWorked
    */
    public void setHours(double hoursWorked)
    {
         if (hoursWorked >= 0)
             hours = hoursWorked;
         else
         {
             System.out.println("Fatal Error: Negative hours worked.");
             System.exit(0);
         }
     }

    /**
     Precondition: newWageRate is nonnegative.
     * @param newWageRate
    */
    public void setRate(double newWageRate)
    {
         if (newWageRate >= 0)
             wageRate = newWageRate;
         else
         {
             System.out.println("Fatal Error: Negative wage rate.");
             System.exit(0);
         }
    }



      @Override
    public String toString( )
    {
        return (getName( ) + " " + getHireDate( ).toString( )
                + "\n$" + wageRate + " per hour for " + hours + " hours");
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
   public boolean equals(Object obj) {
        if( obj== null)
            return false;
        else if( getClass()!=obj.getClass()){
            return false;
            
        }
        else{
            HourlyEmployee HE= (HourlyEmployee)obj;
return ( super.equals(HE)&& wageRate==HE.wageRate&& hours==HE.hours);
        }
    }

}
