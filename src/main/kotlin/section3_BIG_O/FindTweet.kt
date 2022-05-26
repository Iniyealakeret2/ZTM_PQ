package section3_BIG_O

fun main(){
    val arrayTweets = listOf(FindTweet("hi",2021), FindTweet("emma",2022), FindTweet("hi",2020))
    findLatestAndOldestTweet(arrayTweets)
}
fun findLatestAndOldestTweet(tweets: List<FindTweet>){
    val latestTweet = tweets[0]
    val oldestTweet = tweets[tweets.size - 1]
    println("$latestTweet, $oldestTweet")
}
data class FindTweet(
    val tweet: String,
    val date: Int
)