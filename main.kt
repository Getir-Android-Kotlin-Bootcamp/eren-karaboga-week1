fun main() {
    //**************************************************************************
    //println function
    println()
    println(" Sayfa 9")

    val message = "Kotlin was initially developed by JetBrains in 2011."
    println("Message: $message")


    //**************************************************************************
    //Functions
    println()
    println("Sayfa 10")

    println(hi("Eren"))
    println("Area of a square with side length 5: ${calculateSquareArea(5)} square units")

    //**************************************************************************
    //Variables
    println()
    println("Sayfa 11")

    val total = addition(5, 3)
    println("Total: $total")

    val squareResult = square(4)
    println("Square of 4: $squareResult")

    val concatenatedString = concatenate("Eren", "Karaboga")
    println("Concatenated string: $concatenatedString")

    //**************************************************************************
    //val-var example
    println()
    println("Sayfa 11")

    var x = 5
    val y = 3

    println("Initial values - x: $x, y: $y")

    // We can change the value of x because we're using 'var'
    x = 10

    // We cannot change the value of y because we're using 'val'
    // y = 6 // Error: Val cannot be reassigned

    println("Updated values - x: $x, y: $y")
    //**************************************************************************
    //Create Instance
    println()
    println("Sayfa 12")

    val person = Person()
    person.name = "Eren"
    println("Person's name: ${person.name}")
    //**************************************************************************
    //Open class example
    println()
    println("Sayfa 13")

    val dog = Dog()
    dog.sound()
    //**************************************************************************
    //String example
    println()
    println("Sayfa 14")
    val fullName = "Eren KARABOGA"
    val parts = fullName.split(" ")
    val firstName = parts[0]
    val lastName = parts[1]
    val reversedName = "$lastName $firstName"
    println("Reversed Name: $reversedName")
    //**************************************************************************
    //if else example
    println()
    println("Sayfa 15")
    val inputString = "Eren KARABOGA"
    val result = checkStringLength(inputString)
    val resultOneLine = if (inputString.length % 2 == 0) "The length of the string is even" else "The length of the string is odd"
    println(resultOneLine)
    println(result)
    //**************************************************************************
    //For loop example matrix
    println()
    println("Sayfa 16")
    val matrix = Array(3) { IntArray(3) }

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            matrix[i][j] = i * 3 + j + 1
        }
    }
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
    //**************************************************************************
    //While loop example fibonacci
    println()
    println("Sayfa 17")
    val n = 10
    var a = 0
    var b = 1
    var count = 2

    print("First $n Fibonacci terms: $a, $b")


    while (count < n) {
        val sum = a + b
        print(", $sum")
        a = b
        b = sum
        count++
    }

    //**************************************************************************
    //when with enum
    println()
    println("Sayfa 18")

    val day = DayOfWeek.values().random()
    val messageDay = when (day) {
        DayOfWeek.MONDAY -> "It's Monday"
        DayOfWeek.TUESDAY -> "It's Tuesday"
        DayOfWeek.WEDNESDAY -> "It's Wednesday"
        DayOfWeek.THURSDAY -> "It's Thursday"
        DayOfWeek.FRIDAY -> "It's Friday"
        DayOfWeek.SATURDAY -> "It's Saturday"
        DayOfWeek.SUNDAY -> "It's Sunday"
    }
    println()
    println(messageDay)

    //**************************************************************************
    //ranges
    println()
    println("Sayfa 19")

    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    for (number in 1..100) {
        when {
            number in 1..50 && number % 2 == 0 -> evenNumbers.add(number)
            number in 51..100 && number % 2 != 0 -> oddNumbers.add(number)
        }
    }

    println("Even numbers between 1 and 50: $evenNumbers")
    println("Odd numbers between 51 and 100: $oddNumbers")

    //**************************************************************************
    //collections
    println()
    println("Sayfa 20 ")

    val people = listOf(
        PersonClass("Eren", 29),
        PersonClass("Melek", 35),
        PersonClass("Sadık", 22),
        PersonClass("Ceren", 40),
        PersonClass("Dilara", 25)
    )
    val filteredPeople = people.filter { it.age > 30 }

    val sortedPeople = people.sortedBy { it.age }

    val mappedNames = people.map { it.name.toUpperCase() }

    println("Filtered People:")
    filteredPeople.forEach { println("${it.name} - ${it.age}") }

    println("\nSorted People by Age:")
    sortedPeople.forEach { println("${it.name} - ${it.age}") }

    println("\nMapped Names in Uppercase:")
    mappedNames.forEach { println(it) }

    //**************************************************************************
    //21
    //null check and default values
    println()
    println("Sayfa 21")
    val nameFirst: String? = "Eren"
    val nameLast: String? = null
    val age: Int? = 30

    if (firstName != null && lastName != null && age != null) {
        println("Full Name: ${firstName.capitalize()} ${lastName.capitalize()}, Age: $age")
    } else {
        println("One or more fields are null.")
    }

    val middleName: String? = null
    val middleInitial = middleName ?: "N/A"
    println("Middle Initial: $middleInitial")

    val city: String? = null
    val length = city?.length ?: -1
    println("City Length: $length")


    //**************************************************************************
    //type checks and automatic casts
    println()
    println("Sayfa 22")

    //val any: Any = 42
    val any: Any = "42"
    //val any: Any = 42.0
    if (any is String) {
        println(any.length)
    } else if (any is Int) {
        println(any * 2)
    } else if (any is Double) {
        println(any / 2)
    } else {
        println("Unknown type")
    }

    //**************************************************************************
    //naming conventions
    //23-34
    println()
    println("23-34 arası yorum satırında")

