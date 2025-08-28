
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
        package org.allbinary.logic.visual.dhtml.style.css




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.string.StringMaker
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CssElementValidation : CssElementView
                , ValidationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()                        

                            : super()

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (node: Node)                        

                            : super(node)

        Updates for KMP build        
        {
var node = node


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            
    var valid: Boolean = Boolean.TRUE


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("CssElementValidation", this, commonStrings!!.IS_VALID)

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("CssElementValidation: " +valid, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate data", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getValue())
stringBuffer!!.append(" Css Style is not valid.")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation info error", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Data"
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

