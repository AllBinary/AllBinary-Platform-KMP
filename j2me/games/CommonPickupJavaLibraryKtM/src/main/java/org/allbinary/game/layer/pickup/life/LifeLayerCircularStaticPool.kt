
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
        package org.allbinary.game.layer.pickup.life




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.life.Life
import org.allbinary.game.life.LifeInterfaceCompositeInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerCircularPool
import org.allbinary.layer.AllBinaryLayerFactoryInterface

open public class LifeLayerCircularStaticPool : AllBinaryLayerCircularPool {
        
public constructor        (allbinaryLayerFactoryInterface: AllBinaryLayerFactoryInterface, total: Int){
var allbinaryLayerFactoryInterface = allbinaryLayerFactoryInterface
var total = total
super.init(allbinaryLayerFactoryInterface, total)
}


                @Throws(Exception::class)
            
open fun visit(sourceLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var sourceLayerInterface = sourceLayerInterface

    var lifeLayer: LifeLayer = this.getNextInstance() as LifeLayer


    var lifeInterfaceCompositeInterface: LifeInterfaceCompositeInterface = sourceLayerInterface as LifeInterfaceCompositeInterface


    var lifeInterface: Life = lifeInterfaceCompositeInterface!!.getLifeInterface()!!

lifeLayer!!.visit(lifeInterface)
}


}
                
            

