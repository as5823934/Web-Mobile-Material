package PP_Excerice.PP4;

public class PP4_10_Stars_d {
    public static void main(String[] args) {

        for(int i = 10; i >= 1; i--){
            for(int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
