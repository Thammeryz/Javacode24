
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class Mapinduzi
{
    private String name;
    private int day;
    private String mounth;
    
    public Mapinduzi(String name,int day,String mounth){
        this.name=name;
        this.day=day;
        this.mounth=mounth;
    }
    public static double avgDate(Mapinduzi[] holidays){
        int totalday=0;
        for(Mapinduzi hoday:holidays) {
            totalday += hoday.day;   
        }
        return(double) totalday/holidays.length;
    }

    
    public static void main(String[]args){
        Mapinduzi test = new Mapinduzi("Karume day",2,"January");
        System.out.println(test.name);
        System.out.println(test.day);
        System.out.println(test.mounth);
    }
}