// Variable name
// val myVariable = 10

// Variable name, Camel Case
// val camelCaseVariable = 20

// Function name
// fun myFunction() {
//     println("This is a function")
// }

// Function name, Camel Case
// fun camelCaseFunction() {
//     println("This is a camel case function")
// }

// Constant name, uppercase letters and underscore
// val MY_CONSTANT = 30

// Package name
// package com.example.myproject

// Class name
// class MyClass

// Object name
// val myObject = MyClass()

// Property name
// val myProperty = "property"

// Interface name
// interface MyInterface

// Extension function name
// fun String.myExtensionFunction() {
//     println("This is an extension function")
// }

    //**************************************************************************
//test convention
    /*
    import org.junit.Test
    import kotlin.test.assertEquals

    class MyUnitTest {

        @Test
        fun addition_isCorrect() {
            val result = add(3, 4)
            assertEquals(7, result)
        }

        @Test
        fun subtraction_isCorrect() {
            val result = subtract(10, 5)
            assertEquals(5, result)
        }
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
    */
    //**************************************************************************
    //Name convention
    /*
class Rectangle {
    var width: Double = 0.0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    var height: Double = 0.0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    val area: Double
        get() = width * height
}
*/

    //**************************************************************************
    //Idioms - DTO and default parameters (genre)
    println()
    println("Sayfa 37-38")
    val song = Song("Bohemian Rhapsody", "Queen", 355, releaseYear = 1975)
    song.play()
    song.getInfo()

    //**************************************************************************
    //List Filter
    println()
    println("Sayfa 39")
    val products = listOf(
        Product("Laptop", 2500.0),
        Product("Smartphone", 1200.0),
        Product("Tablet", 800.0),
        Product("Headphones", 150.0),
        Product("Smartwatch", 300.0)
    )
    val expensiveProducts = products.filter { it.price > 1000.0 }
    println("Expensive Products:")
    expensiveProducts.forEach { println("${it.name} - ${it.price}") }


    //**************************************************************************
    //Find element in collection (IN)
    println()
    println("Sayfa 40")

    val books = listOf(
        Book("1984", "George Orwell", 1949),
        Book("To Kill a Mockingbird", "Harper Lee", 1960),
        Book("The Catcher in the Rye", "J.D. Salinger", 1951),
        Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
        Book("Brave New World", "Aldous Huxley", 1932)
    )

    val searchAuthor = "George Orwell"

    val booksByAuthor = books.filter { it.author == searchAuthor }

    if (booksByAuthor.isNotEmpty()) {
        println("$searchAuthor books:")
        booksByAuthor.forEach { println("${it.title} (${it.year})") }
    } else {
        println("No books found for $searchAuthor.")
    }


    //**************************************************************************
    //Instance checks
    println()
    println("Sayfa 41")

    val obj: Any = "Hello"

    val objresult = when (obj) {
        is String -> "It's a String with length ${obj.length}"
        is Int -> "It's an Integer"
        is Double -> "It's a Double"
        else -> "Unknown type"
    }

    println(objresult)


    //**************************************************************************
    //Read only list
    println()
    println("Sayfa 42")
    val readOnlyList = listOf("Apple", "Banana", "Orange", "Grapes")

    println("Elements of read-only list:")
    readOnlyList.forEach { println(it) }

    println("Accessing elements of read-only list:")
    println("First element: ${readOnlyList[0]}")
    println("Second element: ${readOnlyList.get(1)}")
    println("Last element: ${readOnlyList.last()}")

    println("Size of read-only list: ${readOnlyList.size}")

    // Modifying a read-only list is not allowed
    // readOnlyList.add("Pineapple") // Error! UnsupportedOperationException
    // readOnlyList.removeAt(0) // Error! UnsupportedOperationException


    //**************************************************************************
    //Read only map
    println()
    println("Sayfa 43")
    val readOnlyMap = mapOf(
        "apple" to 5,
        "banana" to 10,
        "orange" to 7,
        "grapes" to 3
    )

    println("Accessing elements of read-only map:")
    println("Number of apples: ${readOnlyMap["apple"]}")
    println("Number of oranges: ${readOnlyMap.getOrDefault("orange", 0)}")
    println("Number of watermelons: ${readOnlyMap["watermelon"] ?: "Not found"}")

    println("Size of read-only map: ${readOnlyMap.size}")

    // Modifying a read-only map is not allowed
    // readOnlyMap["pineapple"] = 8 // Error! UnsupportedOperationException
    // readOnlyMap.remove("banana") // Error! UnsupportedOperationException

    //**************************************************************************
    //Traverse a map (k,v)
    println()
    println("Sayfa 44")
    val pairs = listOf(
        "apple" to 5,
        "banana" to 10,
        "orange" to 7,
        "grapes" to 3
    )

    println("Traversing list of pairs:")
    pairs.forEach { (key, value) ->
        println("$key -> $value")
    }


    //**************************************************************************
    //Lazy Property
    println()
    println("Sayfa 45")
    val innerLazy = InnerLazy()
    println("Lazy property is not yet initialized")
    // Lazy property will be initialized only when accessed for the first time
    innerLazy.lazyObject.performAction()



    //**************************************************************************
    //extension
    println()
    println("Sayfa 46")
    val sampleString = "Hello, Kotlin!"
    val letterFrequency = sampleString.calculateLetterFrequency()

    println("Letter Frequencies:")
    for ((letter, frequency) in letterFrequency) {
        println("$letter: $frequency")
    }


    //**************************************************************************
    //Singleton
    println()
    println("Sayfa 47")
    DataProcessor.addData(Data(1, "Eren"))
    DataProcessor.addData(Data(2, "Karaboga"))
    DataProcessor.processData()

    //**************************************************************************
    //Abstract class
    println()
    println("Sayfa 48")

    val tower = TelecommunicationTower("TowerX")
    tower.sendMessage("Message 1")
    tower.sendMessage("Message 2")
    println("Received Message: ${tower.receiveMessage()}")
    println("Received Message: ${tower.receiveMessage()}")
    tower.printReceivedMessages()

    //**************************************************************************
    //try-catch , null not null, default parameter, ? expression, let
    println()
    println("Sayfa 49-50-51-53-54-56-57")
    try {
        // Kullanıcı bilgilerini alma
        val user: User? = getUserInfo()

        // Eğer kullanıcı null değilse, bilgilerini yazdır
        user?.let { userInfo ->
            println("User Information:")
            println("Name: ${userInfo.name ?: "Unknown"}")
            println("Age: ${userInfo.age ?: "Unknown"}")
            println("Email: ${userInfo.email ?: "Unknown"}")
        } ?: run {
            println("User information not available")
        }
    } catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }


    //**************************************************************************
    //when & firstOrNull
    println()
    println("Sayfa 52-55")
    val employees = listOf(
        Employee("Eren", 24),
        Employee("Dilara", 22),
        Employee("Mehmet", 35),
        Employee("Ali", 20)
    )

    val emp = employees.firstOrNull {
        when (it.name) {
            "Alice" -> it.age > 25
            "Bob" -> it.age < 30
            else -> false
        }
    } ?: Employee("Unknown", 0)

    println("Selected person: $emp")

    //**************************************************************************
    //asign variable with if
    println()
    println("Sayfa 58")
    val examScore = 75
    val isPassing: Boolean

    isPassing = if (examScore >= 70) {
        true
    } else {
        false
    }

    val resultMessage = if (isPassing) {
        "Congratulations! $examScore."
    } else {
        "Sorry, you failed the exa $examScore"
    }

    println(resultMessage)

    //**************************************************************************
    //fill with apply
    println()
    println("Sayfa 59")
    val arraySize = 5
    val increasingArray = createIncreasingArray(arraySize)

    println("Increasing Array:")
    increasingArray.forEachIndexed { index, value ->
        println("Index $index: $value")
    }


    //**************************************************************************
    //single-expression function
    println()
    println("Sayfa 60")

    val number = 6
    val isEven = isEven(number)
    println("$number is even: $isEven")

    //**************************************************************************
    //multiple function on one class
    println()
    println("Sayfa 61")

    val bookshelf = Bookshelf()

    with(bookshelf) {
        addBook("Harry Potter")
        addBook("The Lord of the Rings")
        addBook("Pride and Prejudice")

        println(listBooks())

        removeBook("Harry Potter")

        println(listBooks())
    }


    //**************************************************************************
    //Apply example
    println()
    println("Sayfa 62")
    val car = Car().apply {
        brand = "Toyota"
        model = "Camry"
        year = 2022
        color = "Blue"
    }

    println("Created car: $car")

    //**************************************************************************
    //generic type example
    println()
    println("Sayfa 64")

    val stringBox = Box("Hello, Kotlin!")

    val messageFromBox: String = stringBox.getItemValue()
    println("Message in the box: $messageFromBox")

    val intBox = Box(42)

    val numberFromBox: Int = intBox.getItemValue()
    println("Number in the box: $numberFromBox")

    //**************************************************************************
    //also example
    println()
    println("Sayfa 65")

    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val doubledNumbers = numbers.map { it * 2 }.also {
        println("Doubled numbers: $it")
    }

    println("Original numbers: $numbers")


    //**************************************************************************
    //TODO example
    println()
    println("Sayfa 66")
    val testNumber = 3

    if (testNumber > 5) {
        println("Number is greater than 5")
    } else {
        //TODO("Handle the case when number is less than or equal to 5")
    }

    //**************************************************************************
    //Default Parameter Values and Named Arguments
    println()
    println("Sayfa 67")
    greet()
    greet("Eren")
    greet(message = "Hi")
    greet("Dilara", "Good morning")
    greet(message = "Hi", name = "Sadık")

    //**************************************************************************
    //Infix Functions
    println()
    println("Sayfa 68")
    val point1 = Point(3, 4)
    val point2 = Point(6, 8)

    val distance = point1 distanceTo point2
    println("Distance between points: $distance")

    //**************************************************************************
    //Operator Functions
    println()
    println("Sayfa 69")
    val vector1 = Vector(3.0, 4.0)
    val vector2 = Vector(1.5, 2.5)

    val sum = vector1 + vector2
    println("Vector sum: (${sum.x}, ${sum.y})")


    //**************************************************************************
    //vararg parameter
    println()
    println("Sayfa 70")
    val calculateResult = calculateSum(1, 2, 3, 4, 5)
    println("Sum: $calculateResult")

    //**************************************************************************
    println()
    println("71 -> variables neredeyse tüm örneklerde kullanıldı")
    println()
    println("72-73 -> 21-49-50-51-55 ")
    println()
    println("74 -> çoğu örnekte class kullanıldı")
    println()
    println("75,76 -> 64 kullanıldı")

    //**************************************************************************
    println()
    println("Sayfa 77-78-79")
    val oakTree = Tree("Oak", 20, false, 30.5)
    oakTree.displayDetails()

    //**************************************************************************
    println()
    println("80-81 -> 18 , 19 , 41 , 52-55")
    println()
    println("82 -> 16,19,20,39,40,42,44")
    println()
    println("83-84 -> 17")
    println()
    println("85,86,87 ->19")


    //**************************************************************************
    println()
    println("Sayfa 88")
    val firstArray = intArrayOf(1, 2, 3)
    val secondArray = intArrayOf(1, 2, 3)

    println("Using === operator:")
    println("firstArray === secondArray: ${firstArray === secondArray}") // false, because they have different references

    val thirdArray = firstArray

    println("\nUsing === operator with same reference:")
    println("firstArray === thirdArray: ${firstArray === thirdArray}") // true, because they have the same reference


    //**************************************************************************
    println()
    println("89 çoğu örnekte if else mevcut ")
    println()
    println("90-91-92 çoğu örneğimde data class mevcut")
}



