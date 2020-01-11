public class ferrari extends car {

    public int enginespeed;
    public int rating;
    public int brandlevel;

    public ferrari( int cost, int speed, int gear, int model, int version, int wheels, int enginespeed, int rating, int brandlevel) {
        super("ferrari", 2, speed, gear, model, version, wheels);
        this.enginespeed = enginespeed;
        this.rating = rating;
        this.brandlevel = brandlevel;
    }

    public void speed(int speed){
        System.out.println("ferrari is moving at a speed of "+ speed);

    }

    public void gear(int gear){
        System.out.println("ferrari is moving at a speed of "+ gear);

    }


}
