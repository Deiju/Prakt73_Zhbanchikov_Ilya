fun main(){
    try {
        println("h")
        var h=readLine()!!.toDouble()
        println("r")
        var r=readLine()!!.toDouble()
        var rez=0.0
        rez=3.14*h*Math.pow(r,2.0)
        println(rez)
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}