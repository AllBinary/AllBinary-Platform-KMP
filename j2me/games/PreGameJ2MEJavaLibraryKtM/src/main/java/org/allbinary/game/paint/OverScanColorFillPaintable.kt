
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
        package org.allbinary.game.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor

open public class OverScanColorFillPaintable : ColorFillPaintable {
        
public constructor        (basicColor: BasicColor)                        

                            : super(basicColor)

        Updates for KMP build        
        {
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
graphics.setColor(this.colorP)
graphics.fillRect( -graphics.getClipX(),  -graphics.getClipY(), this.displayInfoSingleton!!.getLastWidth() +(graphics.getClipX() *2), this.displayInfoSingleton!!.getLastHeight() +(graphics.getClipY() *2))
}


}
                
            

