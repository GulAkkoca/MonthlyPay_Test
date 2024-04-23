/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthlypay_test_driver;

/**
 *
 * @author Gül
 */
// sortableIntger class olucak sortableda implemet etmemiz lazım interface olmalı

/*

sort methodu için sorter objesi oluşturmamız lazım

*/
public class MonthlyPay_Test_Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dt= new Date("May",12,2020);
        Date dt1= new Date("Feb",15,2021);
        
        HourlyEmployee hmp= new HourlyEmployee("Clarie",dt,30.000,200.0);
        HourlyEmployee hmp1= new HourlyEmployee("Gloira Gas",dt1,30.000,200.0);
        SalariedEmployee smp2= new SalariedEmployee("Gloira Gas",dt1,30.000);
        SalariedEmployee smp1= new SalariedEmployee("Clarie",dt,30.000);
        Employee[] list = {hmp,hmp1,smp1,smp2};
        sortByMonthlyPay(list);
        for(Employee e:list){

             System.out.println(e.toString( ));}

             //System.out.println(list[0].getPay( ));
             //System.out.println(list[1].getPay( ));
             //System.out.println(list[2].getPay( ));
             //System.out.println(list[3].getPay( ));
             //System.out.println(list[4].getPay( ));




    }
    public static void sortByMonthlyPay( Employee[]list){
        int minIndex;
         Employee temp;
             for( int index=0; index<list.length-1; index++){
                 minIndex=index;
                 for( int scan = index+1; scan<list.length; scan++)
                     if( list[scan].lessPay(list[minIndex]))
                         minIndex=scan;
                 temp= list[minIndex];
                 list[minIndex]=list[index];
                 list[index]= temp;
                  }
             
        } 

}
