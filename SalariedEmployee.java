/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monthlypay_test_driver;

import monthlypay_test_driver.Date;


/**
 *
 * @author Gül
 */
public class SalariedEmployee extends Employee{
    private double salary; //annual

    public SalariedEmployee( )
    {
        super( );
        salary = 0;
    }

    /**
     Precondition: Neither theName nor theDate are null;
     theSalary is nonnegative.
    */
    public SalariedEmployee(String theName, Date theDate, double theSalary)
    {
         super(theName, theDate);
         if (theSalary >= 0)
             salary = theSalary;
         else
         {
             System.out.println("Fatal Error: Negative salary.");
             System.exit(0);
         }
    }

    public SalariedEmployee(SalariedEmployee originalObject )
    {
         super(originalObject);
         salary = originalObject.salary;
    }
    public double getSalary( )
    {
        return salary;
    }

    /**
     Returns the pay for the month.
    */
    public double getPay( )
    {
        return salary/12;
    }

    /**
     Precondition: newSalary is nonnegative.
    */
    public void setSalary(double newSalary)
    {
         if (newSalary >= 0)
             salary = newSalary;
         else
         {
             System.out.println("Fatal Error: Negative salary.");
             System.exit(0);
         }
    }

    public String toString( )
    {
        return (getName( ) + " " + getHireDate( ).toString( )
                                + "\n$" + salary + " per year");
    }

  

    @Override
    public boolean equals(Object obj) {
       if( obj==null)
           return false;
       else if(getClass()!=obj.getClass()){
         return false;  
    }
       else{
           SalariedEmployee objSE = ( SalariedEmployee)obj;
           return (super.equals(objSE)&& salary== objSE.salary);
       }
    
}}


