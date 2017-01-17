import data.AliceData

val words: Array[String] = AliceData.bookText.split(AliceData.bookRegex)

val stopWords: Set[String] = AliceData.stopWordText.split(AliceData.stopWordRegex).toSet

val cleanWords: Array[String] = words.filterNot(stopWords)

cleanWords
  .groupBy(identity)
  .mapValues(_.length)
  .toList
  .sortBy(pair => -pair._2)
  .take(10)

cleanWords
  .foldLeft(Map.empty[String, Int].withDefaultValue(0)) { (map, word) =>
    map + (word -> (map(word) + 1))
  }
  .toList
  .sortBy(-_._2)
  .take(10)
