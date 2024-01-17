
/**
 * Write a description of class Room here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class Room
{
    private double width;
    private double length;
    private int floor;
    
    public Room(double width,double length,int floor){
        this.width=width;
        this.length=length;
        this.floor=floor;
    }
    public void setwidth(double width){
        
        if (width > 0){
            this.width= width;
        }
        
    }
    public void setlength(double length){
        if (width > 0){
            this.length = length;
        }
       
    }
    public void setfloor(int floor){
        this.floor=floor; 
    }
    public double getwidth(){
        return width;
    }
    public double getlength(){
        return length;
    }
    public double getfloor(){
        return floor;
    }
    public String toString(){
        return length +" x "+width+", floor "+floor;
    }
    
    
}
