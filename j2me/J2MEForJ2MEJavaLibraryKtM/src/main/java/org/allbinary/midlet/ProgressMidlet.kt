
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
        
import org.allbinary.canvas.Processor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ClientInformationFactory
import org.allbinary.thread.PrimaryThreadPool
import org.allbinary.thread.ThreadPool

open public class ProgressMidlet : AllBinaryMidlet {
        

    val abeClientInformation: AbeClientInformationInterface
public constructor (clientInformationFactory: ClientInformationFactory){
    //var clientInformationFactory = clientInformationFactory
this.preInit()
this.abeClientInformation= clientInformationFactory!!.getInstance()
}


    open fun preInit()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun exit(isProgress: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var isProgress = isProgress

    var processor: Processor = MidletExitProcessorFactory.getInstance()!!.getInstance(this)!!


        try {
            
    var primaryThreadPool: ThreadPool = PrimaryThreadPool.getInstance()!!


    var runnable: Runnable = ExitRunnable(this, processor, isProgress)

primaryThreadPool!!.runTask(runnable)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "exit", e)

        try {
            processor.process()
} catch(e2: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "exit", e)
}

}

}


}
                
            

