fun main() {
    val n = 15;

    for (rows in 1..n) {
        for(cols in 1..n){
            if(rows == 1 || rows == n || cols == 1 || cols == n) {
                print(" ")
                print("*")
            } else {
                print(" ")
                print(" ")
            }
        }
        println()
    }
}