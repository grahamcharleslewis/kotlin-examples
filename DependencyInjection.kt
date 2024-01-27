class Car(private val engine: Engine, private val breaks: Breaks) {
    fun start() {
        println("Key is in the ignition")
        engine.start()
    }
   
    fun drive() {
        println("We're off...")
    }
   
    fun stop() {
        breaks.stop()
    }
}

class Breaks() {
fun stop() {
        println("Screeeeeetttttcccccccchhhhhh!")
    }    
}

class Engine() {
fun start() {
        println("Vroooom!")
    }    
}

fun main() {
    var breaks = Breaks()
    var engine = Engine()
    var car = Car(engine, breaks)

    car.start()
    car.drive()
    car.stop()
}
