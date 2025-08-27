
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
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.paint.ColorFillBasePaintable
import org.allbinary.game.paint.ColorFillPaintableFactory
import org.allbinary.graphics.paint.Paintable

open public class BasicPaintablesCanvas : GameCommandCanvas {
        

    private val paintableArray: Array<Paintable?>

    private val colorFillPaintable: ColorFillBasePaintable
public constructor        (cmdListener: CommandListener, name: String, allBinaryGameLayerManager: AllBinaryGameLayerManager, paintableArray: Array<Paintable?>)                        

                            : super(cmdListener, name, allBinaryGameLayerManager!!.getBackgroundBasicColor(), allBinaryGameLayerManager!!.getForegroundBasicColor()){

                    var cmdListener = cmdListener


                    var name = name


                    var allBinaryGameLayerManager = allBinaryGameLayerManager


                    var paintableArray = paintableArray


                            //For kotlin this is before the body of the constructor.
                    
this.paintableArray= paintableArray
this.colorFillPaintable= ColorFillPaintableFactory.getInstance()!!.getInstance(allBinaryGameLayerManager!!.getBackgroundBasicColor(), false)
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.colorFillPaintable!!.paint(graphics)
graphics.setColor(this.foregroundColor)




                        for (index in this.paintableArray!!.size -1 downTo 0)

        {this.paintableArray[index]!!.paint(graphics)
}

super.paint(graphics)
}


}
                
            

