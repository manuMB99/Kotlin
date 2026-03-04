package edu.example.candy_machine

class CashRegister(cashIn: Int = 500) {
    private var cashOnHand: Int = if (cashIn >= 0) cashIn else 500

    fun currentBalance(): Int = cashOnHand

    fun acceptAmount(amountIn: Int) {
        cashOnHand += amountIn
    }
}

class Dispenser(setNoOfItems: Int = 50, setCost: Int = 50) {

    private var numberOfItems: Int = if (setNoOfItems >= 0) setNoOfItems else 50
    private val cost: Int = if (setCost >= 0) setCost else 50

    fun getCount(): Int = numberOfItems

    fun getProductCost(): Int = cost

    fun makeSale() {
        if (numberOfItems > 0) {
            numberOfItems--
        }
    }
}

fun showSelection()
{
    val menu = """
        *** Welcome to Shelly's Candy Shop ***
        To select an item, enter:
        1 for Candy
        2 for Chips
        3 for Gum
        4 for Cookies
        9 for exit
    """.trimIndent()

    println(menu)
}

fun sellProduct(product: Dispenser, cRegister: CashRegister) {
    if (product.getCount() > 0) {
        val price = product.getProductCost()
        var coinsInserted = 0
        var coinsRequired = price

        while (coinsRequired > 0) {
            println("Please deposit $coinsRequired cents: ")
            val input = readln().toIntOrNull() ?: 0
            coinsInserted += input
            coinsRequired = price - coinsInserted
        }
        cRegister.acceptAmount(price)
        product.makeSale()
        println("\nCollect your item at the bottom and enjoy.")

        if (coinsInserted > price) {
            val change = coinsInserted - price
            println("Your change is $change cents. Don't forget it! \n")
        } else {
            println()
        }

    } else {
        println("Sorry, this item is sold out. \n")
    }
}

fun main(){
    val cashRegister = CashRegister()
    val candy = Dispenser(100, 50)
    val chips = Dispenser(100, 65)
    val gum = Dispenser(75, 45)
    val cookies = Dispenser(100, 85)

    var choice: Int

    showSelection()
    choice = readln().toIntOrNull() ?: 0

    while(choice != 9)
    {
        when (choice) {
            1 -> sellProduct(candy, cashRegister)
            2 -> sellProduct(chips, cashRegister)
            3 -> sellProduct(gum, cashRegister)
            4 -> sellProduct(cookies, cashRegister)
            else -> println("Invalid selection.")
        }
        println("Closing machine... Total cash collected: $${cashRegister.currentBalance()}")
        showSelection()
        choice = readln().toIntOrNull() ?: 0
    }
}