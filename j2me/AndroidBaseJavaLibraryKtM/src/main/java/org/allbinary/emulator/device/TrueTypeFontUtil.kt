
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Typeface
import java.io.File
import java.io.FileOutputStream
import javax.microedition.khronos.opengles.GL10
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
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
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!
            

    private val realFontSize: Int = 18

    var fontImage: OpenGLESImage
private constructor        ()                        

                            : super(1){

                            //For kotlin this is before the body of the constructor.
                    
}


open fun saveFontAtlasAsFile()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var file: File = ResourceUtil.getInstance()!!.getContext()!!.getFilesDir()!!
            


    var path: String = file!!.getAbsolutePath() +CanvasStrings.getInstance()!!.FONT_ATLAS

logUtil!!.put(path, this, commonStrings!!.CONSTRUCTOR)

    var fos: FileOutputStream = FileOutputStream(path)


    var bitmap: Bitmap = this.fontImage!!.openGLBitmap!!.getImage()!!.getBitmap()!!
            

bitmap!!.compress(Bitmap.CompressFormat.PNG, 100, fos)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.EXCEPTION, e)
}

}


open fun getFontBitmap(gl: GL10, filename: String, cellSize: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var gl = gl


                    var filename = filename


                    var cellSize = cellSize


                    var basicColor = basicColor

    
                        if(this.fontImage == 
                                    null
                                )
                        
                                    {
                                    
    var cellsPerRow2: Int = CELLS_PER_ROW *2


    var cellsPerRow3: Int = CELLS_PER_ROW *3


    var cellsPerRow4: Int = CELLS_PER_ROW *4


    var cellsPerRow5: Int = CELLS_PER_ROW *5


    var cellsPerRow6: Int = CELLS_PER_ROW *6


    var cellsPerRow7: Int = CELLS_PER_ROW *7


    var typeface: Typeface = Typeface.DEFAULT


    var textureSize: Int = this.getAsTextureSize(CELLS_PER_ROW *cellSize)!!
            


    var bitmap: Bitmap = Bitmap.createBitmap(textureSize, textureSize, Bitmap.Config.ARGB_8888)!!
            


    var canvas: Canvas = Canvas(bitmap)


    var paint: Paint = Paint()

paint!!.setTypeface(typeface)
paint!!.setTextSize(realFontSize)
paint!!.setAlpha(basicColor!!.alpha)
paint!!.setColor(basicColor!!.toInt())

    var biggestHeight: Int = 0


    var bounds: Rect = Rect()


    var x: Int= 0


    var y: Int= 0





                        for (index in 0 until size)


        {characterArray[0]= pattern!![index]
paint!!.getTextBounds(characterArray, 0, 1, bounds)
_characterWidth[index]= bounds!!.right

    
                        if(bounds!!.bottom -bounds!!.top > biggestHeight)
                        
                                    {
                                    biggestHeight= bounds!!.bottom -bounds!!.top

                                    }
                                
x= (index % CELLS_PER_ROW) *cellSize
x += (cellSize shr 1)
x -= (_characterWidth[index] shr 1)
y= 0

    
                        if(index >= CELLS_PER_ROW)
                        
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
canvas!!.drawText(characterArray, 0, 1, x -3, y -6, paint)
}

canvas!!.save()

    var image: Image = Image(bitmap)

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

                    var filename = filename


                    var fontSize = fontSize

    var typeface: Typeface = Typeface.DEFAULT


    var paint: Paint = Paint()

paint!!.setTypeface(typeface)
paint!!.setTextSize(fontSize)
paint!!.setARGB(255, 255, 255, 255)

    var bounds: Rect = Rect()





                        for (index in 0 until size)


        {characterArray[0]= pattern!![index]
paint!!.getTextBounds(characterArray, 0, 1, bounds)

    
                        if(index < lastCapIndex)
                        
                                    {
                                    
    
                        if(characterArray[0] == '1')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right +3

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'J' || characterArray[0] == 'V' || characterArray[0] == '2' || characterArray[0] == '9' || characterArray[0] == 'H' || characterArray[0] == 'I' || characterArray[0] == 'N' || characterArray[0] == 'U')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right +1

                                    }
                                
                             else 
    
                        if(characterArray[0] == '4' || characterArray[0] == 'C' || characterArray[0] == 'E' || characterArray[0] == 'O')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -2

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'G' || characterArray[0] == 'T' || characterArray[0] == 'W')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -3

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'A' || characterArray[0] == 'Q' || characterArray[0] == 'R')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -5

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'M')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -6

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'm')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -8

                                    }
                                
                        else {
                            _characterWidth[index]= bounds!!.right

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(characterArray[0] == ' ')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right +10

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'l' || characterArray[0] == 'i' || characterArray[0] == 'j' || characterArray[0] == '.' || characterArray[0] == '!' || characterArray[0] == '|')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right +6

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'f' || characterArray[0] == 't' || characterArray[0] == 'u' || characterArray[0] == 'v')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right +1

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'r')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right +2

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'a' || characterArray[0] == 'b' || characterArray[0] == 'g' || characterArray[0] == 'u')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -1

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'o' || characterArray[0] == 'e')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -2

                                    }
                                
                             else 
    
                        if(characterArray[0] == 'm')
                        
                                    {
                                    _characterWidth[index]= bounds!!.right -7

                                    }
                                
                        else {
                            _characterWidth[index]= bounds!!.right

                        }
                            

                        }
                            
}

_characterWidth[0]= (fontSize shr 1) -2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return _characterWidth
}


}
                
            

