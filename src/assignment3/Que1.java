package assignment3;

 enum house {
    ONEBHK(3),
    TWOBHK(4),
    THREEBHK(5),
    BUNGLOW(10);
   private int price;
    house(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

}
public class Que1{
    public static void main(String[] args) {
        System.out.println("All Flat prices: ");
        for( house n: house.values()){
            System.out.println("House: "+ n+ " Price:" +n.getPrice() +" In Cr");
        }
    }
}
