interface Drawable {
    fun draw() // Абстрактный метод в интерфейсе
}

interface Clickable {
    fun click()
}

class Painter {
    fun draw(drawable: Drawable) {
        drawable.draw()
    }
}


class Circle : Drawable {
    override fun draw() {
        // Code describing how to draw circle
        println("Drawing circle")
    }
}

class Rectangle : Drawable, Clickable {
    override fun draw() {
        println("Drawing rectangle")
    }

    override fun click() {
        println("Clicked on rectangle")
    }
}

class Triangle : Drawable, Clickable {
    override fun draw() {
        println("Drawing triangle")
    }

    override fun click() {
        println("Clicked on triangle")
    }
}

fun main() {
    val circle = Circle()
    val rectangle = Rectangle()
    val triangle = Triangle()

    val drawables: Array<Drawable> = arrayOf(circle, rectangle, triangle)


    val painter = Painter()
    drawables.forEach { drawable ->
        painter.draw(drawable)
    }

    val clickables: Array<Clickable> = arrayOf(rectangle, triangle)
    clickables.forEach { clickable ->
        clickOnElement(clickable)
    }
}

fun clickOnElement(clickable: Clickable) {
    clickable.click()
}

