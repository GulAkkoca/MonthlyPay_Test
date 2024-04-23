/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monthlypay_test_driver;

/**
 *
 * @author Gül
 */
public class Date {
    private String month; //always 3 letters long, as in Jan, Feb, etc.
    private int day;
    private int year; //a four digit number.

    public Date( )
    {
        month = "Jan";
        day = 1;
        year = 1000;
    }

    public Date(int monthInt, int day, int year)
    {
        setDate(monthInt, day, year);
    }

    public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }

    public Date(int year)
    {
        setDate(1, 1, year);
    }

    public Date(Date aDate)
    {
        if (aDate == null)//Not a real date.
        {
             System.out.println("Fatal Error.");
             System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public void setDate(int monthInt, int day, int year)
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(String monthString, int day, int year)
    {
        if (dateOK(monthString, day, year))
        {
            this.month = monthString;
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(int year)
    {
        setDate(1, 1, year);
    }

    public void setYear(int year)
    {
        if ( (year < 1000) || (year > 9999) )
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }

    public void setMonth(int monthNumber)
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            month = monthString(monthNumber);
    }

    public void setDay(int day)
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }

    public int getMonth( )
    {
        if (month.equals("Jan"))
            return 1;
        else if (month.equals("Feb"))
            return 2;
        else if (month.equals("Mar"))
            return 3;
        else if (month.equals("Apr"))
            return 4;
        else if (month.equals("May"))
            return 5;
        else if (month.equals("Jun"))
            return 6;
        else if (month.equals("Jul"))
            return 7;
        else if (month.equals("Aug"))
            return 8;
        else if (month.equals("Sep"))
            return 9;
        else if (month.equals("Oct"))
            return 10;
        else if (month.equals("Nov"))
            return 11;
        else if (month.equals("Dec"))
            return 12;
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0; //Needed to keep the compiler happy
        }
    }

    public int getDay( )
    {
        return day;
    }

    public int getYear( )
    {
        return year;
    }

    public String toString( )
    {
        return (month + " " + day + ", " + year);
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            Date otherDate =
                          (Date)otherObject;
            return ( month.equals(otherDate.month)
                      && (day == otherDate.day)
                      && (year == otherDate.year) );
        }
    }

    public boolean precedes(Date otherDate)
    {
        return ( (year < otherDate.year) ||
           (year == otherDate.year && getMonth( ) < otherDate.getMonth( )) ||
           (year == otherDate.year && month.equals(otherDate.month)
                                         && day < otherDate.day) );
    }

    

    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return ( monthOK(monthString) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

    private boolean monthOK(String month)
    {
        return (month.equals("Jan") || month.equals("Feb") ||
                month.equals("Mar") || month.equals("Apr") ||
                month.equals("May") || month.equals("Jun") ||
                month.equals("Jul") || month.equals("Aug") ||
                month.equals("Sep") || month.equals("Oct") ||
                month.equals("Nov") || month.equals("Dec") );
    }

    private String monthString(int monthNumber)
    {
        switch (monthNumber)
        {
         case 1:
             return "Jan";
         case 2:
             return "Feb";
         case 3:
             return "Mar";
         case 4:
             return "Apr";
         case 5:
             return "May";
         case 6:
             return "Jun";
         case 7:
             return "Jul";
         case 8:
             return "Aug";
         case 9:
             return "Sep";
         case 10:
             return "Oct";
         case 11:
             return "Nov";
         case 12:
             return "Dec";
         default:
             System.out.println("Fatal Error");
             System.exit(0);
            return "Error"; //to keep the compiler happy
        }
    }

}
