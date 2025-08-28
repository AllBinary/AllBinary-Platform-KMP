
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
        package org.allbinary.data.tables.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoFactoryInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigAndManipulatorFactoryBase
import org.allbinary.logic.visual.transform.info.objectConfig.generator.TransformInfoObjectConfigGeneratorFactoryInterface
import org.allbinary.string.CommonStrings

open public class TransformInfoEntityFactory
            : Object
         {
        

        companion object {
            
open fun getInstance(transformInfoObjectConfigGeneratorFactoryInterface: TransformInfoObjectConfigGeneratorFactoryInterface, transformInfoObjectConfigAndManipulatorFactoryInterface: TransformInfoObjectConfigAndManipulatorFactoryBase, transformInfoFactoryInterface: TransformInfoFactoryInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoEntity

        Updates for KMP build        
        {
var transformInfoObjectConfigGeneratorFactoryInterface = transformInfoObjectConfigGeneratorFactoryInterface
var transformInfoObjectConfigAndManipulatorFactoryInterface = transformInfoObjectConfigAndManipulatorFactoryInterface
var transformInfoFactoryInterface = transformInfoFactoryInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoEntity(transformInfoObjectConfigGeneratorFactoryInterface, transformInfoObjectConfigAndManipulatorFactoryInterface, transformInfoFactoryInterface)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, "TransformInfoEntityFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            

