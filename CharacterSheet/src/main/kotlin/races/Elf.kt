package races

import Tav

class Elf : Race{
    override fun RaceStatus(tav: Tav) {
        tav.dexterity += 2;
        tav.inteligence += 1;
        
    }
}