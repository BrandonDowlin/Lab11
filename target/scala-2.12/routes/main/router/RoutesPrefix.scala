
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/conf/routes
// @DATE:Sat Dec 09 20:43:37 GMT 2017


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
