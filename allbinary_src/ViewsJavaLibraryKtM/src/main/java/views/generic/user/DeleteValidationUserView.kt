
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
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.username.UserName
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class DeleteValidationUserView : UserView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var userName: String
public constructor (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    var httpServletRequest: HttpServletRequest = this.getPageContext()!!.getRequest() as HttpServletRequest


    var hashMap: HashMap<Any, Any> = RequestParams(httpServletRequest).
                            toHashMap()!!

this.userName= UserName(hashMap).
                            get()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("User Name: " +this.userName, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    
                        if(UserName.getInstance()!!.isValid(this.userName) == Boolean.TRUE)
                        
                                    {
                                    this.user= UserEntityFactory.getInstance()!!.getUser(this.userName)

    
                        if(user == 
                                    null
                                )
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
                             else 
    
                        if()
                        



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
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


    
                        if(UserName.getInstance()!!.isValid(this.userName) == Boolean.TRUE)
                        
                                    {
                                    this.user= UserEntityFactory.getInstance()!!.getUser(this.userName)

    
                        if(user == 
                                    null
                                )
                        stringBuffer!!.append("User does not exist.<br />")

                                    }
                                
                             else 
    
                        if()
                        



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
                
            

