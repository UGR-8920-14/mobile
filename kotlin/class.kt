class Rectangle(val length: Double, val width: Double) {

    fun calculatePerimeter(): Double {
        return 2 * (length + width)
    }

    fun calculateArea(): Double {
        return length * width
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    println("Perimeter of rectangle: ${rectangle.calculatePerimeter()}")
    println("Area of rectangle: ${rectangle.calculateArea()}")
}

class Triangle(val side1: Double, val side2: Double, val side3: Double) {

    fun classifyTriangle(): String {
        return when {
            side1 == side2 && side2 == side3 -> "Equilateral"
            side1 == side2 || side2 == side3 || side1 == side3 -> "Isosceles"
            else -> "Scalene"
        }
    }
}

fun main() {
    val triangle = Triangle(5.0, 5.0, 5.0)
    println("Triangle is ${triangle.classifyTriangle()}")
}

data class Item(val name: String, val price: Double)

class ShoppingCart {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun removeItem(item: Item) {
        items.remove(item)
    }

    fun calculateTotalPrice(): Double {
        var totalPrice = 0.0
        for (item in items) {
            totalPrice += item.price
        }
        return totalPrice
    }
}

fun main() {
    val cart = ShoppingCart()
    cart.addItem(Item("Laptop", 999.99))
    cart.addItem(Item("Phone", 599.99))
    cart.addItem(Item("Tablet", 299.99))

    println("Total price: $${cart.calculateTotalPrice()}")
}

