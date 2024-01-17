
/**
 * Write a description of class BakedGood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BakedGood
{
    // instance variables - replace the example below with your own
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name,String recipe,double price,int quantity)
    {
        // initialise instance variables
        this.name=name;
        this.recipe=recipe;
        this.price=price;
        this.quantity=quantity;
    }
    //modify the quantity
    public void increaseQuantity(int count){
        this.quantity+=count;
    }
    //toString
    public String toString(){
        return "baked good: "+this.name+"(" + this.quantity +"@"+this.price+")";
    }
    //instance method to buy some baked goods
    public double purchase(int count){
        if (count> this.quantity){
            throw new IllegalArgumentException("you can not buymore than our current inventory");
        }
        this.quantity -= count;
        return this.price*count;
    
    }
    
    //main method
    
    public static void main(String[] args){
        BakedGood croissant = new BakedGood("croissant","butter,flour,laminate, yum", 20.0,0);
        croissant.increaseQuantity(12);
        System.out.println(croissant.purchase(3));
        System.out.println(croissant.toString());
        
    }
    
}
