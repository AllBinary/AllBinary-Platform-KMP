
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
        package org.allbinary.game.layer.pickup




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.game.collision.CollidableAlwaysPickupNeverCollideBehaviorFactory
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.game.tick.TickableInterface
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.view.ViewPosition

open public class FallingPickupLayer : PickupLayer
                , TickableInterface {
        
companion object {
            
    private val NAME: String = "FallingPickupLayer"

        }
            public constructor (remoteInfo: RemoteInfo)                        

                            : super(NAME, remoteInfo, 0, CountedPickedUpLayerInterfaceFactory.NULL_COUNTED_PICKUP_LAYER_FACTORY, NullAnimationFactory.getFactoryInstance()!!.getInstance(0), Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0), ViewPosition.getInstanceD()){
    //var remoteInfo = remoteInfo


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
this.setPosition(this.x, this.y +1, this.z)
}


    override fun implmentsTickableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

