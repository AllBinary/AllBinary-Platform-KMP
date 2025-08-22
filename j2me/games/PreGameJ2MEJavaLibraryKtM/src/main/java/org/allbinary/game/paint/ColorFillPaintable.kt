
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
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class ColorFillPaintable : ColorFillBasePaintable {
        

    val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
public constructor        (basicColor: BasicColor)                        

                            : super(basicColor){

                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
graphics.setColor(this.colorP)
graphics.fillRect(0, 0, this.displayInfoSingleton!!.getLastWidth(), this.displayInfoSingleton!!.getLastHeight())
}


}
                
            

