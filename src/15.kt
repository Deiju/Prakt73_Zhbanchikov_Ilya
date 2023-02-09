fun main(){
    try {
        println("a")
        var a=readLine()!!.toInt()
        var rez=0
        rez=(a/100)/10*(a/100)%10*(a%100)%10+(a%100)/10
        println(rez)
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}