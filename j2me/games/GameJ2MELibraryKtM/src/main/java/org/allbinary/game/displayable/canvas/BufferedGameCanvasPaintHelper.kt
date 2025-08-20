
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
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.graphics.paint.ProcessPaintable
import org.allbinary.util.CircularIndexUtil

open public class BufferedGameCanvasPaintHelper : ProcessPaintable {
        

        companion object {
            
    private val MAX_IMAGES: Int = 4

        }
            
    private var gameCanvas: Canvas = NullCanvas.NULL_CANVAS

    private val offScreenImage: Array<Image?> = arrayOfNulls(MAX_IMAGES)

    private var previousImage: Image = NullCanvas.NULL_IMAGE

    private val circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(MAX_IMAGES)!!
            

    private val drawCircularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(MAX_IMAGES -1, MAX_IMAGES)!!
            
public constructor        (gameCanvas: AllBinaryGameCanvas){

                    var gameCanvas = gameCanvas



                            throw Exception("No Longer Used")
}

override fun process()
        //nullable = true from not(false or (false and true)) = true
{
    var myCanvas: MyCanvas = (this.gameCanvas as MyCanvas)

myCanvas!!.draw(this.offScreenImage[this.circularIndexUtil!!.getIndex()]!!.getGraphics())
this.circularIndexUtil!!.next()
this.drawCircularIndexUtil!!.next()
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.previousImage= this.offScreenImage[this.drawCircularIndexUtil!!.getIndex()]!!
graphics.drawImage(this.previousImage, 0, 0, anchor)
}


}
                
            