fun hi(name: String): String {
    return "Hello, $name!"
}
fun calculateSquareArea(sideLength: Int): Int {
    return sideLength * sideLength
}
fun addition(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun square(number: Int): Int {
    return number * number
}

fun concatenate(str1: String, str2: String): String {
    return str1 + " " + str2
}
class Person {
    var name: String = ""
    var age: Int = 0
}
data class PersonClass(val name: String, val age: Int)

open class Animal {

    open fun sound() {
        println("Animal makes a sound")
    }
}
class Dog : Animal() {

    override fun sound() {
        println("Dog barks")
    }
}
fun checkStringLength(string: String): String {
    return if (string.length % 2 == 0) {
        "The length of the string is even"
    } else {
        "The length of the string is odd"
    }
}
enum class DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
fun String.myExtensionFunction() {
    println("This is an extension function")
}
data class Song(
    val title: String,
    val artist: String,
    val durationSeconds: Int,
    val genre: String = "Unknown",
    val releaseYear: Int = 0
) {
    fun play() {
        println("Playing: $title by $artist")
    }

    fun getInfo() {
        println("Title: $title")
        println("Artist: $artist")
        println("Duration: $durationSeconds seconds")
        println("Genre: $genre")
        println("Release Year: $releaseYear")
    }
}
data class Product(val name: String, val price: Double)
data class Book(val title: String, val author: String, val year: Int)
class ExpensiveObject {
    init {
        println("Creating expensive object...")
    }

    fun performAction() {
        println("Performing action with expensive object")
    }
}
class InnerLazy {
    val lazyObject: ExpensiveObject by lazy {
        ExpensiveObject()
    }
}
fun String.calculateLetterFrequency(): Map<Char, Int> {
    val frequencyMap = mutableMapOf<Char, Int>()
    for (char in this) {
        if (char.isLetter()) {
            val lowercaseChar = char.toLowerCase()
            val count = frequencyMap.getOrDefault(lowercaseChar, 0)
            frequencyMap[lowercaseChar] = count + 1
        }
    }
    return frequencyMap
}
data class Data(val id: Int, val name: String)
object DataProcessor {
    private val dataList = mutableListOf<Data>()

    init {
        println("DataProcessor singleton initialized")
    }

    fun addData(data: Data) {
        dataList.add(data)
        println("Data added: $data")
    }

    fun processData() {
        println("Processing data...")
        dataList.forEach { data ->
            println("Processing data: $data")
        }
        println("Data processing completed")
    }
}
abstract class CommunicationDevice(val brand: String) {
    abstract fun sendMessage(message: String)
    abstract fun receiveMessage(): String
}
class TelecommunicationTower(brand: String) : CommunicationDevice(brand) {
    private var receivedMessages = mutableListOf<String>()

    override fun sendMessage(message: String) {
        println("Message '$message' sent from $brand")
    }

    override fun receiveMessage(): String {
        val message = "Hello from $brand"
        receivedMessages.add(message)
        return message
    }

    fun printReceivedMessages() {
        println("$brand received messages:")
        receivedMessages.forEachIndexed { index, message ->
            println("${index + 1}. $message")
        }
    }
}
data class User(val name: String?, val age: Int?, val email: String?)
fun getUserInfo(): User? {
    val name: String? = if (Math.random() < 0.5) "John" else null
    val age: Int? = if (Math.random() < 0.5) 30 else null
    val email: String? = if (Math.random() < 0.5) "eren@getir.com" else null

    if (Math.random() < 0.1) {
        //throw Exception("Failed to fetch user information")
    }

    return User(name, age, email)
}
data class Employee(val name: String, val age: Int)

fun createIncreasingArray(size: Int): IntArray {
    return IntArray(size).apply {
        for (i in indices) {
            this[i] = i + 1
        }
    }
}

fun isEven(number: Int): Boolean = number % 2 == 0

class Bookshelf {
    private val books = mutableListOf<String>()

    fun addBook(book: String) {
        books.add(book)
    }

    fun removeBook(book: String) {
        books.remove(book)
    }

    fun listBooks(): String {
        return if (books.isNotEmpty()) {
            "Books in the bookshelf: ${books.joinToString(", ")}"
        } else {
            "The bookshelf is empty."
        }
    }
}

class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0
    var color: String = ""

    override fun toString(): String {
        return "Car(brand='$brand', model='$model', year=$year, color='$color')"
    }
}

