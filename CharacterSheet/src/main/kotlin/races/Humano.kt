package races
import Tav

class Humano : Race {
    override fun RaceStatus(tav : Tav) {
        tav.strength += 1;
        tav.dexterity += 1;
        tav.consituition += 1;
        tav.inteligence += 1
        tav.wisdon += 1;
        tav.charisma += 1;
    }
}