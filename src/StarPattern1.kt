import  java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`);

    val ints = 5;
    val ix = 0;
    for(i in ints downTo  ix) {
        for (j in i downTo  ix) {
            print("*");
        }
        println()
    }
}
