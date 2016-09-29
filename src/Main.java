/**
 * Created by Beta on 28.09.2016.
 */
public class Main{

    public static void main(String[] args){
    burger unu=new burger("special","sauceges", (double) 12,"9 wheat");
    double pricess=unu.itemsizeburger();
    unu.addburger1("tomato",0.27);
    unu.addburger2("lettuce",0.12);
    unu.addburger3("peppers",0.15);
    System.out.println("The total price "+unu.itemsizeburger());
    }

}
