package section3_BIG_O

fun main(args: Array<String>){
    val arrayTweets = listOf("hi", "emma", "solo")
    findLatestAndOldestTweet(arrayTweets)
}
fun findLatestAndOldestTweet(tweets: List<String>){
    val latestTweet = tweets[0]
    val oldestTweet = tweets[tweets.size - 1]
    println("$latestTweet, $oldestTweet")
}