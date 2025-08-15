
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
        package org.allbinary.logic.visual.transform.template.customizer.includes.globals




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.context.modules.storefront.StoreFrontView
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.Validation
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class GlobalsValidation : Validation
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var storeFrontInterface: StoreFrontInterface
public constructor        (storeName: String){

                    var storeName = storeName
this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)
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


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(GlobalsData.NAME)!!
            

node.appendChild(StoreFrontView(this.storeFrontInterface).
                            toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

