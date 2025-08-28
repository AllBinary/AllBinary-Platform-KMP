
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
        package org.allbinary.game.layer.special




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.layer.AllBinaryLayerManager

open public class Special3GameInputInterfaceProcessor : SpecialGameInputInterfaceProcessor {
        
public constructor        (collidableDestroyableDamageableLayer: SpecialGameInputInterface)                        

                            : super(collidableDestroyableDamageableLayer){
var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var allbinaryLayerManager = allbinaryLayerManager
var gameKeyEvent = gameKeyEvent
this.specialGameInputInterface!!.special3(allbinaryLayerManager, gameKeyEvent)
}


}
                
            

