
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
        package org.allbinary.logic.system.os




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class OperatingSystems
            : Object
         {
        

        companion object {
            
    private val instance: OperatingSystems = OperatingSystems()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OperatingSystems{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val LINUX: String = "Linux"

    val WINDOWS: String = "Windows"

    val SOLARIS: String = "Solaris"

    val WINDOWS2000: String = "Windows 2000"

    val WINDOWS_NT: String = "Windows NT"

    val WINDOWS_10: String = "Windows 10"

    val WINDOWS_11: String = "Windows 11"

    val WINDOWS_VISTA: String = "Windows Vista"

    val WINDOWS_XP: String = "Windows XP"

    val ANDROID: String = LINUX
private constructor        ()
            : super()
        {}


    private var unknownSpecificOSAllowed: Boolean = true

open fun isUnknownSpecificOSAllowed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return unknownSpecificOSAllowed
}


open fun setUnknownSpecificOSAllowed(aUnknownSpecificOSAllowed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var aUnknownSpecificOSAllowed = aUnknownSpecificOSAllowed
unknownSpecificOSAllowed= aUnknownSpecificOSAllowed
}


}
                
            

