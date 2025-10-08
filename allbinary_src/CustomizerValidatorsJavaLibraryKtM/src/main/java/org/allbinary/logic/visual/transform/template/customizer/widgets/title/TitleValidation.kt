
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
        package org.allbinary.logic.visual.transform.template.customizer.widgets.title




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class TitleValidation : TitleView
                , ValidationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor ()                        

                            : super(){


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (node: Node)                        

                            : super(node){
var node = node


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (hashMap: HashMap<Any, Any>)                        

                            : super(hashMap){
var hashMap = hashMap


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TitleValidation", this, commonStrings!!.IS_VALID)

                                    }
                                

    var valid: Boolean = Boolean.TRUE


    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.getTitle(), 1, TitleData.getInstance()!!.MAXLEN))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TitleValidation: " +valid, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
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

stringBuffer!!.append("Title is not valid.")



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


}
                
            

