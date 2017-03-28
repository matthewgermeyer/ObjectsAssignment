//Create Address class, define its fields.
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateAbbr;
    private String zip;

    //Constructor
    public Address() {
        System.out.println("in constructor");
    }

    public Address(String addressLine1,
                  String addressLine2,
                  String city,
                  String state,
                  String zip)
    {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateAbbr = state;
        this.zip = zip;}

    //Setters and getters for Address Class
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStateAbbr() {
        return stateAbbr;
    }
    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    //toString for Address Class
    @Override
    public String toString() {
        return "Address{" +

                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", stateAbbr='" + stateAbbr + '\'' +
                ", zip='" + zip + '\'' +

                '}';

}}

