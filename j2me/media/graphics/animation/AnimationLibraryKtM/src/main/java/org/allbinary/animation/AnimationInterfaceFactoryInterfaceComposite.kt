
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
        
import org.allbinary.media.ScaleProperties

open public class AnimationInterfaceFactoryInterfaceComposite
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private val animationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>
public constructor        (basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>)
            : super()
        

        Updates for KMP build        
        {
    //var basicAnimationInterfaceFactoryInterfaceArray = basicAnimationInterfaceFactoryInterfaceArray
this.animationInterfaceFactoryInterfaceArray= basicAnimationInterfaceFactoryInterfaceArray
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullAnimationFactory.getFactoryInstance()!!.getInstance(0)
}


open fun getAnimationInterfaceFactoryInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<AnimationInterfaceFactoryInterface?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceFactoryInterfaceArray
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var scaleProperties = scaleProperties
}


}
                
            

