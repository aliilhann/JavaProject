package JavaClass.Class19;

public class UserClass {
    String name;
    String mobileNumber;

    UserClass(String name,String mobileNumber) {
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}
class userInfo extends UserClass {
    String address;
    userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address=address;
    }
    void userinfo() {
        System.out.println("My name is "+ name + ".My address is "+ address +" .And my phone number is "+mobileNumber);
    }
}
class userDetails {
    public static void main(String[] args) {
        userInfo user=new userInfo("aLi","123-456-7890","Odessa , TX");
        user.userinfo();
    }
}
