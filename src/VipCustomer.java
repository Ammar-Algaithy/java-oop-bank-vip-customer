public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCreditLimit() {

        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {

        this.creditLimit = creditLimit;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VipCustomer(){
        this("Null", 000, "Hola@gmail.com");
        System.out.println("empty");
    }

    public void displayInfo(){
        System.out.println(this.getName());
        System.out.println(this.getEmail());
        System.out.println(this.getCreditLimit());
    }
}
