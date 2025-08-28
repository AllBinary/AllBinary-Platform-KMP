
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.string.CommonPhoneStrings

open public class CanvasUtil
            : Object
         {
        

        companion object {
            
open fun getKeyName(key: Int)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var key = key

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!


    
                        if(key == Canvas.UP)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonPhoneStrings!!.UP

                                    }
                                
                             else 
    
                        if(key == Canvas.DOWN)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonPhoneStrings!!.DOWN

                                    }
                                
                             else 
    
                        if(key == Canvas.RIGHT)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonPhoneStrings!!.RIGHT

                                    }
                                
                             else 
    
                        if(key == Canvas.LEFT)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonPhoneStrings!!.LEFT

                                    }
                                
                             else 
    
                        if(key == Canvas.FIRE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonPhoneStrings!!.FIRE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "UNKNOWN KEY"
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            

