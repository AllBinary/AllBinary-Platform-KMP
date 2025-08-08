
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.DisposalUtil
import org.allbinary.platform.graphics.PlatformBitmapBase
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

open public class OpenGLBitmap : PlatformBitmapBase {
        

    val image: Image
public constructor        (bitmap: Any){

                    var bitmap = bitmap
this.image= bitmap as Image
}


open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun getDepth()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(this.image.isMutable())
                        
                                    {
                                    
    var mutableImage: SwtMutableImage = this.image as SwtMutableImage




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mutableImage!!.getDepth()

                                    }
                                
                        else {
                            
    var immutableImage: SwtImmutableImage = this.image as SwtImmutableImage




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return immutableImage!!.getDepth()

                        }
                            
}


open fun getPixels(pixels: IntArray, offset: Int, stride: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pixels = pixels


                    var offset = offset


                    var stride = stride


                    var x = x


                    var y = y


                    var width = width


                    var height = height

    
                        if(this.image.isMutable())
                        
                                    {
                                    
    var mutableImage: SwtMutableImage = this.image as SwtMutableImage

mutableImage!!.getRGB(pixels, offset, stride, x, y, width, height)

                                    }
                                
                        else {
                            
    var immutableImage: SwtImmutableImage = this.image as SwtImmutableImage

immutableImage!!.getRGB(pixels, offset, stride, x, y, width, height)

                        }
                            
}


open fun setPixels(pixels: IntArray, offset: Int, stride: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pixels = pixels


                    var offset = offset


                    var stride = stride


                    var x = x


                    var y = y


                    var width = width


                    var height = height
this.image.setRGB2(pixels, offset, height, x, y, width, height)
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.image.getWidth()
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.image.getHeight()
}


open fun recycle()
        //nullable = true from not(false or (false and true)) = true
{DisposalUtil.getInstance()!!.dispose(image)
}


}
                
            

