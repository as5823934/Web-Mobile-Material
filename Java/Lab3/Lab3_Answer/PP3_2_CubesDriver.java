package ch3_pp;

public class PP3_2_CubesDriver {
    public static void main(String[] args) {
        PP3_2_CubsSum cube1 = new PP3_2_CubsSum(5, 10);
        double a, a1, a2, sumA;
        double b, b1, b2, sumB;
        a = cube1.getA();
        a1 = Math.pow(a, 2);
        a2 = Math.pow(a, 3);
        sumA = a + a1 + a2;
        System.out.println("Cubes 1 = " + a + " + "+ a1 + " + "+ a2 + " = " + sumA);

        b = cube1.getB();
        b1 = Math.pow(b, 2);
        b2 = Math.pow(b, 3);
        sumB = b + b1 + b2;
        System.out.println("Cubes 2 = " + b + " + "+ b1 + " + "+ b2 + " = " + sumB);



    }


}
