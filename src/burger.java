/**
 * Created by Beta on 28.09.2016.
 */
public class burger {
    private  String name;
    private String meat;
    private Double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String Addition2Name;
    private double Addition2Price;

    private String Addition3Name;
    private double Addition3Price;

    private  String Addition4Name;
    private double Addition4Price;

    public burger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addburger1(String name,double price){
    this.addition1Name=name;
    this.addition1Price=price;
    }

    public void addburger2(String name,double price){
        this.Addition2Name=name;
        this.Addition2Price=price;
    }

    public void addburger3(String name,double price){
        this.Addition3Name=name;
        this.Addition3Price=price;
    }

    public void addburger4(String name,double price){
        this.Addition4Name=name;
        this.Addition4Price=price;

    }

    public double itemsizeburger(){
        double burgerPrice=this.price;
        System.out.println(this.name+" hamburger "+ " on a " + this.breadRollType+
        " roll " +" price is "+this.price);

        if(this.addition1Name!=null){
            burgerPrice+=this.addition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+
            this.addition1Price);
        }

        if(this.Addition2Name!=null){
            burgerPrice+=this.Addition2Price;
            System.out.println("Added "+this.Addition2Name+" for an extra  "+this.Addition2Price);
        }

        if(this.Addition3Name!=null){
            burgerPrice+=this.Addition3Price;
            System.out.println("Added "+this.Addition3Name+" for an extra "+this.Addition3Price);
        }

        if(this.Addition4Name!=null){
            burgerPrice+=this.Addition4Price;
            System.out.println("Added " +this.Addition4Name+" for an extra "+this.Addition4Price);
        }
        return burgerPrice;

    }
}
