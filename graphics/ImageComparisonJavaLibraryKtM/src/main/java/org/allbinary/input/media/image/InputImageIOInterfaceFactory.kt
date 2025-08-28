
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
        package org.allbinary.input.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.media.image.capture.CapturedImageInputOutput
import org.allbinary.media.image.comparison.ComparisonImageInputOutput
import org.allbinary.media.image.comparison.motion.MotionRectanglesImageInputOutput
import org.allbinary.media.image.io.ImageIOInterface

open public class InputImageIOInterfaceFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(imageType: InputImageType)
        //nullable =  from not(true or (false and false)) = 
: ImageIOInterface

        Updates for KMP build        
        {
var imageType = imageType

    
                        if(imageType == InputImageType.CAPTURE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CapturedImageInputOutput()

                                    }
                                
                             else 
    
                        if(imageType == InputImageType.COMPARISON)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ComparisonImageInputOutput()

                                    }
                                
                             else 
    
                        if(imageType == InputImageType.MOTION)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MotionRectanglesImageInputOutput()

                                    }
                                
                        else {
                            


                            throw Exception("No ImageIOInterface for: " +imageType!!.toString())

                        }
                            
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            

