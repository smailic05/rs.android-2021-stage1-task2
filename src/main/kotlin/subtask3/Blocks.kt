package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when(blockB){
            String::class -> blockA.filterIsInstance<String>().joinToString("")

            Int::class -> blockA.filterIsInstance<Int>().sum()

            LocalDate::class ->  {
                blockA.filterIsInstance<LocalDate>().max()!!.format(
                    DateTimeFormatter.ofPattern("dd.MM.yyyy")
                )
            }
            else -> 0
        }
    }
}
