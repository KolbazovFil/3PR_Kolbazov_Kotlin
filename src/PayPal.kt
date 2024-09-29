class PayPal(private val email: String) : PaymentSystem {
    private var balance: Double = 1000.0

    override fun pay(amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            println("Оплата $amount евро через PayPal аккаунт $email.\nТекущий баланс: $balance евро")
            return true
        } else {
            println("Недостаточно средств для оплаты!")
            return false
        }
    }
    override fun refund(amount: Double): Boolean {
        balance += amount
        println("Возврат $amount евро на PayPal аккаунт $email.\nНовый баланс: $balance евро")
        return true
    }
}