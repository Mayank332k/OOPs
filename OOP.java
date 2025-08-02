class Person {
    String name;
    int age;


    public void printInfo(String name ){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name , int age ){
        System.out.println(this.name + " " + this.age );
    }

}

public class OOP {
    public static void main(String[] args) {
        Person men = new Person();

        men.name = "Mayank";
        men.age = 18;

        men.printInfo(men.name , men.age);
    }
}