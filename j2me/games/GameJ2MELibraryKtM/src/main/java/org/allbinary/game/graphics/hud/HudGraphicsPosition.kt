
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
        package org.allbinary.game.graphics.hud




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory

open public class HudGraphicsPosition
            : Object
         {
        

        companion object {
            
    val NULL_HUD_GRAPHICS_POSITION: HudGraphicsPosition = HudGraphicsPosition(PointFactory.getInstance()!!.ZERO_ZERO, 9)

        }
            
    private var anchor: Int= 0

    private var point: GPoint = PointFactory.getInstance()!!.ZERO_ZERO
public constructor        (point: GPoint, anchor: Int)
            : super()
        

        Updates for KMP build        
        {
var point = point
var anchor = anchor
this.setAnchor(anchor)
this.setPoint(point)
}


open fun getAnchor()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anchor
}


open fun setAnchor(anchor: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var anchor = anchor
this.anchor= anchor
}


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


open fun setPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var point = point
this.point= point
}


}
                
            

