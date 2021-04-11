package HomeWork5;

public class Person {

     String fullName;
     String position;
     String e_mail;
     int age;
     long phone;




    public  void preseter(){
        System.out.println(fullName +"; " + position +"; "
                + e_mail+ "; " +age + "; " +phone);
    }

    public Person(String fullName, String position, String e_mail, int age, long phone) {
        this.fullName = fullName;
        this.position = position;
        this.e_mail = e_mail;
        this.age = age;
        this.phone = phone;
    }
}

