public class Car implements CarInterface, VehicleInterface {
    public static void main(String[] args) {
        VehicleInterface.ride();
    }
    @Override
    public void print(){
        // System.out.println("Car detected");
        VehicleInterface.super.print();
    }
}
