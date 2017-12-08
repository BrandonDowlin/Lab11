
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),_display_(/*2.2*/main("Customer Page")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Customer Info</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Address</th>
  
  <th>Number</th>
  
  <th>DOB</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*31.4*/for(p<-customers) yield /*31.21*/ {_display_(Seq[Any](format.raw/*31.23*/("""
  """),format.raw/*32.3*/("""<tr>
  
  <td>"""),_display_(/*34.8*/p/*34.9*/.getID),format.raw/*34.15*/("""</td>
  
  <td>"""),_display_(/*36.8*/p/*36.9*/.getName),format.raw/*36.17*/("""</td>
  
  <td>"""),_display_(/*38.8*/p/*38.9*/.getAddress),format.raw/*38.20*/("""</td>
  
  <td>"""),_display_(/*40.8*/p/*40.9*/.getNumber),format.raw/*40.19*/("""</td>
  
  <td>"""),_display_(/*42.8*/p/*42.9*/.getDOB),format.raw/*42.16*/("""</td>
  </tr>
""")))}),format.raw/*44.2*/("""
  
  """),format.raw/*46.3*/("""</tbody>
  
  </table>
  
  """)))}),format.raw/*50.4*/(""" """))
      }
    }
  }

  def render(customers:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 18:20:14 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab8/app/views/customer.scala.html
                  HASH: ca0b5bb023b5ca5bcb747704572878ec7337c0b3
                  MATRIX: 966->1|1095->35|1122->37|1151->58|1190->60|1222->66|1570->388|1603->405|1643->407|1673->410|1714->425|1723->426|1750->432|1792->448|1801->449|1830->457|1872->473|1881->474|1913->485|1955->501|1964->502|1995->512|2037->528|2046->529|2074->536|2119->551|2152->557|2211->586
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|63->31|63->31|63->31|64->32|66->34|66->34|66->34|68->36|68->36|68->36|70->38|70->38|70->38|72->40|72->40|72->40|74->42|74->42|74->42|76->44|78->46|82->50
                  -- GENERATED --
              */
          