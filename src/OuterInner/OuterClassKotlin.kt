package OuterInner

//In Kotlin, outer class does not see private members of inner class
class OuterClassKotlin {
    object InnerClass {
        private val id: Int = 0
        fun getId(): Int = id
    }

    val idFromInner: Int = InnerClass.getId()
}
