package pojo

import java.time.LocalDateTime

data class TV(var pid: Int, var mid: Int) {
    internal lateinit var myClass: MyClass
    val mfg: LocalDateTime by lazy {
        myClass = MyClass(-1)
        LocalDateTime.now()
    }

    fun showTV() {
        myClass = MyClass(0)
    }

    companion object {
        fun getSampleTv(): TV {
            return TV(0, 0).apply {
                pid = 100
                mid = 100
            }
        }

        fun getMyClassFromTv(tv: TV): MyClass {
            return with(tv) {
                MyClass(pid, mid.toString())
            }
        }
    }
}