package app

import GeneralHelper
import Tav;
import races.*;

fun main(args: Array<String>) {
    var tav = Tav();
    var helper = GeneralHelper();

    println("-----Criação de Personagem-----")
    println("Digite o nome do seu Personagem: ")
    tav.name = readLine().toString()

    helper.showStatus(tav);

    println("Agora vamos escolher a sua raça");

    helper.raceSelector(tav);

    println("Ótimo, agora vamos distribuir os seus pontos de atributo ")

    helper.pointSelector(tav)

    println("Ótimo, agora que selecionou os pontos, vamos aplicar o bonus da sua raça.")

    tav.applyRaceStatus();

    helper.calcHP(tav);

    println("Seu personagem está pronto!")

    helper.showStatus(tav);


}