package controlStatement;

public class JumpStatements {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i == 2){
                continue;//continue/break/return
            }
            System.out.println(i);
        }
        System.out.println("Selesai");
    }
}
