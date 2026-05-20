
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import javax.microedition.khronos.opengles.GL
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.opengles.OpenGLLogUtil
import org.allbinary.opengles.GLUtil
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.opengles.PlatformTextureBaseFactory

open public class OpenGLESGL10Image : OpenGLESImage {
        

    private val textureVertexFloatBuffer: FloatBuffer = ByteBuffer.allocateDirect(4 *4 *2)!!.order(ByteOrder.nativeOrder())!!.asFloatBuffer()!!

    private val realOpenGLESImageDraw: OpenGLESImageDraw = object: OpenGLESImageDraw()
                                {
                                
    private val glUtil: GLUtil = GLUtil.getInstance()!!

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val textureVertexFloatBuffer: FloatBuffer = this@OpenGLESGL10Image.textureVertexFloatBuffer

    private val regionTextureRectangleFloatArray: FloatArray = FloatArray(8)

    private val regionTextureVertexFloatBuffer: FloatBuffer = ByteBuffer.allocateDirect(4 *4 *2)!!.order(ByteOrder.nativeOrder())!!.asFloatBuffer()!!

    private val regionRectangleFloatArray: FloatArray = floatArrayOf(0,0,0,0,0,0,0,0,0,0,0,0)

    val regionRectangleVertexFloatBuffer: FloatBuffer = ByteBuffer.allocateDirect(4 *4 *3)!!.order(ByteOrder.nativeOrder())!!.asFloatBuffer()!!

    val openGLESImageProperties: OpenGLESImageProperties = this@OpenGLESGL10Image.openGLESImageProperties

    open override fun drawRegion(gl: GL10, viewHeight: Int, x_src: Float, y_src: Float, width: Float, height: Float, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var viewHeight = viewHeight
    //var x_src = x_src
    //var y_src = y_src
    //var width = width
    //var height = height
    //var x = x
    //var y = y
    //var z = z

    var imageWidth: Int = this@OpenGLESGL10Image.getWidth()!!


    var imageHeight: Int = this@OpenGLESGL10Image.getHeight()!!

this.regionRectangleFloatArray[7]= viewHeight
this.regionRectangleFloatArray[1]= this.regionRectangleFloatArray[7] -height
this.regionRectangleFloatArray[3]= width
this.regionRectangleFloatArray[4]= this.regionRectangleFloatArray[1]!!
this.regionRectangleFloatArray[9]= this.regionRectangleFloatArray[3]!!
this.regionRectangleFloatArray[10]= this.regionRectangleFloatArray[7]!!
this.regionTextureRectangleFloatArray[0]= x_src /imageWidth
this.regionTextureRectangleFloatArray[1]= () /imageHeight
this.regionTextureRectangleFloatArray[2]= () /imageWidth
this.regionTextureRectangleFloatArray[3]= this.regionTextureRectangleFloatArray[1]!!
this.regionTextureRectangleFloatArray[4]= this.regionTextureRectangleFloatArray[0]!!
this.regionTextureRectangleFloatArray[5]= y_src /imageHeight
this.regionTextureRectangleFloatArray[6]= this.regionTextureRectangleFloatArray[2]!!
this.regionTextureRectangleFloatArray[7]= this.regionTextureRectangleFloatArray[5]!!

    var u_center: Float = (this.regionTextureRectangleFloatArray[0] +this.regionTextureRectangleFloatArray[2]) /2.0f


    var v_center: Float = (this.regionTextureRectangleFloatArray[5] +this.regionTextureRectangleFloatArray[1]) /2.0f

this.glUtil!!.rotateUVs(this.regionTextureRectangleFloatArray,  -this.openGLESImageProperties!!.angle, u_center, v_center)
gl.glPushMatrix()

    var imageProcessor: OpenGLESImageProcessor = this@OpenGLESGL10Image.imageProcessor

this@OpenGLESGL10Image.openGLESImageTranslate!!.translate(gl, this@OpenGLESGL10Image, x,  -y)
imageProcessor!!.scale(gl, this.openGLESImageProperties!!.scaleX, this.openGLESImageProperties!!.scaleY)
imageProcessor!!.colorMask(gl, this.openGLESImageProperties!!.redf, this.openGLESImageProperties!!.greenf, this.openGLESImageProperties!!.bluef, this.openGLESImageProperties!!.alphaf)
this@OpenGLESGL10Image.openGLESImageTranslate!!.translate2(gl, this@OpenGLESGL10Image)
this.regionRectangleVertexFloatBuffer!!.put(this.regionRectangleFloatArray)
this.glUtil!!.position(this.regionRectangleVertexFloatBuffer, 0)
gl.glVertexPointer(3, GL10.GL_FLOAT, 0, this.regionRectangleVertexFloatBuffer)
gl.glEnableClientState(GL10.GL_VERTEX_ARRAY)
gl.glEnable(GL10.GL_TEXTURE_2D)
gl.glBindTexture(GL10.GL_TEXTURE_2D, this.openGLESImageProperties!!.textureID)
gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
this.regionTextureVertexFloatBuffer!!.put(this.regionTextureRectangleFloatArray)
this.glUtil!!.position(this.regionTextureVertexFloatBuffer, 0)
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, this.regionTextureVertexFloatBuffer)
gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4)
gl.glDisableClientState(GL10.GL_VERTEX_ARRAY)
gl.glDisableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
gl.glDisable(GL10.GL_TEXTURE_2D)
gl.glPopMatrix()
}

    open override fun draw(gl: GL10, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var x = x
    //var y = y
    //var z = z

    var width: Int = this@OpenGLESGL10Image.getWidth()!!


    var height: Int = this@OpenGLESGL10Image.getHeight()!!

this.regionRectangleFloatArray[7]= this.displayInfoSingleton!!.getLastHeight()
this.regionRectangleFloatArray[1]= this.regionRectangleFloatArray[7] -height
this.regionRectangleFloatArray[3]= width
this.regionRectangleFloatArray[4]= this.regionRectangleFloatArray[1]!!
this.regionRectangleFloatArray[9]= this.regionRectangleFloatArray[3]!!
this.regionRectangleFloatArray[10]= this.regionRectangleFloatArray[7]!!
this.regionTextureRectangleFloatArray[0]= 0
this.regionTextureRectangleFloatArray[1]= 1
this.regionTextureRectangleFloatArray[2]= 1
this.regionTextureRectangleFloatArray[3]= 1
this.regionTextureRectangleFloatArray[4]= 0
this.regionTextureRectangleFloatArray[5]= 0
this.regionTextureRectangleFloatArray[6]= 1
this.regionTextureRectangleFloatArray[7]= 0
gl.glPushMatrix()
this@OpenGLESGL10Image.openGLESImageTranslate!!.translate(gl, this@OpenGLESGL10Image, x,  -y)

    var imageProcessor: OpenGLESImageProcessor = this@OpenGLESGL10Image.imageProcessor

imageProcessor!!.scale(gl, this.openGLESImageProperties!!.scaleX, this.openGLESImageProperties!!.scaleY)
imageProcessor!!.colorMask(gl, this.openGLESImageProperties!!.redf, this.openGLESImageProperties!!.greenf, this.openGLESImageProperties!!.bluef, this.openGLESImageProperties!!.alphaf)
this@OpenGLESGL10Image.openGLESImageTranslate!!.translate2(gl, this@OpenGLESGL10Image)
this.regionRectangleVertexFloatBuffer!!.put(this.regionRectangleFloatArray)
this.glUtil!!.position(this.regionRectangleVertexFloatBuffer, 0)
gl.glVertexPointer(3, GL10.GL_FLOAT, 0, this.regionRectangleVertexFloatBuffer)
gl.glEnableClientState(GL10.GL_VERTEX_ARRAY)
gl.glEnable(GL10.GL_TEXTURE_2D)
gl.glBindTexture(GL10.GL_TEXTURE_2D, this.openGLESImageProperties!!.textureID)
gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
this.glUtil!!.rotateUVs(this.regionTextureRectangleFloatArray,  -this.openGLESImageProperties!!.angle, 0.5f, 0.5f)
this.glUtil!!.position(this.textureVertexFloatBuffer, 0)
this.textureVertexFloatBuffer!!.put(this.regionTextureRectangleFloatArray)
this.glUtil!!.position(this.textureVertexFloatBuffer, 0)
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, this.textureVertexFloatBuffer)
gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4)
gl.glDisableClientState(GL10.GL_VERTEX_ARRAY)
gl.glDisableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
gl.glDisable(GL10.GL_TEXTURE_2D)
gl.glPopMatrix()
}

                                }
                            

    private var openGLESImageDraw: OpenGLESImageDraw = OpenGLESImageDraw.getInstance()!!
