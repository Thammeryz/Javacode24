
/**
 * Write a description of class stockItem here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class stockItem
{
    private int stockno;
    private String name;
    private double price;
    private int total;
    
    public stockItem(int stockno, String name,double price,int total){
        this.stockno = stockno;
        this.name=name;
        this.price= price;
        this.total=0;    
    }
    
    public void setprice(double price){
        this.price = price;
        
    }
    public void add(int no){
        this.total =+ no;
        
    }
    public double calc(){
        return price * total;
        
    }
     public int getstock(){
        return stockno;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public int gettotal(){
        return total;
    }
    
    
    
    
    
    
  

}
