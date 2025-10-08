
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
        package org.allbinary.input.automation.module.generic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class CaptureWorkerUtil
            : Object
         {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun processProfileActionConditions(vector: Vector, frame: Long)
        //nullable = true from not(false or (false and false)) = true
{
var vector = vector
var frame = frame

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, "CaptureWorkerUtil", "processProfileActionConditions")

    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var profileActionConditionInterface: ProfileActionScriptConditionInterface = vector.get(index) as ProfileActionScriptConditionInterface


    
                        if(profileActionConditionInterface!!.shouldProcess(frame))
                        
                                    {
                                    profileActionConditionInterface!!.process(frame)

                                    }
                                
                        else {
                            
                        }
                            
}

}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor ()
            : super()
        {
}


}
                
            

