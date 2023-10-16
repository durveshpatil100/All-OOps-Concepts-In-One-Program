import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome For a nice Drive...");

        Scanner sc = new Scanner(System.in);

        Driver newDriver = new Driver();
        newDriver.profile("peter");

        Car c;

        System.out.println("Choose your own Car/n"+ "Press 0 for default car or 1 for Your Choice");

        int carType = sc.nextInt();
        if (carType ==1) {
            System.out.println("Enter Car name");
            String carName = sc.next();
            c= new Car(carName);
        }else{
            c=new Car();
        }

        c.getInTheCar(newDriver);
        c.enjoyBeverages();

    }
}
