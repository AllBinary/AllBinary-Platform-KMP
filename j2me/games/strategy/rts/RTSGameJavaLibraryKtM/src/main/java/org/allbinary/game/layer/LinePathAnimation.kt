
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.GPoint
import org.allbinary.layer.Layer

open public class LinePathAnimation
            : Object
         {
        

        companion object {
            
    private val instance: LinePathAnimation = LinePathAnimation()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LinePathAnimation

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun paint(graphics: Graphics, point: GPoint, nextPoint: GPoint, tiledLayer: Layer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var point = point
    //var nextPoint = nextPoint
    //var tiledLayer = tiledLayer
graphics.drawLine(nextPoint!!.getX(), nextPoint!!.getY(), point.getX(), point.getY())
}


}
                
            

