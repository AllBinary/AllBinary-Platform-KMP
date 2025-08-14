
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
        package org.allbinary.input.automation.module.generic.constraints




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.graphics.GPoint
import org.allbinary.input.automation.module.ImageComparatorConstraints

open public class NoImageComparatorConstraints : ImageComparatorConstraints {
        
public constructor        ()                        

                            : super(1){

                            //For kotlin this is before the body of the constructor.
                    
this.setMaxNonMatchingPixelDeltas(.MAX_VALUE())
}


open fun isColorAllowed(frame: Int, point: GPoint, color: Color)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var frame = frame


                    var point = point


                    var color = color



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isImageValid(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var bufferedImage = bufferedImage



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