public constructor (image: Image, bitmapFactory: PlatformBitmapBaseFactory, textureFactory: PlatformTextureBaseFactory)                        

                            : super(image, bitmapFactory, textureFactory){
    //var image = image
    //var bitmapFactory = bitmapFactory
    //var textureFactory = textureFactory


                            //For kotlin this is before the body of the constructor.
                    
this.initVertices()
}


    open fun initVertices()
        //nullable = true from not(false or (false and true)) = true
{
this.textureVertexFloatBuffer!!.put(0)
this.textureVertexFloatBuffer!!.put(1)
this.textureVertexFloatBuffer!!.put(1)
this.textureVertexFloatBuffer!!.put(1)
this.textureVertexFloatBuffer!!.put(0)
this.textureVertexFloatBuffer!!.put(0)
this.textureVertexFloatBuffer!!.put(1)
this.textureVertexFloatBuffer!!.put(0)
this.textureVertexFloatBuffer!!.rewind()
}


    open fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl

    var gl10: GL10 = gl as GL10


    
                        if(super.initTexture(gl10))
                        
                                    {
                                    this.textureFactory!!.load(gl10, GL10.GL_TEXTURE_2D, 0, this, 0, true)
gl10.glDisable(GL10.GL_TEXTURE_2D)
this.openGLESImageDraw= this.realOpenGLESImageDraw
OpenGLLogUtil.getInstance()!!.logError(gl10, this)

                                    }
                                
}


    open fun drawRegion(gl: GL10, viewHeight: Int, x_src: Float, y_src: Float, width: Float, height: Float, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var viewHeight = viewHeight
    //var x_src = x_src
    //var y_src = y_src
    //var width = width
    //var height = height
    //var x = x
    //var y = y
    //var z = z
this.openGLESImageDraw!!.drawRegion(gl, viewHeight, x_src, y_src, width, height, x, y, z)
}


    open fun draw(gl: GL10, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var x = x
    //var y = y
    //var z = z
this.openGLESImageDraw!!.draw(gl, x, y, z)
}


}
                
            

