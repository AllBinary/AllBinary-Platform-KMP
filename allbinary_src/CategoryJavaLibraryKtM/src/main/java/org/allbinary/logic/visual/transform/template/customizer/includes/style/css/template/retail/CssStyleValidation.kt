
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
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.visual.transform.template.customizer.includes.style.css.template.retail




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.Validation
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.dhtml.style.StyleData
import org.allbinary.logic.visual.dhtml.style.StylesData
import org.allbinary.logic.visual.dhtml.style.StylesValidationFactory
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CssStyleValidation : Validation
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var cssStyleElementVector: Vector
public constructor        (){
this.cssStyleElementVector= Vector()
}

public constructor        (document: Document){
var document = document
this.cssStyleElementVector= StylesValidationFactory.getInstance()!!.getInstance(document)
}

public constructor        (hashMap: HashMap<Any, Any>){
var hashMap = hashMap
this.cssStyleElementVector= StylesValidationFactory.getInstance(hashMap)
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    var isValid: Boolean = Boolean.TRUE


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.IS_VALID)

                                    }
                                

    var size: Int = cssStyleElementVector!!.size!!





                        for (i in 0 until size)

        {

    var styleValidationInterface: ValidationInterface = cssStyleElementVector!!.get(i) as ValidationInterface


    
                        if(!styleValidationInterface!!.isValid())
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("End: " +isValid, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
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

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
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


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = document.createElement(StylesData.getInstance()!!.NAME)!!


    var styleNode: Node = document.createElement(StyleData.getInstance()!!.NAME)!!

node.appendChild(styleNode)

    var size: Int = cssStyleElementVector!!.size!!





                        for (i in 0 until size)

        {

    var styleDomNodeInterface: DomNodeInterface = cssStyleElementVector!!.get(i) as DomNodeInterface

styleNode!!.appendChild(styleDomNodeInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

