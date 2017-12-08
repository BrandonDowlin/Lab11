
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main("Products Page")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Product Catalogue</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*31.4*/for(p<-products) yield /*31.20*/ {_display_(Seq[Any](format.raw/*31.22*/("""
  """),format.raw/*32.3*/("""<tr>
  
  <td>"""),_display_(/*34.8*/p/*34.9*/.getId),format.raw/*34.15*/("""</td>
  
  <td>"""),_display_(/*36.8*/p/*36.9*/.getName),format.raw/*36.17*/("""</td>
  
  <td>"""),_display_(/*38.8*/p/*38.9*/.getDesc),format.raw/*38.17*/("""</td>
  
  <td>"""),_display_(/*40.8*/p/*40.9*/.getStock),format.raw/*40.18*/("""</td>
  
  <td class="numeric">&euro; """),_display_(/*42.31*/("%.2f".format(p.getPrice))),format.raw/*42.58*/("""</td>
  </tr>
""")))}),format.raw/*44.2*/("""
  
  """),format.raw/*46.3*/("""</tbody>
  
  </table>
  
  """)))}),format.raw/*50.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 17:34:50 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab8/app/views/index.scala.html
                  HASH: fe3a3748ecf7db5a7c40c58c55ef8314779d6b9e
                  MATRIX: 962->1|1089->33|1116->35|1145->56|1184->58|1216->64|1573->395|1605->411|1645->413|1675->416|1716->431|1725->432|1752->438|1794->454|1803->455|1832->463|1874->479|1883->480|1912->488|1954->504|1963->505|1993->514|2059->553|2107->580|2152->595|2185->601|2244->630
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|63->31|63->31|63->31|64->32|66->34|66->34|66->34|68->36|68->36|68->36|70->38|70->38|70->38|72->40|72->40|72->40|74->42|74->42|76->44|78->46|82->50
                  -- GENERATED --
              */
          