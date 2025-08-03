
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Displayable
import org.allbinary.J2MEUtil
import org.allbinary.canvas.Processor

open public class ScreenRepaintProcessorFactory
            : Object
         {
        

        companion object {


    private val instance: ScreenRepaintProcessorFactory = ScreenRepaintProcessorFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ScreenRepaintProcessorFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


open fun getInstance(displayable: Displayable)
        //nullable =  from not(true or (false and false)) = 
: Processor{

                    var displayable = displayable

    
                        if(!J2MEUtil.isJ2ME())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScreenRepaintProcessor(displayable)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Processor.getInstance()

                        }
                            
}


}
                
            

