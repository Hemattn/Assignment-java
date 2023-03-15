package assignment2;

public class Ques1 {
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        sbi.showBank();
        sbi.SBI_setter("State Bank of India", "Faridabaad", "Vipul Kumar",
                25, 5, 10.5, 13.6);
        sbi.SBI_getter();
        System.out.println(sbi.toString());

        BOI boi = new BOI();
        boi.showBank();
        boi.BOI_setter("Bank of India", "Ghaziabad", "Vansh Mehra",
                10, 6.5, 11.6, 13);
        boi.BOI_getter();
        System.out.println(boi.toString());

        ICICI icici = new ICICI();
        icici.showBank();
        icici.ICICI_setter("ICICI", "Noida", "Shubash Ghai", 15,
                7.5, 12, 15);
        icici.ICICI_getter();
        System.out.println(icici.toString());
    }
}
