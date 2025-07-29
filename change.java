class legend {
    String name;
    int age;
    float Hdr;

    // Parameterized Constructor
    legend(String name , int age, float Hdr) {
        System.out.println("Parameterized constructor called!");
        this.name = name;   // current object ka name set
        this.age = age;     // current object ka age set
        this.Hdr = Hdr;     // current object ka Hdr set
    }
}

public class change {
    public static void main(String[] args) {
        
       // Object banate waqt hi values pass ki (parameterized constructor use)
       legend lg = new legend("me sabka papa" , 18, 99.99f);

       // Values print ki
       System.out.println(" Name : " + lg.name);  
       System.out.println(" Age : " + lg.age);    
       System.out.println(" HDR : " + lg.Hdr);
    }
}