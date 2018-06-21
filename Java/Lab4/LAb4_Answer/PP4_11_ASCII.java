package PP_Excerice.PP4;

public class PP4_11_ASCII {
    public static void main(String[] args) {

        int start = 32;
        int end = 126;
        int count = 0;

        for(int i = start; i <= end; i++) {
            System.out.print(i + "\t" + (char)start + "\t");
            start++;
            count++;
            if(count == 5){
                System.out.println();
                count = 0;
            }
        }
    }
}
