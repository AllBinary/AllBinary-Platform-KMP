
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
        package org.allbinary.input.media.image.capture




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class CapturedImageWorkerResultsEvent : AllBinaryEventObject {
        

    private val frame: Long

    private var bufferedImage: BufferedImage
public constructor        (anyType: Any, frame: Long, bufferedImage: BufferedImage)                        

                            : super(anyType){

                    var anyType = anyType


                    var frame = frame


                    var bufferedImage = bufferedImage


                            //For kotlin this is before the body of the constructor.
                    
this.frame= frame
setBufferedImage(bufferedImage)
}


open fun getBufferedImage()
        //nullable = true from not(false or (false and true)) = true
: BufferedImage{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


open fun setBufferedImage(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var bufferedImage = bufferedImage
this.bufferedImage= bufferedImage
}


open fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frame
}


}
                
            

