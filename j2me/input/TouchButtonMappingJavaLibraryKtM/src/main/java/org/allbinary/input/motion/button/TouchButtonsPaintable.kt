
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.paint.Paintable
import org.allbinary.util.BasicArrayList

open public class TouchButtonsPaintable : Paintable {
        

    val foregroundBasicColor: BasicColor

    val foregroundColor: Int

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!

    private val touchButtonFactory: TouchButtonFactory = TouchButtonFactory.getInstance()!!
public constructor        (basicColor: BasicColor){

                    var basicColor = basicColor
this.foregroundBasicColor= basicColor
this.foregroundColor= basicColor!!.toInt()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var list: BasicArrayList = touchButtonFactory!!.getList()!!

this.basicSetColorUtil!!.setBasicColorP(graphics, this.foregroundBasicColor, this.foregroundColor)

    var touchButton: TouchButton





                        for (index in list.size()!! downTo 0)


        {touchButton= list.objectArray[index]!! as TouchButton
touchButton!!.paint(graphics)
}





                        for (index in list.size()!! downTo 0)


        {touchButton= list.objectArray[index]!! as TouchButton
touchButton!!.paintHint(graphics)
}

}


}
                
            

