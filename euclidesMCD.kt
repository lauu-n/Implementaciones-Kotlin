fun euclides_mcd(a: Int, b: Int): Int 
{
    return if (b == 0) a else euclides_mcd(b, a % b)
}

fun main() 
{
    println("Determinar el mínimo común divisor de dos números")
    val a = 48
    val b = 18
    println("\tEl MCD de $a y $b es ${euclides_mcd(a, b)}")
}
