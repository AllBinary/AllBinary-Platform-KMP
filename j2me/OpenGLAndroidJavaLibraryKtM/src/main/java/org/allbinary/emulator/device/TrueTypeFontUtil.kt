
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
        
import java.io.File
import java.io.FileOutputStream
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Typeface
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings
import org.microemu.android.device.AndroidImageInterface
import org.microemu.android.device.AndroidImmutableImage
//TTF
open public class TrueTypeFontUtil : TrueTypeFontUtilBase {
        
companion object {
            
    private val instance: TrueTypeFontUtil = TrueTypeFontUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TrueTypeFontUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TrueTypeFontUtil.instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!

    private val realFontSize: Int = 18

    var fontImage: OpenGLESImage = OpenGLESImage.NULL_OPENGL_IMAGE
private constructor ()                        

                            : super(1){


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun saveFontAtlasAsFile()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var file: File = ResourceUtil.getInstance()!!.getContext()!!.getFilesDir()!!


    var path: String = file.getAbsolutePath() +CanvasStrings.getInstance()!!.FONT_ATLAS

this.logUtil!!.putF(path, this, commonStrings!!.CONSTRUCTOR)

    var fos: FileOutputStream = FileOutputStream(path)


    var bitmap: Bitmap = 
                                    (getImage as AndroidImageInterface).getBitmap()!!

bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.putOE(commonStrings!!.EXCEPTION, this, commonStrings!!.EXCEPTION, e)
}

}


    open fun getFontBitmapGL(gl: GL10, filename: String, cellSize: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var gl = gl
    //var filename = filename
    //var cellSize = cellSize
    //var basicColor = basicColor

    
                        if(this.fontImage == OpenGLESImage.NULL_OPENGL_IMAGE)
                        
                                    {
                                    
    var cellsPerRow2: Int = this.CELLS_PER_ROW *2


    var cellsPerRow3: Int = this.CELLS_PER_ROW *3


    var cellsPerRow4: Int = this.CELLS_PER_ROW *4


    var cellsPerRow5: Int = this.CELLS_PER_ROW *5


    var cellsPerRow6: Int = this.CELLS_PER_ROW *6


    var cellsPerRow7: Int = this.CELLS_PER_ROW *7


    var typeface: Typeface = Typeface.DEFAULT


    var textureSize: Int = this.getAsTextureSize(this.CELLS_PER_ROW *cellSize)!!


    var bitmap: Bitmap = Bitmap.createBitmap(textureSize, textureSize, Bitmap.Config.ARGB_8888)!!


    var canvas: Canvas = Canvas(bitmap)


    var paint: Paint = Paint()

paint.setTypeface(typeface)
paint.setTextSize(this.realFontSize.toFloat())
paint.setAlpha(basicColor!!.alpha.toInt())
paint.setColor(basicColor!!.toInt())

    var biggestHeight: Int = 0


    var bounds: Rect = Rect()


    var x: Int= 0


    var y: Int= 0





                        for (index in 0 until this.size)

        {
this.characterArray[0]= this.pattern[index]
paint.getTextBounds(this.characterArray, 0, 1, bounds)
this._characterWidth[index]= bounds.right

    
                        if(bounds.bottom -bounds.top > biggestHeight)
                        
                                    {
                                    biggestHeight= bounds.bottom -bounds.top

                                    }
                                
x= (index % this.CELLS_PER_ROW) *cellSize
x += (cellSize shr 1)
x -= (this._characterWidth[index] shr 1)
y= 0

    
                        if(index >= this.CELLS_PER_ROW)
                        
                                    {
                                    y += cellSize

                                    }
                                

    
                        if(index >= cellsPerRow2)
                        
                                    {
                                    y += cellSize

                                    }
                                

    
                        if(index >= cellsPerRow3)
                        
                                    {
                                    y += cellSize

                                    }
                                

    
                        if(index >= cellsPerRow4)
                        
                                    {
                                    y += cellSize

                                    }
                                

    
                        if(index >= cellsPerRow5)
                        
                                    {
                                    y += cellSize

                                    }
                                

    
                        if(index >= cellsPerRow6)
                        
                                    {
                                    y += cellSize

                                    }
                                

    
                        if(index >= cellsPerRow7)
                        
                                    {
                                    y += cellSize

                                    }
                                
y += cellSize
y -= (cellSize shr 2)
canvas.drawText(this.characterArray, 0, 1, x.toFloat() -3, y.toFloat() -6, paint)
}

canvas.save()

    var image: Image = AndroidImmutableImage.create(bitmap)!!

this.fontImage= this.preResourceImageUtil!!.encapsulate(image) as OpenGLESImage



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fontImage

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fontImage

                        }
                            
}


    open fun getFontWidths(filename: String, fontSize: Int)
        //nullable = true from not(false or (false and false)) = true
: IntArray{
    //var filename = filename
    //var fontSize = fontSize

    var typeface: Typeface = Typeface.DEFAULT


    var paint: Paint = Paint()

paint.setTypeface(typeface)
paint.setTextSize(fontSize.toFloat())
paint.setARGB(255, 255, 255, 255)

    var bounds: Rect = Rect()





                        for (index in 0 until this.size)

        {
this.characterArray[0]= this.pattern[index]
paint.getTextBounds(this.characterArray, 0, 1, bounds)

    
                        if(index < this.lastCapIndex)
                        
                                    {
                                    
    
                        if(this.characterArray[0] == '1')
                        
                                    {
                                    this._characterWidth[index]= bounds.right +3

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'J' || this.characterArray[0] == 'V' || this.characterArray[0] == '2' || this.characterArray[0] == '9' || this.characterArray[0] == 'I' || this.characterArray[0] == 'N' || this.characterArray[0] == 'U')
                        
                                    {
                                    this._characterWidth[index]= bounds.right +1

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == '4' || this.characterArray[0] == 'C' || this.characterArray[0] == 'E' || this.characterArray[0] == 'O')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -2

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'B' || this.characterArray[0] == 'D' || this.characterArray[0] == 'G' || this.characterArray[0] == 'H' || this.characterArray[0] == 'T' || this.characterArray[0] == 'W')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -3

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'A' || this.characterArray[0] == 'Q' || this.characterArray[0] == 'R')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -5

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'M')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -6

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'm')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -8

                                    }
                                
                        else {
                            this._characterWidth[index]= bounds.right

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(this.characterArray[0] == ' ')
                        
                                    {
                                    this._characterWidth[index]= bounds.right +10

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'l' || this.characterArray[0] == 'i' || this.characterArray[0] == 'j' || this.characterArray[0] == '.' || this.characterArray[0] == '!' || this.characterArray[0] == '|')
                        
                                    {
                                    this._characterWidth[index]= bounds.right +6

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'f' || this.characterArray[0] == 't' || this.characterArray[0] == 'u' || this.characterArray[0] == 'v')
                        
                                    {
                                    this._characterWidth[index]= bounds.right +1

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'r')
                        
                                    {
                                    this._characterWidth[index]= bounds.right +2

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'a' || this.characterArray[0] == 'b' || this.characterArray[0] == 'g' || this.characterArray[0] == 'u')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -1

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'o' || this.characterArray[0] == 'e')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -2

                                    }
                                
                             else 
    
                        if(this.characterArray[0] == 'm')
                        
                                    {
                                    this._characterWidth[index]= bounds.right -7

                                    }
                                
                        else {
                            this._characterWidth[index]= bounds.right

                        }
                            

                        }
                            
}

this._characterWidth[0]= (fontSize shr 1) -2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this._characterWidth
}


}
                
            

