fun main() {
    val ints = 10;
    val ix = 1;

    for(rows in ix..ints) {
        for(cols in ix..rows) {
            print("*");
        }
        println();
    }
}
