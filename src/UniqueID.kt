class UniqueID {
    // объект-одиночка, у которого есть переменные и функции, связанные с классом, но не с конкретными его экземплярами.
    companion object {
        private var currentId = 0
        fun generateId(): Int {
            return ++currentId
        }
    }
}
    class MyObject {
        private val id: Int = UniqueID.generateId()

        override fun toString(): String {
            return "Уникальный ID = $id"
        }
    }