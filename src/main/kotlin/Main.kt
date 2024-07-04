fun main() {
    // val/var objName: ObjType (optional) = ObjType() / Call object/class constructor
    val zhasulan = Worker(name = "Жасулан", age = 30, "Jusan")
    val aibek = Person(name = "Айбек", age = 18)

//
//     Нельзя напрямую изменить возраст, так как он инкапсулирован.
//     Мы используем методы для доступа и модификации данных.
//    aibek.setAge(25)
//    zhasulan.age = -20
//    zhasulan.introduce()
//    zhasulan.work()

    introducePerson(zhasulan)
    introducePerson(aibek)
}

fun introducePerson(person: Person) {
    person.introduce()
}
