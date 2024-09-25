class Library {
    private var books = mutableListOf<Book>()   // MutableListOf() — это функция, создаёт изменяемый список.

    // Метод для добавления книги в библиотеку
    fun addBook(book: Book) {
        books.add(book)
    }
    // Метод для поиска книг по автору
    fun findByAuthor(author: String): List<Book> {

        val foundBooks = books.filter { it.author.equals(author, ignoreCase = true) }
        if (foundBooks.isEmpty()) {
            println("Таких книг не найдено!")
        } else {
            println("Результат поиска: ${foundBooks.size} - книг")
        }
        return foundBooks
    }
    // Метод для поиска книг по году публикации
    fun findByYear(year: Int): List<Book> {
        val foundBooks = books.filter { it.year == year }
        if (foundBooks.isEmpty()) {
            println("Таких книг не найдено!")
        } else {
            println("Результат поиска: ${foundBooks.size} - книг")
        }
        return foundBooks
    }
}