
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
        package org.allbinary.logic.io




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.BufferedReader
import java.io.FileReader
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class BufferedLineReader
            : Object
         {
        

    private val tmpIn: BufferedReader
public constructor        (file: AbFile)
            : super()
        

        Updates for KMP build        
        {
var file = file
this.tmpIn= BufferedReader(FileReader(AbFileNativeUtil.get(file)))
}


open fun readUpToLines(readAheadIndex: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var readAheadIndex = readAheadIndex
}


                @Throws(Exception::class)
            
open fun readLine()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tmpIn!!.readLine()
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getCurrent()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

