fun factorial(n: Int): Int 
{
    if (n < 0) 
    {
        return 0
    } 
    else if (n == 0 || n == 1) 
    {
        return 1
    } 
    else 
    {
        return n * factorial(n - 1)
    }
}

fun main() 
{
    println("Factorial de un número")

    val n = 5
    val resultado = factorial(n)
    println("\tEl factorial de $n es $resultado")
}
