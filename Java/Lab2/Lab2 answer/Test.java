package ClassExamples;
public class Test {
//    private int n1;
//    private int n2;
//    private int n;
//    private int times;
    //private String sentence;

    public Test(){

    }
    //ex 5.6
    public void lyrics(){
        System.out.println("This is lyrics");
    }
    //ex 5.7
    public int cube(int n){
        int result = n * n * n;
        return result;
    }
    //ex 5.8
    public int random100(){
        int result = (int)(Math.random() * 100) +1;
        return result;
    }
    //ex 5.9
    public int randonInRange(int n1, int n2){
        int result = (int)(Math.random() * n2 + 1) + n1;
        return result;
    }
    //ex 5.10
    public void powerOfTwo(){
        int result = 0;
        for (int i = 2; i < 12; i++){
            result = i * i;
            System.out.println(result);
        }

    }
    //ex 5.11
    public void alarm(int times){

        if (times < 1) {
            System.out.println("Error");
        }
        else {
            for (int count = 1; count <= times; count++)
                System.out.println("Alarm");
        }

    }

    //ex 5.12
    public int sum100(int n){
        int sum = 0;
        while(n <= 100){
            sum += n;
            n++;
        }
        return sum;
    }

    //ex 5.13
    public String maxOfTwo(int n1, int n2){
        if(n1 > n2){
            return String.valueOf(n1);
        }
        if (n2 > n1) {
            return String.valueOf(n2);
        }
        return "Tie";
    }

    //ex 5.14
    public String hunter(int n1, int n2) {

        if (n2 < n1) {
            return 0 + " Error";
        }

        int sum = 0;
        while (n1 < n2) {
            sum += n1;
            n1++;
        }
        return String.valueOf(sum);
    }

    //ex 5.15

    public boolean larger(double n1, double n2){
        return (n1 > n2);
    }

    //ex5.16
    public String countA(String sentence){
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == 'A') {
                count++;
            }
        }
        return count + " times";
    }

    //ex 5.17
    public boolean evenlyDivisible(int n1, int n2){
        if (n1 == 0 || n2 == 0){
            return false;
        }
        else if(n1 % n2 == 0 || n2 % n1 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //ex 5.18
    public boolean isAlpha(char a){
        return (Character.isLetter(a));
    }

    //ex 5.19
    public boolean floatEquals(float n1, float n2, float within){
        return (Math.abs(n1 - n2) <= within);
    }

    //ex 5.20

    public String reverse(String n){
        String result = "";
        for(int i = n.length()-1; i >= 0; i--){
            result += n.charAt(i);
        }
        return result;
    }

    //ex 5.21
    public boolean isIsosceles(int n1, int n2, int n3){
        if ((n1 == n2 || n1 == n3 || n2 == n3) && ((n1 + n2 +n3) % 3 != 0)) {
            return true;
        }
        else{
            return false;
        }
    }

    //ex 5.22
    public float average(int n1, int n2){
        float result = (float)(n1 + n2) / 2;
        return result;
    }

    //ex 5.23
    public float average(int n1, int n2, int n3){
        float result = (float)(n1 + n2 + n3) / 3;
        return result;
    }

    //ex 5.24
    public float average(int n1, int n2, int n3, int n4){
        float result = (float)(n1 + n2 + n3 + n4) / 4;
        return result;
    }

    //ex 5.25
    public String multiConcat(String n1, int n2){
        if (n2 < 2){
            return n1;
        }
        String result;
        for (int i = 0; n2 >= 1; n2--){
            System.out.print(n1);
        }
        return "";
    }

    //ex 5.26
    public String multiConcat(String n1){
        System.out.print(n1 + n1);
        return "";
    }

    //ex 5.27



}

