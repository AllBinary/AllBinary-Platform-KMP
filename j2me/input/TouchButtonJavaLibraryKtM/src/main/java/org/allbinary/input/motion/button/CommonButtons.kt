
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class CommonButtons
            : Object
         {
        

        companion object {
            
    private val instance: CommonButtons = CommonButtons()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CommonButtons{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val STANDARD_BUTTON_SIZE: Int

    val NORMAL_BUTTON: Rectangle

    val LARGE_BUTTON: Rectangle
private constructor        ()
            : super()
        {
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var commonButtonSize: Int = 128


        while(commonButtonSize > 64)
        {
    var totalColumns: Int = displayInfo!!.getLastWidth() /commonButtonSize


    var totalRows: Int = displayInfo!!.getLastHeight() /commonButtonSize


    var max: Int = totalColumns


    
                        if(totalRows > max)
                        
                                    {
                                    max= totalRows

                                    }
                                

    
                        if(max > 9)
                        
                                    {
                                    break;

                    

                                    }
                                
commonButtonSize= commonButtonSize shr 1
}

STANDARD_BUTTON_SIZE= commonButtonSize
NORMAL_BUTTON= Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, STANDARD_BUTTON_SIZE, STANDARD_BUTTON_SIZE)
LARGE_BUTTON= Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, STANDARD_BUTTON_SIZE shl 1, STANDARD_BUTTON_SIZE shl 1)
}


}
                
            

