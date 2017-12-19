
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""
"""),_display_(/*2.2*/main("Customer Page", user)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Customer Info</p>
  

  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
    """),format.raw/*8.5*/("""<div class="alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
""")))}),format.raw/*11.2*/("""

  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
  
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
  """),_display_(/*38.4*/for(p<-customers) yield /*38.21*/ {_display_(Seq[Any](format.raw/*38.23*/("""
  """),format.raw/*39.3*/("""<tr>
  
  <td>"""),_display_(/*41.8*/p/*41.9*/.getId),format.raw/*41.15*/("""</td>
  
  <td>"""),_display_(/*43.8*/p/*43.9*/.getName),format.raw/*43.17*/("""</td>
  
  <td>"""),_display_(/*45.8*/p/*45.9*/.getAddress),format.raw/*45.20*/("""</td>
  
  <td>"""),_display_(/*47.8*/p/*47.9*/.getNumber),format.raw/*47.19*/("""</td>
  
  <td>"""),_display_(/*49.8*/p/*49.9*/.getDob),format.raw/*49.16*/("""</td>
  <td>
    <a href=""""),_display_(/*51.15*/routes/*51.21*/.HomeController.updateCustomer(p.getId)),format.raw/*51.60*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-pencil"></span>
    </a>
  </td>
  <td>
    <a href=""""),_display_(/*56.15*/routes/*56.21*/.HomeController.deleteCustomer(p.getId)),format.raw/*56.60*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-trash"></span>
    </a>
  </td>
  </tr>
""")))}),format.raw/*61.2*/("""
  
  """),format.raw/*63.3*/("""</tbody>
  
  </table>
  
  <p>
    <a href=""""),_display_(/*68.15*/routes/*68.21*/.HomeController.addCustomer()),format.raw/*68.50*/("""">
        <button class="btn btn-primary">Add a customer</button>
    </a>

  </p>
  """)))}),format.raw/*73.4*/(""" """))
      }
    }
  }

  def render(customers:List[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customers,user)

  def f:((List[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customers,user) => apply(customers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 02:17:56 GMT 2017
                  SOURCE: /home/brandon/Web/Lab10/app/views/customer.scala.html
                  HASH: a1f462d27ed60a1e43ef43a84a44c1b0f43dad23
                  MATRIX: 984->1|1138->60|1165->62|1200->89|1239->91|1271->97|1337->138|1377->170|1415->171|1446->176|1512->217|1525->222|1560->237|1592->242|1630->250|1661->254|1970->537|2003->554|2043->556|2073->559|2114->574|2123->575|2150->581|2192->597|2201->598|2230->606|2272->622|2281->623|2313->634|2355->650|2364->651|2395->661|2437->677|2446->678|2474->685|2528->712|2543->718|2603->757|2786->913|2801->919|2861->958|3034->1101|3067->1107|3140->1153|3155->1159|3205->1188|3322->1275
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|70->38|70->38|70->38|71->39|73->41|73->41|73->41|75->43|75->43|75->43|77->45|77->45|77->45|79->47|79->47|79->47|81->49|81->49|81->49|83->51|83->51|83->51|88->56|88->56|88->56|93->61|95->63|100->68|100->68|100->68|105->73
                  -- GENERATED --
              */
          