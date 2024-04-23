/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monthlypay_test_driver;

/**
 *
 * @author Gül
 */
public abstract class Employee {
    private String name;
    private Date hireDate;

    public Employee( )
    {
         name = "No name";
         hireDate = new Date("Jan", 1, 1000); //Just a place holder.
    }

    /**
     Precondition: Neither theName nor theDate are null.
    */
    public Employee(String theName, Date theDate)
    {
        if (theName == null || theDate == null)
        {
             System.out.println("Fatal Error creating employee.");
             System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public Employee(Employee originalObject)
    {
         name = originalObject.name;
         hireDate = new Date(originalObject.hireDate);
    }
     

    public String getName( )
    {
        return name;
    }

    public Date getHireDate( )
    {
        return new Date(hireDate);
    }

    /**
     Precondition newName is not null.
    */
    public void setName(String newName)
    {
        if (newName == null)
        {
             System.out.println("Fatal Error setting employee name.");
             System.exit(0);
        }
       else
            name = newName;
    }

    /**
     Precondition newDate is not null.
    */
    public void setHireDate(Date newDate)
    {
        if (newDate == null)
        {
             System.out.println("Fatal Error setting employee hire date.");
             System.exit(0);
        }
        else
            hireDate = new Date(newDate);
    }
    
    //Add an abstract method getPay() to the Employee class. 
    public abstract double getPay();
    
    /*Add a method boolean equalPay(Employee other) to the Employee class 
    such that it returns true if the montly pays of the calling object (this) 
    and the parameter object are equal. Otherwise it returns false. 
    You must invoke the getPay method within equalPay method. TEST the method you wrote.*/  
    
    public boolean equalPay(Employee other)
     {
         if (other == null)
        {
            System.out.println("Error: null Employee object.");
            System.exit(0);
        }
        
        
        return (getPay()== other.getPay());
         
     }
    
    /*add a method boolean lessPay(Employee other) to the Employee class such that it returns true 
    if the monthly pay of the calling object (this) is less than the monthly pay of the parameter object. 
    Otherwise it returns false. You must invoke the getPay method within lessPay method. TEST the method you wrote.*/ 
     public boolean lessPay(Employee other)
     {
         if (other == null)
        {
            System.out.println("Error: null Employee object.");
            System.exit(0);
        }
        else
        System.out.println("getPay(): "+getPay());
        System.out.println("other.getPay(): "+other.getPay());
        return (getPay()<other.getPay());
         
     }

    public String toString( )
    {
        return (name + " " + hireDate.toString( ));
    }


    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( )){
            
            return false;
        }
        else
        {
            Employee otherEmployee = (Employee)otherObject;
            return (name.equals(otherEmployee.name)
                   && hireDate.equals(otherEmployee.hireDate));
        }
    }

}

