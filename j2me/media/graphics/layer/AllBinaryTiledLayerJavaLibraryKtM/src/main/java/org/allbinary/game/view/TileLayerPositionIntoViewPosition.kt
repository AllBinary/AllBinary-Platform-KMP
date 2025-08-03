
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.layer.Layer
import org.allbinary.layer.NullLayer
import org.allbinary.view.ViewPosition

open public class TileLayerPositionIntoViewPosition : ViewPosition {
        

    private var tiledLayer: Layer = 
                null
            
public constructor        (){}


open fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getX() -this.tiledLayer!!.getXP()
}


open fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getY() -this.tiledLayer!!.getYP()
}


open fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getZ() -this.tiledLayer!!.getZP()
}


open fun setTiledLayer(tiledLayer: AllBinaryTiledLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var tiledLayer = tiledLayer
this.tiledLayer= tiledLayer
}


}
                
            

