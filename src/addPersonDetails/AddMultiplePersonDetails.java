package addPersonDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class AddMultiplePersonDetails {
    private String name;
    private String address;
    private int age;
    private int phoneNumber;
    AddMultiplePersonDetails() {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    String ToString() {
        return "Name" + getName() + "Address" + getAddress() + "Age" + getAge() + "PhoneNumber" + getPhoneNumber();
    }

    public static void main(String[] args) {

        Collection<AddMultiplePersonDetails> c = new ArrayList<AddMultiplePersonDetails>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("Select Option");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Person Name:");
                    String name = sc1.nextLine();
                    System.out.println("Enter Person Address:");
                    String address = sc1.nextLine();
                    System.out.println("Enter Person Age:");
                    int age = sc.nextInt();
                    System.out.println("Enter Person PhoneNumber:");
                    int phoneNumber = sc.nextInt();
                    c.add(new AddMultiplePersonDetails());
                case 2:
                    Iterator<AddMultiplePersonDetails>i=c.iterator();
                    i.hasNext();
                    System.out.println(i.next());
            }
        } while (ch != 0);
    }
}
