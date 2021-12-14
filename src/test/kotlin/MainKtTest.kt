import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionVisaMir() {
        transferAmount = 100000
        assertEquals(103500, commissionVisaMir(100000))
    }

    @Test
    fun commissionMastercardMaestro() {
        transferAmount = 100000
        stock = false
        assertEquals(102600, commissionMastercardMaestro(100000,false))
    }

    @Test
    fun limitСontrol() {
        nameCard = "visaMir"
        sumTransferMonth = 1500300
        sumTransferDay = 1200000
        transferAmount = 100000
        assertEquals(kotlin.Unit, limitСontrol(visaMir, 1500300, 100000, 1200000))

    }

    @Test
    fun calculationСommission() {
        nameCard = "visaMir"
        transferAmount = 1000000
        assertEquals(kotlin.Unit ,calculationСommission(visaMir, 1000000))
    }
}