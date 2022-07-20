import java.util.Date;

public class Bill {
    private int billID;
    private  float totalPrice;
    private Date date;
    private  int Discount;
    //private String *items[];


    public float calTotal() {

        return 0;
    }

    public void displayTotal(){
        System.out.println("Total:"+ totalPrice);
        System.out.println("Bill Number: " + billID);
        System.out.println("Discount" + Discount );
        System.out.println("Date :" + date);
    }

}
