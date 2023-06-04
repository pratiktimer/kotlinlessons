fun main(){
    sumOfTwoNumbers7()
    sumOfTwoNumbers7(5, 4)
    println(sumOfTwoNumbers7(5.10, 4))
    println(sumOfTwoNumbers7(5, 4.90))
    sumOfTwoNumbers7(b = 5, a = 2)
}
fun sumOfTwoNumbers7(){
    println(2 + 2)
}

fun sumOfTwoNumbers7(a: Int, b: Int){
    println(a + b)
}

fun sumOfTwoNumbers7(a: Double, b: Int): Double{
    return a+ b
}

fun sumOfTwoNumbers7(a: Int, b: Double)= a+ b