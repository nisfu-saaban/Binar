import ext.Pembagian
import ext.pengurangan
import ext.penjumlahan
import ext.perkalian
import trining.DataTrining

fun main(args: Array<String>) {


    val tambah = DataTrining(x = 5,y = 10).let {
        it.x.penjumlahan(it.y)

    }

    val kurang = DataTrining(x = 5, y = 10).let {
        it.x.pengurangan(it.y)
    }

    val kali = DataTrining(x = 5, y = 10).let {
        it.x.perkalian(it.y)
    }

    val bagi = DataTrining(x = 5, y = 10).let {
        it.x.Pembagian(it.y)
    }
    println(tambah)
    println(kurang)
    println(kali)
    println(bagi)

}



