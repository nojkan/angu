package models

import scala.collection.Set
import play.api.libs.json.JsValue

case class Product( 
				 apiResources: List[String],
                 approvalType: String,
                 //attributes: List[JsValue],
                 //createdBy: String,
                 description: String,
                 displayName : String,
                 //environments: List[String],
                 name: String,
                 //proxies: List[String],
                 quota : Int,
                 quotaInterval: String,
                 quotaTimeUnit: String,
                 //scopes:List[String],
                 active:Boolean
                 )

object JsonProductFormats {
  import play.api.libs.json.Json

  // Generates Writes and Reads for Feed and User thanks to Json Macros
  implicit val productFormat = Json.format[Product]
}