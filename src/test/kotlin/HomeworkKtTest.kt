import org.junit.Assert.*

class HomeworkKtTest {

    @org.junit.Test
    fun commissionPercentage() {
        //Arrange
        val testAmount = 1001
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
}