
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import javax.microedition.lcdui.Image
import org.allbinary.logic.communication.log.PreLogUtil
import org.microemu.device.j2se.J2SEImmutableImage
import org.microemu.device.j2se.J2SEMutableImage

open public class ImageRotationUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageRotationUtil = ImageRotationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageRotationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val imageJ2SERotationUtil: ImageJ2SERotationUtil = ImageJ2SERotationUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun rotateImage(originalImage: Image, image: Image, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var originalImage = originalImage


                    var image = image


                    var totalAngle = totalAngle

    
                        if(image.isMutable())
                        
                                    {
                                    
    var j2seImage: J2SEMutableImage = image as J2SEMutableImage


    var newBufferedImage: BufferedImage = j2seImage!!.getImage() as BufferedImage


    var originalAwtImage: java.awt.Image = 
                null
            


    
                        if(originalImage!!.isMutable())
                        
                                    {
                                    
    var originalJ2SEImage: J2SEMutableImage = originalImage as J2SEMutableImage

originalAwtImage= originalJ2SEImage!!.getImage() as Image

                                    }
                                
                        else {
                            
    var originalJ2SEImage: J2SEImmutableImage = originalImage as J2SEImmutableImage

originalAwtImage= originalJ2SEImage!!.getImage() as Image

                        }
                            
imageJ2SERotationUtil!!.rotateImage(originalAwtImage, newBufferedImage, totalAngle)

                                    }
                                
                        else {
                            PreLogUtil.put(
                            "Not Mutable", this, 
                            "getRotatedImage", Exception())

                        }
                            
}


                @Throws(Exception::class)
            
open fun createRotatedImage(originalImage: Image, rotationInDegrees: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var originalImage = originalImage


                    var rotationInDegrees = rotationInDegrees

    var image: Image = ImageCreationUtil.getInstance()!!.getInstance(originalImage!!.getWidth(), originalImage!!.getHeight())!!
            


    
                        if(image.isMutable())
                        
                                    {
                                    
    var originalAwtImage: java.awt.Image = 
                null
            


    
                        if(originalImage!!.isMutable())
                        
                                    {
                                    
    var originalJ2SEImage: J2SEMutableImage = originalImage as J2SEMutableImage

originalAwtImage= originalJ2SEImage!!.getImage() as Image

                                    }
                                
                        else {
                            
    var originalJ2SEImage: J2SEImmutableImage = originalImage as J2SEImmutableImage

originalAwtImage= originalJ2SEImage!!.getImage() as Image

                        }
                            

    var j2seImage: J2SEMutableImage = image as J2SEMutableImage


    var newBufferedImage: BufferedImage = j2seImage!!.getImage() as BufferedImage


    var bufferedImage: BufferedImage = ImageJ2SERotationUtil.getInstance()!!.getRotatedImage(originalAwtImage, newBufferedImage, rotationInDegrees)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Not Mutable")

                        }
                            
}


}
                
            

