
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
        package org.allbinary.input.automation.actions.script.condition




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.actions.script.ProfileActionScriptItemInterface
import org.allbinary.input.automation.actions.script.ProfileActionScriptNodeInterface
import org.allbinary.input.automation.actions.script.condition.processors.ProfileActionScriptProcessorInterface
interface ProfileActionScriptConditionInterface : ProfileActionScriptNodeInterface, CustomTreeNodeInterface, ProfileActionScriptItemInterface {
        

open fun addProcessor(profileActionProcessorInterface: ProfileActionScriptProcessorInterface)
        //nullable = true from not(false or (false and false)) = true


open fun removeProcessor(profileActionProcessorInterface: ProfileActionScriptProcessorInterface)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun shouldProcess(frame: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

}
                
            

