public class vechile {
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public String name;
    public int cost;

    public int speed;
    public int gear;

    public vechile(String name, int cost, int speed, int gear) {
        this.name = name;
        this.cost = cost;

        this.speed = speed;
        this.gear = gear;
    }

    public void gear(int gear){

        System.out.println("vechile moving at gear"+ gear);
    }

    public void speed(int speed){

        System.out.println("vechile ,oving at speed"+ speed);
    }
}
