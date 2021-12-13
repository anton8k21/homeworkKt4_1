import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionVisaMir() {
        transferAmount = 100000
        assertEquals(100750, return)
    }

    @Test
    fun commissionMastercardMaestro() {
        transferAmount = 100000
        stock = false
        assertEquals(102600, return)
    }
}