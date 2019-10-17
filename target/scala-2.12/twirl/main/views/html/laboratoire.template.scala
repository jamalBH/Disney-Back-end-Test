
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

object laboratoire extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task : String,pictures : List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main("Disneyland Paris - Java Technical Test")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),_display_(/*4.2*/if(task == "task2")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
"""),format.raw/*5.1*/("""<h1>/ This is the image of task 2/</h1>
<img src="""),_display_(/*6.11*/routes/*6.17*/.Assets.versioned("images/image.jpg")),format.raw/*6.54*/(""" """),format.raw/*6.55*/("""/>
""")))}/*7.3*/else/*7.8*/{_display_(Seq[Any](format.raw/*7.9*/("""
"""),format.raw/*8.1*/("""<h1>/ This is the image of task 3/</h1>
"""),_display_(/*9.2*/for(picture <- pictures) yield /*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
"""),_display_(/*10.2*/picture),format.raw/*10.9*/("""
"""),format.raw/*11.1*/("""<img src="""),_display_(/*11.11*/routes/*11.17*/.Assets.versioned(picture)),format.raw/*11.43*/(""" """),format.raw/*11.44*/("""/>

""")))}),format.raw/*13.2*/("""
""")))}),format.raw/*14.2*/("""
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(task:String,pictures:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(task,pictures)

  def f:((String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (task,pictures) => apply(task,pictures)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 17 01:00:46 UTC 2019
                  SOURCE: D:/livr/dlp-test/app/views/laboratoire.scala.html
                  HASH: 73ef8156efb2c8a36d754aeceb630d0ebfd09f31
                  MATRIX: 967->1|1101->40|1131->45|1185->91|1224->93|1252->96|1279->115|1318->117|1346->119|1423->170|1437->176|1494->213|1522->214|1544->220|1555->225|1592->226|1620->228|1687->270|1726->294|1765->296|1794->299|1821->306|1850->308|1887->318|1902->324|1949->350|1978->351|2015->358|2048->361|2081->364
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|43->11|43->11|43->11|45->13|46->14|47->15
                  -- GENERATED --
              */
          