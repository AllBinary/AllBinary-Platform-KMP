
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
        package org.allbinary.game.ai



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.bounds.TopULayerBounds
import org.allbinary.game.input.GameInput
import org.allbinary.game.physics.velocity.VelocityInterface
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer

open public class TopUBoundBounceAIFactory
            : Object
        
                , ArtificialIntelligenceInterfaceFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            override fun getInstance(hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)
        //nullable =  from not(true or (false and false)) = 
: ArtificialIntelligenceInterface{

                    var hashtable = hashtable


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput

    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = ownerLayerInterface as VelocityInterfaceCompositeInterface


    var velocityInterface: VelocityInterface = velocityInterfaceCompositeInterface!!.getVelocityProperties() as VelocityInterface


    var maxDistancePerTick: Int = (velocityInterface!!.getMaxForwardVelocity() shr velocityInterface!!.getVelocityXBasicDecimalP()!!.getScaledFactor())


    var halfWidth: Int = ownerLayerInterface!!.getWidth() *2 +maxDistancePerTick +1


    var halfHeight: Int = ownerLayerInterface!!.getHeight() *2 +maxDistancePerTick +1


    var point: GPoint = PointFactory.getInstance()!!.getInstance(halfWidth, halfHeight +60)!!
            


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var rectangle: Rectangle = Rectangle(point, (displayInfo!!.getLastWidth() -halfWidth -point.getX()), (displayInfo!!.getLastHeight() -halfHeight -point.getY()))




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BoundBounceAI(ownerLayerInterface, gameInput, TopULayerBounds(rectangle), ReverseVelocityBoundsVisitor(ownerLayerInterface))
}


}
                
            

