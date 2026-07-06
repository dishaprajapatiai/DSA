public class Intro {
    public static void main(String[] args) {
        Pen p = new Pen();   //a object is created  name as Pen
        p.setColor("Red"); 
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);
        Student s = new Student();
        s.calPer(34,89,90);
    }
}

class Pen{
    // prop + func
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name ;
    int age;
    float percentage;

    void calPer(int phy, int maths, int eng){
        percentage = (phy + maths+eng)/3;
    }
}