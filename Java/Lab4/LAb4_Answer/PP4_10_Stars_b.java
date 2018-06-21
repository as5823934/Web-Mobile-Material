package PP_Excerice.PP4;

public class PP4_10_Stars_b {
    public static void main(String[] args) {

        for(int i = 10; i >= 1; i--){
            for(int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
