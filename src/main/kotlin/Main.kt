fun main() {
    // val/var objName: ObjType (optional) = ObjType() / Call object/class constructor
    val zhasulan = Person(name = "Жасулан", age = 30)
    zhasulan.introduce()
    val aibek = Person(name = "Айбек", age = 18)


    // Нельзя напрямую изменить возраст, так как он инкапсулирован.
    // Мы используем методы для доступа и модификации данных.
//    aibek.setAge(25)
//    zhasulan.setAge(-20)
    zhasulan.introduce()
}
