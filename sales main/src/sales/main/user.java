
package sales.main;

import java.util.Scanner;
import static sales.main.Car.arr;

public class user extends Person {

    public user( String email,  String Password) {
        super( email,Password);
    }
    
     @Override
  public  void Displaycars() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i + 1 + "- :" + " Model: " + arr.get(i).model + "   Manufacture: " + arr.get(i).manufacture + "   Color: " + arr.get(i).color + "   Year: " + arr.get(i).year + "   Price: " + arr.get(i).sell_price);
        }
    }
}
