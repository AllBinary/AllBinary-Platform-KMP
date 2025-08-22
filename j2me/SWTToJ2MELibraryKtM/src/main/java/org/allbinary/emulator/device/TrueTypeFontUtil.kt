
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
        package org.allbinary.emulator.device




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.ImageData
import org.eclipse.swt.graphics.ImageLoader
import org.microemu.device.swt.SwtMutableImage
import org.allbinary.AvianUtil
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.opengles.OpenGLCapabilities
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class TrueTypeFontUtil : TrueTypeFontUtilBase {
        

        companion object {
            
    private val instance: TrueTypeFontUtil = TrueTypeFontUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TrueTypeFontUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!

    private val widthFloatArray: FloatArray

    var fontImage: OpenGLESImage

    private val widthScale: Float
private constructor        ()                        

                            : super(2){

                            //For kotlin this is before the body of the constructor.
                    

    
                        if(AvianUtil.isAvian())
                        
                                    {
                                    widthFloatArray= FloatArray()

                                    }
                                
                        else {
                            widthFloatArray= FloatArray()

                        }
                            
this.widthScale= if((this.scale == 2)) {
                            
                            
                                        //Otherwise - thenExpr - DoubleLiteralExpr

                        
                            } else {
                            
                                        //Otherwise - expression - elseExpr - DoubleLiteralExpr

                            }
    
}


open fun getFontBitmap(gl: GL10, filename: String, cellSize: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var gl = gl


                    var filename = filename


                    var cellSize = cellSize


                    var basicColor = basicColor

        try {
            
    
                        if(this.fontImage == 
                                    null
                                )
                        
                                    {
                                    
    var canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!


    var openGLCapabilities: OpenGLCapabilities = OpenGLCapabilities.getInstance()!!


    
                        if(openGLCapabilities!!.isTextureSizeValid(1024) && this.scale == 2)
                        
                                    {
                                    
    var FONT_ATLAS_1024: String = "/font_1024.png"


    var image: Image = Image.createImage(ResourceUtil.getInstance()!!.getResourceAsStream(FONT_ATLAS_1024))!!

image.setName(canvasStrings!!.FONT_ATLAS)
this.fontImage= this.preResourceImageUtil!!.encapsulate(image) as OpenGLESImage

                                    }
                                
                             else 
    
                        if(openGLCapabilities!!.isTextureSizeValid(512))
                        
                                    {
                                    
    var FONT_ATLAS_512: String = "/font_512.png"


    var image: Image = Image.createImage(ResourceUtil.getInstance()!!.getResourceAsStream(FONT_ATLAS_512))!!

image.setName(canvasStrings!!.FONT_ATLAS)
this.fontImage= this.preResourceImageUtil!!.encapsulate(image) as OpenGLESImage

                                    }
                                
                        else {
                            
    var FONT_ATLAS_512: String = "/font_512.png"


    var image: Image = Image.createImage(ResourceUtil.getInstance()!!.getResourceAsStream(FONT_ATLAS_512))!!

image.setName(canvasStrings!!.FONT_ATLAS)
this.fontImage= this.preResourceImageUtil!!.encapsulate(image) as OpenGLESImage

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fontImage

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fontImage

                        }
                            
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.EXCEPTION, e)



                            throw RuntimeException()
}

}


open fun saveFontAtlasAsFile()
        //nullable = true from not(false or (false and true)) = true
{
    var image: Image = this.getFontBitmap2(
                            null, cellSize, BasicColorFactory.getInstance()!!.WHITE)!!


    var imageLoader: ImageLoader = ImageLoader()


    var imageData: ImageData = image = imageimage as SwtMutableImage
image.
                    image.getImageData()!!

imageData!!.transparentPixel= imageData!!.getPixel(0, 0)
imageLoader!!.data= arrayOf(imageData)
imageLoader!!.save(CommonSeps.getInstance()!!.PERIOD +CanvasStrings.getInstance()!!.FONT_ATLAS, SWT.IMAGE_PNG)
}


open fun getFontBitmap2(filename: String, cellSize: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var filename = filename


                    var cellSize = cellSize


                    var basicColor = basicColor

    var cellsPerRow2: Int = CELLS_PER_ROW *2


    var cellsPerRow3: Int = CELLS_PER_ROW *3


    var cellsPerRow4: Int = CELLS_PER_ROW *4


    var cellsPerRow5: Int = CELLS_PER_ROW *5


    var cellsPerRow6: Int = CELLS_PER_ROW *6


    var cellsPerRow7: Int = CELLS_PER_ROW *7


    var image: Image = Image.createImage(textureSize, textureSize)!!


    var graphics: Graphics = image.getGraphics()!!

graphics.setColor(basicColor!!.toInt())

    var biggestHeight: Int = 0


    var bounds: Rectangle = Rectangle(PointFactory.getInstance()!!.getInstance(0, 0), cellSize, cellSize)


    var x: Int= 0


    var y: Int= 0





                        for (index in 0 until size)


        {characterArray[0]= pattern[index]
_characterWidth[index]= bounds.getMaxX()

    
                        if(bounds.getMaxY() -bounds.getPoint()!!.getX() > biggestHeight)
                        biggestHeight= bounds.getMaxY() -bounds.getPoint()!!.getX()
x= (index % CELLS_PER_ROW) *cellSize
x += (cellSize shr 1)
x -= (_characterWidth[index] shr 1)
y=  -(cellSize shr 1)

    
                        if(index >= CELLS_PER_ROW)
                        y += cellSize

    
                        if(index >= cellsPerRow2)
                        y += cellSize

    
                        if(index >= cellsPerRow3)
                        y += cellSize

    
                        if(index >= cellsPerRow4)
                        y += cellSize

    
                        if(index >= cellsPerRow5)
                        y += cellSize

    
                        if(index >= cellsPerRow6)
                        y += cellSize

    
                        if(index >= cellsPerRow7)
                        y += cellSize
y += cellSize
y -= (cellSize shr 2)
graphics.drawChar(characterArray[0]!!, x, y, 0)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun getFontWidths(filename: String, fontSize: Int)
        //nullable = true from not(false or (false and false)) = true
: IntArray{

                    var filename = filename


                    var fontSize = fontSize

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!





                        for (index in 0 until size)


        {characterArray[0]= pattern[index]

    
                        if(characterArray[0] == ' ')
                        
                                    {
                                    _characterWidth[index]= (fontSize /4)

                                    }
                                
                        else {
                            
    var shortPatternIndex: Int = this.shortPattern!!.indexOf(characterArray[0]!!)!!


    var w: Int = (widthFloatArray[shortPatternIndex] /75).toInt() +19

_characterWidth[index]= w.toInt()

    
                        if(characterArray[0] >= 'a' && characterArray[0] < 'k')
                        _characterWidth[index] -= 2

    
                        if(characterArray[0] >= 'k' && characterArray[0] < 'v')
                        _characterWidth[index] -= 4

    
                        if(characterArray[0] >= 'v' && characterArray[0] < 'z')
                        _characterWidth[index] -= 8

                        }
                            
_characterWidth[index] *= this.widthScale
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return _characterWidth
}


}
                
            

