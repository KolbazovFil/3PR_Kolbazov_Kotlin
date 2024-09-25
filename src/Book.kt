class Book(val title: String, val author: String, val year: Int) {
    override fun toString(): String {
        return "Название: '$title', Автор: '$author', Год: $year"
    }
}