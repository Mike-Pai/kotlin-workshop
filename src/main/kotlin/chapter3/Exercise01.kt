package chapter3
fun main() {
    //我第一次碰Kotlin

    print("> Hi, Please Enter your Name:")

    when (readLine()) {
        "謹瑜" -> {
            println("Hi!You're the VIP client.")
        }
        "Mike" -> {
            println("Hi!You're the VIP client.")
        }
        else -> {
            println("Ups,No!You are the wrong person.")
        }
    }


}