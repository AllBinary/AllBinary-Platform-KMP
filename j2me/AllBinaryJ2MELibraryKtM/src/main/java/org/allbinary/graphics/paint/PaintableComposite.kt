
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
        package org.allbinary.graphics.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics

open public class PaintableComposite : Paintable {
        

    private var paintableArray: Array<PaintableInterface?>
public constructor (paintableArray: Array<PaintableInterface?>){
    //var paintableArray = paintableArray
this.paintableArray= paintableArray
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics




                        for (index in paintableArray!!.size -1 downTo 0)

        {
this.paintableArray[index]!!.paint(graphics)
}

}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics




                        for (index in paintableArray!!.size -1 downTo 0)

        {
this.paintableArray[index]!!.paintThreed(graphics)
}

}


}
                
            

