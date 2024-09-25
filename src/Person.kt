open class Person(var name: String, var age: Int, var gender: String) {
    // Метод для вывода информации о человеке
    open fun displayInfoOfPerson() {
        println("\nИмя: $name\nВозраст: $age\nПол: $gender")
    }
    // Метод для увеличения возраста на указанный интервал
    fun increaseAgeOfPerson(years: Int) {
        if (years < 0) {
            throw IllegalArgumentException("Возраст не может быть уменьшен!")
        }
        age += years
    }
    // Метод для изменения имени
    fun changeNameOfPerson(newName: String) {
        name = newName
    }
}