package DI;
class Car {
    private Wheel wh; // Inject an Instance of Wheel (dependency of car) at runtime
    private Battery bt; // Inject an Instance of Battery (dependency of car) at runtime

    // setter Injection
    public void setWheel(Wheel wh) {
        this.wh = wh;
    }

    public void setBattery(Battery bt) {
        this.bt = bt;
    }
    // ...

    public void drive() {
        // Lógica para conducir el coche
        System.out.println("Car is driving...");
        System.out.println(wh);
        System.out.println(bt);
    }

    /*
     * puedes inyectar cualquier implementación de Wheel y Battery en Car en tiempo
     * de ejecución
     */
}