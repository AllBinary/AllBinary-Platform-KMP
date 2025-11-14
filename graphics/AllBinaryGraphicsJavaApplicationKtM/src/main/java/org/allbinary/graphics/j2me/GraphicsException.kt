
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
        package org.allbinary.graphics.j2me




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.GuiLog
import org.allbinary.logic.communication.log.LogUtil

open public class GraphicsException : java.lang.Exception {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val guiLog: GuiLog = GuiLog.getInstance()!!
public constructor (msg: String, obj: Any, method: String)                        

                            : super(msg){
var msg = msg
var obj = obj
var method = method


                            //For kotlin this is before the body of the constructor.
                    

        try {
            guiLog!!.showDialog(msg)
logUtil!!.put(msg, obj, method, this)
} catch(e: Exception)
            {
}

}

public constructor (msg: String, className: String, method: String)                        

                            : super(msg){
var msg = msg
var className = className
var method = method


                            //For kotlin this is before the body of the constructor.
                    

        try {
            guiLog!!.showDialog(msg)
logUtil!!.put(msg, className, method, this)
} catch(e: Exception)
            {
}

}


}
                
            

