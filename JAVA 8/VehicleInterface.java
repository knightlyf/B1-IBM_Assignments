public interface VehicleInterface {
    default void print(){
        System.out.println("Vehicle Interface");
    }
    static void ride(){
        System.out.println("Car is riding");
    }
}
