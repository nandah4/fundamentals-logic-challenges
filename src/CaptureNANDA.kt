fun main() {
    val height  = 5
    /*
        Capture NANDA With for looping
     */

    // Huruf N
    for (rows in 0 until height) {
        for (element in 0 until height) {
            if(element == 0 || element == height - 1 || element == rows) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println()


}