
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
import javax.microedition.lcdui.Screen
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.form.item.CustomItemInterface
import org.allbinary.graphics.color.BasicColor

open public class TileLayerItem : CustomItem
                , CustomItemInterface {
        

    private val tiledLayer: AllBinaryTiledLayer
public constructor        (label: String, tiledLayer: AllBinaryTiledLayer, layout: Int, altText: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(label, backgroundBasicColor, foregroundBasicColor)

        Updates for KMP build        
        {
var label = label
var tiledLayer = tiledLayer
var layout = layout
var altText = altText
var backgroundBasicColor = backgroundBasicColor
var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.tiledLayer= tiledLayer
}


open fun setOwner(owner: Screen)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var owner = owner
}


open fun getMinimumWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getWidth()
}


open fun getMinimumHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getHeight()
}


open fun getMinContentHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getHeight()
}


open fun getMinContentWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getWidth()
}


open fun getPrefContentHeight(width: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var width = width



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getHeight()
}


open fun getPrefContentWidth(height: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getWidth()
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y
this.tiledLayer!!.setPosition(x, y, this.tiledLayer!!.getZP())
this.tiledLayer!!.paint(graphics)
}


open fun paintUnselected(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y
}


}
                
            

