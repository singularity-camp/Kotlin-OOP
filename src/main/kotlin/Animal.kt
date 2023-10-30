abstract class Animal(val name: String) {
    // Абстрактный метод, который должны реализовать подклассы
    abstract fun makeSound()
    // abstract fun functionName(param: ParamType...): ReturnType

    // Обычный (не абстрактный) метод
    open fun eat() {
        println("$name is eating.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks: Woof! Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name meows: Meow! Meow!")
    }
}

class Cow(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name moos: Moo! Moo!")
    }

    override fun eat() {
        println("$name is chewing a seno.")
    }
}




fun main() {
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    dog.makeSound() // Вывод: Buddy barks: Woof! Woof!
    dog.eat() // Вывод: Buddy is eating.

    cat.makeSound() // Вывод: Whiskers meows: Meow! Meow!
    cat.eat() // Вывод: Whiskers is eating.


    val cow = Cow("Mayka")
    cow.eat()
    cow.makeSound()
}

fun animalSays(animal: Animal) {
    animal.makeSound()
}
