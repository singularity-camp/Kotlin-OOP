class ClassExample

open class Person(protected val name: String, protected var age: Int = 0) {

//
//    var address: String
//
//    constructor(providedAddress: String): this(name = "John") {
//        address = providedAddress
//        println("Secondary constructor called. Address = $address")
//    }
//
//    constructor(someVal: Double): this(providedAddress = "Kabanbay Batyr ave.") {
//        println("Secondary constructor #2")
//    }
//
//
//    init {
//        println("Initialized Person with name = $name")
//        address = if (age == 0) {
//            ""
//        } else {
//            "Address should be given"
//        }
//        println("Address = $address")
//    }
//
//    private val isAdult: Boolean = age >= 18
//
//    init {
//        println("Second init block called")
//        println("Is adult = $isAdult")
//    }

//    fun getAge(): Int {
//        return age
//    }
//
//    fun setAge(newAge: Int) {
//        if (newAge >= 0) {
//            age = newAge
//        }
//    }

    fun celebratesBirthday() {
        age += 1
    }

    open fun introduce() {
        println("Меня зовут $name и мне $age лет.")
    }
}

class Worker(name: String, age: Int, private val workPlace: String) : Person(name, age) {

    fun work() {
        println("I am working at $workPlace")
    }

    override fun introduce() {
        println("Меня зовут $name и мне $age лет. Я работаю в $workPlace")
    }

}
