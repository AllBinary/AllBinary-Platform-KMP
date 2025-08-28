
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
        package org.allbinary.game.collision




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.layer.AllBinaryLayer

open public class CollisionHelper
            : Object
         {
        

    var sourceLayerInterface: AllBinaryLayer
public constructor        (sourceLayerInterface: AllBinaryLayer)
            : super()
        

        Updates for KMP build        
        {
var sourceLayerInterface = sourceLayerInterface
this.sourceLayerInterface= sourceLayerInterface
}


open fun isCollidable(layerInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var layerInterface = layerInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getOwnerLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sourceLayerInterface
}


open fun setOwnerLayerInterface(sourceLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var sourceLayerInterface = sourceLayerInterface
this.sourceLayerInterface= sourceLayerInterface
}


}
                
            

