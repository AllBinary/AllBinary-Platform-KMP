
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
        package org.allbinary.data.generator



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbDataInputStream
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.AbFileOutputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.string.CommonStrings

open public class UniqueIdGenerator
            : Object
        
                , IdGeneratorInterface {
        

        companion object {
            
    val EXT: String = ".unq"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var newFile: AbFile

    private var id: Long = 0
public constructor        ()
            : super()
        {}


open fun initialize(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            newFile!!.createNewFile()

    var idData: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(newFile)!!
            

idData!!.writeLong(value)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "initialize", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun setFile(filePathName: String, name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePathName = filePathName


                    var name = name
newFile= AbFile(filePathName)
}


                @Throws(IOException::class)
            
open fun getNext()
        //nullable = true from not(false or (false and true)) = true
: String{
    var idData: AbDataInputStream = 
                null
            


    var idOutData: AbDataOutputStream = 
                null
            


        try {
            
    var idFile: AbFileInputStream = AbFileInputStream(this.newFile)

idData= AbDataInputStream(idFile)
id= idData!!.readLong()

    var idOutFile: AbFileOutputStream = AbFileOutputStream(this.newFile)

idOutData= AbDataOutputStream(idOutFile)
idOutData!!.writeLong(id +1)

    var idLong: Long = id as Long




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return idLong!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getNext", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error"
}

         finally {
            StreamUtil.getInstance()!!.close(idData)
StreamUtil.getInstance()!!.close(idOutData)

         }
        
}


}
                
            

