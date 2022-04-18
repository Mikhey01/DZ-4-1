import org.junit.Assert.*

class HomeworkKtTest {

    @org.junit.Test
    fun commissionPercentagePAY_CARD_VK() {
        //Arrange
        val testAmount = 1000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_VK

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(1000, result)
    }

    @org.junit.Test
    fun commissionPercentagePAY_CARD_MASTERCARD() {
        //Arrange
        val testAmount = 1000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_MASTERCARD

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(1000, result)
    }

    @org.junit.Test
    fun commissionPercentagePAY_CARD_MAESTRO() {
        //Arrange
        val testAmount = 1000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_MAESTRO

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(1000, result)
    }

    @org.junit.Test
    fun commissionPercentagePAY_CARD_VISA() {
        //Arrange
        val testAmount = 1000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_VISA

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(1000, result)
    }
    @org.junit.Test
    fun commissionPercentagePAY_CARD_MIR() {
        //Arrange
        val testAmount = 1000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_MIR

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(1000, result)
    }

    @org.junit.Test
    fun commissionPercentage_PAY_CARD_VK() {
        //Arrange
        val testAmount = 10000000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_VK

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(0, result)
    }
    @org.junit.Test
    fun commissionPercentage_PAY_CARD_MIR() {
        //Arrange
        val testAmount = 16000000
        val testAmountPastTransfer = 10.0
        val testTransferMethod = PAY_CARD_MIR

        //act
        val result = commissionPercentage(
            amount = testAmount,
            amountPastTransferts = testAmountPastTransfer,
            transferMethod = testTransferMethod
        )

        //assert
        assertEquals(1, result)
    }
}