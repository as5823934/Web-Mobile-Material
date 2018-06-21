package PP_Excerice.PP4;

public class PP4_6_MutiTable {
    public static void main(String[] args) {

        int result;

        for(int i = 1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                result = j * i;
                System.out.print(j + " * " + i + " = " + result + "\t\t");
            }


            System.out.println("\t");
        }
    }
}
