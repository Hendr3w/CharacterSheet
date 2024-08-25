package races

import Tav

class Elf : Race{
    override fun RaceStatus(tav: Tav) {
        tav.raceName = "Elfo"
        tav.dexterity += 2;
        tav.speed = 9f;
        tav.nightVision = 18;


        //Implement Perception Proficiency
        //Implement Meditation
        //Implement Incantation Resistance

        
    }
}