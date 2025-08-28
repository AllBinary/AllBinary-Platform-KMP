
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.thread.ABRunnable

open public class DemoGameStartupRunnable : ABRunnable {
        

        companion object {
            
    val TYPE: Int = 4

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val demoCanvas: DemoCanvas
public constructor        (demoCanvas: DemoCanvas){
var demoCanvas = demoCanvas
this.demoCanvas= demoCanvas
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.setRunning(true)
this.demoCanvas!!.stopGameDemo()
this.demoCanvas!!.create()
this.demoCanvas!!.start()
this.setRunning(false)
} catch(e: Exception)
            {
this.setRunning(false)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE
}


}
                
            

