fun main(args: Array<String>) {

    for(i in 1..100){
        var a = if (i % 10 == 0){
            "$i bisa d bagi 10"
        }else if (i % 2 == 0){
            "$i genap"
        }else{
            "$i"
        }

        println(a)
    }
}

