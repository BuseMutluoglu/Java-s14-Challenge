package com.workintech.S14Challenge.BurgerCompany;

public class DeluxeBurger extends Hamburger{

    private String cips;
    private  String  drink;

    public DeluxeBurger() {
        super("DeluxeBurger", 19.1, "Double Sandwich");
        super.setMeat("Double");
    }


    public double itemizeHamburger (String addition1Name, String addition2Name, String addition3Name, String addition4Name){
        if(!addition1Name.equals(null)){
            setAddition1Name(addition1Name);
        } else if (!addition2Name.equals(null)){
            setAddition2Name(addition2Name);
        } else if (!addition3Name.equals(null)) {
            setAddition3Name(addition3Name);
        } else if (!addition4Name.equals(null)) {
            setAddition4Name(addition4Name);
        }
        System.out.println("Toplam malzeme" + getName() + "\n" + getMeat() + "\n" +
                getBreadRollType() + "\n" + getAddition1Name()+ "\n" + getAddition2Name()+ "\n" +getAddition3Name()
                + "\n" + getAddition4Name() +"\n" + cips + drink);

        return getPrice()+getAddition3Price()+getAddition1Price()+getAddition2Price()+getAddition4Price();
    }

    public void autoMessageForExtra(){
        System.out.println("Üzgünüz" + getClass().getSimpleName() + "extra malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        autoMessageForExtra();
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        autoMessageForExtra();
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        autoMessageForExtra();
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        autoMessageForExtra();
    }
}
