open class Car(val brand: String, val model: String) {
    open fun start() {
        println("$brand $model начал движение")
    }

    open fun stop() {
        println("$brand $model остановился")
    }
}

class ElectricCar(brand: String, model: String, val batteryCapacity: Double) : Car(brand, model) {
    override fun start() {
        println("$brand $model запустился на электричестве")
    }

    override fun stop() {
        println("$brand $model остановился и отключил электродвигатель")
    }

    fun charge() {
        println("$brand $model заряжается")
    }
}

class GasolineCar(brand: String, model: String, val fuelType: String) : Car(brand, model) {
    override fun start() {
        println("$brand $model запустился на $fuelType")
    }

    override fun stop() {
        println("$brand $model остановился и выключил двигатель")
    }

    fun refuel() {
        println("$brand $model заправляется топливом ($fuelType)")
    }
}

fun main() {
    val tesla = ElectricCar("Tesla", "Model S", 85.0)
    val ford = GasolineCar("Ford", "Focus", "бензин")

    tesla.start()
    tesla.charge()
    tesla.stop()

    ford.start()
    ford.refuel()
    ford.stop()

    val car = Car("Уаз", "Патриот")
    car.start()
    car.stop()
}
