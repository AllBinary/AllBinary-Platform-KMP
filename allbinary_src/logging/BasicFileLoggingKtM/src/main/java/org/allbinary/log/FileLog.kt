
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
        package org.allbinary.log




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.RandomAccessFile
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.communication.log.LogFormatUtil

open public class FileLog
            : Object
         {
        

        companion object {
            
    private val stringUtil: StringUtil = StringUtil.getInstance()!!

    private val logLength: Long = 33000000

    private val logPath: String = "g:\\log\\"

    private val extension: String = .toCharArray()

    private val fileName: String = .toCharArray()

    private val backupFileName: String = fileName!!.concat(".bak")!!

    private val ORG_ALLBINARY: String = "org.allbinary: "

    private var firstTime: Boolean = true

    private var logFile: File = File(logPath, fileName)

    private var logFileBak: File

    private var fileOut: BufferedWriter

    private var backupIndex: Int= 0
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun createLogFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            logFile= File(logPath, fileName)

    
                        if(!firstTime)
                        
                                    {
                                    fileOut= BufferedWriter(FileWriter(logFile))

                                    }
                                
                        else {
                            firstTime= false

    var raFile: RandomAccessFile = RandomAccessFile(logFile, "rw")

raFile!!.seek(raFile!!.length())
fileOut= BufferedWriter(FileWriter(raFile!!.getFD()))

                        }
                            

    var canWrite: Boolean = logFile!!.canWrite()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return canWrite
} catch(e: Exception)
            {
System.out.println("Error Creating Log: " +e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun createLogFileBackup()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            logFileBak= File(logPath, StringBuilder().
                            append(backupFileName)!!.append(CommonSeps.getInstance()!!.PERIOD)!!.append(backupIndex)!!.toString())

        while(logFileBak!!.isFile())
        {
backupIndex++
logFileBak= File(logPath, StringBuilder().
                            append(backupFileName)!!.append(CommonSeps.getInstance()!!.PERIOD)!!.append(backupIndex)!!.toString())
}


    var line: String = .toCharArray()


    var tmpOut: BufferedWriter = BufferedWriter(FileWriter(logFileBak))


    var tmpIn: BufferedReader = BufferedReader(FileReader(logFile))


        while((line= tmpIn!!.readLine()) != 
                                    null
                                )
        {
tmpOut!!.write(line, 0, line.length)
tmpOut!!.newLine()
}

tmpOut!!.flush()
tmpOut!!.close()
tmpIn!!.close()
logFile!!.delete()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
System.out.println("Error Creating Backup: " +e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var specialMessage = specialMessage
var anyType = anyType
var functionName = functionName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return put(specialMessage, anyType, functionName, 
                            null)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Throwable)
        //nullable = true from not(false or (false and false)) = true
: String{
var specialMessage = specialMessage
var anyType = anyType
var functionName = functionName
var exception = exception

        try {
            
    
                        if(firstTime == true)
                        
                                    {
                                    createLogFileBackup()

    
                        if(createLogFile() == false)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()

                                    }
                                

                                    }
                                

    var length: Long = logFile!!.length()!!


    
                        if(length > logLength)
                        
                                    {
                                    
    
                        if(!(createLogFileBackup()) || createLogFile() == false)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()

                                    }
                                

                                    }
                                

    var className: String = NULL_STRING.toCharArray()


    
                        if(functionName == 
                                    null
                                )
                        functionName= NULL_STRING.toCharArray()

    
                        if(specialMessage == 
                                    null
                                )
                        specialMessage= NULL_STRING.toCharArray()

    
                        if(anyType!!::class.toString()!! != 
                                    null
                                )
                        className= anyType!!::class.toString()!!.toCharArray().concatToString()
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

fileOut!!.write(message, 0, message.length)
fileOut!!.newLine()
fileOut!!.flush()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()
} catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun put(specialMessage: String, className: String, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: String{
    //var specialMessage = specialMessage
    //var className = className
    //var functionName = functionName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return put(specialMessage, className, functionName, 
                            null)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun put(specialMessage: String, className: String, functionName: String, exception: Exception)
        //nullable = true from not(false or (false and false)) = true
: String{
var specialMessage = specialMessage
    //var className = className
var functionName = functionName
    //var exception = exception

        try {
            
    
                        if(firstTime == true)
                        
                                    {
                                    createLogFileBackup()

    
                        if(createLogFile() == false)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()

                                    }
                                

                                    }
                                

    var length: Long = logFile!!.length()!!


    
                        if(length > logLength)
                        
                                    {
                                    
    
                        if(!(createLogFileBackup()) || createLogFile() == false)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()

                                    }
                                

                                    }
                                

    
                        if(functionName == 
                                    null
                                )
                        functionName= NULL_STRING.toCharArray()

    
                        if(specialMessage == 
                                    null
                                )
                        specialMessage= NULL_STRING.toCharArray()

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

fileOut!!.write(message, 0, message.length)
fileOut!!.newLine()
fileOut!!.flush()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()
} catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return .toCharArray()
}

}


open fun getFilePath()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return logPath +fileName
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

