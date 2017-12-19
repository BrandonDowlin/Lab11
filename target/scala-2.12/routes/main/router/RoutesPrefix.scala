
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Web/Lab10/conf/routes
// @DATE:Tue Dec 19 02:15:52 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
