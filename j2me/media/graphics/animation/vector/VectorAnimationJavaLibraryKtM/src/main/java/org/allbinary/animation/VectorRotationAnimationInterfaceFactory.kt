
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
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.NullUtil
import org.allbinary.media.ScaleProperties

open public class VectorRotationAnimationInterfaceFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private var currentPoints: Array<Array<IntArray?>?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY_ARRAY

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    val animationBehaviorFactory: AnimationBehaviorFactory
public constructor        (currentPoints: Array<Array<IntArray?>?>, basicColor: BasicColor)                        

                            : this(currentPoints, basicColor, AnimationBehaviorFactory.getInstance()){

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (currentPoints: Array<Array<IntArray?>?>, basicColor: BasicColor, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                    var animationBehaviorFactory = animationBehaviorFactory
this.currentPoints= currentPoints
this.setBasicColorP(basicColor)
this.animationBehaviorFactory= animationBehaviorFactory
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VectorRotationAnimation(this.currentPoints, this.getBasicColorP(), this.animationBehaviorFactory!!.getOrCreateInstance())
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
this.basicColor= basicColor
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
}


}
                
            

