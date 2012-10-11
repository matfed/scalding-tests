package scalding_tests

/**
 * @author ${user.name}
 */

import com.twitter.scalding._

class MyJob(args: Args) extends Job(args) {

  TextLine(args("input"))
    .read
    .flatMap('line -> 'word){ line : String => line.split("\\s")}
    .groupBy('word){group => group.size}
    .write(Tsv(args("output")))

}
