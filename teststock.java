import java.util.Scanner;
public class teststock
{
    public static void main(String[]args){
        stockItem it = new stockItem(3,"Application",56.11,52);
        it.add(10);
        it.setprice(50.00);
        System.out.println("The all stock is "+it.getstock());
        System.out.println("Stock name is "+it.getname());
        System.out.println("The price is "+ it.getprice());
        System.out.println("The stock is "+it.gettotal());
        System.out.println("The total value "+it.calc());
    }
   
}
