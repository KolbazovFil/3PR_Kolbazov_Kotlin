class Store {
    private val products = mutableListOf<Product>()     // MutableListOf() — создаёт изменяемый список.

    // метод добавления продуктов
    fun addProduct(product: Product) {
        products.add(product)
    }

    // Метод удаления товара по имени
    fun removeProductByName(name: String): Boolean {
        // Находим товар по имени
        val productToRemove = products.find { it.name == name }
        // Если нашел товар
        if (productToRemove != null) {
            products.remove(productToRemove)    // Удаление элемента из изменяемого списка
            return true
        } else {
            return false
        }
    }

    // Метод поиска товара по имени
    fun findProductByName(name: String): Product? {
        return products.find { it.name == name }
    }

    // Метод отображения товаров
    fun displayProducts() {
        if (products.isEmpty()) {
            println("Список товаров пуст!")
        } else {
            println("Список товаров:")
            for (product in products) {
                println("Название: ${product.name}, Цена: ${product.price} евро, Количество: ${product.quantity}")
            }

        }
    }
}