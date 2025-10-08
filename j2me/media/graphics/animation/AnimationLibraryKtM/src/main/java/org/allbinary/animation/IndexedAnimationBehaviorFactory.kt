
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class IndexedAnimationBehaviorFactory : AnimationBehaviorFactory {
        

    var frameDelayTime: Long

    var loopTotal: Int
public constructor (loopTotal: Int, frameDelayTime: Long){
    //var loopTotal = loopTotal
    //var frameDelayTime = frameDelayTime
this.loopTotal= loopTotal
this.frameDelayTime= frameDelayTime
}


    override fun getOrCreateInstance()
        //nullable = true from not(false or (false and true)) = true
: AnimationBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return IndexedAnimationBehavior(this.loopTotal, this.frameDelayTime)
}


}
                
            

