
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  III
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.visual.transform.template.customizer.includes.meta




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.Validation
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.dhtml.html.head.meta.HtmlMetaAttributeData
import org.allbinary.logic.visual.dhtml.html.head.meta.HtmlMetaAttributeDataFactory
import org.allbinary.logic.visual.dhtml.html.head.meta.HtmlMetaData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class MetaValidation : Validation
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var label: String

    private var name: String

    private var httpEquiv: String

    private var content: String
public constructor        (htmlMetaAttributeData: HtmlMetaAttributeData, label: String, attributeValue: String, contentValue: String){

                    var htmlMetaAttributeData = htmlMetaAttributeData


                    var label = label


                    var attributeValue = attributeValue


                    var contentValue = contentValue
this.label= label

    
                        if(htmlMetaAttributeData!!.equals(HtmlMetaAttributeDataFactory.getInstance()!!.HTTP_EQUIV))
                        
                                    {
                                    this.httpEquiv= attributeValue

                                    }
                                
                             else 
    
                        if(htmlMetaAttributeData!!.equals(HtmlMetaAttributeDataFactory.getInstance()!!.NAME))
                        
                                    {
                                    this.name= attributeValue

                                    }
                                
this.content= contentValue
}

public constructor        (document: Document){

                    var document = document



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var valid: Boolean = Boolean.TRUE




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate form", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringBuffer: StringMaker = StringMaker()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var htmlMetaAttributeDataFactory: HtmlMetaAttributeDataFactory = HtmlMetaAttributeDataFactory.getInstance()!!

hashMap!!.put(HtmlMetaData.getInstance()!!.LABEL.toString(), this.label)
hashMap!!.put(htmlMetaAttributeDataFactory!!.NAME.toString(), this.name)
hashMap!!.put(htmlMetaAttributeDataFactory!!.HTTP_EQUIV.toString(), this.httpEquiv)
hashMap!!.put(htmlMetaAttributeDataFactory!!.CONTENT.toString(), this.content)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = ModDomHelper.createNameValueNodes(document, HtmlMetaData.getInstance()!!.NAME.toString(), this.toHashMap())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

