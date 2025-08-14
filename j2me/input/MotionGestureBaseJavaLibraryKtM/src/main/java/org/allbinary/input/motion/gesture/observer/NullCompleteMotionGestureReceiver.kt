
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
        package org.allbinary.input.motion.gesture.observer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class NullCompleteMotionGestureReceiver
            : Object
        
                , CompleteMotionGestureListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(
                            "Null Gesture Reciever", this, commonStrings!!.CONSTRUCTOR)
}


                @Throws(Exception::class)
            override fun onMotionGestureCompleted(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list
}


}
                
            

