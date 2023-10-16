import java.util.Scanner;

public class Car {
    Driver driver;
    Beverages beverages;
    String carChoice;

     Car() {
        this.carChoice = "SUV";
    }

    Car(String carChoice){
        this.carChoice = carChoice;
    }

    void getInTheCar(Driver driver){
        System.out.println("Hey "+ driver.getName()+ "Enjoy the driving with your "+ this.carChoice+ " Car");
        driver.drive();
    }

    void enjoyBeverages(){
        System.out.println("Want Beverages ?"+" Enter 1 for tea and 2 for coffee!!");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice ==1){
            beverages = new Tea();
        }
        if(choice ==2){
            beverages =new Coffee();
        }
        beverages.getBeverage();
    }

}
