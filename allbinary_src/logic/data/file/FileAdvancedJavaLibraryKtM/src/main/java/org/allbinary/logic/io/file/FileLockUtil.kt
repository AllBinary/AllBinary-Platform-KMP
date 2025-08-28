
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
        package org.allbinary.logic.io.file




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.channels.FileChannel
import java.nio.channels.FileLock
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbFileOutputStream
import org.allbinary.logic.io.StreamUtil

open public class FileLockUtil
            : Object
         {
        

        companion object {
            
    private val instance: FileLockUtil = FileLockUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileLockUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {
}


                @Throws(Exception::class)
            
open fun getAll(vector: Vector, isReturnOnFailure: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var vector = vector
var isReturnOnFailure = isReturnOnFailure

    var fileLockVector: Vector = Vector()


    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var file: AbFile = vector.get(index) as AbFile


    var fileLock: FileLock = getLock(file)!!


    
                        if(fileLock != 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("File Lock Obtained: " +file.getAbsolutePath(), this, "getAll")
fileLockVector!!.add(fileLock)

                                    }
                                
                             else 
    
                        if(isReturnOnFailure)
                        
                                    {
                                    logUtil!!.put("Total Locks Obtained: " +fileLockVector!!.size, this, "getAll")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileLockVector

                                    }
                                
}

logUtil!!.put("Total Locks Obtained: " +fileLockVector!!.size, this, "getAll")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileLockVector
}


                @Throws(Exception::class)
            
open fun getAllPossible(vector: Vector)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var vector = vector



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getAll(vector, false)
}


                @Throws(Exception::class)
            
open fun getAllOrNone(vector: Vector)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var vector = vector

    var fileLockVector: Vector = getAll(vector, true)!!


    
                        if(vector.size != fileLockVector!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Vector()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileLockVector

                        }
                            
}


                @Throws(Exception::class)
            
open fun getLock(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: FileLock{
var file = file

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getLock(AbFileOutputStream(file, true))
} catch(e: Exception)
            {
logUtil!!.put("Exception returns null", this, "getLock", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

         finally {
            
         }
        
}


                @Throws(Exception::class)
            
open fun getLock(fileOutputStream: AbFileOutputStream)
        //nullable = true from not(false or (false and false)) = true
: FileLock{
var fileOutputStream = fileOutputStream

        try {
            
    var fileLock: FileLock = getLock(fileOutputStream!!.getChannel())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileLock
} catch(e: Exception)
            {
logUtil!!.put("Exception returns null", this, "getLock", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

         finally {
            logUtil!!.put("Finally - Closing FileOutputStream", this, "getLock")
StreamUtil.getInstance()!!.close(fileOutputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun getLock(fileChannel: FileChannel)
        //nullable = true from not(false or (false and false)) = true
: FileLock{
var fileChannel = fileChannel

        try {
            
    var fileLock: FileLock = fileChannel!!.tryLock()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileLock
} catch(e: Exception)
            {
logUtil!!.put("Exception returns null", this, "getLock", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

         finally {
            logUtil!!.put("Finally - Closing FileChannel", this, "getLock")
fileChannel!!.close()

         }
        
}


}
                
            

