
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
        package org.allbinary.midlet




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.NullCanvas
import org.allbinary.canvas.Processor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ExitRunnable
            : Object
        
                , Runnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val midlet: AllBinaryMidlet

    private val processor: Processor

    private val isProgress: Boolean
public constructor (midlet: AllBinaryMidlet, processor: Processor, isProgress: Boolean)
            : super()
        {
var midlet = midlet
var processor = processor
var isProgress = isProgress
this.midlet= midlet
this.isProgress= isProgress
this.processor= processor
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)
this.midlet.destroyApp(false, this.isProgress)
this.midlet.setDisplay(NullCanvas.NULL_CANVAS)
this.midlet.notifyDestroyed()
logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
processor.process()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)

        try {
            processor.process()
} catch(e2: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

}


}
                
            

