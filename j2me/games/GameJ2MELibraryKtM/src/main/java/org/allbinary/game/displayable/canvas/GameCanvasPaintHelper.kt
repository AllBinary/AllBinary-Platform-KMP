
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.paint.ProcessPaintable

open public class GameCanvasPaintHelper : ProcessPaintable {
        

    private var gameCanvas: AllBinaryGameCanvas
public constructor        (gameCanvas: AllBinaryGameCanvas)

        Updates for KMP build        
        {
var gameCanvas = gameCanvas
this.gameCanvas= gameCanvas
}

override fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
this.gameCanvas!!.draw(graphics)
}


}
                
            

