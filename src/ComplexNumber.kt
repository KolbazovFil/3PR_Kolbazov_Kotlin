class ComplexNumber (private val real: Double, private val imaginary: Double) {

    // Operator - Перегружает оператор. Это позволяет использовать знак + для сложения объектов класса ComplexNumber.
    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real + other.real, imaginary + other.imaginary)
    }

    operator fun minus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real - other.real, imaginary - other.imaginary)
    }

    operator fun times(other: ComplexNumber): ComplexNumber {
        val realPart = real * other.real - imaginary * other.imaginary
        val imaginaryPart = real * other.imaginary + imaginary * other.real
        return ComplexNumber(realPart, imaginaryPart)
    }

    operator fun div(other: ComplexNumber): ComplexNumber {
        val denominator = other.real * other.real + other.imaginary * other.imaginary
        return ComplexNumber(
            (real * other.real + imaginary * other.imaginary) / denominator,
            (imaginary * other.real - real * other.imaginary) / denominator
        )
    }
    override fun toString(): String {
        return "$real + $imaginary i"
    }
}