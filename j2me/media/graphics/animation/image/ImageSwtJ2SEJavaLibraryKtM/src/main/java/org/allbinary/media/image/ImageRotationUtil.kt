
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
        
import javax.microedition.lcdui.Image
import org.allbinary.game.configuration.feature.Features
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.logic.communication.log.PreLogUtil
import org.eclipse.swt.graphics.GC
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

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
            
    private val imageSwtRotationUtil: ImageSwtRotationUtil = ImageSwtRotationUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


    private val features: Features = Features.getInstance()!!
            

open fun rotateImage(originalImage: Image, image: Image, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var originalImage = originalImage


                    var image = image


                    var totalAngle = totalAngle

    var originalImage2: Image = originalImage


    
                        if(features.isFeature(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    
    
                        if(originalImage!!.getType() >= OpenGLESImage.TYPE)
                        
                                    {
                                    
    var openGLESImage: OpenGLESImage = (originalImage as OpenGLESImage)

openGLESImage!!.openGLESImageProperties!!.angle= totalAngle

    
                        if(originalImage != image)
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                        else {
                            PreLogUtil.put("OpenGL but image is: " +originalImage +" type: " +originalImage!!.getType(), this, 
                            "rotateImage")

                        }
                            

                                    }
                                

    var originalSwtImage: org.eclipse.swt.graphics.Image = (originalImage2!!.getImage() as Image)


    var gc: GC = 
                null
            


    var copySwtImage: org.eclipse.swt.graphics.Image = 
                null
            


    
                        if(image.isMutable())
                        
                                    {
                                    
    var swtImage: SwtMutableImage = image as SwtMutableImage

copySwtImage= swtImage!!.getImage() as Image
gc= swtImage!!.getGc()
imageSwtRotationUtil!!.rotateImage(originalSwtImage, copySwtImage, gc, totalAngle)

                                    }
                                
                        else {
                            PreLogUtil.put("No rotation for: " +image.toString(), this, 
                            "rotateImage")

                        }
                            
}


                @Throws(Exception::class)
            
open fun createRotatedImage(originalImage: Image, rotationInDegrees: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var originalImage = originalImage


                    var rotationInDegrees = rotationInDegrees



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage
}


}
                
            

