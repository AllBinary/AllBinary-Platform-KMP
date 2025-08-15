
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
        package org.allbinary.business.user.password




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Random
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings

open public class Password
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var password: String
public constructor        (password: String)
            : super()
        {

                    var password = password
this.password= password
}


open fun set(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.password= value
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.password
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


        try {
            
    var valid: Boolean = Boolean.TRUE


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VALIDATION))
                        
                                    {
                                    logUtil!!.put("Password: " +this.password, this, commonStrings!!.IS_VALID)

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.password, 6, UserData.MAXLEN))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VALIDATION))
                        
                                    {
                                    logUtil!!.put("Password is invalid", this, commonStrings!!.IS_VALID)

                                    }
                                
valid= Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VALIDATIONERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate form", "Password", commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun getValidationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.password, 6, UserData.MAXLEN))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Please enter a Password with more than 6 characters.<br />"

                                    }
                                

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringUtil!!.EMPTY_STRING
}


open fun toVector(secret: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var secret = secret
this.password= StringUtil.getInstance()!!.getInstance(this.password)

    var random: Int = Random().
                            nextInt(SuperCrypt.KEYMAX)!!
            


    var vector: Vector = Vector()

vector.add(Integer(random).
                            toString())
vector.add(secret)
vector.add(SuperCrypt(random).
                            encrypt(password))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


open fun toHashMap(secret: String)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var secret = secret
this.password= StringUtil.getInstance()!!.getInstance(this.password)

    var values: HashMap<Any, Any> = HashMap<Any, Any>()


    var random: Int = Random().
                            nextInt(SuperCrypt.KEYMAX)!!
            

values.put(EntryData.getInstance()!!.ENCRYPTION, Integer(random).
                            toString())
values.put(UserData.SECRET, secret)
values.put(UserData.PASSWORD, SuperCrypt(random).
                            encrypt(this.password))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


}
                
            

