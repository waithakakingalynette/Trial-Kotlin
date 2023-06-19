fun main (){
    val School="Akirachix"
    print("Akirachix"[0])
    print("Akirachix"[1])
    print("Akirachix"[2])
    println()
    sumn(name = "Lynette","20")
    println(name("Lynette"))
    Myname("Lynette")



}
//1. Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string (2 points)

fun school() {
    val School= "Akirachix"


}
//2. Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively. (3 points)

fun sumn(name:String,age:String){
    println("Hi, my name is $name and I am $age years old")
}
//3. Write a function that takes in a String and returns its length (2 points)
fun name(word:String):Int{
     word.length
    return word.length

}
 //4. Write a function that takes in a name and prints out “That’s me!” when your
 //name is passed to it, otherwise it prints out “I don’t know who that is” (3
 //points)
fun Myname(name: String){
    if(name.equals("Lynette")){
        println("That is me")
    }else
        println("I don't know who that is")
}

