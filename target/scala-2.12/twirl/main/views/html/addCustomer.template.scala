
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Customer", user)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new customer</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.106*/ {_display_(Seq[Any](format.raw/*8.108*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.82*/("""
    """),_display_(/*13.6*/inputText(customerForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*13.88*/("""
    """),_display_(/*14.6*/inputText(customerForm("number"), '_label -> "Phone Number", 'class -> "form-control")),format.raw/*14.92*/("""
    """),_display_(/*15.6*/inputText(customerForm("dob"), '_label -> "Date of Birth", 'class -> "form-control")),format.raw/*15.90*/("""

    """),_display_(/*17.6*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.71*/("""

    """),format.raw/*19.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Customer" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.customer),format.raw/*22.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*27.2*/("""
""")))}))
      }
    }
  }

  def render(customerForm:Form[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,user)

  def f:((Form[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,user) => apply(customerForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 02:17:56 GMT 2017
                  SOURCE: /home/brandon/Web/Lab10/app/views/addCustomer.scala.html
                  HASH: f62eec0e4eab057ac2f232231735a3070a1925f0
                  MATRIX: 987->1|1122->66|1167->63|1195->82|1222->84|1256->110|1295->112|1322->113|1402->168|1511->268|1551->270|1588->281|1601->285|1632->295|1665->302|1762->378|1794->384|1897->466|1929->472|2036->558|2068->564|2173->648|2206->655|2292->720|2325->726|2475->849|2490->855|2535->879|2668->982
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|54->22|54->22|54->22|59->27
                  -- GENERATED --
              */
          