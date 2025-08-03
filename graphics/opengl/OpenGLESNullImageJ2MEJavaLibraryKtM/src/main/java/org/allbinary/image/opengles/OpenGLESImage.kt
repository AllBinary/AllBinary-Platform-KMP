
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
import javax.microedition.lcdui.Image
import org.allbinary.platform.graphics.PlatformBitmapBase
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.opengles.PlatformTextureBaseFactory
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class OpenGLESImage
            : Object
        
                , OpenGLSurfaceChangedInterface {
        

        companion object {


    val texture2dList: BasicArrayList = BasicArrayList()

    val TYPE: Int = 4


        }
            
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val textureFactory: PlatformTextureBaseFactory

    val openGLBitmap: PlatformBitmapBase

    val openGLESImageProperties: OpenGLESImageProperties = OpenGLESImageProperties()
public constructor        (image: Image, bitmapFactory: PlatformBitmapBaseFactory, textureFactory: PlatformTextureBaseFactory)
            : super()
        {

                    var image = image


                    var bitmapFactory = bitmapFactory


                    var textureFactory = textureFactory
this.openGLBitmap= bitmapFactory!!.createBitmap(image)
this.textureFactory= textureFactory
}


                @Throws(Exception::class)
            override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun initTexture(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var gl = gl



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


}
                
            

