fun  main() {

    var likes = 11 //поставленные "лайки"
    if (likes == 1 || likes != 11 && likes % 2 == 1 && (likes + 1) % 2 == 1 || likes % 10 == 1 && likes != 11) {
        println("Понравилось  " + likes + " человеку")
    } else if (likes == 11 || (likes + 1) % 2 == 0 && likes % 2 == 1 || likes % 2 == 0 && likes != 0) {
        println("Понравилось " + likes + " людям")
    } else {
        println("Никому не понравилось")
    }

}