class Manager(name: String, age: Int, gender: String, salary: Double) : Worker(name, age, gender, salary) {
    private val subordinates = mutableListOf<Worker>()
    // Метод для добавления подчиненного работника
    fun addSubordinate(worker: Worker) {
        subordinates.add(worker)
    }
    // Метод для отображения информации о подчиненных
    fun displaySubordinates() {
        println("\nПодчиненные менеджера $name:")
        for (sub in subordinates) {
            println("- ${sub.name}, возраст: ${sub.age}, зарплата: ${sub.salary}")
        }
    }
}