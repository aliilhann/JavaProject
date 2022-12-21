package Variable;

public  class students {
   String name;
   String id;
   static int numberofStudents;

    public static void main(String[] args) {
        students roman= new students();
        roman.id="1";
        roman.name="Roman";
       numberofStudents++;

        students roma= new students();
        roman.id="1";
        roman.name="Roman";
        numberofStudents++;

        students rom= new students();
        roman.id="1";
        roman.name="Roman";
        numberofStudents++;

        System.out.println(numberofStudents);
    }
}
