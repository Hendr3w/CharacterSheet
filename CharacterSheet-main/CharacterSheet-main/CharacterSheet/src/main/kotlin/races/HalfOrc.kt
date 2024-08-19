package races

import Tav;

class HalfOrc : Race {

    override fun RaceStatus(tav: Tav) {
        tav.speed = 9f;
        tav.nightVision = 18;
        tav.strength += 2;
        tav.consituition += 1;

        //Implement Immortal Resistance
        //Implement Brutal Strength
    }
}