
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->
<link rel="stylesheet" type="text/css" href="../public/stylesheets/main.css">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">

<li"""),_display_(/*35.5*/if(title=="Products")/*35.26*/{_display_(Seq[Any](format.raw/*35.27*/("""class="active"""")))}),format.raw/*35.42*/("""><a href=""""),_display_(/*35.53*/routes/*35.59*/.HomeController.index()),format.raw/*35.82*/("""">Products</a></li>

<li><a href="/customers">Customers</a></li>

<li><a href="#">Contact</a></li>

<li"""),_display_(/*41.5*/if(title=="Login")/*41.23*/{_display_(Seq[Any](format.raw/*41.24*/("""class="active"""")))}),format.raw/*41.39*/(""">
    """),_display_(/*42.6*/if(user != null)/*42.22*/{_display_(Seq[Any](format.raw/*42.23*/("""
        """),format.raw/*43.9*/("""<a href=""""),_display_(/*43.19*/routes/*43.25*/.LoginController.logout()),format.raw/*43.50*/("""">Logout</a></li>
            """)))}/*44.15*/else/*44.20*/{_display_(Seq[Any](format.raw/*44.21*/("""
                """),format.raw/*45.17*/("""<a href=""""),_display_(/*45.27*/routes/*45.33*/.LoginController.login()),format.raw/*45.57*/("""">Login</a></li>
            """)))}),format.raw/*46.14*/(""" 

"""),format.raw/*48.1*/("""</ul>

</div>

</nav>

<container>

<div class="row">

<div class="col-md-12">
<div class="content">
"""),_display_(/*60.2*/content),format.raw/*60.9*/("""
"""),format.raw/*61.1*/("""</div>
</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>
<script src=""""),_display_(/*81.15*/routes/*81.21*/.Assets.versioned("javascripts/main.js")),format.raw/*81.61*/(""""></script>
</body>

</html> """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 02:23:24 GMT 2017
                  SOURCE: /home/brandon/Web/Lab10/app/views/main.scala.html
                  HASH: 06338695566c75a9f5ece92af1aedc964a5101cc
                  MATRIX: 970->1|1120->56|1148->58|1264->147|1290->152|1566->401|1581->407|1643->448|1897->676|1927->697|1966->698|2012->713|2050->724|2065->730|2109->753|2239->857|2266->875|2305->876|2351->891|2384->898|2409->914|2448->915|2484->924|2521->934|2536->940|2582->965|2632->997|2645->1002|2684->1003|2729->1020|2766->1030|2781->1036|2826->1060|2887->1090|2917->1093|3045->1195|3072->1202|3100->1203|3304->1380|3319->1386|3380->1426
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|67->35|67->35|67->35|67->35|67->35|67->35|67->35|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|80->48|92->60|92->60|93->61|113->81|113->81|113->81
                  -- GENERATED --
              */
          