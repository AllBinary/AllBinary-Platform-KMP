
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
        
import org.allbinary.game.health.HealthInterfaceCompositeInterface
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.part.CountedLayerInterfaceFactoryPart
import org.allbinary.game.part.PartInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings

open public class PickupBehavior
            : Object
        
                , PickupBehaviorInterface {
        

        companion object {
            
    val NULL_PICKUP_BEHAVIOR: PickupBehavior = PickupBehavior(CollidableDestroyableDamageableLayer.NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER, 0)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val countedIndex: Int

    private val ownerLayerInterface: CollidableDestroyableDamageableLayer
public constructor        (ownerLayerInterface: CollidableDestroyableDamageableLayer, countedIndex: Int)
            : super()
        {

                    var ownerLayerInterface = ownerLayerInterface


                    var countedIndex = countedIndex
this.ownerLayerInterface= ownerLayerInterface
this.countedIndex= countedIndex
}

override fun doPickup(pickupProcessorInterface: PickupProcessorInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pickupProcessorInterface = pickupProcessorInterface

        try {
            
    var healthInterfaceCompositeInterface: HealthInterfaceCompositeInterface = this.ownerLayerInterface as HealthInterfaceCompositeInterface


    
                        if(healthInterfaceCompositeInterface!!.getHealthInterface()!!.isAlive())
                        
                                    {
                                    pickupProcessorInterface!!.process(ownerLayerInterface)

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "doPickup", e)
}

}

override fun doPickup(pickupLayerInterface: PickedUpLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pickupLayerInterface = pickupLayerInterface

        try {
            
    var pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface = pickupLayerInterface!!.getPickedUpLayerInterfaceFactoryInterface()!!
            


    var pickedUpLayerType: PickedUpLayerType = pickedUpLayerInterfaceFactoryInterface!!.getPickedUpLayerType()!!
            


    var pickedUpLayerTypeFactory: PickedUpLayerTypeFactory = PickedUpLayerTypeFactory.getInstance()!!
            


    
                        if(pickedUpLayerType == pickedUpLayerTypeFactory!!.BEAM || pickedUpLayerType == pickedUpLayerTypeFactory!!.MINE || pickedUpLayerType == pickedUpLayerTypeFactory!!.PROJECTILE || pickedUpLayerType == pickedUpLayerTypeFactory!!.ENHANCEMENT)
                        
                                    {
                                    this.add(pickedUpLayerInterfaceFactoryInterface as CountedPickedUpLayerInterfaceFactoryInterface)

                                    }
                                
                             else 
    
                        if(pickedUpLayerInterfaceFactoryInterface!!.getPickedUpLayerType() == pickedUpLayerTypeFactory!!.PART)
                        
                                    {
                                    this.ownerLayerInterface!!.addPart(pickedUpLayerInterfaceFactoryInterface)

                                    }
                                
                             else 
    
                        if(pickedUpLayerType == pickedUpLayerTypeFactory!!.NONE)
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.doPickup(pickedUpLayerInterfaceFactoryInterface as PickupProcessorInterface)

                        }
                            
pickupLayerInterface!!.setPickedUp()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, this, 
                            "doPickup", e)
}

}


open fun add(countedPickedUpLayerInterfaceFactoryInterface: CountedPickedUpLayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var countedPickedUpLayerInterfaceFactoryInterface = countedPickedUpLayerInterfaceFactoryInterface

    var partIndex: Int = countedPickedUpLayerInterfaceFactoryInterface!!.getId() +this.countedIndex

this.add(countedPickedUpLayerInterfaceFactoryInterface, partIndex)
}


open fun add(countedPickedUpLayerInterfaceFactoryInterface: CountedPickedUpLayerInterfaceFactoryInterface, partIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var countedPickedUpLayerInterfaceFactoryInterface = countedPickedUpLayerInterfaceFactoryInterface


                    var partIndex = partIndex

    var countedLayerInterfaceFactory: CountedLayerInterfaceFactoryPart = this.ownerLayerInterface!!.getPartInterfaceArray()[partIndex]!! as CountedLayerInterfaceFactoryPart

countedLayerInterfaceFactory!!.setTotal(countedLayerInterfaceFactory!!.getTotal() +countedPickedUpLayerInterfaceFactoryInterface!!.getTotal())
}


open fun getFirstAvailableCountedLayerInterfaceFactory(pickedUpLayerTypeArray: Array<PickedUpLayerType?>)
        //nullable = true from not(false or (false and false)) = true
: CountedLayerInterfaceFactoryPart{

                    var pickedUpLayerTypeArray = pickedUpLayerTypeArray

    var partInterfaceArray: Array<PartInterface?> = this.ownerLayerInterface!!.getPartInterfaceArray()!!
            


    var size: Int = partInterfaceArray!!.size
                


    var nextCountedLayerInterfaceFactory: CountedLayerInterfaceFactoryPart


    var countedPickedUpLayerInterfaceFactory: CountedPickedUpLayerInterfaceFactory





                        for (index in this.countedIndex until size)


        {nextCountedLayerInterfaceFactory= this.ownerLayerInterface!!.getPartInterfaceArray()[index]!! as CountedLayerInterfaceFactoryPart
countedPickedUpLayerInterfaceFactory= nextCountedLayerInterfaceFactory!!.getCountedPickedUpLayerInterfaceFactory()




                        for (index2 in pickedUpLayerTypeArray!!.size downTo 0)


        {
    
                        if(countedPickedUpLayerInterfaceFactory!!.getPickedUpLayerType() == pickedUpLayerTypeArray[index2])
                        
                                    {
                                    
    
                        if(nextCountedLayerInterfaceFactory!!.getTotal() > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nextCountedLayerInterfaceFactory

                                    }
                                

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CountedLayerInterfaceFactoryPart.NULL_COUNTED_LAYER_INTERFACE_FACTORY
}


                @Throws(Exception::class)
            
open fun getCountedLayerInterfaceFactoryForSlot(slotIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: CountedLayerInterfaceFactoryPart{

                    var slotIndex = slotIndex

    var currentSlot: Int = 0


    var partInterfaceArray: Array<PartInterface?> = this.ownerLayerInterface!!.getPartInterfaceArray()!!
            


    var size: Int = partInterfaceArray!!.size
                


    var nextCountedLayerInterfaceFactory: CountedLayerInterfaceFactoryPart





                        for (index in this.countedIndex until size)


        {nextCountedLayerInterfaceFactory= this.ownerLayerInterface!!.getPartInterfaceArray()[index]!! as CountedLayerInterfaceFactoryPart

    
                        if(nextCountedLayerInterfaceFactory!!.getTotal() > 0)
                        
                                    {
                                    
    
                        if(currentSlot == slotIndex)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nextCountedLayerInterfaceFactory

                                    }
                                
                        else {
                            currentSlot++

                        }
                            

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CountedLayerInterfaceFactoryPart.NULL_COUNTED_LAYER_INTERFACE_FACTORY
}


open fun getCountedIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return countedIndex
}


}
                
            

