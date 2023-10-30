import kotlin.math.PI

abstract class Shape {
    abstract val name: String
    abstract fun calculateArea(): Float
    fun draw() {
        println("Рисую $name")
    }
}

//open class Circle(val radius: Int) : Shape() {
//    override val name = "Круг"
//
//    override fun calculateArea(): Float {
//        return PI.toFloat() * radius * radius
//    }
//}
//
//open class Rectangle(val width: Int, val length: Int) : Shape() {
//    override val name = "Прямоугольник"
//
//    override fun calculateArea(): Float {
//        return length * width.toFloat()
//    }
//}

//class Square(val sideLength: Int) : Rectangle(width = sideLength, length = sideLength) {
//    override val name: String = "Квадрат"
//}
//
//fun showShapeArea(shape: Shape) {
//    println("${shape.name} area is ${shape.calculateArea()}")
//}
//
//fun main() {
//    val circle = Circle(3)
//    circle.draw()
//
//    val rectangle = Rectangle(3, 4)
//    rectangle.draw()
//
//    val square = Square(4)
//    square.draw()
//
//    showShapeArea(circle)
//    showShapeArea(rectangle)
//    showShapeArea(square)
//}