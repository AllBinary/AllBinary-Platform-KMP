
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener

open public class LicenseUtil
            : Object
         {
        

        companion object {
            
    private val instance: LicenseUtil = LicenseUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LicenseUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun init()
        //nullable = true from not(false or (false and true)) = true
{
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var running = running
}


open fun shouldWait(commandListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var commandListener = commandListener



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isRunning()
}


}
                
            

