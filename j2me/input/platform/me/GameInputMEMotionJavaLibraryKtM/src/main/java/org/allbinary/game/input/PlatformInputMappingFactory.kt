
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class PlatformInputMappingFactory
            : Object
         {
        

        companion object {


    private val instance: PlatformInputMappingFactory = PlatformInputMappingFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlatformInputMappingFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var SINGLETON: PersistentInputMapping = PersistentInputMapping.NULL_PERSISTENT_INPUT_MAPPING

open fun getPersistentInputMappingInstance()
        //nullable = true from not(false or (false and true)) = true
: PersistentInputMapping{
        try {
            
    
                        if(SINGLETON == 
                                    null
                                )
                        
                                    {
                                    SINGLETON= MotionJ2MEGameInputMapping()

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


}
                
            

