fun numero_primo(n: Int): Boolean 
{
    if (n <= 1) 
    {
        return false
    }
    for (i in 2 until n) 
    {
        if (n % i == 0) 
        {
            return false
        }
    }
    return true
}

fun main() 
{
    println("Determinar si un número es primo")
    
    val n = 3
    if (numero_primo(n)) 
    {
        println("\tEl número $n es primo")
    }
    else 
    {
        println("\tEl número $n no es primo")
    }
}
