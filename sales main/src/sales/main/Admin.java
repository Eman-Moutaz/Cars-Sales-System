package sales.main;

import java.util.Scanner;
import static sales.main.Car.arr;

public class Admin extends Person{

    private static String email;
    private static String Password;

    public Admin(String email, String Password) {

       super( email,Password);
        this.email = email;
        this.Password = Password;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return Password;
    }
 public static void Add() {
        System.out.println("How Many Cars you want Add ?");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(i + 1 + "- :");
            System.out.println("Model :-");
            String k1 = new String(input.next());
            System.out.println("manufactor :-");
            String k2 = new String(input.next());
            System.out.println("Color :-");
            String k3 = new String(input.next());
            System.out.println("Year :-");
            String k4 = new String(input.next());
            System.out.println(" the sell Price :-");
            String k5 = new String(input.next());
            System.out.println(" the actual Price :-");
            String k6 = new String(input.next());
            arr.add(new Car(k1, k2, k3, k4, k5,k6));
            System.out.println("Car Added Succeeded");

        }
 
 }
@Override
   public void Displaycars()  {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i + 1 + "- :" + " Model: " + arr.get(i).model + "   Manufacture: " + arr.get(i).manufacture + "   Color: " + arr.get(i).color + "   Year: " + arr.get(i).year +
                    "   sell_price: " + arr.get(i).sell_price + "   the actual price: "
                    + arr.get(i).actual_price  );
        }
    }
}
