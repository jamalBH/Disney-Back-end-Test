// @GENERATOR:play-routes-compiler
// @SOURCE:D:/livr/dlp-test/conf/routes
// @DATE:Wed Oct 16 16:17:49 UTC 2019


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
