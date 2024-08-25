package races
import Tav

class Dwarf : Race {

    override fun RaceStatus(tav: Tav) {
        tav.raceName = "Anão"
        tav.speed = 7.5f;
        tav.nightVision = 18;
        tav.consituition += 2;

        //Implement poison resistance
        //Implement crafting tools proficiency
        //Implement Incantation Resistance

    }
}