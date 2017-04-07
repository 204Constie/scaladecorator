/**
  * Created by constie on 04.04.2017.
  */

import readerDecorator.{InputReader, FileReader, CapitalizeDecorator, WhitespaceDecorator}

object Main {
  def main(args: Array[String]) {

    val iReader = new InputReader
    val fReader = new FileReader

    print("\n")
    iReader.read().foreach(print)
    print("\n")
    fReader.read().foreach(print)
    print("\n")

    val wfReader = new FileReader with WhitespaceDecorator
    val cwiReader = new InputReader with CapitalizeDecorator with WhitespaceDecorator

    print("\n")
    wfReader.read().foreach(print)
    print("\n")
    cwiReader.read().foreach(print)
    print("\n")
    
  }
}
