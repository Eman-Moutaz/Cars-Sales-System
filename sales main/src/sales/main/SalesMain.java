package sales.main;

import java.util.Scanner;
import static sales.main.Car.arr;

public class SalesMain {

    public static void main(String[] args) {
        initData();
        int x = 0;
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("lol", "123");

        System.out.println("                Hello");
        System.out.println("1-Signup");
        System.out.println("2-Login");
        //System.out.println("3-Return To Main Menu");
        System.out.println("3-Exit");
        x = input.nextInt();
        switch (x) {
            case 1:
                user.signup();
                returnn.ShowMainMenu();
                break;
            case 2:
                user.login();
                break;
            case 3:
                returnn.ShowMainMenu();
                break;
            case 4:
                System.out.println("           Thanks For Using This Program");
                break;
        }
    }
public static void initData() {
        arr.add(new Car("BMW", "X3", "Black", "2020", "20000$","180000$"));
        arr.add(new Car("BMW", "X6", "Red", "2020", "45000$","180000$"));
         arr.add(new Car("Honda", "X5", "gray", "2020", "6000$","180000$"));
        arr.add(new Car("Mercury", "X8", "Red", "2020", "25000$","180000$"));
         arr.add(new Car("Honda", "X3", "Black", "2020", "20000$","180000$"));
        arr.add(new Car("Vauxhall", "X9", "Red", "2020", "45000$","180000$"));
        

    }
    }

