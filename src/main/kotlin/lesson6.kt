fun main(){
    sumOfTwoNumbers()
    sumOfTwoNumbers(5, 4)
    println(sumOfTwoNumbers(5.10, 4))
    println(sumOfTwoNumbers(5, 4.90))
}
fun sumOfTwoNumbers(){
    println(2 + 2)
}

fun sumOfTwoNumbers(a: Int, b: Int){
    println(a + b)
}

fun sumOfTwoNumbers(a: Double, b: Int): Double{
   return a+ b
}

fun sumOfTwoNumbers(a: Int, b: Double)= a+ b