
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab8/conf/routes
// @DATE:Fri Dec 08 18:20:15 GMT 2017


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
