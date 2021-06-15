package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        if ((day.toInt()>28 && month=="2")||day.toInt()>31||month.toInt()>12)
            return "Такого дня не существует"
        val monthArr= listOf("января","февраля","марта","апреля","мая","июня","июля","августа","сентября","октября","ноября","декабря")
        val dayArr=listOf("воскресенье","понедельник","вторник","среда","четверг","пятница","суббота")
        val monthInt=month.toInt()
        val a= (14-monthInt)/12
        val y= year.toInt()-a
        val m= monthInt+12*a-2
        val r= (7000 +(day.toInt()+y +y/4 - y/100 +y/400+(31*m)/12))%7

        return "$day ${monthArr[monthInt-1]}, ${dayArr[r]}"
    }
}
