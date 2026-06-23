public class main {
    public static void main(String[] args) {
        Person p1 = new Person("ahmed", "1200");
        Person p2 = new Student("ali", "567");
        Person p3 = new Lecturer("dr.izad", "74321");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}


