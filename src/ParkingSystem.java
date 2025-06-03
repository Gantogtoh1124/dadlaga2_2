public class ParkingSystem {
    private int bigSlots;
    private int mediumSlots;
    private int smallSlots;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (bigSlots > 0) {
                bigSlots--;
                return true;
            }
        } else if (carType == 2) {
            if (mediumSlots > 0) {
                mediumSlots--;
                return true;
            }
        } else if (carType == 3) {
            if (smallSlots > 0) {
                smallSlots--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

        System.out.println(parkingSystem.addCar(1)); // true
        System.out.println(parkingSystem.addCar(2)); // true
        System.out.println(parkingSystem.addCar(3)); // false
        System.out.println(parkingSystem.addCar(1)); // false
    }
}
