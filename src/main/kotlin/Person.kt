open class Person(private val name: String, private var age: Int) {

    fun getAge(): Int {
        return age
    }

    fun setAge(newAge: Int) {
        if (newAge >= 0) {
            age = newAge
        }
    }

    fun celebratesBirthday() {
        age += 1
    }

    fun introduce() {
        println("Меня зовут $name и мне $age лет.")
    }
}

class Worker(name: String, age: Int) : Person(name, age)
