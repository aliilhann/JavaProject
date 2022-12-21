package JavaClass.Class21;

public class Task1 {
    public static void main(String[] args) {
        UserInfo user=new UserInfo("aLi", "123","odessa");
        user.UserDetail();
    }
}

    class User {
        String name;
        String mobileNumber;

        User(String name, String mobileNumber) {
            this.name=name;
            this.mobileNumber=mobileNumber;
        }
    }
class UserInfo extends User {
      String address;
    UserInfo(String name, String mobileNumber,String address) {
        super(name, mobileNumber);
        this.address=address;
    }
    void UserDetail() {
        System.out.println(name +" "+ mobileNumber + " "+ address);
    }
}

