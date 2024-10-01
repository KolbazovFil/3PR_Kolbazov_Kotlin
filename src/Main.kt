import kotlin.system.exitProcess

fun main() {
////    //1. Класс "Человек"
//    println("\nЗадание 1: Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. " +
//            "Добавьте метод для изменения имени\n")
//    // Создаем экземпляр класса Person
//    val person = Person("Алексей", 25, "Мужской")
//    print("(Информация о человеке)")
//    person.displayInfoOfPerson()
//
//    print("\nУвеличите возраст на: ")
//    val incrAge = readln().toInt()
//    person.increaseAgeOfPerson(incrAge)
//    print("Измените имя: ")
//    val changeName = readln()
//    person.changeNameOfPerson(changeName)
//    println("(Новая информация о человеке)")
//    person.displayInfoOfPerson()
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
//2. Наследование: Класс "Работник" и "Менеджер"
//println("\nЗадание 2: класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и " +
//        "добавляет поле для подчиненных сотрудников.\n")
//
//    println("(Добавьте работника)")
//    print("Введите имя: ")
//    val nameWorker = readln()
//    print("Введите возраст: ")
//    val ageWorker = readln().toInt()
//    print("Введите пол: ")
//    val genderWorker = readln()
//    print("укажите заработную плату: ")
//    val salaryWorker = readln().toDouble()
//    val worker = Worker(nameWorker, ageWorker, genderWorker, salaryWorker)
//
//    print("\nИнформация о менеджере:")
//    val manager = Manager("Филипп", 29, "Мужской", 90000.0)
//
//    // Добавляем подчиненных к менеджеру
//    manager.addSubordinate(worker)
//    // Отображаем информацию о менеджере и его подчиненных
//    manager.displayInfoOfPerson()
//    manager.displaySubordinates()
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////3. Полиморфизм: Животные
//println("\nЗадание 3: интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. " +
//        "Продемонстрируйте полиморфизм на примере массива животных.\n")
//
//    val animalsSound: Array<Animal> = arrayOf(Dog(), Cat(), Cow())
//    for (animal in animalsSound) {
//        println(animal.makeSound())
//    }
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////4. Абстрактный класс "Транспорт"
//println("\nЗадание 4: абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().\n")
//
//    val transports: Array<Transport> = arrayOf(Car(), Bike())
//    for (transport in transports) {
//        println(transport.move())
//    }
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////5. Класс "Книга" и "Библиотека"
//println("\nЗадание 5: класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг, " +
//        "поиска по автору и году публикации.\n")
//    val library = Library()
//    // Добавляем три книги по умолчанию
//    library.addBook(Book("1984", "George Orwell", 1949))
//    library.addBook(Book("Brave New World", "Aldous Huxley", 1932))
//    library.addBook(Book("Animal Farm", "George Orwell", 1945))
//
//    print("Введите имя автора для поиска: ")
//    val findAuthBook = readln()
//    val authBooks = library.findByAuthor(findAuthBook)
//    for (book in authBooks) {
//        println(book)
//    }
//
//    print("Введите год для поиска: ")
//    val findYearBook = readln().toInt()
//    val booksFrom = library.findByYear(findYearBook)
//    for (book in booksFrom) {
//        println(book)
//    }
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////6. Инкапсуляция: Банк
//    println("\nЗадание 6: Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств. Обеспечьте инкапсуляцию для безопасности данных счета.\n")
//    val account = BankAccount("777")
//    println(account.getAccountNumber())
//    println("баланс: ${account.getBalance()} евро")
//    print("Пополните баланс: ")
//    val addDep = readln().toDouble()
//    account.deposit(addDep)
//    print("снять денежные средства: ")
//    val withDrawMoney = readln().toDouble()
//    account.withdraw(withDrawMoney)
//    account.infoBankAccount()
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
//7. Счетчик объектов
//println("\nЗадание 7: класс Counter, который хранит количество созданных объектов данного класса. Реализуйте статическое поле для учета количества объектов и метод " +
//        "для его увеличения при каждом создании объекта.\n")
//    val counter1 = Counter()
//    val counter2 = Counter()
//    val counter3 = Counter()
//    val counter4 = Counter()
//    val counter5 = Counter()
//    println("Количество созданных объектов: ${Counter.getCount()}")
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
//8. Площадь фигур
//println("\nЗадание 8: абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, " +
//        "которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.\n")
//    print("Введите радиус круга: ")
//    val radiusCircle = readln().toDouble()
//    val circle = Circle(radiusCircle)
//    println("Площадь круга: ${circle.getArea()}\n")
//    print("Введите длину прямоугольника: ")
//    val widthRectangle = readln().toDouble()
//    print("Введите высоту прямоугольника: ")
//    val heightRectangle = readln().toDouble()
//    val rectangle = Rectangle(widthRectangle, heightRectangle)
//    println("Площадь прямоугольника: ${rectangle.getArea()}")
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
//9. Наследование: Животные и их движения
//    println("\nЗадание 9: класс Animal с методом move(). Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() " +
//            "(рыба плавает, птица летает, собака бегает).\n")
//    val animalsMove: Array<Animal> = arrayOf(Dog(), Cat(), Cow())
//    for (animal in animalsMove) {
//        println(animal.move())
//    }
//
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////10. Работа с коллекциями: Университет
//   println("\nЗадание 10: Создайте класс Student с полями name, group, grade. Создайте класс University, " +
//           "который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.\n")
//    // Добавление студентов
//    val university = University()
//    university.addStudent(Student("Стас", "A54", 3.8))
//    university.addStudent(Student("Боби", "B99", 2.5))
//    university.addStudent(Student("Лев", "B99", 3.5))
//    // Отображение всех студентов
//    println("Список студентов:")
//    university.displayStudents()
//    // Сортировка студентов по имени
//    university.sortStudentsByName()
//    println("\nСортированный список студентов по имени:")
//    university.displayStudents()
//    // Фильтрация студентов по успеваемости (например, от 3.0 и выше)
//    val filteredStudents = university.filterStudentsByGrade(3.5)
//    println("\nСтуденты с успеваемостью 3.0 и выше:")
//    for (student in filteredStudents) {
//        println("Имя: ${student.name}, Группа: ${student.group}, Успеваемость: ${student.grade}")
//    }
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////11. Класс "Магазин"
// println(
//  "\nЗадание 11: Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, " +
//          "который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.\n"
// )
// val store = Store()
//
// val apple = Product("Яблоко", 0.10, 1)
// val banana = Product("Банан", 0.15, 1)
// val pineapple = Product("Ананас", 5.14, 1)
//
// store.addProduct(apple)
// store.addProduct(banana)
// store.addProduct(pineapple)
//
// store.displayProducts()
//
// // Поиск продукта
// val foundProduct = store.findProductByName("Ананас")
// if (foundProduct != null) {
//  println("\nНайденный продукт: ${foundProduct.name}, Цена - ${foundProduct.price}, Количество - ${foundProduct.quantity}\n")
// } else {
//  println("Продукт не найден.")
// }
//
// // Удаление продукта
// val isRemoved = store.removeProductByName("Банан")
// println("Продукт удален: $isRemoved\n")
//
// store.displayProducts()
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////12. Интерфейс "Платежная система"
//println("\nЗадание 12: Создайте интерфейс PaymentSystem с методами pay() и refund(). " +
//        "Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.\n")
//    val creditCard = CreditCard("1234")
//    val payPal = PayPal("user@example.com")
//    creditCard.pay(100.24)
//    println()
//    creditCard.refund(56.10)
//    println()
//    payPal.pay(247.50)
//    println()
//    payPal.refund(89.56)
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////13. Генерация уникальных идентификаторов
//println("\nЗадание 13: Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. " +
//        "Реализуйте этот функционал через статическое поле и метод.\n")
//    val obj = MyObject()
//    val obj1 = MyObject()
//    println(obj)
//    println(obj1)
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////14. Класс "Точка" и "Прямоугольник"
//println("\nЗадание 14: Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки " +
//        "(левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.\n")
//    println("Введите точки левого верхнего угла")
//    print("Х = ")
//    val topX = readln().toDouble()
//    print("У = ")
//    val topY = readln().toDouble()
//    val topLeft = Point(topX, topY)
//    println("Введите точки нижнего правого угла")
//    print("Х = ")
//    val bottomX = readln().toDouble()
//    print("У = ")
//    val bottomY = readln().toDouble()
//    val bottomRight = Point(bottomX, bottomY)
//    val rectangl = Rectangl(topLeft, bottomRight)
//    println("Площадь прямоугольника: ${rectangl.area()}")
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////15. Комплексные числа
//    println("\nЗадание 15: Создайте класс ComplexNumber с полями для действительной и мнимой частей. " +
//            "Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.\n")
//    val num1 = ComplexNumber(5.0, 6.0)
//    val num2 = ComplexNumber(3.0, 7.0)
//    println("Сумма: ${num1 + num2}")
//    println("Разность: ${num1 - num2}")
//    println("Произведение: ${num1 * num2}")
//    println("Частное: ${num1 / num2}")
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////16. Перегрузка операторов: Матрица
//    println("\nЗадание 16: Создайте класс Matrix, представляющий двумерную матрицу. " +
//            "Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.\n")
//    val matrix1 = Matrix(arrayOf(
//        doubleArrayOf(5.5, 7.0, 5.0),
//        doubleArrayOf(3.0, 4.0, 7.4),
//        doubleArrayOf(6.0, 15.0, 13.0)
//    ))
//    val matrix2 = Matrix(arrayOf(
//        doubleArrayOf(5.0, 6.0, 6.0),
//        doubleArrayOf(7.0, 10.0, 3.6),
//        doubleArrayOf(6.0, 15.0, 10.5)
//    ))
//    val sum = matrix1 + matrix2
//    val times = matrix1 * matrix2
//    println("Сумма матриц:")
//    println(sum)
//    println("\nПроизведение матриц:")
//    println(times)
//// -----------------------------------------------------------------------------------------------------------------------------------------------------------
////17. Создание игры с использованием ООП
    println("\nЗадание 17: Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, " +
            "с полями и методами, описывающими их поведение.\n")
    println("Персонажи: (1) - Герой, (2) - Эльф, (3) - Гоблин, (4) - Тролль")
    print("Введите номер персонажа: ")
    val hero = readln().toInt()
    val heroDescription = when (hero) {
        1 -> "Герой"
        2 -> "Эльф"
        3 -> "Гоблин"
        4 -> "Тролль"
        else -> "Герой"
    }
    val player = Player(heroDescription)

    println("\nОружия: (1) - Меч, (2) - Барсук, (3) - Лук, (4) - Нунчаки")
    print("Введите номер оружия: ")
    val weap = readln().toInt()
    val weaponDescription = when (weap) {
        1 -> "Мечом"
        2 -> "Барсуком"
        3 -> "Луком"
        4 -> "Нунчаки"
        else -> "Нунчаки"
    }
    println("\nТип: (1) - Огненный, (2) - Водный, (3) - Ветреный, (4) - Вонючий")
    print("Введите тип оружия: ")
    val typeWeap = readln().toInt()
    val typeWeapon = when (typeWeap) {
        1 -> "Огненным"
        2 -> "Водным"
        3 -> "Ветреным"
        4 -> "Вонючим"
        else -> "Вонючим"
    }
    println()
    val weapon = Weapon(weaponDescription, 30, typeWeapon)
    player.equipWeapon(weapon)
    println()
    val enemy = Enemy("Слизень", 60)

    while (player.isAlive() && enemy.isAlive()) {
        println(player.attack(enemy))
        if (enemy.isAlive()) {
            println(enemy.attack(player))
        } else {
            println("${enemy.name} повержен!\n")
            break
        }

        println("${player.name} здоровье: ${player.health}, ${enemy.name} здоровье: ${enemy.health}\n")
    }

    if (!player.isAlive()) {
        println("${player.name} проиграл!")
    } else {
        println("${player.name} выиграл!")
    }


}
//18. Автоматизированная система заказов
//Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
//
//19. Наследование: Электроника
//Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.
//
//20. Игра "Крестики-нолики"
//Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.