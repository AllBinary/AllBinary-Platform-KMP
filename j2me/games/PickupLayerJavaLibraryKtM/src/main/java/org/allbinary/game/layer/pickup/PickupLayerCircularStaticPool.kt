
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
        
import org.allbinary.layer.AllBinaryLayerCircularPool

open public class PickupLayerCircularStaticPool : AllBinaryLayerCircularPool {
        

        companion object {
            
    private var SINGLETON: PickupLayerCircularStaticPool = PickupLayerCircularStaticPool()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PickupLayerCircularStaticPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            private constructor        (){
}


                @Throws(Exception::class)
            
open fun getInstance(pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface, x: Int, y: Int, z: Int)
        //nullable =  from not(true or (false and false)) = 
: PickedUpLayerInterface{
var pickedUpLayerInterfaceFactoryInterface = pickedUpLayerInterfaceFactoryInterface
var x = x
var y = y
var z = z

    var pickupLayer: PickupLayer = this.getNextInstance() as PickupLayer

pickupLayer!!.init(x, y, z)
pickupLayer!!.init(pickedUpLayerInterfaceFactoryInterface, pickedUpLayerInterfaceFactoryInterface!!.getAnimationInterface())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pickupLayer
}


}
                
            

