
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.visual.media



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.imageio.ImageIO

open public class MediaIOUtil
            : Object
         {
        

        companion object {


    private val instance: MediaIOUtil = MediaIOUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MediaIOUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getReaderFormatNames()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageIO.getReaderFormatNames()
}


open fun getWriterFormatNames()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageIO.getWriterFormatNames()
}


}
                
            

