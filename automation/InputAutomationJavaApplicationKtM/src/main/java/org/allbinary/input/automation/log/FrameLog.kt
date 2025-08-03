
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
        package org.allbinary.input.automation.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileOutputStream
import java.util.Vector
import org.allbinary.input.automation.ImageOutputData
import org.allbinary.logic.java.number.LongUtil
import org.allbinary.logic.string.StringMaker

open public class FrameLog
            : Object
         {
        

        companion object {


    private var frameBytes: ByteArray = String(
                            "Frame: ").
                            encodeToByteArray()!!
            

    private var info: ByteArray = String(
                            "Info: \n").
                            encodeToByteArray()!!
            

    private var actions: ByteArray = String(
                            "Actions: \n").
                            encodeToByteArray()!!
            


        }
            
    private val frame: Long

    private var infoStringBuffer: StringMaker = StringMaker()

    private var actionsStringBuffer: StringMaker = StringMaker()
public constructor        (frame: Long)
            : super()
        {

                    var frame = frame
this.frame= frame
}


open fun addInfo(infoString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var infoString = infoString
this.infoStringBuffer!!.append(infoString)
}


open fun addActions(vectorOfStrings: Vector<String>)
        //nullable = true from not(false or (false and false)) = true
{

                    var vectorOfStrings = vectorOfStrings

    var size: Int = vectorOfStrings!!.size!!
            





                        for (index in 0 until size)


        {this.addAction(vectorOfStrings!!.get(index) as String)
}

}


open fun addAction(action: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var action = action
this.actionsStringBuffer!!.append(action)
this.actionsStringBuffer!!.append(
                            "\n")
}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{
    var filePathStringBuffer: StringMaker = StringMaker()

filePathStringBuffer!!.append(ImageOutputData.SAVE_PATH)
filePathStringBuffer!!.append(LongUtil.fillIn(frame!!.toString()))
filePathStringBuffer!!.append(
                            ".txt")

    var filePath: String = filePathStringBuffer!!.toString()!!
            


    var fileOutputStream: FileOutputStream = FileOutputStream(File(filePath))

fileOutputStream!!.write(frameBytes)
fileOutputStream!!.write(getFrame()!!.toString()!!.encodeToByteArray())
fileOutputStream!!.write(
                            '\n')
fileOutputStream!!.write(info)
fileOutputStream!!.write(infoStringBuffer!!.toString()!!.encodeToByteArray())
fileOutputStream!!.write(
                            '\n')
fileOutputStream!!.write(actions)
fileOutputStream!!.write(actionsStringBuffer!!.toString()!!.encodeToByteArray())
fileOutputStream!!.close()
}


open fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frame
}


}
                
            

