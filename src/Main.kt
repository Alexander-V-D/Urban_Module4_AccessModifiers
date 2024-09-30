fun main() {

}

//Функция для задачи 2
//Возвращает пустой массив если матрица не соответствует размеру 4x4
fun getEvenNumbers(array: Array<Array<Int>>): Array<Int> {
    var evenNumbers = arrayOf<Int>()
    if (array.size != 4) return evenNumbers
    array.forEach { if (it.size != 4) return evenNumbers }
    for (row in array) {
        for (i in row) if (i % 2 == 0) evenNumbers += i
    }
    return evenNumbers
}

//Функция для задачи 3
//Возвращает изначальный массив если матрица не соответствует размеру 4x4
fun fill4x4ArrayByNumbersFrom1To16(array: Array<Array<Int>>): Array<Array<Int>> {
    if (array.size != 4) return array
    array.forEach { if (it.size != 4) return array }
    var count = 0
    for (i in 0..3) {
        for (j in 0..3) array[i][j] = j + count + 1
        count += 4
    }
    return array
}

//Функция для задачи 4
fun printPositiveNumbers(array: Array<Int>) {
    fun isPositive(number: Int) = number > 0
    for (i in array) if (isPositive(i)) println(i)
}
