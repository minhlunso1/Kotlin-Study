package OuterInner

//In Kotlin, outer class does not see private members of inner class
class OuterClassKotlin {
    object InnerClass {
        private val id2: Int = 0
        private var id: Int = 0
        fun getId(): Int = id
        fun setId(id: Int) { this.id = id }
    }

    val idFromInner: Int = InnerClass.getId() //idFromInner always 0

}
