
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
        package org.allbinary.graphics.displayable.screen




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Displayable
import org.allbinary.canvas.Processor

open public class ScreenRepaintProcessor : Processor {
        

    private val displayable: Displayable
public constructor        (displayable: Displayable)

        Updates for KMP build        
        {
var displayable = displayable
this.displayable= displayable
}


                @Throws(Exception::class)
            override fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
ScreenRepaintUtil.repaint(displayable)
}


}
                
            

