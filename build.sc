import mill._, mill.scalalib._

object modulo extends JavaModule {
  object test extends Tests {
    override def ivyDeps = Agg(
      ivy"com.novocode:junit-interface:0.11"
    )
    def testFrameworks = Seq("com.novocode.junit.JUnitFramework")
  }
}
