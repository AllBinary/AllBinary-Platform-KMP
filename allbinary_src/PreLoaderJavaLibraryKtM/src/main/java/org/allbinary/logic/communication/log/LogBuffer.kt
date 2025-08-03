
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
        package org.allbinary.logic.communication.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class LogBuffer
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var logEntryVector: Vector
public constructor        ()
            : super()
        {this.logEntryVector= Vector()
}


open fun add(log: Log)
        //nullable = true from not(false or (false and false)) = true
{

                    var log = log
this.logEntryVector!!.add(log)
}


open fun logAll()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = this.logEntryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var log: Log = this.logEntryVector!!.get(index) as Log

logUtil!!.put(log)
}

}


}
                
            

