package ch3_pp;

public class PP3_1_NameDrive {
    public static void main(String[] args) {
        PP3_1_Name user = new PP3_1_Name("Puanani", "Lkaia");
        char userLast;
        String userFirst, userName;

        userLast = user.getLastName().charAt(0);
        userFirst = user.getFirstName().substring(0,5);
        userName = userLast + userFirst;

        System.out.println(userName + user.generator());
        //System.out.println(user.generator());
    }



}
