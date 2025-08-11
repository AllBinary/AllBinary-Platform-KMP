
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
        package org.allbinary.media.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import javax.microedition.lcdui.Image

open public class AndroidImageUtil
            : Object
         {
        

        companion object {


    private val instance: AndroidImageUtil = AndroidImageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AndroidImageUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun paint(bitmap: Bitmap, originalBitmap: Bitmap, paint: Paint)
        //nullable = true from not(false or (false and false)) = true
{

                    var bitmap = bitmap


                    var originalBitmap = originalBitmap


                    var paint = paint
bitmap.eraseColor(Color.TRANSPARENT)

    var canvas: Canvas = android.graphics.Canvas()

canvas.setBitmap(bitmap)
canvas.drawBitmap(originalBitmap, 0.0f, 0.0f, paint)
}


open fun paint(image: Image, originalImage: Image, paint: Paint)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var originalImage = originalImage


                    var paint = paint
image.getBitmap()!!.eraseColor(Color.TRANSPARENT)

    var canvas: Canvas = image.getCanvas()!!
            

canvas.drawBitmap(originalImage!!.getBitmap(), 0.0f, 0.0f, paint)
}


open fun rotate(image: Image, originalImage: Image, matrix: Matrix, paint: Paint)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var originalImage = originalImage


                    var matrix = matrix


                    var paint = paint
image.getBitmap()!!.eraseColor(Color.TRANSPARENT)

    var canvas: Canvas = image.getCanvas()!!
            

canvas.concat(matrix)
canvas.drawBitmap(originalImage!!.getBitmap(), 0.0f, 0.0f, paint)
}


open fun rotate(image: Image, originalImage: Image, matrix: Matrix)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var originalImage = originalImage


                    var matrix = matrix
image.getBitmap()!!.eraseColor(Color.TRANSPARENT)

    var canvas: Canvas = image.getCanvas()!!
            

canvas.concat(matrix)
image.getGraphics()!!.drawImage(originalImage, 0, 0, 0)
}


}
                
            

