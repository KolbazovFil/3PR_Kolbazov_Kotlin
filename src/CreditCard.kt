class CreditCard(private val cardNumber: String): PaymentSystem {
    private var balance: Double = 1000.00

    override fun pay(amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            println("Оплата $amount евро через кредитную карту номер $cardNumber.\nТекущий баланс: $balance евро")
            return true
        } else {
            println("Недостаточно средств для оплаты!")
            return false
        }
    }

    override fun refund(amount: Double): Boolean {
        balance += amount
        println("Возврат $amount евро на кредитную карту номер $cardNumber.\nНовый баланс: $balance евро")
        return true
    }
}