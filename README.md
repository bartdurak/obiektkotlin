# KotlinJDK18_2Av2

### Pamiętaj o numerowaniu commit
`01 (name) ; 02 (name)`

Starajcie się nie commitować tych plików.
 
Jak już musicie (bo system blokuje ). 
To nazwijcie:
`numerem 0011 (xml) itd.`

![Screenshot from 2023-12-04 14-48-17.png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20from%202023-12-04%2014-48-17.png)

^ **commit** jest wersją pliku, który  jest w oddzielnym folderze
ma tą samą nazwę, lecz inną zawartość.
#### Jęśli komuś wydaję się to nie potrzebne, to uprzejmie proszę
#### wziąć udział w dyskusji na github.com , umieścić swój projekt.
Szybko zostaniecie upomnieni o porządek w commitach.
###_____###
## Wstęp AI. 
### Świat przyśpieszył. Trwają rozmowy na temat etyki AI
`**Możecie już teraz się przygotować że następne lata będziecie programowali
ze wspomaganiem AI , lub pod AI.**`
______
***Programista będzie tworzył nowe narzędzie
AI. To duże wyzwanie, ale i spore możwiwości finansowe. Nauczają was świetni fachowcy, lecz konserwatyści. Sami też będziemy uczestniczyć procesie AI***

### Ok . Punkty zadania do wykonania. 
#### 1.1
Ustaw wersje JDK na 1.8 openGL . Tak zwana wersja uwolniona. Pisana przez ochotników za free.
![vokoscreenNG-2023-11-19_19-15-06.297.png](src%2Fimage%2FvokoscreenNG-2023-11-19_19-15-06.297.png)
![vokoscreenNG-2023-11-19_19-15-55.712.png](src%2Fimage%2FvokoscreenNG-2023-11-19_19-15-55.712.png)
#### 1.2
![Screenshot from 2023-11-19 20-56-45.png](src%2Fimage%2FScreenshot%20from%202023-11-19%2020-56-45.png)
Dla Gradle również JDK 1.8
#### 1.3

#### *Wykonaj ćwiczenie*
````
fun main(args: Array<String>)
{
//typy danych
var liczby: Int = 5
println(liczby)
println(" plus int : "+ Int.MAX_VALUE)
println(" minus int : "+ Int.MIN_VALUE)
// dla przykładu sprawdzamy typ danych Byte
````
Dopisz
`.MAX_VALUE) dla pozostałych operatorów`
_z klasą typu UInit , UByte, ULong, UShort, itd_

#### 1.4
**Dla incrementation i dekrementacji przeprowadź kompilacje**
* z różnymi kombinacjami println(i)
* umieszczaj printlne w różnych miejscach kodu. Uzasadnij w komentarzach
* dlaczego tak się stało. Jak przebiegłało dodawanie lub odejmowanie.
  import kotlin.math.pow
  // robimy import bibliotek math, żeby skożystać z pow. Podobnie jak w python.

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
// Pamiętaj to nie wszystko . Dopisz stringi w println ( w których wyjaśniesz działanie dekrementacji lub inkrementacji)

// Operatory potęgowania
// musimmy stosować typ danych zmienno przecinkowych.
```println( (2.0).pow(4) )```
//potęgowanie liczb
```println(kotlin.math.sqrt(25.0))```
}

#### 1.5
Dopisz własne **println("string wujaśniający" + zmienna)**
w komentarzach napisz dlaczego wyszła prawda lub fałsz?
// dlaczego ?
`
fun main(args: Array<String>) {
var a = 5
var b = 3
var x: Boolean
x = a != b
println(x)
x = a == b
println(x)
}`

#### 1.6
Wykonaj kilka przykładów z operatorami logicznymi OR AND NOT

* dopisz własne **println("string wyjaśniający" + zmienna)**

* w komentarzach napisz dlaczego wyszła prawda lub fałsz,
* weź pod uwagę kolejność wykonywania operacji logicznych?
  Więcej pod linkiem.
  **Algebra Boole’a**
* 

4 klasa podstawowa (działania na zbiorach) **takie kolorowe kółka**.

* https://programistajava.pl/java-petle-i-przeplyw-sterowania/

fun main(args: Array<String>) {
var x: Boolean
x = 5 > 5 || 1 != 2 // ||
println(x)

    println(true || false) // OR czyli lub
    println(false && false) // AND czyli i
    println(!false) // NOT czyli nie
    println(true || false && false) // AND  przed OR
// uwaga ! negacja jest przed AND i przed OR

```
--------------------
--------------------
```

### Authors and acknowledgment
BartDurak 2A
### License
For open source projects, say how it is licensed.
ZST.Kolbuszowa
### Project status
start.
```
cd existing_repo
git remote add origin https://gitlab.com/programista_1/2a_klasy/..

git branch -M main
git push -uf origin main
```
