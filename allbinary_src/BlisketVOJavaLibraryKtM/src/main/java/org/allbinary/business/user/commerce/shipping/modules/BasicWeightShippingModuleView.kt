
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
        package org.allbinary.business.user.commerce.shipping.modules




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicWeightShippingModuleView : BasicWeightShippingModule
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor (){
}


    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: org.w3c.dom.Document{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    open fun toValidationInfoNode(document: org.w3c.dom.Document)
        //nullable = true from not(false or (false and false)) = true
: org.w3c.dom.Node{
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    open fun toXmlNode(document: org.w3c.dom.Document)
        //nullable = true from not(false or (false and false)) = true
: org.w3c.dom.Node{
var document = document

        try {
            
    var shippingMethodNode: Node = document.createElement(ShippingMethodData.NAME)!!

shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodData.NAME, this.getName()))
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodData.DESCRIPTION, this.getDescription()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shippingMethodNode
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "toXmlNode", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: org.w3c.dom.Document{

        try {
            
    var document: Document = DomDocumentHelper.create()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "toXmlDoc", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.NOT_IMPLEMENTED
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "view", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

