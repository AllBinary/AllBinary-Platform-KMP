
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
        package org.allbinary.logic.visual.transform.info.objectConfig.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil

open public class BasicGenerator : TransformInfoObjectConfigGenerator {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()

        Updates for KMP build        
        {
}


open fun process(input: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var input = input

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Processing", this, commonStrings!!.PROCESS)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return input
}


}
                
            

