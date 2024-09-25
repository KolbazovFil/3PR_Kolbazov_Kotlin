class University {
    private val students = mutableListOf<Student>()     // MutableListOf() — создаёт изменяемый список.


    fun addStudent(student: Student) {
        students.add(student)
    }

    fun sortStudentsByName() {
        students.sortBy { it.name }
    }

    // Метод для фильтрации студентов по успеваемости
    fun filterStudentsByGrade(minGrade: Double): List<Student> {
        return students.filter { it.grade >= minGrade }
    }

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