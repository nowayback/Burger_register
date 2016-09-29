/**
 * Created by Beta on 29.09.2016.
 */
public class bigburger extends burger{

    private String bigburger1Name;
    private double bigburger1Price;

    private String bigburger2Name;
    private double bigburger2Price;

    public bigburger(String meat,double price){
        super("Bigburger",meat,price,"White");

    }

    public void addbigburger1(String name,double price){
        this.bigburger1Name=name;
        this.bigburger1Price=price;
    }
    public void addbigburger2(String name,double price){
        this.bigburger2Name=name;
        this.bigburger2Price=price;
    }

    @Override
    public double itemsizeburger(){
        double burgerPrice= super.itemsizeburger();
        if(this.bigburger1Price!=null){
            burgerPrice+=this.bigburger1Price;
            System.out.println("Added "+this.bigburger1Name+" for extra "+this.bigburger1Price);
        }
        if(this.bigburger2Price!=null){
            burgerPrice+=this.bigburger2Price;
            System.out.println("Added "+this.bigburger2Name+" for extra "+this.bigburger2Price);
        }
        return burgerPrice;
    }
}
