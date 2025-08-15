
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
        
import java.io.DataInputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class LineReader
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var fileName: String

    private var string: String

    private var index: Int = 0

    private var idFile: AbFileInputStream

    private var idData: DataInputStream
public constructor        (fileName: String)
            : super()
        {

                    var fileName = fileName

        try {
            
    var bytes: ByteArray = ByteArray(100000)

this.fileName= fileName
idFile= AbFileInputStream(fileName)
idFile!!.read(bytes)
string= bytes.decodeToString()
} catch(e: Exception)
            {logUtil!!.put("File: " +fileName, this, "LineReader", e)


                            {
                            
                            }
                    
}

}


open fun hasNext()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var nextIndex: Int = string.indexOf("\n", index)!!
            


    
                        if(nextIndex ==  -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "hasNext", e)


                            {
                            
                            }
                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(Exception::class)
            
open fun next()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var nextIndex: Int = string.indexOf("\n", index)!!
            


    
                        if(nextIndex ==  -1)
                        
                                    {
                                    


                            throw Exception("next() should have been called first")

                                    }
                                

    var temp: String = string.substring(index, nextIndex)!!
            

index= nextIndex +1



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return temp
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "next", e)


                            {
                            
                            }
                    



                            throw e
}

}


}
                
            

