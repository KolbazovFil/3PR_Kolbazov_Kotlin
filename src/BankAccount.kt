class BankAccount(private val accountNumber: String) {
    private var balance = 1000.00
    // Метод для пополнения счета
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Сумма пополнения должна быть положительной!")
        }
    }
    // Метод для снятия средств
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        } else if (amount > balance) {
            println("Недостаточно средств для снятия!")
        } else {
            println("Сумма снятия должна быть положительной!")
        }
    }
    // Метод для получения текущего баланса
    fun getBalance(): Double {
        return balance
    }
    // Метод для получения номера счета
    fun getAccountNumber(): String {
        return "Счёт №: ${accountNumber}"
    }

    fun infoBankAccount(){
    println("\nБаланс счёта №${accountNumber} составляет ${balance} евро" )
    }
}