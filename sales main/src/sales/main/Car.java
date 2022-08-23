package sales.main;

import java.util.Scanner;
import java.util.ArrayList;

public  class Car {

    public String model;
    public String manufacture;
    public String color;
    public String year;
    public String sell_price;
    public String actual_price;
    static ArrayList<Car> arr = new ArrayList<Car>();
    static int index = 0;

    public Car(String model, String manufacture, String color, String year, String sell_price, String actual_price  ) {
        this.model = model;
        this.manufacture = manufacture;
        this.color = color;
        this.year = year;
        this.sell_price = sell_price;
        this.actual_price = actual_price;
    }

    public static void Buy() {
        boolean x = false;
        System.out.println("               List Of Cars");
        new Admin("lol", "123").Displaycars();        
        String model;
        String color;
        System.out.println("Enter The Model : ");
        Scanner input1 = new Scanner(System.in);
        model = input1.next();
        System.out.println("Enter The Color : ");
        Scanner input2 = new Scanner(System.in);
        color = input2.next();
        for (int i = 0; i < arr.size(); i++) {
            if (model.equals(arr.get(i).model) && color.equals(arr.get(i).color)) {
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);
                System.out.println("buying succeeded");
                x = true;

            }

        }
        if (x == false) {
            System.out.println("Car Not Foud");
        }
    }

   

    

    public static void Search() {
        boolean x = false;
        System.out.println("Enter The Model Of The Car");
        Scanner input = new Scanner(System.in);
        String carmodel = new String(input.next());
        for (int i = 0; i < arr.size(); i++) {
            if (carmodel.equals(arr.get(i).model)) {
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);
                x = true;
                
            }
        }
        if (x == false) {
            System.out.println("Car Not Found");
        }
       
    }

   

    public static void Edit() {
       new Admin("lol","123").Displaycars();
         System.out.println("Enter The Num Of Car To Edit It");
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
for(int i=0;i<arr.size();i++){
        if (i == num-1) {
            System.out.println("To Edit In Model write (m),manufacture(ma),color(c),year(y),price(p)");
            String x1 = new String(input.next());
            if (x1.equals("m")) {
                System.out.println("Enter The New Model");
                String x2 = new String(input.next());
                arr.get(i).model = x2;
                System.out.println("Car After Edit:");
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);

            } else if (x1.equals("ma")) {
                System.out.println("Enter The New Manufacture");
                String x2 = new String(input.next());
                arr.get(i).manufacture = x2;
                System.out.println("Car After Edit:");
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);

            } else if (x1.equals("c")) {
                System.out.println("Enter The New Color");
                String x2 = new String(input.next());
                arr.get(i).color = x2;
                System.out.println("Car After Edit:");
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);

            } else if (x1.equals("y")) {
                System.out.println("Enter The New year");
                String x2 = new String(input.next());
                arr.get(i).year = x2;
                System.out.println("Car After Edit:");
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);

            } else if (x1.equals("p")) {
                System.out.println("Enter The New Price");
                String x2 = new String(input.next());
                arr.get(i).sell_price = x2;
                System.out.println("Car After Edit:");
                System.out.println("Model: " + arr.get(i).model + "  Manufacture: " + arr.get(i).manufacture + "  Color: " + arr.get(i).color + " Year: " + arr.get(i).year + " Price: " + arr.get(i).sell_price);

            }

        }

    }
    }

    public static void Remove() {
        new Admin("lol", "123").Displaycars(); 
        System.out.println("Enter The Num Of Car To Remove It");
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (i == num-1) {
                arr.remove(arr.get(i));
                System.out.println("Car Removed");
            }

        }
    }

    
}
