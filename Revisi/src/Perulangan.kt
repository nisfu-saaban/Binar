fun main(args: Array<String>) {

    for(i in 1..100){
        val a = when(0){
            i%10 -> print("$i bisa di bagi 10")
            i%2  -> print("genap")
            else -> print("ganjil")

        }
        println(a)
    }
}

fun trying(){

}





