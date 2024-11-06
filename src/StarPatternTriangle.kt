fun main() {
    val n = 10;

    for (rows in 1..n) {
        for(space in 1..n - rows) {
            print(" ")
        }
        for (element in 1..2 * rows - 1) {
            print("*")
        }
        println()
    }
    for (rows in n - 1 downTo  1) {
        for (space in 1 .. n - rows) {
            print(" ")
        }
        for (element in 1..2 * rows - 1) {
            print("*")
        }
        println()
    }
}