package CodingBat.WarmUp1;

public class LastThree {
    public String endsUp(String str) {
        if(str.length()<=3) {
            return str;
        }else {
            int num=str.length()-3;  //
            String first=str.substring(0,num);
            String second=str.substring(num);
            return first+second.toUpperCase();
        }

    }
    public static void main(String[] args) {

        LastThree lastThree=new LastThree();
        System.out.println(lastThree.endsUp("bilgisayar"));
    }
}
