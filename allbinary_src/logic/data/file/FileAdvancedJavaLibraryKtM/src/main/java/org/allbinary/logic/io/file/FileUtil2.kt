
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.logic.io.file




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.StreamUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class FileUtil2
            : Object
         {
        
companion object {
            
    private val instance: FileUtil2 = FileUtil2()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileUtil2{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val streamUtil: StreamUtil = StreamUtil.getInstance()!!
private constructor ()
            : super()
        {
}


    open fun loadFileAsList(file: AbFile, max: Int, byteArray1: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var file = file
    //var max = max
    //var byteArray1 = byteArray1

    var inputStream: AbFileInputStream = 
                null
            


        try {
            inputStream= AbFileInputStream(file)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SimpleFileUtil.getInstance()!!.loadFileAsList(inputStream, max, byteArray1)
}


}
                
            

