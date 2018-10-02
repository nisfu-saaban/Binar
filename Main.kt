fun main(args: Array<String>) {

    opr1(10,5, {num1,num2 -> print("nilai dari $num1/$num2 adalah : ${num1/num2}  ")})

    val perkal: (Int, Int) -> String = {n1,n2 -> "nilai dari $n1 x $n2 adalah : ${n1*n2}" }
    opr2(10,5,perkal)



}

fun opr1(firstNum: Int, secondNum: Int, bagi: (Int, Int) -> Unit){
    bagi (firstNum,secondNum)
    println("hasilnya")
}

fun opr2(firstNum: Int, secondNum: Int, kali: (Int, Int) -> String){
    val x = kali (firstNum,secondNum)
    println(x)
}






