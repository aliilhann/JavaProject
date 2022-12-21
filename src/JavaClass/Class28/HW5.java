package JavaClass.Class28;

import java.util.TreeMap;
public class HW5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> employees=new TreeMap<>();
        employees.put("alex",123000);
        employees.put("meLinda",150000);
        employees.put("Luis",100000);
        employees.put("michaeL",90000);

        int maxValue=0;
        String maxKey="";
        var keys=employees.keySet();
        for(var key:keys) {
            if(employees.get(key)>maxValue) {
                maxValue=employees.get(key);
              maxKey=key;
            }
        }System.out.println(maxKey+ "="+maxValue);

    }

}

