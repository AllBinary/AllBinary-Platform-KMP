
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
        

expect open public class SystemProperties
            : Object
         {
        
companion object {
            
    //private val instance: SystemProperties
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SystemProperties

        }
            

    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getArch()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

