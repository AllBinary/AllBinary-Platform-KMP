
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
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.graphics.color.BasicColor
import org.allbinary.image.opengles.OpenGLESImage

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
            
    var fontImage: OpenGLESImage = OpenGLESImage.NULL_OPENGL_IMAGE
private constructor        ()                        

                            : super(1){

                            //For kotlin this is before the body of the constructor.
                    
}

override fun getAsTextureSize(textureSize: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var textureSize = textureSize



                            throw RuntimeException()
}

override fun getCellSize(cellSize: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var cellSize = cellSize



                            throw RuntimeException()
}


open fun getFontBitmap(filename: String, fontSize: Int, cellSize: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var filename = filename


                    var fontSize = fontSize


                    var cellSize = cellSize


                    var basicColor = basicColor



                            throw RuntimeException()
}


open fun saveFontAtlasAsFile()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getFontBitmap(gl: GL10, filename: String, cellSize: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var gl = gl


                    var filename = filename


                    var cellSize = cellSize


                    var basicColor = basicColor



                            throw RuntimeException()
}


open fun getFontWidths(filename: String, fontSize: Int)
        //nullable = true from not(false or (false and false)) = true
: IntArray{

                    var filename = filename


                    var fontSize = fontSize



                            throw RuntimeException()
}


}
                
            

