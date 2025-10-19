
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.view




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.Layer
import org.allbinary.layer.NullLayer
import org.allbinary.view.ViewPosition

open public class StaticTileLayerIntoPositionViewPosition : ViewPosition {
        
companion object {
            
    private var tiledLayer: Layer = NullLayer.getInstance()!!

    var layer: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER

    open fun setTiledLayer(tiledLayer: AllBinaryTiledLayer)
        //nullable = true from not(false or (false and false)) = true
{
var tiledLayer = tiledLayer
StaticTileLayerIntoPositionViewPosition.tiledLayer= tiledLayer
}


        }
            public constructor (){
}


    override fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getX() -StaticTileLayerIntoPositionViewPosition.tiledLayer!!.getXP()
}


    override fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getY() -StaticTileLayerIntoPositionViewPosition.tiledLayer!!.getYP()
}


    override fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getZ() -StaticTileLayerIntoPositionViewPosition.tiledLayer!!.getZP()
}


}
                
            

