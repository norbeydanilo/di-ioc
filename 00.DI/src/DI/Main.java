package DI;
class Main {
    /*
     * Se puede inyectar cualquier implementación de Wheel y Battery en Car en tiempo de ejecución. 
     * Esto podría hacerse, por ejemplo, en tu método main o en un marco de inyección de dependencias como Spring.
     */
    public static void main(String[] args) {
        // Crear instancias de Wheel y Battery
        Wheel wh = new NepaliRubberWheel();
        Battery bt = new ExcideBattery();

        // Crear una instancia de Car
        Car car = new Car();

        // Inyectar las dependencias
        car.setWheel(wh);
        car.setBattery(bt);

        // Ahora puedes usar tu objeto car con las dependencias inyectadas
        // ...

        car.drive();

        /*
         * Estamos creando instancias de NepaliRubberWheel y ExcideBattery y luego las estamos inyectando 
         * en una instancia de Car usando los métodos setWheel y setBattery. 
         * Esto significa que Car no necesita saber nada sobre cómo se crean estas dependencias, solo necesita saber que puede usarlas.
         */
    }
}
