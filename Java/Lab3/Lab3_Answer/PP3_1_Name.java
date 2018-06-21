package ch3_pp;

public class PP3_1_Name {
    private String lastName;
    private String firstName;
    private int random;

    public PP3_1_Name (String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int generator(){
        random = (int)(Math.random() * 99) + 10;
        return random;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//    public int getRandom(){
//        return random;
//    }
}


