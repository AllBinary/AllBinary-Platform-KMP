
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
import javax.microedition.lcdui.Image
import org.allbinary.graphics.form.item.CustomImageItem
import org.allbinary.logic.java.character.CharArrayFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.math.PrimitiveLongUtil

open public class TechnologyRTSInterfaceImageItem : CustomImageItem {
        

    private val myFont: MyFont = MyFont.getInstance()!!

    private val rtsInterface: RTSInterface

    private val adjustedCostLabelY: Int

    private val adjustedCostX: Int

    private val adjustedCostY: Int

    private var costString: CharArray = CharArrayFactory.getInstance()!!.getZeroCharArray()!!

    private var costLength: Int= 0

    private val adjustedLevelX: Int

    private val adjustedLevelY: Int

    private var levelString: CharArray = CharArrayFactory.getInstance()!!.getZeroCharArray()!!

    private var levelLength: Int= 0

    private val primitiveLongUtil: PrimitiveLongUtil = PrimitiveLongUtil(10000)

    private val LEVEL: String = "Level"

    private val COST: String = "Cost"

    private val DOLLAR: String = "$"
public constructor        (label: String, img: Image, layout: Int, altText: String, basicColor: BasicColor, rtsInterface: RTSInterface)                        

                            : super(label, img, layout, altText, basicColor)

        Updates for KMP build        
        {
var label = label
var img = img
var layout = layout
var altText = altText
var basicColor = basicColor
var rtsInterface = rtsInterface


                            //For kotlin this is before the body of the constructor.
                    
this.rtsInterface= rtsInterface

    var DEFAULT_CHAR_HEIGHT: Int = myFont!!.DEFAULT_CHAR_HEIGHT


    var imageHeight: Int = 0


    var image: Image = this.getImage()!!


    
                        if(image != 
                                    null
                                )
                        
                                    {
                                    imageHeight= image.getHeight()

                                    }
                                
this.adjustedCostLabelY=  -yOffset +imageHeight -(3 *DEFAULT_CHAR_HEIGHT)
this.adjustedCostY=  -yOffset +imageHeight -(2 *DEFAULT_CHAR_HEIGHT)
this.adjustedCostX= 2 +(DOLLAR.length *(DEFAULT_CHAR_HEIGHT -1))
this.adjustedLevelY=  -yOffset +imageHeight -DEFAULT_CHAR_HEIGHT
this.adjustedLevelX= 2 +(LEVEL.length *(DEFAULT_CHAR_HEIGHT -1))
this.update()
}


open fun getRtsInterface()
        //nullable = true from not(false or (false and true)) = true
: RTSInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsInterface
}


open fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.costString= this.primitiveLongUtil!!.getCharArray(this.getRtsInterface()!!.getUpgradeCost())
this.levelString= this.primitiveLongUtil!!.getCharArray(this.getRtsInterface()!!.getLevel())
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y
super.paint(graphics, x, y)

    var xa: Int = x +2

graphics.drawString(COST, xa, y +this.adjustedCostLabelY, 0)
graphics.drawString(DOLLAR, xa, y +this.adjustedCostY, 0)
graphics.drawChars(costString, 0, this.costLength, x +this.adjustedCostX, y +this.adjustedCostY, 0)
graphics.drawString(LEVEL, xa, y +this.adjustedLevelY, 0)
graphics.drawChars(levelString, 0, this.levelLength, x +this.adjustedLevelX, y +this.adjustedLevelY, 0)
}


}
                
            

