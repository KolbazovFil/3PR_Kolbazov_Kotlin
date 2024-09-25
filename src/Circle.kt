class Circle(private val radius: Double) : Shape() {
    override fun getArea(): Double {
        // Площадь круга: πr²
        return Math.PI * radius * radius
    }
}