/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.main;

import java.util.Scanner;

/**
 *
 * @author EslamHany
 */
public class returnn {

    public static void ShowAdminMenu() {

        System.out.println("1-Add Car");
        System.out.println("2-Display");
        System.out.println("3-Edit");
        System.out.println("4-Remove Car");
        System.out.println("5-Return To Main Menu");
        System.out.println("6-Exit");
        int x ;
        int z ;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        switch (x) {
            case 1:
                Admin.Add();
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowAdminMenu();
                }
                break;
            case 2:
                new Admin("lol", "123").Displaycars(); 
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowAdminMenu();
                }
                break;
            case 3:
                Car.Edit();
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowAdminMenu();
                }
                break;
            case 4:
                Car.Remove();
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowAdminMenu();
                }
                break;
            case 5:
                returnn.ShowMainMenu();
                break;
            case 6:
                System.out.println("           Thanks For Using This Program");
                break;
        }
    }

    public static void ShowUserMenu() {

        System.out.println("1-Display");
        System.out.println("2-Search");
        System.out.println("3-Buy Car");
        System.out.println("4-Return To Main Menu");
        System.out.println("5-Exit");
        int x ;
        int z ;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        switch (x) {
            case 1:
                new user("lol", "123").Displaycars(); 
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowUserMenu();
                }
                break;
            case 2:
                Car.Search();
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowUserMenu();
                    break;
                }
            case 3:
                Car.Edit();
                System.out.println("Enter 0 To Return Main Menu");
                z = input.nextInt();
                if (z == 0) {
                    returnn.ShowUserMenu();
                }
                break;
            case 4:
                returnn.ShowMainMenu();
                break;
            case 5:
                System.out.println("           Thanks For Using This Program");
                break;
        }
    }

    public static void ShowMainMenu() {
        System.out.println("                Hello");
        System.out.println("1-Signup");
        System.out.println("2-Login");
        //System.out.println("3-Return To Main Menu");
        System.out.println("3-Exit");
        Scanner input = new Scanner(System.in);
        int x = 0;
        x = input.nextInt();
        switch (x) {
            case 1:
                Person.signup();
                returnn.ShowMainMenu();
                break;
            case 2:
                Person.login();
                break;
            case 3:
                returnn.ShowMainMenu();
                break;
            case 4:
                System.out.println("           Thanks For Using This Program");
                break;
        }

    }

}
