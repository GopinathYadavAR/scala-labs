package x  

object WordCount {
    val text = """
    Mount Everest attracts many climbers, including highly experienced mountaineers. There are two main climbing routes, one approaching the summit from the southeast in Nepal (known as the "standard route") and the other from the north in Tibet. While not posing substantial technical climbing challenges on the standard route, Everest presents dangers such as altitude sickness, weather, and wind, as well as hazards from avalanches and the Khumbu Icefall. As of 2019, over 300 people have died on Everest,[4] many of whose bodies remain on the mountain

    The first recorded efforts to reach Everest's summit were made by British mountaineers. As Nepal did not allow foreigners to enter the country at the time, the British made several attempts on the north ridge route from the Tibetan side. After the first reconnaissance expedition by the British in 1921 reached 7,000 m (22,970 ft) on the North Col, the 1922 expedition pushed the north ridge route up to 8,320 m (27,300 ft), marking the first time a human had climbed above 8,000 m (26,247 ft). The 1924 expedition resulted in one of the greatest mysteries on Everest to this day: George Mallory and Andrew Irvine made a final summit attempt on 8 June but never returned, sparking debate as to whether they were the first to reach the top. Tenzing Norgay and Edmund Hillary made the first documented ascent of Everest in 1953, using the southeast ridge route. Norgay had reached 8,595 m (28,199 ft) the previous year as a member of the 1952 Swiss expedition. The Chinese mountaineering team of Wang Fuzhou, Gonpo, and Qu Yinhua made the first reported ascent of the peak from the north ridge on 25 May 1960

    Mount Everest has a polar climate with all months averaging well below freezing
    """

    def main(args: Array[String]) {

        // split the sentence into words
        val words = text.split("\\W+")

        /*
        for (w <- words) {
                // TODO-1 : print out one word per line
        }
        */

        // TODO-2: Print total number of words
        // println (s"total row words : ${words.???}")


        // convert words to lowercase
        // val wordsLowerCase = words.map(x => x.toLowerCase)

        // debug : print out lowercased words one per line
        /*
        for (w <- wordsLowerCase) {
                println (w)
        }
        */

        // TODO-3: Print lowercase word count
        // println (...)


        // TODO-4: Our words may have duplicates
        // How can we eliminate the duplicates?
        // Hint : consider using a Set
        // val uniqWords = wordsLowerCase.to???
        // println (s"uniqWords.length : ${uniqWords.size}")

        // TODO-5 : find the max lengh of word
        /*
        var maxLen = 0
        for (w <- uniqWords) {
                if (w.length > maxLen)  maxLen = ???
        }
        println ("max word len : " + maxLen)
        */

    }
}