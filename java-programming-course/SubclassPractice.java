public class SubclassPractice {
 
    public static void main(String[] args) {
        // no constructor
        RacingCar rc = new RacingCar();
        rc.setCar(1, "12가 3456");
        rc.setSpeed(300);
        
        System.out.println( rc.getNum() );
        System.out.println( rc.getcarNumber() );
        System.out.println( rc.getSpeed() );
    }
}
 
class Car {
    private int num;
    private String carNumber;
    
    public Car() {
        this.num = 0;
        this.carNumber = "";
        System.out.println("자동차가 생성되었습니다.");
    }
    public void setCar (int num, String carNumber) {
        this.num = num;
        this.carNumber = carNumber;
    }
    public int getNum() {
        return this.num;
    }
    public String getcarNumber() {
        return this.carNumber;
    }
}
 
class RacingCar extends Car {
    private int max_speed;
    
    public RacingCar() {
        this.max_speed = 0;
        System.out.println("경주용차가 생성되었습니다.");
    }
    public void setSpeed (int max_speed) {
        this.max_speed = max_speed;
    }
    public int getSpeed () {
        return this.max_speed;
    }
}