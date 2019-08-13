import com.google.gson.Gson
import java.io.File

val filePath = "./src/posts.json"

fun main() {
    val posts = loadData()
}





data class Post(
    val body: String = "",
    val id: Int = 0,
    val title: String = "",
    val userId: Int = 0
)

fun loadData(): List<Post> {
    val gson = Gson()
    val jsonData = File(filePath).bufferedReader().use { it.readText() }
    return gson.fromJson(jsonData, Array<Post>::class.java).toList()
}