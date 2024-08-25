package races

import Tav;
class Drow : Race {
    override fun RaceStatus(tav: Tav) {
        tav.raceName = "Drow"
        tav.speed = 9.0f;
        tav.nightVision = 18;
        tav.charisma += 1;
    }
}