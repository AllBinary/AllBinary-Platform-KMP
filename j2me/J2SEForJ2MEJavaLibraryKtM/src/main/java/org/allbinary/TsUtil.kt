
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary




        import java.lang.Object        
        
        import java.lang.InterruptedException
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Displayable
import javax.microedition.lcdui.Form
import javax.microedition.rms.InvalidRecordIDException
import javax.microedition.rms.RecordStore
import javax.microedition.rms.RecordStoreException
import javax.microedition.rms.RecordStoreNotOpenException
import org.allbinary.logic.NullUtil

open public class TsUtil
            : Object
         {
        
companion object {
            
    private val instance: TsUtil = TsUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TsUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TsUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun hashCode(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType!!.hashCode()
}


                @Throws(InterruptedException::class)
            
    open fun waitFor(any: Any, timeoutMillis: Long)
        //nullable = true from not(false or (false and false)) = true
{
var any = any
    //var timeoutMillis = timeoutMillis

    var anyType: Object = any as Object

anyType!!.wait(timeoutMillis)
}


                @Throws(RecordStoreNotOpenException::class, InvalidRecordIDException::class, RecordStoreException::class)
            
    open fun getRecord(anyType: Any, recordId: Int)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{
    //var anyType = anyType
    //var recordId = recordId

    var recordStore: RecordStore = anyType as RecordStore


    var data: ByteArray


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {
data= ByteArray(recordStore!!.getRecordSize(recordId))
recordStore!!.getRecord(recordId, data, 0)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if(data.size < 1) {
                            
                            NullUtil.getInstance()!!.NULL_BYTE_ARRAY
                        
                            } else {
                            data
                            }
    
}


    open fun compareTo(a: String, b: String)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var a = a
    //var b = b



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return a.compareTo(b)
}


    open fun matchIgnoreCase(a: String, b: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var a = a
    //var b = b



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return a.equals(b, ignoreCase = true)
}


    open fun isItemListener(owner: Displayable)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var owner = owner

    
                        if(owner is Form)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

