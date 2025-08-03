
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class VectorExplosionAnimationFactory
            : Object
        
                , ProceduralAnimationInterfaceFactoryInterface {
        

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    val animationBehaviorFactory: AnimationBehaviorFactory
public constructor        (basicColor: BasicColor)                        

                            : this(basicColor, AnimationBehaviorFactory.getInstance()){

                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (basicColor: BasicColor, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {

                    var basicColor = basicColor


                    var animationBehaviorFactory = animationBehaviorFactory
this.animationBehaviorFactory= animationBehaviorFactory
this.setBasicColorP(basicColor)
}


    private val vectorExplosionGenerator: VectorExplosionGenerator = VectorExplosionGenerator.getInstance()!!
            

                @Throws(Exception::class)
            override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var animationInterface = animationInterface

    var vectorRotationAnimationInterface: VectorAnimationInterface = animationInterface as VectorAnimationInterface


    var frame: Int = vectorRotationAnimationInterface!!.getFrame()!!
            


    var framePoints: Array<IntArray?> = vectorRotationAnimationInterface!!.getPoints(frame)!!
            


    var points: Array<Array<IntArray?>?> = vectorExplosionGenerator!!.getInstance(framePoints, 6, vectorExplosionGenerator!!.ROTATION)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VectorRotationAnimation(points, this.getBasicColorP(), this.animationBehaviorFactory!!.getOrCreateInstance())
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


}
                
            

