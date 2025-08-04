
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
        package org.allbinary.game.layer.pickup.health



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.layer.pickup.CountedPickedUpLayerInterfaceFactory
import org.allbinary.game.layer.pickup.IconLayerFactory
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactory
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.game.layer.pickup.PickedUpLayerTypeFactory
import org.allbinary.game.layer.pickup.PickupProcessorInterface
import org.allbinary.layer.AllBinaryLayer

open public class HealPickedUpLayerInterfaceFactory : PickedUpLayerInterfaceFactory
                , PickupProcessorInterface {
        

        companion object {


    private var pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface = CountedPickedUpLayerInterfaceFactory.NULL_COUNTED_PICKUP_LAYER_FACTORY

                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{pickedUpLayerInterfaceFactoryInterface= HealPickedUpLayerInterfaceFactory()
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PickedUpLayerInterfaceFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pickedUpLayerInterfaceFactoryInterface
}



        }
            
    private var pool: HealLayerCircularStaticPool = HealLayerCircularStaticPool(HealLayerFactory(), 1)
private constructor        ()                        

                            : super(PickedUpLayerTypeFactory.getInstance()!!.HEAL, IconLayerFactory.getInstance(FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(HealthResources.getInstance()!!.RESOURCE)!!.getInstance(0), 10, 10), FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(HealthResources.getInstance()!!.RESOURCE)!!.getInstance(0)){

                            //For kotlin this is before the body of the constructor.
                    
}


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


                @Throws(Exception::class)
            override fun process(sourceLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var sourceLayerInterface = sourceLayerInterface
pool!!.visit(sourceLayerInterface)
}


}
                
            

