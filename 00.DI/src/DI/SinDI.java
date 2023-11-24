package DI;
class Wheel {
    // ...
}

class NepaliRubberWheel extends Wheel {
    // ...
}

class Battery {
    // ...
}

class ExcideBattery extends Battery {
    // ...
}

class Cars {
    private Wheel wh = new NepaliRubberWheel();
    private Battery bt = new ExcideBattery();
    // ...

    /*
     * Car está fuertemente acoplado a estas clases específicas (NepaliRubberWheel y ExcideBattery), 
     * lo que puede hacer que el código sea más difícil de mantener y de probar.
     */
}
