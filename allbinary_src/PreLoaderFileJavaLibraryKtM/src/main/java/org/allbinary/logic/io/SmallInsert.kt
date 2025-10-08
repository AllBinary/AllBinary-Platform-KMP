
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
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.DataOutputStream
import java.io.FileOutputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.string.CommonStrings

open public class SmallInsert
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


    open fun atBeginning(text: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var text = text

        try {
            
    var idFile: FileOutputStream = FileOutputStream(this.fileName)


    var idOutData: DataOutputStream = DataOutputStream(idFile)

idOutData!!.writeBytes(text +this.string)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "insertAtBeginning", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


    open fun after(text: String, after: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var text = text
var after = after

        try {
            
    var index: Int = this.string.indexOf(after)!!


    
                        if(index < 0)
                        
                                    {
                                    System.out.println("No such start: " +after +" in: " +this.string)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
index= index +after.length

    var start: String = this.string.substring(0, index)!!


    var end: String = this.string.substring(index +1, this.string.length)!!


    var idFile: FileOutputStream = FileOutputStream(this.fileName)


    var idOutData: DataOutputStream = DataOutputStream(idFile)

idOutData!!.writeBytes(start +text +end)
idOutData!!.close()
idFile!!.close()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "after", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


    open fun atEnd(text: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var text = text

        try {
            
    var idFile: FileOutputStream = FileOutputStream(this.fileName)


    var idOutData: DataOutputStream = DataOutputStream(idFile)

idOutData!!.writeBytes(this.string +text)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.IDLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "insertAtEnd", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

