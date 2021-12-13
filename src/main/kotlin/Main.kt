var visaMir = "visaMir"
var mastercardMaestro = "mastercardMaestro"
val vkpay = "vkpay"
var sumTransferMonth = 3345
var sumTransferDay = 222348678
var transferAmount = 233645
var stock = true

fun main(args: Array<String>) {

    limitСontrol(visaMir, sumTransferMonth, sumTransferDay, transferAmount)
    calculationСommission(visaMir, transferAmount)

}

fun calculationСommission(nameCard: String, transferAmount: Int) {
    when (nameCard) {
        "visaMir" -> println("Сумма перевода с коммисией ровна "
                + commissionVisaMir(transferAmount) / 100 +
                "." + commissionVisaMir(transferAmount) % 100 + "руб.")
        "mastercardMaestro" -> println("Сумма перевода с коммисией ровна "
                + commissionMastercardMaestro(transferAmount, stock) / 100 +
                "." + commissionMastercardMaestro(transferAmount, stock) % 100 + "руб.")
        "vkpay" -> println("Сумма перевода с коммисией ровна $transferAmount руб.")
    }
}

fun commissionVisaMir(transferAmount: Int): Int {
    if (transferAmount / 100 * 0.75 < 3500) {
        return transferAmount + 3500 * 2
    } else
        return transferAmount + (transferAmount / 100 * 0.75).toInt()
}

fun commissionMastercardMaestro(transferAmount: Int, stock: Boolean): Int {
    if (transferAmount >= 300 && transferAmount <= 75000 && stock == true) {
        return transferAmount
    } else
        return ((transferAmount / 100 * 0.6) + 2000).toInt()
}

fun limitСontrol(nameCard: String, sumTransferMonth: Int, transferAmount: Int, sumTransferDay: Int) {
    if (nameCard == mastercardMaestro || nameCard == visaMir) {
        if (sumTransferDay > 1500000 || sumTransferMonth > 60000000) {
            println("Привышен лимит по карте!!")
            System.exit(0)

        } else if (nameCard == vkpay) {
            if (sumTransferMonth > 4000000 || transferAmount > 1500000) {
                println("Привышен лимит переводов в VK Pay")
                System.exit(0)
            }
        }
    }
}