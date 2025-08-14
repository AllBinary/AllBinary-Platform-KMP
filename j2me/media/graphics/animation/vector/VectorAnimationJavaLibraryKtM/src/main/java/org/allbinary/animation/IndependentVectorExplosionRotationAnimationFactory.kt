
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
import org.allbinary.logic.NullUtil
import org.allbinary.vector.VectorInfo

open public class IndependentVectorExplosionRotationAnimationFactory
            : Object
        
                , ProceduralAnimationInterfaceFactoryInterface {
        

    private var framePoints: Array<Array<IntArray?>?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY_ARRAY

    private var vectorInfo: VectorInfo

    private var basicColor: BasicColor

    private var vectorAnimationFactoryInterface: VectorAnimationFactoryInterface
public constructor        (vectorInfo: VectorInfo, basicColor: BasicColor, vectorAnimationFactoryInterface: VectorAnimationFactoryInterface)
            : super()
        {

                    var vectorInfo = vectorInfo


                    var basicColor = basicColor


                    var vectorAnimationFactoryInterface = vectorAnimationFactoryInterface
this.vectorInfo= vectorInfo
this.basicColor= basicColor
this.vectorAnimationFactoryInterface= vectorAnimationFactoryInterface
this.init()
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{framePoints= VectorRotationGenerator.getInstance()!!.getInstance(this.vectorInfo)
}


    private val vectorExplosionGenerator: VectorExplosionGenerator = VectorExplosionGenerator.getInstance()!!
            

                @Throws(Exception::class)
            override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var animationInterface = animationInterface

    var frame: Int = 0


    
                        if(animationInterface != 
                                    null
                                )
                        
                                    {
                                    
    var rotationAnimationInterface: IndexedAnimation = animationInterface as IndexedAnimation

frame= rotationAnimationInterface!!.getFrame()

                                    }
                                

    var points: Array<Array<IntArray?>?> = vectorExplosionGenerator!!.getInstance(framePoints[frame]!!, 6, vectorExplosionGenerator!!.ROTATION)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.vectorAnimationFactoryInterface!!.getInstance(points, this.basicColor)
}


}
                
            

