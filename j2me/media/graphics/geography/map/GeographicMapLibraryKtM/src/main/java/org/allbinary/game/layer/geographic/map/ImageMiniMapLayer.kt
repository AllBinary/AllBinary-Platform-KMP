
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
        package org.allbinary.game.layer.geographic.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.graphics.Anchor
import org.allbinary.image.PaintableToImageUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.view.ViewPosition

open public class ImageMiniMapLayer : MiniMapLayer {
        

    private var image: Image
public constructor        (geographicMapInterface: BasicGeographicMap, viewPosition: ViewPosition)                        

                            : super(geographicMapInterface, viewPosition)

        Updates for KMP build        
        {
var geographicMapInterface = geographicMapInterface
var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var aWidth: Int = allBinaryTiledLayer!!.getWidth()!!


    var aHeight: Int = allBinaryTiledLayer!!.getHeight()!!

this.image= PaintableToImageUtil.getImage(allBinaryTiledLayer, aWidth, aHeight)
}


    private var anchor: Int = Anchor.TOP_LEFT

open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
graphics.drawImage(image, x, y, anchor)
this.paintDots(graphics)
}


}
                
            

