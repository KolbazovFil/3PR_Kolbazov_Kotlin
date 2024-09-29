interface PaymentSystem {
    fun pay(amount: Double): Boolean
    fun refund(amount: Double): Boolean
}