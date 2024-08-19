package races

import Tav;

class Tiefling : Race{

    override fun RaceStatus(tav: Tav) {
        tav.speed = 9f;
        tav.nightVision = 18;
        tav.charisma += 2;
        tav.inteligence += 1;

        //Implement Fire Resistance
        //Implement Infernal Magic
    }
}