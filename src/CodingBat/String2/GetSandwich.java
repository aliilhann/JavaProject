package CodingBat.String2;

public class GetSandwich {
    /*

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance
 of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
     */
    public String getSandwich(String str) {
      int front=str.indexOf("bread");
      int end=str.lastIndexOf("bread");
      if(front==end) {
          return "";
      }
      return str.substring(front+5,end);



    }

}
