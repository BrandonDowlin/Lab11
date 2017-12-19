
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""
"""),_display_(/*2.2*/main("Products Page", user)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>Categories</h4>
      <div class="list-group">
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.index(0)),format.raw/*9.49*/("""" class="list-group-item">All categories</a>
        """),_display_(/*10.10*/for(c <- categories) yield /*10.30*/{_display_(Seq[Any](format.raw/*10.31*/("""
          """),format.raw/*11.11*/("""<a href=""""),_display_(/*11.21*/routes/*11.27*/.HomeController.index(c.getId)),format.raw/*11.57*/("""" class="list-group-item">"""),_display_(/*11.84*/c/*11.85*/.getName),format.raw/*11.93*/("""
            """),format.raw/*12.13*/("""<span class="badge">"""),_display_(/*12.34*/c/*12.35*/.getProducts.size()),format.raw/*12.54*/("""</span>
          </a>
        """)))}),format.raw/*14.10*/("""

      """),format.raw/*16.7*/("""</div>
    </div>
    <div class="col-sm-10">
  

  """),_display_(/*21.4*/if(flash.containsKey("success"))/*21.36*/{_display_(Seq[Any](format.raw/*21.37*/("""
      """),format.raw/*22.7*/("""<div class="alert alert-success">
        """),_display_(/*23.10*/flash/*23.15*/.get("success")),format.raw/*23.30*/("""
      """),format.raw/*24.7*/("""</div>
  """)))}),format.raw/*25.4*/("""

  
  """),format.raw/*28.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>

  <th>Category</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*55.4*/for(p<-products) yield /*55.20*/ {_display_(Seq[Any](format.raw/*55.22*/("""
  """),format.raw/*56.3*/("""<tr>
  
  <td>"""),_display_(/*58.8*/p/*58.9*/.getId),format.raw/*58.15*/("""</td>
  
  <td>"""),_display_(/*60.8*/p/*60.9*/.getName),format.raw/*60.17*/("""</td>

  <td>"""),_display_(/*62.8*/p/*62.9*/.getCategory.getName),format.raw/*62.29*/("""</td>
  
  <td>"""),_display_(/*64.8*/p/*64.9*/.getDescription),format.raw/*64.24*/("""</td>
  
  <td>"""),_display_(/*66.8*/p/*66.9*/.getStock),format.raw/*66.18*/("""</td>

  <td class="numeric">&euro; """),_display_(/*68.31*/("%.2f".format(p.getPrice))),format.raw/*68.58*/("""</td>

  """),_display_(/*70.4*/if(user != null)/*70.20*/{_display_(Seq[Any](format.raw/*70.21*/("""
  """),format.raw/*71.3*/("""<td>
    <a href=""""),_display_(/*72.15*/routes/*72.21*/.HomeController.updateProduct(p.getId)),format.raw/*72.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-pencil"></span>
    </a>
  </td>

  <td>
    <a href=""""),_display_(/*78.15*/routes/*78.21*/.HomeController.deleteProduct(p.getId)),format.raw/*78.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-trash"></span>
    </a>
  </td>
""")))}),format.raw/*82.2*/("""
  """),format.raw/*83.3*/("""</tr>
""")))}),format.raw/*84.2*/("""
  
  """),format.raw/*86.3*/("""</tbody>
  
  </table>

  <p>
    <a href=""""),_display_(/*91.15*/routes/*91.21*/.HomeController.addProduct()),format.raw/*91.49*/("""">
        <button class="btn btn-primary">Add a product</button>
    </a>

  </p>
</div>
</div>
  
  """)))}),format.raw/*99.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 02:17:56 GMT 2017
                  SOURCE: /home/brandon/Web/Lab10/app/views/index.scala.html
                  HASH: 988c2cc89bd823f36b170e9098149501c6d59d0d
                  MATRIX: 1002->1|1189->93|1216->95|1251->122|1290->124|1322->130|1508->290|1522->296|1566->320|1647->374|1683->394|1722->395|1761->406|1798->416|1813->422|1864->452|1918->479|1928->480|1957->488|1998->501|2046->522|2056->523|2096->542|2159->574|2194->582|2273->635|2314->667|2353->668|2387->675|2457->718|2471->723|2507->738|2541->745|2581->755|2615->762|2950->1071|2982->1087|3022->1089|3052->1092|3093->1107|3102->1108|3129->1114|3171->1130|3180->1131|3209->1139|3249->1153|3258->1154|3299->1174|3341->1190|3350->1191|3386->1206|3428->1222|3437->1223|3467->1232|3531->1269|3579->1296|3615->1306|3640->1322|3679->1323|3709->1326|3755->1345|3770->1351|3829->1389|4013->1546|4028->1552|4087->1590|4252->1725|4282->1728|4319->1735|4352->1741|4423->1785|4438->1791|4487->1819|4620->1922
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|46->14|48->16|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|60->28|87->55|87->55|87->55|88->56|90->58|90->58|90->58|92->60|92->60|92->60|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|100->68|100->68|102->70|102->70|102->70|103->71|104->72|104->72|104->72|110->78|110->78|110->78|114->82|115->83|116->84|118->86|123->91|123->91|123->91|131->99
                  -- GENERATED --
              */
          