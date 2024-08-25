import races.Human
import races.Race

class Tav(
    var name : String = "",
    var level : Int = 1,
    var raceName : String = "Humano",
    var speed: Float = 9.0f, // Meters
    var health : Int = 10,
    var strength : Int = 8,
    var dexterity : Int = 8,
    var consituition : Int = 8,
    var wisdon : Int = 8,
    var inteligence : Int = 8,
    var charisma : Int = 8,
    //var _class : String,
    var race: Race = Human(),
    var nightVision : Int = 0,  // Meters
    var statusPoints : Int = 27
)
{

    fun changeRace(newRace : Race){
        this.race = newRace;
    }

    fun applyRaceStatus(){
        this.race.RaceStatus(this);
    }

}