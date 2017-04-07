/**
  * Created by constie on 04.04.2017.
  */

package readerDecorator

import scala.io.Source
import scala.io.StdIn.readLine

trait Reader {
  def read(): String
}

trait CapitalizeDecorator extends Reader {
  abstract override def read(): String = {
    super.read().split(" ").map(_.capitalize).mkString(" ")
  }
}

trait WhitespaceDecorator extends Reader {
  abstract override def read(): String = {
    super.read().filterNot((x: Char) => x.isWhitespace)
  }
}

class InputReader extends Reader {
  override def read(): String = {
    println("read from input")
    readLine
  }
}

class FileReader extends Reader {
  override def read(): String = {
    println("read from file")
    Source.fromFile("/Users/constie/IdeaProjects/textfile.txt").mkString
  }
}
