class University {
    private val students = mutableListOf<Student>()     // MutableListOf() — создаёт изменяемый список.
    // метод добавления студентов
    fun addStudent(student: Student) {
        students.add(student)
    }
    // метод сортировки по имени
    fun sortStudentsByName() {
        students.sortBy { it.name }
    }
    // Метод фильтрации студентов по успеваемости
    fun filterStudentsByGrade(minGrade: Double): List<Student> {
        return students.filter { it.grade >= minGrade }
    }
    // Метод отображения
    fun displayStudents() {
        if (students.isEmpty()) {
            println("Нет студентов в университете!")
        } else {
            for (student in students) {
                println("Имя: ${student.name}, Группа: ${student.group}, Успеваемость: ${student.grade}")
            }
        }
    }
}