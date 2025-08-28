
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
        package org.allbinary.content




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import org.allbinary.logic.communication.log.LogUtil

open public class CommandUriAction
            : Object
         {
        

        companion object {
            
    private val instance: CommandUriAction = CommandUriAction()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CommandUriAction

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun add(command: Command, url: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var command = command
var url = url
}


open fun process(command: Command)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var command = command
}


}
                
            

