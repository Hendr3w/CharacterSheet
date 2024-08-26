import Tav
import races.*

class GeneralHelper {
    fun showStatus(tav: Tav) {
        println("-----Seus Atributos-----")
        println("Nome: " + tav.name)
        println("Raça: " + tav.raceName)
        println("Pontos de Vida: " + tav.health)
        println("")
        println("Força: " + tav.strength)
        println("Destreza: " + tav.dexterity)
        println("Constituição: " + tav.consituition)
        println("Sabedoria: " + tav.wisdon)
        println("Inteligência: " + tav.inteligence)
        println("Carísma: " + tav.charisma)
        println(" ")
        println("Veloccidade: " + tav.speed + "m")
        println("Visão Noturna: " + tav.nightVision + "m")
    }

    fun raceSelector(tav : Tav){

        println("-----Seleção de Raça-----")
        println("1 - Humano");
        println("2 - Elfo");
        println("3 - Anão");
        println("4 - Meio-Elfo");
        println("5 - Halfling");
        println("6 - Meio-Orc");
        println("7 - Tiefling");
        println("8 - Drow");

        var valor = readLine()!!.toInt();

        if(valor > 0 && valor < 9) {
            when (valor) {
                1 -> tav.changeRace(Human())
                2 -> tav.changeRace(Elf())
                3 -> tav.changeRace(Dwarf())
                4 -> tav.changeRace(HalfElf())
                5 -> tav.changeRace(Halfling())
                6 -> tav.changeRace(HalfOrc())
                7 -> tav.changeRace(Tiefling())
                8 -> tav.changeRace(Drow())
            }

            println("Raça Selecionada!")
            return;
        }
        println("Valor inválido");
        raceSelector(tav);
    }

    fun resetStatus(tav: Tav){
        tav.strength = 8;
        tav.dexterity = 8;
        tav.consituition = 8;
        tav.wisdon = 8;
        tav.inteligence = 8;
        tav.charisma = 8;
    }

    fun pointSelector(tav : Tav){
        tav.statusPoints = 27;
        println("ATENÇÃO! Você precisa gastar todos os pontos")


        showAvalibalePoints(tav);
        selectorStrength(tav);

        showAvalibalePoints(tav);
        selectorDexterity(tav);

        showAvalibalePoints(tav);
        selectorConstituition(tav);

        showAvalibalePoints(tav);
        selectorWisdon(tav);

        showAvalibalePoints(tav);
        selectorInteligence(tav);

        showAvalibalePoints(tav);
        selectorCharisma(tav);

        if (tav.statusPoints > 0){
            println("Inválido, você precisa gastar todos os pontos.")
            println("Pontos restantes: " + tav.statusPoints)
            println("Status resetado, retornando a seleção")
            resetStatus(tav);
            pointSelector(tav);
        }
        return
    }

    fun selectorStrength(tav : Tav){
        var input = 0;
        var balance = 0;
        println("Escolha entre valores de 8 a 15");
        println("Força: ")
        input = readLine()!!.toInt();
        balance = calcCost(tav.statusPoints, input);

        if (verifyBalance(balance)) {
            tav.strength = input;
            tav.statusPoints = balance;
            return;
        }
        selectorStrength(tav)
    }

    fun selectorDexterity(tav : Tav){
        var input = 0;
        var balance = 0;
        println("Escolha entre valores de 8 a 15");
        println("Destreza: ")
        input = readLine()!!.toInt();
        balance = calcCost(tav.statusPoints, input);

        if (verifyBalance(balance)) {
            tav.dexterity = input;
            tav.statusPoints = balance;
            return;
        }
        selectorDexterity(tav)
    }

    fun selectorConstituition(tav : Tav){
        var input = 0;
        var balance = 0;
        println("Escolha entre valores de 8 a 15");
        println("Constituição: ")
        input = readLine()!!.toInt();
        balance = calcCost(tav.statusPoints, input);

        if (verifyBalance(balance)) {
            tav.consituition = input;
            tav.statusPoints = balance;
            return;
        }
        selectorConstituition(tav)
    }

    fun selectorWisdon(tav : Tav){
        var input = 0;
        var balance = 0;
        println("Escolha entre valores de 8 a 15");
        println("Sabedoria: ")
        input = readLine()!!.toInt();
        balance = calcCost(tav.statusPoints, input);

        if (verifyBalance(balance)) {
            tav.wisdon = input;
            tav.statusPoints = balance;
            return;
        }
        selectorWisdon(tav)
    }

    fun selectorInteligence(tav : Tav){
        var input = 0;
        var balance = 0;
        println("Escolha entre valores de 8 a 15");
        println("Inteligência: ")
        input = readLine()!!.toInt();
        balance = calcCost(tav.statusPoints, input);

        if (verifyBalance(balance)) {
            tav.inteligence = input;
            tav.statusPoints = balance;
            return;
        }
        selectorInteligence(tav)
    }

    fun selectorCharisma(tav : Tav){
        var input = 0;
        var balance = 0;
        println("Escolha entre valores de 8 a 15");
        println("Carísma: ")
        input = readLine()!!.toInt();
        balance = calcCost(tav.statusPoints, input);

        if (verifyBalance(balance)) {
            tav.charisma = input;
            tav.statusPoints = balance;
            return;
        }
        selectorCharisma(tav)
    }

    fun showAvalibalePoints(tav: Tav){
        println("Você ainda tem: " + tav.statusPoints + " Pontos Disponíveis...")
    }

    fun calcCost(balance : Int, value : Int) : Int {
        var cost = 0;
        when(value){
            8 -> cost = 0
            9 -> cost = 1
            10 -> cost = 2
            11 -> cost = 3
            12 -> cost = 4
            13 -> cost = 5
            14 -> cost = 7
            15 -> cost = 9
            else -> return -100
        }

        println("Isso irá custar: " + cost);
        println("Confirmar escolha?[S/N]")
        var selection = readLine().toString()
        selection.lowercase()
        if (selection == "s")
            return balance - cost;

        return -1000;

    }

    fun verifyBalance(balance : Int): Boolean{
        if (balance == -100) {
            print("Valor inválido")
            return false
        } else if(balance == -1000){
            print("Alterações não salvas, retornando...")
            return false;
        } else if(balance >= 0){
            return true;
        } else
            println("O custo é maior que os pontos disponíveis")
            return false;

    }

    fun calcMod(status : Int) : Int{
        when (status) {
            1 -> return -5
            2 -> return -4
            3 -> return -4
            4 -> return -3
            5 -> return -3
            6 -> return -2
            7 -> return -2
            8 -> return -1
            9 -> return -1
            10 -> return 0
            11 -> return 0
            12 -> return 1
            13 -> return 1
            14 -> return 2
            15 -> return 2
            16 -> return 3
            17 -> return 3
            18 -> return 4
            19 -> return 4
            20 -> return 5
            21 -> return 5
            22 -> return 6
            23 -> return 6
            24 -> return 7
            25 -> return 7
            26 -> return 8
            27 -> return 8
            28 -> return 9
            29 -> return 9
            30 -> return 10
            else -> return 0;
        }
    }

    fun calcModi(status : Int) : Int{
       return (status)/ 2 - 5
    }

    fun calcHP(tav: Tav){
        var constMod = calcMod(tav.consituition);
        tav.health += constMod



    }
}