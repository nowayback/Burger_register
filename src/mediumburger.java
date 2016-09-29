/**
 * Created by Beta on 29.09.2016.
 */
public class mediumburger extends burger {
    public mediumburger(){
        super("Medium","Bacon & Salami",5.23,"brown");
        super.addburger1("Chips",1.20);
        super.addburger2("Drink",1.01);
    }
    @Override
    public void addburger1(String name,double price){
        System.out.println("Cannot add additional items to a medium burger");
    }

    @Override
    public void addburger2(String name,double price){
        System.out.println("Cannot add additional items to a medium burger");
    }

    @Override
    public void addburger3(String name,double price){
        System.out.println("Cannot add additional items to a medium burger");
    }

    public void addburger4(String name,double price){
        System.out.println("Cannot add additional items to a medium burger");
    }

}
