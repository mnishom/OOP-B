package controlStatement;

public class Quiz1 {
    public static void main(String[] args) {
        //Loop 1-25 dengan Output: 1,3,5,9,13,15,19,21,23,25
        
        for(int i = 1; i<=25; i+=2){
            if(i==7 || i == 11 || i == 17){
                continue;               
            }
            
//            System.out.print(i);
//            if(i < 25){
//                System.out.print(",");
//            }
            
            System.out.print(i < 25 ? i+",":i);
        }
    }
}
