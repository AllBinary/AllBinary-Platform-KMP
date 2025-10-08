
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
        package org.allbinary.game.part




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.layer.AllBinaryLayer

open public class CountedLayersHudPaintable
            : Object
        
                , PaintableInterface {
        
companion object {
            
    private val XXString: String = "XX"

    private val XXStringWidth: Int = MyFont.getInstance()!!.stringWidth(XXString)!!

        }
            
    private val myFont: MyFont = MyFont.getInstance()!!

    private val partInterfaceArray: Array<PartInterface?>

    private val countedTotalStringColor: Int

    private val countedPartsBorder: Int

    private val startIndex: Int

    private val dropSize: Int
public constructor (partInterfaceArray: Array<PartInterface?>, dropSize: Int, startIndex: Int, countedTotalStringColor: Int, countedPartsBorder: Int)
            : super()
        {
var partInterfaceArray = partInterfaceArray
var dropSize = dropSize
var startIndex = startIndex
var countedTotalStringColor = countedTotalStringColor
var countedPartsBorder = countedPartsBorder
this.partInterfaceArray= partInterfaceArray
this.startIndex= startIndex
this.countedTotalStringColor= countedTotalStringColor
this.countedPartsBorder= countedPartsBorder
this.dropSize= dropSize
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var height: Int = myFont!!.DEFAULT_CHAR_HEIGHT


    
                        if(this.dropSize > myFont!!.DEFAULT_CHAR_HEIGHT)
                        
                                    {
                                    height= this.dropSize

                                    }
                                

    var lastWidth: Int = DisplayInfoSingleton.getInstance()!!.getLastWidth()!!


    var count: Int = 0


    var widthEdge: Int = lastWidth -this.dropSize


    var y: Int= 0


    var size: Int = partInterfaceArray!!.size
                


    var countedLayerInterfaceFactory: CountedLayerInterfaceFactoryPart


    var pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface


    var layerInterface: AllBinaryLayer


    var charArray: CharArray





                        for (index in startIndex until size)

        {
countedLayerInterfaceFactory= partInterfaceArray[index]!! as CountedLayerInterfaceFactoryPart

    
                        if(countedLayerInterfaceFactory!!.getTotal() > 0)
                        
                                    {
                                    pickedUpLayerInterfaceFactoryInterface= countedLayerInterfaceFactory!!.getCountedPickedUpLayerInterfaceFactory()
layerInterface= pickedUpLayerInterfaceFactoryInterface!!.getIconLayer()
y= 40 +(count *height)
layerInterface!!.setPosition(widthEdge, y, layerInterface!!.getZP())
layerInterface!!.paint(graphics)
graphics.setColor(countedTotalStringColor)
charArray= countedLayerInterfaceFactory!!.getTotalString()
graphics.drawChars(charArray, 0, charArray!!.size, widthEdge -countedLayerInterfaceFactory!!.getXOffset(), y, 0)
count++

                                    }
                                
}


    
                        if(count > 0)
                        
                                    {
                                    graphics.setColor(countedPartsBorder)
graphics.drawRect(lastWidth -(XXStringWidth +this.dropSize), 40, XXStringWidth +this.dropSize, (count *height) +3)

                                    }
                                
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


}
                
            

