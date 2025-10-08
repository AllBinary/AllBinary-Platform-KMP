
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.layer.Layer

open public class PaintableLayerComposite : Paintable {
        

    private val paintableArray: Array<Layer?>
public constructor (paintableArray: Array<Layer?>){
    //var paintableArray = paintableArray
this.paintableArray= paintableArray
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics




                        for (index in paintableArray!!.size  - 1  downTo 0)

        {
this.paintableArray[index]!!.paint(graphics)
}

}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var paintableInterface: PaintableInterface





                        for (index in paintableArray!!.size  - 1  downTo 0)

        {
paintableInterface= this.paintableArray[index]!! as PaintableInterface
paintableInterface!!.paintThreed(graphics)
}

}


}
                
            

