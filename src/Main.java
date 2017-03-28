public class Main {

    public static void main(String[] args) {
        Address address = new Address("123 High St", null, "Austin", "TX", "78704");
        Address address2 = new Address("135 Country Club Rd", null, "Brownsville", "TX", "78521");
        System.out.println(address);
        System.out.println(address2);
        Address[] addresses = new Address[2];
        addresses[0] = address;
        addresses[1] = address2;
        Member matt = new Member("Matt", "1986-01-29", addresses);
        System.out.println(matt);

        



    }
}
