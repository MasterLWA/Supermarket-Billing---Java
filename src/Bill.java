import java.util.Date;

public class Bill {
    private int billID;
    private  float totalPrice;
    private Date date;
    //private String *items[];


    public float calTotal() {

        return 0;
    }

    public void displayTotal(){
        System.out.println("Total:"+ totalPrice);
        System.out.println("Bill Number: " + billID);
    }

}
