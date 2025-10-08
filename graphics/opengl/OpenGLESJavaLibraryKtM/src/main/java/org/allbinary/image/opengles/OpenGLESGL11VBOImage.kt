
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
import org.allbinary.graphics.opengles.OpenGLLogUtil
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.opengles.GLUtil
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.opengles.PlatformTextureBaseFactory

open public class OpenGLESGL11VBOImage : OpenGLESImage {
        

    private val glUtil: GLUtil = GLUtil.getInstance()!!

    private var textureVertexFloatBuffer: FloatBuffer = ByteBuffer.allocateDirect(4 *4 *2)!!.order(ByteOrder.nativeOrder())!!.asFloatBuffer()!!
public constructor (image: Image, bitmapFactory: PlatformBitmapBaseFactory, textureFactory: PlatformTextureBaseFactory)                        

                            : super(image, bitmapFactory, textureFactory){
    //var image = image
    //var bitmapFactory = bitmapFactory
    //var textureFactory = textureFactory


                            //For kotlin this is before the body of the constructor.
                    
this.initVertices()
this.regionRectangleVertexFloatBuffer!!.put(FloatBuffer.wrap(regionRectangleFloatArray))
this.regionTextureVertexFloatBuffer!!.put(FloatBuffer.wrap(regionTextureRectangleFloatArray))
}


    open fun initVertices()
        //nullable = true from not(false or (false and true)) = true
{
textureVertexFloatBuffer!!.put(0)
textureVertexFloatBuffer!!.put(1)
textureVertexFloatBuffer!!.put(1)
textureVertexFloatBuffer!!.put(1)
textureVertexFloatBuffer!!.put(0)
textureVertexFloatBuffer!!.put(0)
textureVertexFloatBuffer!!.put(1)
textureVertexFloatBuffer!!.put(0)
textureVertexFloatBuffer!!.rewind()
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
OpenGLLogUtil.getInstance()!!.logError(gl10, this)

                                    }
                                
}


    val regionRectangleFloatArray: FloatArray = floatArrayOf(0,0,0,0,0,0,0,0,0,0,0,0)

    var regionRectangleVertexFloatBuffer: FloatBuffer = ByteBuffer.allocateDirect(4 *4 *3)!!.order(ByteOrder.nativeOrder())!!.asFloatBuffer()!!

    private val regionTextureRectangleFloatArray: FloatArray = FloatArray(8)

    private var regionTextureVertexFloatBuffer: FloatBuffer = ByteBuffer.allocateDirect(4 *4 *2)!!.order(ByteOrder.nativeOrder())!!.asFloatBuffer()!!

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
this.regionRectangleFloatArray[0]= x
this.regionRectangleFloatArray[7]= viewHeight -y
this.regionRectangleFloatArray[1]= this.regionRectangleFloatArray[7] -height
this.regionRectangleFloatArray[3]= x +width
this.regionRectangleFloatArray[4]= this.regionRectangleFloatArray[1]!!
this.regionRectangleFloatArray[6]= x
this.regionRectangleFloatArray[9]= this.regionRectangleFloatArray[3]!!
this.regionRectangleFloatArray[10]= this.regionRectangleFloatArray[7]!!
regionTextureRectangleFloatArray[0]= x_src /this.getWidth()
regionTextureRectangleFloatArray[1]= () /this.getHeight()
regionTextureRectangleFloatArray[2]= () /this.getWidth()
regionTextureRectangleFloatArray[3]= regionTextureRectangleFloatArray[1]!!
regionTextureRectangleFloatArray[4]= regionTextureRectangleFloatArray[0]!!
regionTextureRectangleFloatArray[5]= y_src /this.getHeight()
regionTextureRectangleFloatArray[6]= regionTextureRectangleFloatArray[2]!!
regionTextureRectangleFloatArray[7]= regionTextureRectangleFloatArray[5]!!
this.glUtil!!.position(regionRectangleVertexFloatBuffer, 0)
gl.glVertexPointer(3, GL10.GL_FLOAT, 0, regionRectangleVertexFloatBuffer)
gl.glEnableClientState(GL10.GL_VERTEX_ARRAY)
gl.glEnable(GL10.GL_TEXTURE_2D)
gl.glBindTexture(GL10.GL_TEXTURE_2D, openGLESImageProperties!!.textureID)
gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
this.glUtil!!.position(regionTextureVertexFloatBuffer, 0)
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, regionTextureVertexFloatBuffer)
gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4)
gl.glDisableClientState(GL10.GL_VERTEX_ARRAY)
gl.glDisableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
gl.glDisable(GL10.GL_TEXTURE_2D)
}


    open fun draw(gl: GL10, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var x = x
    //var y = y
    //var z = z
this.regionRectangleFloatArray[0]= x
this.regionRectangleFloatArray[7]= DisplayInfoSingleton.getInstance()!!.getLastHeight() -y
this.regionRectangleFloatArray[1]= this.regionRectangleFloatArray[7] -this.getHeight()
this.regionRectangleFloatArray[3]= x +this.getWidth()
this.regionRectangleFloatArray[4]= this.regionRectangleFloatArray[1]!!
this.regionRectangleFloatArray[6]= x
this.regionRectangleFloatArray[9]= this.regionRectangleFloatArray[3]!!
this.regionRectangleFloatArray[10]= this.regionRectangleFloatArray[7]!!
this.glUtil!!.position(regionRectangleVertexFloatBuffer, 0)
gl.glVertexPointer(3, GL10.GL_FLOAT, 0, regionRectangleVertexFloatBuffer)
gl.glEnableClientState(GL10.GL_VERTEX_ARRAY)
gl.glEnable(GL10.GL_TEXTURE_2D)
gl.glBindTexture(GL10.GL_TEXTURE_2D, openGLESImageProperties!!.textureID)
gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
this.glUtil!!.position(textureVertexFloatBuffer, 0)
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, textureVertexFloatBuffer)
gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4)
gl.glDisableClientState(GL10.GL_VERTEX_ARRAY)
gl.glDisableClientState(GL10.GL_TEXTURE_COORD_ARRAY)
gl.glDisable(GL10.GL_TEXTURE_2D)
}


}
                
            

