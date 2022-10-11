package Class19HW;

public class UserInfo extends UserClass{

     String userAddress;

    UserInfo(String name, String mobileNumber, String userAddress) {

        super(name, mobileNumber);
        this.userAddress = userAddress;
    }

    void userDetails() {

        System.out.println("name: "+ name+ ", number: "+ mobileNumber + ", address: "+ userAddress);
    }
}
