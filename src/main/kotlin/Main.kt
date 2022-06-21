fun main() {
    val likes = 1511
    val people = if (likes == 1 || (likes % 100 != 11 && likes % 10 == 1)) "человеку" else "людям"

    println("Понравилось $likes $people")
}
