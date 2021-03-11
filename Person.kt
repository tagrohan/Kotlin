class Person(str: Int, int: Int) {

    private var int = int
    private var str = str

    constructor(int: Int) : this(10,int) {
        this.int = int
    }

    fun add() = str + int

}