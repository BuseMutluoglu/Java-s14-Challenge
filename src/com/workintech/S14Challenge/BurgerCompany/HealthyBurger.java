package com.workintech.S14Challenge.BurgerCompany;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        super.setMeat("Tofu");
    }


    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        String explanation=super.itemize();
        System.out.println(explanation);
        StringBuilder builder=new StringBuilder();
        if(healthyExtra1Name!=null){
           builder.append("HealthAdd1 : " + healthyExtra1Name + "\n");
        } else if (healthyExtra2Name!=null){
            builder.append("HealthAdd2: " +healthyExtra2Name + "\n");
        }
        double healthPrice= getPrice() +healthyExtra1Price +healthyExtra2Price;
        builder.append("Total price: " + healthPrice);
        System.out.println(builder.toString());
        return healthPrice;
    }
}
