
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.media.ScaleProperties

open public class NullAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface
                , ProceduralAnimationInterfaceFactoryInterface {
        

        companion object {
            
    var NULL_NOT_FOR_USE_ANIMATION_FACTORY: NullAnimationFactory = NullAnimationFactory()

    private var NULL_ANIMATION_FACTORY: NullAnimationFactory = NullAnimationFactory()

open fun getFactoryInstance()
        //nullable = true from not(false or (false and true)) = true
: NullAnimationFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_ANIMATION_FACTORY
}


        }
            
    private val NULL_ANIMATION: Animation = object: Animation()
                                {
                                
open override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
}

                                }
                            

    val EMPTY_ARRAY: Array<Animation?> = arrayOfNulls(0)
private constructor        ()
            : super()
        {}

override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_ANIMATION
}


                @Throws(Exception::class)
            override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_ANIMATION
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
}


}
                
            

