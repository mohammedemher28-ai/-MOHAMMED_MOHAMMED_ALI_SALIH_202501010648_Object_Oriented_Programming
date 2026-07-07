public class Main {

    public static void main(String[] args) {

        Appliance wm = new WashingMachine("LG");

        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println();

        Appliance fridge = new Refrigerator("Panasonic");

        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();

        System.out.println();

        Appliance tv = new Television("Samsung");

        tv.displayBrand();
        tv.turnOn();
        tv.operate();
        tv.turnOff();

        System.out.println();

        Appliance ac = new AirConditioner("Daikin");

        ac.displayBrand();
        ac.turnOn();
        ac.operate();
        ac.turnOff();
    }
}
