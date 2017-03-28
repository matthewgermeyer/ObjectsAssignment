import java.time.LocalDate;
import java.util.Arrays;

public class Member {
    private String name;
    private LocalDate dob;
    private Address[] addresses;

    public Member(String name, String dob, Address[] addresses) {
        this.name = name;
        this.dob = LocalDate.parse(dob);
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", addresses=" + Arrays.toString(addresses) +
                '}';
    }
}
