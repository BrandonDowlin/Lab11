
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

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""

    """),format.raw/*6.5*/("""<div class="col-xs-4">
        <h3>Sign in</h3>
        """),_display_(/*8.10*/if(loginForm.hasGlobalErrors)/*8.39*/{_display_(Seq[Any](format.raw/*8.40*/("""
            """),format.raw/*9.13*/("""<p class="alert alert-warning">
                """),_display_(/*10.18*/loginForm/*10.27*/.globalError.message),format.raw/*10.47*/("""
            """),format.raw/*11.13*/("""</p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("error"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<p class="alert alert-warning">
                """),_display_(/*15.18*/flash/*15.23*/.get("loginRequired")),format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""</p>
        """)))}),format.raw/*17.10*/("""
        """),_display_(/*18.10*/helper/*18.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*18.80*/ {_display_(Seq[Any](format.raw/*18.82*/("""
            """),_display_(/*19.14*/CSRF/*19.18*/.formField),format.raw/*19.28*/("""
            """),format.raw/*20.13*/("""<div class="form-group">
                """),_display_(/*21.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*22.76*/("""
            """),format.raw/*23.13*/("""</div>
            <div class="form-group">
                    """),_display_(/*25.22*/inputPassword(loginForm("password"), '_label -> "",
                    'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*26.83*/("""
            """),format.raw/*27.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign in" class="btn btn-primary">
            </div>
        """)))}),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 02:17:56 GMT 2017
                  SOURCE: /home/brandon/Web/Lab10/app/views/userLogin.scala.html
                  HASH: e3139e1602750f3ee49e18deb287bac1e52de1a5
                  MATRIX: 988->1|1123->65|1168->63|1195->81|1222->83|1249->102|1288->104|1320->110|1403->167|1440->196|1478->197|1518->210|1594->259|1612->268|1653->288|1694->301|1739->315|1776->325|1815->355|1855->357|1896->370|1972->419|1986->424|2028->445|2069->458|2114->472|2151->482|2166->488|2239->552|2279->554|2320->568|2333->572|2364->582|2405->595|2474->637|2615->757|2656->770|2748->835|2903->969|2944->982|3125->1132|3157->1137
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|38->6|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|52->20|53->21|54->22|55->23|57->25|58->26|59->27|63->31|64->32
                  -- GENERATED --
              */
          