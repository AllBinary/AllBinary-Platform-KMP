
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
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AllBinaryMediaManagerShutdown
            : Object
         {
        

        companion object {
            
    private val instance: AllBinaryMediaManagerShutdown = AllBinaryMediaManagerShutdown()

                @Throws(Exception::class)
            
open fun shutdown(soundsFactoryInterface: SoundsFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var soundsFactoryInterface = soundsFactoryInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.START, instance, "shutdown")
AllBinaryMediaManager.shutdown(soundsFactoryInterface)
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

