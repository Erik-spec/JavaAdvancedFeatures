package pachetelul1;

public class App {
    static ClassWithTheSameName firstPerson = new ClassWithTheSameName() ;
    static pachetelul2.ClassWithTheSameName secondPerson = new pachetelul2.ClassWithTheSameName() ;

    public static void main(String[] args) {
        System.out.println(firstPerson.age + firstPerson.gender + firstPerson.gender);
    }

}
