
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Product", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/ {_display_(Seq[Any](format.raw/*8.107*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.81*/("""
    """),_display_(/*13.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*13.95*/("""
        """),_display_(/*14.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*19.14*/("""

    """),_display_(/*21.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*21.83*/("""
    """),_display_(/*22.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.83*/("""

    """),_display_(/*24.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.70*/("""

    """),format.raw/*26.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.index(0)),format.raw/*29.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*34.2*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 02:17:56 GMT 2017
                  SOURCE: /home/brandon/Web/Lab10/app/views/addProduct.scala.html
                  HASH: ee531f9e9155a8ff79d0ca82c1d52bd23a810f19
                  MATRIX: 985->1|1118->64|1163->61|1191->80|1218->82|1251->107|1290->109|1317->110|1396->164|1504->263|1544->265|1581->276|1594->280|1625->290|1658->297|1754->372|1786->378|1896->467|1933->477|2194->717|2227->724|2325->801|2357->807|2455->884|2488->891|2573->955|2606->961|2755->1083|2770->1089|2815->1113|2948->1216
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|51->19|53->21|53->21|54->22|54->22|56->24|56->24|58->26|61->29|61->29|61->29|66->34
                  -- GENERATED --
              */
          