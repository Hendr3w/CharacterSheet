package races
import Tav

class Human : Race {
    override fun RaceStatus(tav : Tav) {
        tav.raceName = "Humano"
        tav.nightVision = 0;
        tav.speed = 9F;
        tav.strength += 1;
        tav.dexterity += 1;
        tav.consituition += 1;
        tav.inteligence += 1
        tav.wisdon += 1;
        tav.charisma += 1;

        //Choose one proficiency

    }

}