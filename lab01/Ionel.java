
public class Ionel {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Ionut";

        System.out.println(s1.name);
        System.out.println(s1.sum(2, 5));

        s1.clear();
        System.out.println(s1.name);
    }
}

class Student {
    String    name;
    Integer   group;
    Character series;

    int sum(int a, int b) {
        return a + b;
    }

    void clear() {
        this.name   = "";
        this.group  = 0;
        this.series = 0;
    }
}
