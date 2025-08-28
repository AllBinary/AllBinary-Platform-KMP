
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
        package org.allbinary.animation.compound




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.IndexedAnimation
import org.allbinary.media.ScaleProperties

open public class SimultaneousCompoundIndexAnimationInterfaceFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private val basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>

    private val animationBehaviorFactory: AnimationBehaviorFactory
public constructor        (basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        

        Updates for KMP build        
        {
    //var basicAnimationInterfaceFactoryInterfaceArray = basicAnimationInterfaceFactoryInterfaceArray
    //var animationBehaviorFactory = animationBehaviorFactory
this.basicAnimationInterfaceFactoryInterfaceArray= basicAnimationInterfaceFactoryInterfaceArray
this.animationBehaviorFactory= animationBehaviorFactory
}


                @Throws(Exception::class)
            
open fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var instanceId = instanceId

    var size: Int = this.basicAnimationInterfaceFactoryInterfaceArray!!.size
                


    var animationInterfaceArray: Array<IndexedAnimation?> = arrayOfNulls(size)





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
animationInterfaceArray[index]= this.basicAnimationInterfaceFactoryInterfaceArray[index]!!.getInstance(instanceId) as IndexedAnimation
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(animationInterfaceArray)
}


open fun getInstance(animationInterfaceArray: Array<IndexedAnimation?>)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var animationInterfaceArray = animationInterfaceArray



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SimultaneousCompoundIndexAnimation(animationInterfaceArray, this.animationBehaviorFactory!!.getOrCreateInstance())
}


open fun getBasicAnimationInterfaceFactoryInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<AnimationInterfaceFactoryInterface?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicAnimationInterfaceFactoryInterfaceArray
}


open fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var scaleProperties = scaleProperties
}


}
                
            

