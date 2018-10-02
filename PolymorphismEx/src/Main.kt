import com.sun.xml.internal.ws.api.ha.StickyFeature

fun main(args: Array<String>) {

    val cat: Animal = CatBEhaviourImpl()
    cat.eat()
    cat.travel()

    val fullName: (String, String) -> String = { s1, s2 ->
        "Nama sata adalah $s1 $s2"

    }

    getFullname("nisfu", "saaban", fullName)

    //higher order function

}


//polimorphism

fun getFullname(firstName: String, lastName: String,
                result: (String, String) -> String) {
    val res = result(firstName, lastName)
    println(res)
}



