
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
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.media.ScaleProperties

open public class CompoundAnimationInterfaceFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    val basicAnimationInterfaceFactoryInterfaceArrayP: Array<AnimationInterfaceFactoryInterface?>

    val animationBehaviorFactory: AnimationBehaviorFactory
public constructor        (basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {

                    var basicAnimationInterfaceFactoryInterfaceArray = basicAnimationInterfaceFactoryInterfaceArray


                    var animationBehaviorFactory = animationBehaviorFactory
this.basicAnimationInterfaceFactoryInterfaceArrayP= basicAnimationInterfaceFactoryInterfaceArray
this.animationBehaviorFactory= animationBehaviorFactory
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId

    var size: Int = this.basicAnimationInterfaceFactoryInterfaceArrayP!!.size
                


    var animationInterfaceArray: Array<Animation?> = this.createArray(size)!!
            





                        for (index in 0 until size)


        {animationInterfaceArray[index]= this.basicAnimationInterfaceFactoryInterfaceArrayP[index]!!.getInstance(instanceId)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(animationInterfaceArray)
}


open fun createArray(size: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Animation?>{

                    var size = size



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullAnimationFactory.getFactoryInstance()!!.EMPTY_ARRAY
}


open fun getInstance(animationInterfaceArray: Array<Animation?>)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var animationInterfaceArray = animationInterfaceArray



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullAnimationFactory.getFactoryInstance()!!.getInstance(0)
}


open fun getBasicAnimationInterfaceFactoryInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<AnimationInterfaceFactoryInterface?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicAnimationInterfaceFactoryInterfaceArrayP
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties

    var size: Int = this.basicAnimationInterfaceFactoryInterfaceArrayP!!.size
                





                        for (index in 0 until size)


        {this.basicAnimationInterfaceFactoryInterfaceArrayP[index]!!.setInitialScale(scaleProperties)
}

}


}
                
            

