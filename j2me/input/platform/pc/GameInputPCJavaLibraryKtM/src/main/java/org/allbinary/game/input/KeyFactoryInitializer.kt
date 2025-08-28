
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.init.Init
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class KeyFactoryInitializer : Init {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
override fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.INIT)
SmallIntegerSingletonFactory.getInstance()!!.init(0x2D0, 6)
}


}
                
            

