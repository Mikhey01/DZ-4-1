const val PAY_CARD_MASTERCARD = "Mastercard"
const val PAY_CARD_MAESTRO = "Maestro"
const val PAY_CARD_VISA = "Visa"
const val PAY_CARD_MIR = "Mir"
const val PAY_CARD_VK = "Vk"
val maxSummLimitDay = 150000
val maxSummLimitDayVk = 15000
val maxSummNotComission = 75000
//val maxSummLimitMonth = 600000
val additionalCommission = 20000        // в копейках
val comissionSumm = 3500
//val maxSummLimitMonthVk = 40000


fun main() {

    val transferAmount = 10        // Сумма перевода
    val amount = transferAmount * 100 // Переводим в копейки
    val amountPastTransfers = 0.0
    val transferMethod = "Maestro"         // Система перевода
    val commissionAmount: Double = when (transferMethod) {   //Стандартная Скидка системы перевода %
        PAY_CARD_MASTERCARD, PAY_CARD_MAESTRO -> .06
        PAY_CARD_VISA, PAY_CARD_MIR -> .075
        PAY_CARD_VK -> 0.0
        else -> error("Неизвестная система переводов")
    }
    val result = amount * commissionAmount   //Сумма комиссии
    val resultComission: Double = when (transferMethod) {
        PAY_CARD_MASTERCARD, PAY_CARD_MAESTRO ->
            (if (transferAmount > maxSummNotComission) result + additionalCommission else result)

        PAY_CARD_VISA, PAY_CARD_MIR ->
            (if (result > comissionSumm)
                result else comissionSumm) as Double
        else -> 0.0
    }

    val translation = commissionPercentage(amount, amountPastTransfers, transferMethod)
    println(
        "Сумма перевода составляет: ${translation / 100} рублей " +
                "сумма комиссии за перевод: $resultComission копеек"
    )
}

fun commissionPercentage(
    amount: Int,
    amountPastTransferts: Double,
    transferMethod: String,
): Int {
    val transferts = amount + amountPastTransferts
    val a: Int = when (transferMethod) {
        PAY_CARD_MASTERCARD, PAY_CARD_MAESTRO, PAY_CARD_VISA, PAY_CARD_MIR ->
            if (transferts <= maxSummLimitDay*100) amount else error("Превышен лимит перевода за текущие сутки")

        else -> {

            if (transferts <= maxSummLimitDayVk*100) amount else
                error("Превышен лимит единовременного перевода ")
        }
    }
    return a
}


