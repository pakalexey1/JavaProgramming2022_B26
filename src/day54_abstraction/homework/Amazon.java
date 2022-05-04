package day54_abstraction.homework;

public final class Amazon extends OnlineShopping {

    @Override
    public void buyItem(){
        System.out.println("Buy an items");
    }

    @Override
    public void returnItem(){
        System.out.println("returning item");
    }
    @Override
    public void payForShipping(boolean b1){
        System.out.println("paying for shipping");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing cart");
    }
}
