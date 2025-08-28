
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
        package views.generic.user




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.username.UserName
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class EditValidationUserView : UserView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var userName: String
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.userName= this.getWeblisketSession()!!.getUserName()
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            
    
                        if(UserName.getInstance()!!.isValid(this.userName) == Boolean.TRUE)
                        
                                    {
                                    this.user= UserEntityFactory.getInstance()!!.getUser(this.userName)

    
                        if(user == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                
                             else 
    
                        if()
                        



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.user.isValid()
} catch(e: Exception)
            

        Updates for KMP build        
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
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(UserName.getInstance()!!.isValid(this.userName))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("User Name is valid", this, "validationInfo()")

                                    }
                                
this.user= UserEntityFactory.getInstance()!!.getUser(this.userName)

    
                        if(user == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("User does not exist.<br />")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                

                                    }
                                
                        else {
                            stringBuffer!!.append("User Name is not valid.<br />")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                        }
                            

    
                        if(this.user.isValid() == Boolean.FALSE)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("User exists but is invalid - Probably manually modified", this, "validationInfo()")

                                    }
                                
stringBuffer!!.append("User data is not valid - Please call administrator.<br />")
stringBuffer!!.append(this.user.validationInfo())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
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
                
            

