
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
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.khronos.opengles.GL10
import javax.microedition.khronos.opengles.GL11
import javax.microedition.khronos.opengles.GL11Ext
import javax.microedition.lcdui.Image
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.opengles.OpenGLLogUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.opengles.PlatformTextureBaseFactory

open public class OpenGLESGL11ExtImage : OpenGLESImage {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var a: Int= 0

    private val rectangle: IntArray
public constructor        (image: Image, bitmapFactory: PlatformBitmapBaseFactory, textureFactory: PlatformTextureBaseFactory)                        

                            : super(image, bitmapFactory, textureFactory)

        Updates for KMP build        
        {
    //var image = image
    //var bitmapFactory = bitmapFactory
    //var textureFactory = textureFactory


                            //For kotlin this is before the body of the constructor.
                    
this.onDisplayChangeEvent(
                            null)
rectangle= intArrayOf(0,this.getHeight(), this.getWidth(),  -this.getHeight())
}


open fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var displayChangeEvent = displayChangeEvent

        try {
            logUtil!!.put(commonStrings!!.START, this, "onResize")
this.a= DisplayInfoSingleton.getInstance()!!.getLastHeight() -this.getHeight()
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "onResize", e)
}

}


open fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
this.onDisplayChangeEvent(
                            null)

    var gl11: GL11 = gl as GL11


    
                        if(super.initTexture(gl11))
                        
                                    {
                                    this.textureFactory!!.load(gl11, GL10.GL_TEXTURE_2D, 0, this, 0, true)
gl11.glTexParameteriv(GL10.GL_TEXTURE_2D, GL11Ext.GL_TEXTURE_CROP_RECT_OES, rectangle, 0)
gl11.glDisable(GL10.GL_TEXTURE_2D)
OpenGLLogUtil.getInstance()!!.logError(gl11, this)

                                    }
                                
}


open fun draw(gl: GL10, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
    //var x = x
    //var y = y
    //var z = z
gl.glEnable(GL10.GL_TEXTURE_2D)
gl.glBindTexture(GL10.GL_TEXTURE_2D, openGLESImageProperties!!.textureID)
gl = glgl as GL11Ext
gl.
                    glDrawTexfOES(x, a -y, z, this.getWidth(), this.getHeight())
gl.glDisable(GL10.GL_TEXTURE_2D)
}


}
                
            

