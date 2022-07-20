//package customer;

public class registedCustomer extends customer {
    private String name;
    private int age;
    private String cityName;
    private int discount;

    public void setDetails(String nme, int ag, String cty){
        name = nme;
        age = ag;
        cityName = cty;

        if(age>10 && age <50){
            discount = 10;
        }
         else if (age >= 50 && age < 120) {
             discount = 25;

        }
    }

    
}