class Box<T>(var item: T) {
    fun getItemValue(): T {
        return item
    }

    fun setItemValue(newItem: T) {
        item = newItem
    }
}
fun greet(name: String = "Guest", message: String = "Hello") {
    println("$message, $name!")
}
class Point(val x: Int, val y: Int) {
    infix fun distanceTo(other: Point): Double {
        val dx = x - other.x
        val dy = y - other.y
        return Math.sqrt((dx * dx + dy * dy).toDouble())
    }
}
data class Vector(val x: Double, val y: Double) {
    operator fun plus(other: Vector): Vector {
        return Vector(x + other.x, y + other.y)
    }
}
fun calculateSum(vararg numbers: Int): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

open class Plant(val species: String, val ageInYears: Int, val hasFlowers: Boolean) {
    open fun displayDetails() {
        println("Species: $species, Age: $ageInYears years")
        if (hasFlowers) {
            println("This plant has flowers.")
        } else {
            println("This plant does not have flowers.")
        }
    }
}
class Tree(species: String, ageInYears: Int, hasFlowers: Boolean, val trunkDiameter: Double) : Plant(species, ageInYears, hasFlowers) {
    override fun displayDetails() {
        super.displayDetails()
        println("Trunk Diameter: $trunkDiameter cm")
    }
}