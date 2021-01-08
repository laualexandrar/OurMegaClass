package extraPractice

fun main() {
    objectsInMyDesk()
    pokeball()
    planti()
    apartment()
}

fun objectsInMyDesk() {
    val isPokeballInMyDesk = true
    val isPrinterInMyDesk = true
    val isMatiInMyDesk = false

    if (isMatiInMyDesk) {
        println("Mati is in my desk")
    } else {
        println("Mati is in another place")
    }

    if (isMatiInMyDesk == true && isPokeballInMyDesk == true) {
        println("both Mati and the pokeball are in my desk")
    } else if (isMatiInMyDesk == false) {
        println("Is the pokeball more important than Mati??? Whay Mati is not in my desk :(")

    }

    if (isPrinterInMyDesk) {
        println("Please print some documents for me!")
    }


    val isMyPhoneBlue = true
    val hasMyPhoneACamera = true
    val isMyPhoneAnLG = false

    if (!isMyPhoneAnLG) {
        println("Which phone do you have?")
    }

    if (!isMyPhoneBlue || !isMyPhoneAnLG || !hasMyPhoneACamera) {
        println("are you sure that is a phone?")

    }

    if (!isMyPhoneBlue || isMyPhoneAnLG || !hasMyPhoneACamera) {
        println("are you sure that is a phone?")

    }

    val isPokeballWorking = true
    val isPokeballConectedToPokemonGo = true
    val isPokeballVibrating = false

    if(isPokeballConectedToPokemonGo && isPokeballWorking && isPokeballVibrating){
        println("are you losing time!! catch that pokemon now!")
    } else {
        println("there are no pokemon close to you if that's not the case, check if your pokeball is working")
    }

    if(!isPokeballConectedToPokemonGo){
        println("select the pokeball in the right upper corner of your game")
    }

    if (isPokeballConectedToPokemonGo){
        println("Let's play!")
    }

}

fun pokeball():Boolean{

    val isPokeballInMyBag = true
    if (isPokeballInMyBag){
        println("search for new pokemon!")
    }

    return isPokeballInMyBag
}

fun planti(): Boolean{
    val isPlantiHealthy = false

    if(!isPlantiHealthy){
        println("We should buy it something for the soil")
    }

    return isPlantiHealthy
}

fun apartment(): Boolean {
    val isTheApartmentCold = true
    if(isTheApartmentCold){
        println("Turn on the heater ")
    } else {
        println("turn on the AC ")
    }

    return isTheApartmentCold
}