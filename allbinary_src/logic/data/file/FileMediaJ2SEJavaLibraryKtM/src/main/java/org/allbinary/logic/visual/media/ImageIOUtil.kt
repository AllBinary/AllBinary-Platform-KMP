
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.visual.media



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import javax.imageio.ImageIO
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class ImageIOUtil
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun read(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageIO.read(AbFileNativeUtil.get(file))
}


                @Throws(Exception::class)
            
open fun write(renderedImage: RenderedImage, name: String, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var renderedImage = renderedImage


                    var name = name


                    var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageIO.write(renderedImage, name, AbFileNativeUtil.get(file))
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

