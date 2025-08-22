
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
        package org.allbinary.input.automation.module.actions.script.condition.processors.output




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.input.media.image.InputImageIOInterfaceFactory
import org.allbinary.input.media.image.InputImageType
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.io.ImageIOInterface
import org.allbinary.string.CommonStrings

open public class ImageActionScriptOutputProcessor
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun process(imageActionScriptOutputInterface: ImageActionScriptOutputInterface, frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageActionScriptOutputInterface = imageActionScriptOutputInterface


                    var frame = frame

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Start - Processing at: " +imageActionScriptOutputInterface!!.toString(), "ImageActionScriptOutputProcessor", commonStrings!!.PROCESS)

    var imageTypes: ImageTypes = imageActionScriptOutputInterface!!.getImageTypes()!!


    var vector: Vector = imageTypes!!.getVector()!!


    var size: Int = vector.size!!





                        for (index in 0 until size)


        {
    var imageType: InputImageType = vector.get(index) as InputImageType


    var imageIOInterface: ImageIOInterface = InputImageIOInterfaceFactory.getInstance(imageType)!!

imageIOInterface!!.save(frame)
}

}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {}


}
                
            

