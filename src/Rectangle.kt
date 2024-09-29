class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun getArea(): Double {
        // Площадь прямоугольника: w * h
        return width * height
    }
}
// Для 14 задания
class Rectangl(private val topLeft: Point, private val bottomRight: Point) {
    fun area(): Double {
        val width = bottomRight.x - topLeft.x
        val height = topLeft.y - bottomRight.y
        return width * height
    }
}