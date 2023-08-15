public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingAdded = 150;
    private int backpackPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded =false;
    private boolean isExtraTroppingAdded =false;
    private boolean isTakeaway =false;



    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;

        }
        basePizzaPrice = this.price;
    }
    public void getPizzaPrice(){
        System.out.println(this.price);
    }

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price +=extraCheesePrice;


    }
    public void addExtraTroppings(){
        isExtraTroppingAdded=true;
        this.price +=extraToppingAdded;


    }

    public void takeAway(){
        isTakeaway=true;
        this.price +=backpackPrice;

    }
    public void getBill(){
        String bill ="";
        System.out.println("Pizza : "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill +="Extra Cheese added :" +extraCheesePrice +"\n" ;
        }
        if(isExtraTroppingAdded){
            bill +="Extra Tropping added :" +extraCheesePrice +"\n" ;
        }
        if(isTakeaway){
            bill +="Takeaway :" +backpackPrice +"\n" ;
        }
        bill += "Bill :" +this.price +"\n";
        System.out.println(bill);
    }
}
