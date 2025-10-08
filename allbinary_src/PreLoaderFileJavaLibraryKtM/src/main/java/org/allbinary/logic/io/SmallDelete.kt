
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
        
import java.io.DataOutputStream
import java.io.FileOutputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.string.CommonStrings

open public class SmallDelete
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var fileName: String

    private var string: String
public constructor (fileName: String)
            : super()
        {
var fileName = fileName
this.fileName= fileName
string= FileUtil.getInstance()!!.readAsString(fileName)
}


    open fun deleteAtStart(start: String, end: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var start = start
var end = end

        try {
            
    var beginIndex: Int= 0
var endIndex: Int= 0

beginIndex= this.string.indexOf(start)
endIndex= this.string.indexOf(end)

    
                        if(endIndex > beginIndex && beginIndex >= 0 && endIndex >= 0 && beginIndex < 10 && endIndex < 525)
                        
                                    {
                                    
    var text: String = this.string.substring(endIndex, this.string.length)!!


    var idFile: FileOutputStream = FileOutputStream(this.fileName)


    var idOutData: DataOutputStream = DataOutputStream(idFile)

idOutData!!.writeBytes(text)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "deleteAtStart", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


    open fun deleteBetween(start: String, end: String, newText: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var start = start
var end = end
var newText = newText

        try {
            
    var beginIndex: Int= 0
var endIndex: Int= 0

beginIndex= this.string.indexOf(start)
endIndex= this.string.indexOf(end)

    
                        if(endIndex > beginIndex && beginIndex >= 0 && endIndex >= 0 && beginIndex < 50 && endIndex < 425)
                        
                                    {
                                    
    var newStart: String = this.string.substring(0, beginIndex)!!


    var text: String = this.string.substring(endIndex +end.length, this.string.length)!!


    var idFile: FileOutputStream = FileOutputStream(this.fileName)


    var idOutData: DataOutputStream = DataOutputStream(idFile)

idOutData!!.writeBytes(newStart +newText +text)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "deleteAtStart", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

