fun main(){
    ageRestriction(17)
    ageRestriction(20)
}

fun ageRestriction(age: Int){
    if(age< 18){ println("access denied") }
    if(age> 18){  println("access approved")}
}