import kotlin.math.pow

/*fun println(any: Any, d: Double) {

} */

fun main(args: Array<String>)
{
    //definiujemy zmienną i

    var i =1
    // wykorzystujemy operator += złożony
    i+=1 // da wynik 2
    // inkrementujemy zmienną i
    i++
    // wyświetlamy na terminalu zmienną i
    println(i)
    println(i--)
    println(++i)
    println(i++)
    println(i)
 // Operatory potęgowania
    // musimmy stosować typ danych zmienno przecinkowych.
    println( (2.0).pow(4) )
    //potęgowanie liczb
    println(kotlin.math.sqrt(25.0))
}