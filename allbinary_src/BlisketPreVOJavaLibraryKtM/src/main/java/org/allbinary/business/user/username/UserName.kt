
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
        package org.allbinary.business.user.username



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.UserData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings

open public class UserName
            : Object
         {
        

        companion object {
            
    private val instance: UserName = UserName()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UserName{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun getValidationInfo(aUserName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var aUserName = aUserName

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(aUserName, 5, UserData.MAXLEN))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Please enter a User Name with more than 5 characters.<br/>"

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var userName: String
private constructor        ()
            : super()
        {}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.userName= hashMap!!.get(UserData.USERNAME) as String
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isValid(userName)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to validate form", this, 
                            "isUserNameValid()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun isValid(aUserName: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var aUserName = aUserName

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


        try {
            
    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!
            


    var valid: Boolean = booleanFactory!!.TRUE


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VALIDATION))
                        
                                    {
                                    logUtil!!.put("UserName: " +aUserName, this, commonStrings!!.IS_VALID)

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(aUserName, 5, UserData.MAXLEN))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VALIDATION))
                        
                                    {
                                    logUtil!!.put(
                            "UserName is invalid", this, commonStrings!!.IS_VALID)

                                    }
                                
valid= booleanFactory!!.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to validate form", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

