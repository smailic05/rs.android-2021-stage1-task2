package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var k=0
        var ai=a
        for (i in ai.indices) {
            if (k<b.length) {
                if (ai[i].toUpperCase()!=b[k])
                    ai=ai.removeRange(i,i)
                else k++
            }
        }
        return if (k==b.length)
            "YES"
        else "NO"


    }
}
