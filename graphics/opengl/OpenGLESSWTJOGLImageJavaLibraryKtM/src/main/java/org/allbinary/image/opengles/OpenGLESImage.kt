
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
        package org.allbinary.image.opengles



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.khronos.opengles.GL10
import javax.microedition.khronos.opengles.GL11
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.OpenGLESPostLoadPlatformImage
import org.allbinary.graphics.GraphicsStrings
import org.allbinary.graphics.OpenGLBitmap
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.opengles.PlatformTextureBaseFactory
import org.allbinary.util.BasicArrayList

open public class OpenGLESImage : Image
                , OpenGLSurfaceChangedInterface {
        

        companion object {
            
    val texture2dList: BasicArrayList = BasicArrayList()

    val TYPE: Int = 4

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val textureFactory: PlatformTextureBaseFactory

    val openGLBitmap: OpenGLBitmap

    var imageProcessor: OpenGLESImageProcessor = OpenGLESImageProcessor.getInstance()!!
            

    var openGLESImageTranslate: OpenGLESImageTranslate = OpenGLESImageTranslate.getInstance()!!
            

    val openGLESImageProperties: OpenGLESImageProperties = OpenGLESImageProperties()
public constructor        (image: Image, bitmapFactory: PlatformBitmapBaseFactory, textureFactory: PlatformTextureBaseFactory)                        

                            : super(image.getName(), 
                            null){

                    var image = image


                    var bitmapFactory = bitmapFactory


                    var textureFactory = textureFactory


                            //For kotlin this is before the body of the constructor.
                    
this.openGLBitmap= bitmapFactory!!.createBitmap(image) as OpenGLBitmap
this.textureFactory= textureFactory
OpenGLImageCacheFactory.getInstance()!!.init(this)
this.platformImage= OpenGLESPostLoadPlatformImage.getInstance()
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.openGLBitmap!!.getHeight() *this.openGLESImageProperties!!.scaleY2).toInt()
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.openGLBitmap!!.getWidth() *this.openGLESImageProperties!!.scaleX2).toInt()
}


                @Throws(Exception::class)
            
open fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun initTexture(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var gl = gl

    
                        if(!texture2dList!!.contains(this))
                        
                                    {
                                    texture2dList!!.add(this)

    var textures: IntArray = IntArray(1)

gl.glEnable(GL10.GL_TEXTURE_2D)

    
                        if(this.openGLESImageProperties!!.textureID !=  -1)
                        
                                    {
                                    textures[0]= this.openGLESImageProperties!!.textureID
gl.glDeleteTextures(1, textures, 0)

                                    }
                                
gl.glGenTextures(1, textures, 0)
this.openGLESImageProperties!!.textureID= textures[0]!!
gl.glBindTexture(GL10.GL_TEXTURE_2D, this.openGLESImageProperties!!.textureID)
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST)
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_S, GL10.GL_CLAMP_TO_EDGE)
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_T, GL10.GL_CLAMP_TO_EDGE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun drawRegion(gl: GL10, viewHeight: Int, x_src: Float, y_src: Float, width: Float, height: Float, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var viewHeight = viewHeight


                    var x_src = x_src


                    var y_src = y_src


                    var width = width


                    var height = height


                    var x = x


                    var y = y


                    var z = z
}


open fun draw(gl: GL10, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var x = x


                    var y = y


                    var z = z
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var graphicsStrings: GraphicsStrings = GraphicsStrings.getInstance()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(this.getName())!!.append(super.toString())!!.append(graphicsStrings!!.OPACITY)!!.append(this.openGLESImageProperties!!.alphaf)!!.toString()
}


}
                
            

