package com.workintech.S14Challenge.BurgerCompany;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String  addition1Name;
    private String  addition2Name;
    private String  addition3Name;
    private String  addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, double price, String breadRollType ) {
        this.name = name;
        this.breadRollType=breadRollType;
        this.meat = "Normal";
        this.price = price;

    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
            this.addition1Name=addition1Name;
            this.addition1Price=addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
    }
    public double itemizeHamburger (){
        String explanation=itemize();
        System.out.println(explanation);
        System.out.println("Price: " + getPrice());
        return getPrice();
    }
    public String itemize() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType + "\n");

        if (addition1Name != null) {
            builder.append("Addition1: " + addition1Name + "\n");
            price = price + addition1Price;
        }

        if (addition2Name != null) {
            builder.append("Addition2: " + addition2Name + "\n");
            price = price + addition2Price;
        }

        if (addition3Name != null) {
            builder.append("Addition3: " + addition3Name + "\n");
            price = price + addition3Price;
        }

        if (addition4Name != null) {
            builder.append("Addition4: " + addition4Name + "\n");
            price = price + addition4Price;
        }
        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public void setAddition2Name(String addition2Name) {
        this.addition2Name = addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }



}
