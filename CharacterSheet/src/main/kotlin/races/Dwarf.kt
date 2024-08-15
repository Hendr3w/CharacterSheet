package races
import Tav

class Dwarf : Race {
    override fun RaceStatus(tav: Tav) {
        tav.consituition += 2;
        tav.strength += 2;
        tav.wisdon += 1;
    }
}