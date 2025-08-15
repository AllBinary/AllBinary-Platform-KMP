
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
        package org.allbinary.logic.system.security.licensing.registration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class RegistrationConfiguration
            : Object
         {
        

        companion object {
            
    private val SINGLETON: RegistrationConfiguration = RegistrationConfiguration()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RegistrationConfiguration{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private var registrationCode: String = "No Registration Code"

    val NAME: String = "registrationid"
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun read()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append("Registration Code: ")!!.append(this.getRegistrationCode())!!.toString()
}


open fun setRegistrationCode(registrationCode: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var registrationCode = registrationCode
this.registrationCode= registrationCode
}


open fun getRegistrationCode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return registrationCode
}


}
                
            

