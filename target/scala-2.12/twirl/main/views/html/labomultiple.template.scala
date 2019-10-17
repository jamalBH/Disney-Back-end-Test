
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

object labomultiple extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tmp : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/main("Disneyland Paris - Java Technical Test")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<h1>/ This is the image /</h1>
"""),_display_(/*5.2*/tmp),format.raw/*5.5*/("""
"""),format.raw/*6.1*/("""<img src="""),_display_(/*6.11*/routes/*6.17*/.Assets.versioned("images/image.jpg")),format.raw/*6.54*/(""" """),format.raw/*6.55*/("""/>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(tmp:String): play.twirl.api.HtmlFormat.Appendable = apply(tmp)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (tmp) => apply(tmp)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 16 21:45:27 UTC 2019
                  SOURCE: D:/livr/dlp-test/app/views/labomultiple.scala.html
                  HASH: bebc2cca00601ed19cf9201a073753c0cd3cdf6c
                  MATRIX: 955->1|1064->15|1094->20|1148->66|1187->68|1215->70|1273->103|1295->106|1323->108|1359->118|1373->124|1430->161|1458->162|1492->167
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|38->6|38->6|38->6|38->6|38->6|39->7
                  -- GENERATED --
              */
          