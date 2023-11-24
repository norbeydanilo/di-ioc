package DI;
class Wheel {
    //...
}

class Battery {
    //...
}

class Carss {
    private Wheel wh; // Inject an Instance of Wheel (dependency of car) at runtime  
    private Battery bt; // Inject an Instance of Battery (dependency of car) at runtime

    //setter Injection
    void setWheel(Wheel wh) {  
        this.wh = wh;
    }

    void setBattery(Battery bt) {
        this.bt = bt;
    }
    //...
}
