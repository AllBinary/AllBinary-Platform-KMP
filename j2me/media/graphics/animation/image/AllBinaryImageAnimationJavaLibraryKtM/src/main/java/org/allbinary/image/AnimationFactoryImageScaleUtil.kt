
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.animation.image.AnimationFactoryInitializationVisitor
import org.allbinary.animation.image.BaseImageAnimationFactory
import org.allbinary.media.ScaleProperties
import org.allbinary.media.image.ImageJ2MEScaleUtil

open public class AnimationFactoryImageScaleUtil
            : Object
         {
        
companion object {
            
    private val instance: AnimationFactoryImageScaleUtil = AnimationFactoryImageScaleUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnimationFactoryImageScaleUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val imageScaleUtil: ImageJ2MEScaleUtil = ImageJ2MEScaleUtil.getInstance()!!

                @Throws(Exception::class)
            
    open fun createImage(image: Image, width: Int, height: Int, scaleWidth: Int, scaleHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var image = image
    //var width = width
    //var height = height
    //var scaleWidth = scaleWidth
    //var scaleHeight = scaleHeight

    var scaledImage: Image


    
                        if(scaleWidth != 0 && scaleHeight != 0)
                        
                                    {
                                    
    var scaleX: Float = (scaleWidth.toFloat()) /(width.toFloat())


    var scaleY: Float = (scaleHeight.toFloat()) /(height.toFloat())


    
                        if((scaleX == 1.0f && scaleY == 1.0f) || (scaleX == 0.0f || scaleY == 0.0f))
                        
                                    {
                                    scaledImage= image

                                    }
                                
                        else {
                            scaledImage= this.imageScaleUtil!!.scale(image, (scaleX *width).toInt(), (scaleY *height).toInt())

                        }
                            

                                    }
                                
                        else {
                            scaledImage= image

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledImage
}


                @Throws(Exception::class)
            
    open fun processAdjust(baseImageAnimationFactory: BaseImageAnimationFactory)
        //nullable = true from not(false or (false and false)) = true
{
    //var baseImageAnimationFactory = baseImageAnimationFactory

    var scaleProperties: ScaleProperties = baseImageAnimationFactory!!.getScalePropertiesP()!!


    
                        if(scaleProperties!!.scaleWidth != 0 && scaleProperties!!.scaleHeight != 0)
                        
                                    {
                                    
    var animationFactoryInitializationVisitor: AnimationFactoryInitializationVisitor = baseImageAnimationFactory!!.getAnimationFactoryInitializationVisitorP()!!


    var scaleX: Float = (scaleProperties!!.scaleWidth.toFloat()) /(animationFactoryInitializationVisitor!!.width.toFloat())


    var scaleY: Float = (scaleProperties!!.scaleHeight.toFloat()) /(animationFactoryInitializationVisitor!!.height.toFloat())


    
                        if((scaleX == 1.0f && scaleY == 1.0f) || (scaleX == 0.0f || scaleY == 0.0f))
                        
                                    {
                                    
                                    }
                                
                        else {
                            animationFactoryInitializationVisitor!!.dx= (animationFactoryInitializationVisitor!!.originalDx *scaleX).toInt()
animationFactoryInitializationVisitor!!.dy= (animationFactoryInitializationVisitor!!.originalDy *scaleY).toInt()

                        }
                            

                                    }
                                
                        else {
                            
                        }
                            
}


}
                
            

