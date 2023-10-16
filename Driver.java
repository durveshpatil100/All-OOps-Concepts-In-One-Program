public class Driver {

    String name;
    long licenseNumber;
    long mobileNumber=778764654;

    public Driver() {
        this.name = "Car owner";
        this.licenseNumber = 45867654;
        this.mobileNumber = 830801136;

    }

    public Driver(String name, long licenseNumber, long mobileNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.mobileNumber = mobileNumber;
    }

    public void drive() {
        System.out.println("Drive Started...");
    }

    public void profile(String name){
        this.name = name;
    }

    public void profile(String name,long licenseNumber){
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void profile(String name,long licenseNumber, long mobileNumber){
        this.name = name;
        this.licenseNumber=licenseNumber;
        this.mobileNumber = mobileNumber;
    }

    public String getName(){
        return name;
    }

}

