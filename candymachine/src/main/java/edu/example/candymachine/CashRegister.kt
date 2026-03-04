package edu.example.candymachine

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

fun sellProduct(product: Dispenser, cRegister: CashRegister)
{
    var price: Int
    var coinsInserted: Int
    var coinsRequired: Int

    if(product.getCount() > 0)
    {
        price = product.getProductCost()
        coinsRequired = price
        coinsInserted = 0

        while (coinsRequired > 0)
        {
            println("Please deposit" + coinsRequired + "cents: ")
            coinsInserted = coinsInserted + readln().toInt()
            coinsRequired = price - coinsInserted
        }
        println()

        cRegister.acceptAmount(coinsInserted)
    }
}

fun main(){

}