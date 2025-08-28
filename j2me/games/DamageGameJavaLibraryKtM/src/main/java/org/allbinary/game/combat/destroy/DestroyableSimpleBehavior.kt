
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
        package org.allbinary.game.combat.destroy




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.CollidableCompositeLayer

open public class DestroyableSimpleBehavior : DestroyableBaseBehavior {
        

    val ownerLayer: CollidableCompositeLayer

    private var destroyed: Boolean = false
public constructor        (ownerLayer: CollidableCompositeLayer){
var ownerLayer = ownerLayer
this.ownerLayer= ownerLayer
}

override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.destroyed
}

override fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var destroyed = destroyed
this.destroyed= destroyed

    
                        if(this.isDestroyed())
                        
                                    {
                                    DestroyedLayerProcessor.getInstance()!!.add(this.ownerLayer)

                                    }
                                
}


}
                
            

