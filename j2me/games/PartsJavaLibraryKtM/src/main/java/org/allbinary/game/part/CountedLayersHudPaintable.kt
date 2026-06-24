
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.layer.AllBinaryLayer

open public class CountedLayersHudPaintable
            : Object
        
                , PaintableInterface
                , UpdateMyFontInterface {
        
companion object {
            
    private var XXStringWidth: Int = 0

        }
            
    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val partInterfaceArray: Array<PartInterface?>

    private val countedTotalStringColor: Int

    private val countedPartsBorder: Int

    private val startIndex: Int

    private val dropSize: Int

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var height: Int= 0
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


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.height= font.getHeight()

    
                        if(this.dropSize > font.getHeight())
                        
                                    {
                                    this.height= this.dropSize

                                    }
                                

    
                        if(CountedLayersHudPaintable.XXStringWidth == 0)
                        
                                    {
                                    
    var XXString: String = "XX"

CountedLayersHudPaintable.XXStringWidth= font.stringWidth(XXString)

                                    }
                                
this.myFontProcessor= MyFontProcessor.getInstance()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.myFontProcessor!!.process(graphics)

    var lastWidth: Int = this.displayInfoSingleton!!.getLastWidth()!!


    var widthEdge: Int = lastWidth -this.dropSize


    var size: Int = this.partInterfaceArray!!.size
                


    var count: Int = 0


    var y: Int= 0


    var countedLayerInterfaceFactory: CountedLayerInterfaceFactoryPart


    var pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface


    var layerInterface: AllBinaryLayer


    var charArray: CharArray





                        for (index in this.startIndex until size)

        {
countedLayerInterfaceFactory= this.partInterfaceArray[index]!! as CountedLayerInterfaceFactoryPart

    
                        if(countedLayerInterfaceFactory!!.getTotal() > 0)
                        
                                    {
                                    pickedUpLayerInterfaceFactoryInterface= countedLayerInterfaceFactory!!.getCountedPickedUpLayerInterfaceFactory()
layerInterface= pickedUpLayerInterfaceFactoryInterface!!.getIconLayer()
y= 40 +(count *this.height)
layerInterface!!.setPosition(widthEdge, y, layerInterface!!.getZP())
layerInterface!!.paint(graphics)
graphics.setColor(this.countedTotalStringColor)
countedLayerInterfaceFactory!!.paint(graphics)
charArray= countedLayerInterfaceFactory!!.getTotalString()
graphics.drawChars(charArray, 0, charArray!!.size, widthEdge -countedLayerInterfaceFactory!!.getXOffset(), y, 0)
count++

                                    }
                                
}


    
                        if(count > 0)
                        
                                    {
                                    graphics.setColor(this.countedPartsBorder)
graphics.drawRect(lastWidth -(CountedLayersHudPaintable.XXStringWidth +this.dropSize), 40, CountedLayersHudPaintable.XXStringWidth +this.dropSize, (count *this.height) +3)

                                    }
                                
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


}
                
            

