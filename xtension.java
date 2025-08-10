//  lets try exceptiion handeling 

public class xtension {
    public static void main(String[] args) {
        
        int [] marks = {23 , 56 , 78 , 90};
        try{ // koshsh kr agr sab kuchh theek hai to shi agar nhi to exception ko cath karo and aage badho
        System.out.println(marks[1]);
        } catch(Exception exception){
            // kuchh kro agar error aayi to solve krne ki try kro
            System.out.println("error found at searching at index!");
        }
         System.out.println("the  student name is mayank !"); // prited 
    }
}