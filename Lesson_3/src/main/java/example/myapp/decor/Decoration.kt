package example.myapp.decor

data class Decoration(val rocks: String) {
}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}

fun main() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}

