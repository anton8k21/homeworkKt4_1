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
}