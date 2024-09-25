open class Worker(name: String, age: Int, gender: String, var salary: Double) : Person(name, age, gender) {

    override fun displayInfoOfPerson() {
        super.displayInfoOfPerson()
        println("Заработная плата в рублях: $salary")
    }
}