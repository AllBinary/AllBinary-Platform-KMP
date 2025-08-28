
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
        
import java.util.Hashtable
import javax.microedition.lcdui.Command
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.data.resource.ResourceUtil

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

    private var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

open fun add(command: Command, url: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var command = command
var url = url
hashtable.put(command, url)
}


open fun process(command: Command)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var command = command

        try {
            } catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}


open fun getIntent(command: Command)
        //nullable = true from not(false or (false and false)) = true
: Intent

        Updates for KMP build        
        {
var command = command

    var url: String = hashtable.get(command as Object) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return intent
}


}
                
            

