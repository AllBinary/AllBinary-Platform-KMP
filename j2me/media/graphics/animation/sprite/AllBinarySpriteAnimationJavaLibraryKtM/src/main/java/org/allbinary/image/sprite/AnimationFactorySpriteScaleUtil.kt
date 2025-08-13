
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
        package org.allbinary.image.sprite



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.game.layer.SpriteFactory
import org.allbinary.graphics.opengles.OpenGLUtil
import org.allbinary.image.ImageCache
import org.allbinary.image.ImageCacheFactory
import org.allbinary.image.opengles.OpenGLESImageExclusionUtil
import org.allbinary.logic.math.J2SEMath
import org.allbinary.media.image.ImageScaleUtil

open public class AnimationFactorySpriteScaleUtil
            : Object
         {
        

        companion object {
            
    private val instance: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnimationFactorySpriteScaleUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val imageCache: ImageCache = ImageCacheFactory.getInstance()!!
            

    private val imageScaleUtil: ImageScaleUtil = ImageScaleUtil.getInstance()!!
            

    private val openGLUtil: OpenGLUtil = OpenGLUtil.getInstance()!!
            

    private val j2seMath: J2SEMath = J2SEMath.getInstance()!!
            

    private val openGLESImageExclusionUtil: OpenGLESImageExclusionUtil = OpenGLESImageExclusionUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun createImage(image: Image, width: Int, height: Int, scaleWidth: Int, scaleHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Sprite{

                    var image = image


                    var width = width


                    var height = height


                    var scaleWidth = scaleWidth


                    var scaleHeight = scaleHeight

    var spriteFactory: SpriteFactory = SpriteFactory.getInstance()!!
            


    var sprite: Sprite


    var scaledImage: Image


    
                        if(scaleWidth != 0 && scaleHeight != 0)
                        
                                    {
                                    
    var scaleX: Float = (scaleWidth.toFloat()) /(width.toFloat())


    var scaleY: Float = (scaleHeight.toFloat()) /(height.toFloat())


    
                        if((scaleX == 1.0f && scaleY == 1.0f) || (scaleX == 0.0f || scaleY == 0.0f))
                        
                                    {
                                    scaledImage= openGLUtil!!.add(image)
sprite= spriteFactory!!.create(scaledImage, width, height)

                                    }
                                
                        else {
                            
    
                        if(openGLESImageExclusionUtil!!.isCustomScaling(image))
                        
                                    {
                                    
    var width2: Int = j2seMath!!.round((scaleWidth) -0.5f)!!
            


    var height2: Int = j2seMath!!.round((scaleHeight) -0.5f)!!
            


    var multiplesOf16Width: Int = width2 /16


    var by16Width: Int = multiplesOf16Width *16

scaleX= (by16Width.toFloat()) /width

    var multiplesOf16Height: Int = height2 /16


    var by16Height: Int = multiplesOf16Height *16

scaleY= (by16Height.toFloat()) /height

    
                        if(scaleWidth < width)
                        
                                    {
                                    scaleX= scaleX *2.35f

                                    }
                                

    
                        if(scaleHeight < height)
                        
                                    {
                                    scaleY= scaleY *2.35f

                                    }
                                

                                    }
                                
scaledImage= imageScaleUtil!!.createImage(imageCache, image, scaleX, 1.0f, scaleY, 1.0f, true)
sprite= spriteFactory!!.create(scaledImage, (width *scaleX).toInt(), (height *scaleY).toInt())

                        }
                            

                                    }
                                
                        else {
                            scaledImage= openGLUtil!!.add(image)
sprite= spriteFactory!!.create(scaledImage, width, height)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sprite
}


}
                
            

