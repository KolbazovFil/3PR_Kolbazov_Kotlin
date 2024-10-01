// Свойство класса, представляющее собой двумерный массив типа Double.
class Matrix(private val matr: Array<DoubleArray>) {
    // для хранения количества строк в матрице.
    private val rows: Int = matr.size   // Метод size возвращает количество элементов (строк) в матрице.
    private val cols: Int = matr[0].size    // [0] первый элемент массива.
    // Метод для сложения матриц. Operator - Перегружает оператор. Это позволяет использовать знак + для сложения объектов класса Matrix.
    operator fun plus(other: Matrix): Matrix {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Матрица должна иметь одинаковые размеры для сложения!")
        }
        val result = Array(rows) { DoubleArray(cols) }  // Лямбда-функция
        for (i in 0 until rows) {   // проходим по всем строкам
            for (j in 0 until cols) {   // проходим по всем столбцам
                result[i][j] = this.matr[i][j] + other.matr[i][j]   // сложение двух матриц
            }
        }
        return Matrix(result)   // результат сложения матриц
    }
    // Метод для умножения матриц
    operator fun times(other: Matrix): Matrix {
        if (this.cols != other.rows) {
            throw IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй!")
        }
        val result = Array(rows) { DoubleArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += this.matr[i][k] * other.matr[k][j]
                }
            }
        }
        return Matrix(result)
    }
    // Метод для удобного отображения матрицы
    override fun toString(): String {
        return matr.joinToString("\n") { row -> row.joinToString("\t") }    //  - Метод объединяет все элементы коллекции в одну строку.
    }   // - Лямбда-выражение начинается с определения параметров до ->, после чего следует код, который будет выполнен при вызове этого выражения.
}