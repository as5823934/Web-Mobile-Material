package PP_Excerice.PP4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PP4_16_File {

        public static void main(String[] args) throws FileNotFoundException {

            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);

//
//            File rm = new File("readme.txt");
//            Scanner in = new Scanner(rm);
//
//
//            //prints paragraph
//            String paragraph = "";
//            int line_number = 0;
//
//            while(in.hasNext()) {
//                paragraph += line_number + ": " + in.nextLine() + "\n";
//                line_number++;
//            }
//
//            System.out.println(paragraph);

            Scanner scan = new Scanner(new File("num.txt"));

            int [] nums = new int [15];
            int i = 0;

            while(scan.hasNext()) {
                nums[i++] = scan.nextInt();
            }
            System.out.println(Arrays.toString(nums));
    }
}
