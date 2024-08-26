import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import Tav;
import races.*;
class TavTest {

    @Test
    fun testChangeRace() {
        val tav = Tav();
        tav.race = Drow();

        tav.changeRace(Elf())
        assertEquals("Drow", tav.raceName)
    }


}
