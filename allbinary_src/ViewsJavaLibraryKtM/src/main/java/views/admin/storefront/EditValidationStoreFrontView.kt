
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
        package views.admin.storefront




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class EditValidationStoreFrontView : StoreFrontComponent
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    var valid: Boolean = Boolean.TRUE


    
                        if(this.newStoreFrontInterface!!.isNameValid() == Boolean.FALSE)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(StoreFrontFactory.getInstance(this.newStoreFrontInterface!!.getName()) == 
                                    null
                                )
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                
this.newStoreFrontInterface= StoreFrontFactory.getInstance(this.newStoreFrontInterface!!.getName())



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


    
                        if(this.newStoreFrontInterface!!.isNameValid() == Boolean.FALSE)
                        
                                    {
                                    stringBuffer!!.append(this.newStoreFrontInterface!!.nameValidationInfo())

                                    }
                                

    
                        if(StoreFrontFactory.getInstance(this.newStoreFrontInterface!!.getName()) == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.newStoreFrontInterface +" does not exist.<br>")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Unkown Error"
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
                
            

