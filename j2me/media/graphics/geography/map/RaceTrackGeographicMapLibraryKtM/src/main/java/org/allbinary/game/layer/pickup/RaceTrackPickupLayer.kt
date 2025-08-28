
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
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.view.TileLayerPositionIntoViewPosition
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.view.event.ViewPositionEventHandler

open public class RaceTrackPickupLayer : PickupLayer {
        

        companion object {
            
    private val NAME: String = "RaceTrackPickupLayer"

        }
            public constructor        ()                        

                            : super(NAME, TileLayerPositionIntoViewPosition()){


                            //For kotlin this is before the body of the constructor.
                    
}


    private val viewPositionEventHandler: ViewPositionEventHandler = ViewPositionEventHandler.getInstance()!!

open fun setTiledLayer(tiledLayer: AllBinaryTiledLayer)
        //nullable = true from not(false or (false and false)) = true
{
var tiledLayer = tiledLayer

    var viewPosition: TileLayerPositionIntoViewPosition = this.getViewPosition() as TileLayerPositionIntoViewPosition

viewPosition!!.setTiledLayer(tiledLayer)
viewPositionEventHandler!!.addListener(this as AllBinaryLayer)
}


open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var destroyed = destroyed
super.setDestroyed(destroyed)

    
                        if(this.isDestroyed())
                        
                                    {
                                    viewPositionEventHandler!!.removeListener(this)

                                    }
                                
}


}
                
            

