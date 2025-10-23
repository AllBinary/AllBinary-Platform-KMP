
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
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.draw.CanvasDrawLineString
import org.allbinary.graphics.paint.InitUpdatePaintable

open public class PreGameSelectorPaintable : InitUpdatePaintable {
        

    private val title: String

    private var canvasDrawLineString: CanvasDrawLineString

    private val preGameScrollSelectionForm: PreGameScrollSelectionForm
public constructor (title: String, preGameScrollSelectionForm: PreGameScrollSelectionForm){
var title = title
var preGameScrollSelectionForm = preGameScrollSelectionForm
this.title= title

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

this.canvasDrawLineString= CanvasDrawLineString(displayInfo!!.getLastHalfWidth(), 0)
this.preGameScrollSelectionForm= preGameScrollSelectionForm
}


    override fun update()
        //nullable = true from not(false or (false and true)) = true
{

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

this.canvasDrawLineString= CanvasDrawLineString(displayInfo!!.getLastHalfWidth(), 0)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
graphics.setColor(BasicColorFactory.getInstance()!!.WHITE.toInt())
this.canvasDrawLineString!!.paint(graphics, title, 0)
this.getPreGameSelectionForm()!!.paint(graphics)
}


    open fun getPreGameSelectionForm()
        //nullable = true from not(false or (false and true)) = true
: PreGameScrollSelectionForm{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return preGameScrollSelectionForm
}


}
                
            

