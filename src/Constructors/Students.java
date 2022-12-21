package Constructors;

public class Students {
    String name;
    int subject1;
    int subject2;
    int subject3;

    Students(String newName, int newSubject1, int newSubject2,int newSubject3) {
        name=newName;
        subject1=newSubject1;
        subject2=newSubject2;
        subject3=newSubject3;
    }
    public void calculateAverage() {
        System.out.println("The average grade of " + name + " is " + (subject1+subject2+subject3)/3);
    }

    public static void main(String[] args) {
        Students student1=new Students("aLi", 85, 90, 80);
        Students student2=new Students("keLLy", 95, 100, 70);
        Students student3=new Students("meLinda", 60, 80, 100);
        Students student4=new Students("Logan", 100, 95, 85);
        Students student5=new Students("aLex", 75, 90, 85);
        student1.calculateAverage();
        student2.calculateAverage();
        student3.calculateAverage();
        student4.calculateAverage();
        student5.calculateAverage();
    }

}
