
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.io.File

open public class ImageProcessorInput
            : Object
         {
        

    private var bufferedImageArray: Array<BufferedImage?>

    private var files: Array<File?>
public constructor        (files: Array<File?>, bufferedImageArray: Array<BufferedImage?>)                        

                            : super(){

                    var files = files


                    var bufferedImageArray = bufferedImageArray


                            //For kotlin this is before the body of the constructor.
                    
this.bufferedImageArray= bufferedImageArray
this.files= files
}


open fun getBufferedImageArray()
        //nullable = true from not(false or (false and true)) = true
: Array<BufferedImage?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageArray
}


open fun getFiles()
        //nullable = true from not(false or (false and true)) = true
: Array<File?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return files
}


}
                
            

