
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
        package org.allbinary.logic.communication.http.file.upload




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.io.UnsupportedEncodingException
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings
import org.apache.commons.fileupload.FileItem
import org.apache.commons.fileupload.FileItemHeaders
import org.apache.commons.fileupload.FileItemUtil

open public class AbFileItem
            : Object
        
                , FileItem {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val name: String

    private var fieldName: String

    private val byteArray: ByteArray
public constructor        (name: String, fieldName: String, byteArray: ByteArray)
            : super()
        

        Updates for KMP build        
        {
var name = name
var fieldName = fieldName
var byteArray = byteArray
this.name= name
this.fieldName= fieldName
this.byteArray= byteArray
}


                @Throws(IOException::class)
            
open fun getInputStream()
        //nullable = true from not(false or (false and true)) = true
: InputStream

        Updates for KMP build        
        {



                            throw IOException(commonStrings!!.NOT_IMPLEMENTED)
}


open fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun isInMemory()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.byteArray!!.size
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: ByteArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.byteArray
}


                @Throws(UnsupportedEncodingException::class)
            
open fun getString(encoding: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var encoding = encoding



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return byteArray.decodeToString()
}


open fun getString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FileItemUtil.getInstance()!!.getString(byteArray)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getString", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

}


                @Throws(Exception::class)
            
open fun write(file: File)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var file = file



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun write(file: AbFile)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var file = file



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun delete()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, "delete()")
}


open fun getFieldName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fieldName
}


open fun setFieldName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var name = name
this.fieldName= name
}


open fun isFormField()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.fieldName))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


open fun setFormField(state: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var state = state
}


                @Throws(IOException::class)
            
open fun getOutputStream()
        //nullable = true from not(false or (false and true)) = true
: OutputStream

        Updates for KMP build        
        {



                            throw IOException(commonStrings!!.NOT_IMPLEMENTED)
}


open fun getHeaders()
        //nullable = true from not(false or (false and true)) = true
: FileItemHeaders

        Updates for KMP build        
        {



                            throw RuntimeException(commonStrings!!.NOT_IMPLEMENTED)
}


open fun setHeaders(fih: FileItemHeaders)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var fih = fih



                            throw RuntimeException(commonStrings!!.NOT_IMPLEMENTED)
}


}
                
            

