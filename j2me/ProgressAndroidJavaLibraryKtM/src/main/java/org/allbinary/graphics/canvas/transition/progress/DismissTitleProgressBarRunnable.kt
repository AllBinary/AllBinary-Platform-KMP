
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
        package org.allbinary.graphics.canvas.transition.progress



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.transition.TransistionTypes
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import android.app.Activity

open public class DismissTitleProgressBarRunnable : ProgressRunnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (midletActivity: Activity, progressCanvas: ProgressCanvas)                        

                            : super(midletActivity, progressCanvas){

                    var midletActivity = midletActivity


                    var progressCanvas = progressCanvas


                            //For kotlin this is before the body of the constructor.
                    
}


    private val ZOOM_OUT_AND_IN: IntArray = intArrayOf(TransistionTypes.getInstance()!!.ZOOM_OUT,TransistionTypes.getInstance()!!.ZOOM_IN)

open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.midletActivity!!.onDismissProgress(ZOOM_OUT_AND_IN)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            

