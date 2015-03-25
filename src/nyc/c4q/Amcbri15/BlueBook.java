package nyc.c4q.Amcbri15;

/**
 * Access Code 2.1
 *
 * Author  Anthony McBride
 * Date    March 2015
 *
 * This class asks the user which car they have and prints its price.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BlueBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("toyota", "camry", 2000, 3000));
        cars.add(new Car("toyota", "corolla", 2002, 4000));
        cars.add(new Car("honda", "civic", 2005, 5500));
        cars.add(new Car("honda", "accord", 2004, 5000));
        String make;
        String model;
        int year;

        System.out.println(cars.get(2).getPrice());

        // 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.
        System.out.println("Please enter the make of the car you're searching for: ");
        make = in.next();
        System.out.println("Please enter the model of the car you're searching for: ");
        model = in.next();
        System.out.println("Please enter the year of the car you're looking for: ");
        year = in.nextInt();


        // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
        //    ...make
        //    ...model
        //    ...year
        for (int i = 0; i < cars.size(); i++) {

            Car car = cars.get(i);
            if (car.getMake().equals(make) && car.getModel().equals(model) && car.getYear() == year) {
                System.out.println("The price of this car is " + car.getPrice());
                break;
            }
        }

        // 6. Print the price of that car.
    }
}