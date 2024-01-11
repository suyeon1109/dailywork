public class SubclassPractice {
    public static void main(String[] args) {
        // no constructor
        RacingCar rc = new RacingCar();
        rc.setCar(1, "12가 3456", "Jennie");
        rc.setSpeed(300);
        
        System.out.println(rc.getNum());
        System.out.println(rc.getcarNumber());
        System.out.println(rc.getSpeed());
    }
}

class Car {
    private int num;
    private String carNumber;
    public String driver;
    
    public Car() {
        this.num = 0;
        this.driver = "";
        this.carNumber = "";
        System.out.println("Car created");
    }
    public void setCar (int num, String carNumber, String driver) {
        this.num = num;
        this.carNumber = carNumber;
        this.driver = driver;
    }
    public int getNum() {
        return this.num;
    }
    public String getcarNumber() {
        return this.carNumber;
    }
    public String getDriver() {
        return this.driver;
    }
}

class RacingCar extends Car {
    private int max_speed;
    
    public RacingCar() {
        super(driver);
        this.max_speed = 100;
        System.out.println("Racing car created");
    }
    public void setSpeed (int max_speed) {
        this.max_speed = max_speed;
    }
    public int getSpeed () {
        return this.max_speed;
    }
    public void warnedDriver(String driver) {
        super(driver);
        System.out.println("warning to "+driver);
    }
}