package scalding_tests

/**
 * @author Mateusz Fedoryszak (m.fedoryszak@icm.edu.pl)
 */

import com.twitter.scalding._

class MyJobTyped(args: Args) extends Job(args) {
  val input = TypedPipe.from(TextLine(args("input")))
  val words = input.flatMap(_.split("""\s+"""))
  val wordGroups = words.groupBy(identity).foldLeft(0)((len, _) => len + 1)
  wordGroups.write((0,1), TextLine(args("output")))
}
