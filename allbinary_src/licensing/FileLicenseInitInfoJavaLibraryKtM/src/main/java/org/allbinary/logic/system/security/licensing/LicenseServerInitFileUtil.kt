
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import java.io.OutputStream
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.FileStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.logic.io.file.SimpleFileUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class LicenseServerInitFileUtil
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val NULL_OUTPUT_STREAM: OutputStream = SimpleFileUtil.nullOutputStream()!!

    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var filePath: String = LicenseInitInfoUtil.getInstance()!!.INITFILENAME

LicenseInitInfoUtil.getInstance()!!.setFilePath(StringUtil.getInstance()!!.EMPTY_STRING)

    
                        if(FileFactory.getInstance()!!.isFile(filePath))
                        
                                    {
                                    this.logUtil!!.putF("Using Existing License File", this, this.commonStrings!!.INIT)

                                    }
                                
                        else {
                            this.write()

                        }
                            
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e)
}

}


    open fun write()
        //nullable = true from not(false or (false and true)) = true
{

    var fileOutputStream: OutputStream = this.NULL_OUTPUT_STREAM


        try {
            
    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var filePath: String = LicenseInitInfoUtil.getInstance()!!.INITFILENAME


    var inputStream: InputStream = resourceUtil!!.getResourceAsStream(filePath)!!

this.logUtil!!.putF("Writing Default License File", this, this.commonStrings!!.INIT)

    var fileStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!

fileOutputStream= fileStreamFactory!!.getFileOutputStreamInstance(StringUtil.getInstance()!!.EMPTY_STRING, filePath)

    var b: Int= 0


    var index: Int = 0


        while(true)
        {
b= inputStream!!.read()

    
                        if(b ==  -1)
                        
                                    {
                                    break;

                    

                                    }
                                
fileOutputStream!!.write(b)
index++
}

this.logUtil!!.putF("Wrote Bytes: " +index, this, this.commonStrings!!.INIT)
fileOutputStream!!.flush()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e)
}

         finally {
            StreamUtil.getInstance()!!.close(fileOutputStream)

         }
        
}


}
                
            

