/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.main;

import java.util.Scanner;
import static sales.main.Car.arr;

/**
 *
 * @author Mohamed Khaled
 */
public class Person {
    private static String email;
    private static String Password;

    public Person(String email, String Password) {

        this.email = email;
        this.Password = Password;
    }
    public Person(){
    
    }

    static int x = 0;
    static String useracc[] = new String[1000];
    static String userpass[] = new String[1000];

    public static void signup() {
        System.out.println("Write Email : ");
        Scanner input1 = new Scanner(System.in);
        useracc[x] = input1.next();
        System.out.println("Password : ");
        Scanner input2 = new Scanner(System.in);
        userpass[x] = input2.next();
        x++;
    }

    public static void login() {
        System.out.println("Write Email : ");
        Scanner input3 = new Scanner(System.in);
        String acc = input3.next();
        System.out.println("Password : ");
        Scanner input4 = new Scanner(System.in);
        String pass = input4.next();
        boolean A = false;
        for (int i = 0; i <= x; i++) {

            if (acc.equals(useracc[i]) && pass.equals(userpass[i])) {
                A = true;
                System.out.println("Login Success (User)");
              
                returnn.ShowUserMenu();
                break;
            } else if (acc.equals(Admin.getEmail()) && pass.equals(Admin.getPassword())) {
                A = true;
                System.out.println("Login Success (Admin)");
                returnn.ShowAdminMenu();
                
                break;
            }

        }
        if (A == false) {

            System.out.println("Sorry Your passward does not correct, cheak your passward  or make new accout " );

        }

    }
    
   public void Displaycars() {

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i + 1 + "- :" + " Model: " + arr.get(i).model + "   Manufacture: " + arr.get(i).manufacture + "   Color: " + arr.get(i).color + "   Year: " + arr.get(i).year 
                    + "   the sell Price: " + arr.get(i).sell_price );
        }
    }
      
}
