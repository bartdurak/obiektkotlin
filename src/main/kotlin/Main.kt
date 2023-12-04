fun main(args: Array<String>) {
    val nrDziennika = 2
    val nrDnia = 4
    val nrMiesiaca = 12
    val ifone = nrDziennika
    val iftwo = nrMiesiaca + nrDnia
    val ifthree = nrDziennika + nrMiesiaca
// sprawdzam czy arytmetyka działa?
    println("Numer dziennika to: " + (ifone))
    println("Miesiąc plus dzień to: " +(iftwo))
    println("Nr dziennika plus aktualny miesiąc to: "+ (ifthree))
       // Sprawdzamy warunki if

        if ( ifone == nrDziennika) {
            println("Warunek 1 spełniony.")
        }

        if (iftwo == nrMiesiaca + nrDnia){
            println("Warunek 2 spełniony.")
        }

        if (ifthree == nrDziennika + nrMiesiaca ) {
            println("Warunek 3 spełniony.")
        }
}
