
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
        package org.allbinary.game.configuration.persistance




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.util.Hashtable
import javax.microedition.rms.RecordEnumeration
import javax.microedition.rms.RecordStore
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonSeps
import org.allbinary.util.HashtableUtil

open public class KeyValuePersistance : BasicPersitance {
        
protected constructor (recordId: String)                        

                            : super(recordId){
    //var recordId = recordId


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    open fun loadAll(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
this.loadAll(abeClientInformation, 1)
}


                @Throws(Exception::class)
            
    open fun loadAll(abeClientInformation: AbeClientInformationInterface, size: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
var size = size

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var recordEnum: RecordEnumeration = recordStore!!.enumerateRecords(NullRecordFilter.NULL_RECORD_FILTER, NullRecordComparator.NULL_RECORD_COMPARATOR, true)!!


    var hashtable: Hashtable<String, String>


    var name: String


    var value: String


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()


    var recordAsBytes: ByteArray


    var byteArrayInputStream: ByteArrayInputStream


    var inputStream: DataInputStream


        while(recordEnum!!.hasNextElement())
        {

    var id: Int = recordEnum!!.nextRecordId()!!

stringBuffer!!.delete(0, stringBuffer!!.length())
logUtil!!.put(stringBuffer!!.append(this.persistanceStrings!!.LOADING_ID)!!.append(id)!!.toString(), this, this.persistanceStrings!!.LOAD_ALL)
recordAsBytes= recordStore!!.getRecord(id)

    
                        if(recordAsBytes != 
                                    null
                                )
                        
                                    {
                                    byteArrayInputStream= ByteArrayInputStream(recordAsBytes)
inputStream= DataInputStream(byteArrayInputStream)
hashtable= Hashtable<String, String>()




                        for (index in 0 until size)

        {
name= inputStream!!.readUTF()
inputStream!!.readUTF()
value= inputStream!!.readUTF()
hashtable.put(name, value)
}

this.valueList!!.add(hashtable)
this.idList!!.add(smallIntegerSingletonFactory!!.getInstance(id))

                                    }
                                
}

} catch(e: Exception)
            {



                            throw e
}

         finally {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(this.persistanceStrings!!.CLOSING_RECORDSTORE, this, this.persistanceStrings!!.LOAD_ALL)
recordStore!!.closeRecordStore()

                                    }
                                

         }
        
}


                @Throws(Exception::class)
            
    open fun save(abeClientInformation: AbeClientInformationInterface, hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
    //var hashtable = hashtable

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            logUtil!!.put(StringMaker().
                            append(this.persistanceStrings!!.SAVING)!!.append(StringUtil.getInstance()!!.toString(hashtable))!!.toString(), this, this.commonStrings!!.SAVE)
recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var outputStream: DataOutputStream = DataOutputStream(byteArrayOutputStream)


    var value: String


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!


    var anyType: Any


    var size: Int = objectArray!!.size
                





                        for (index in 0 until size)

        {
outputStream!!.writeUTF(objectArray[index]!! as String)
outputStream!!.writeUTF(commonSeps!!.EQUALS)
anyType= objectArray[index]!! as Object
value= hashtable.get(anyType as Object) as String
outputStream!!.writeUTF(value)
}


    var savedGameBytes: ByteArray = byteArrayOutputStream!!.toString()!!.encodeToByteArray()!!

recordStore!!.addRecord(savedGameBytes, 0, savedGameBytes!!.size)
} catch(e: Exception)
            {



                            throw e
}

         finally {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(this.persistanceStrings!!.CLOSING_RECORDSTORE, this, this.commonStrings!!.SAVE)
recordStore!!.closeRecordStore()

                                    }
                                

         }
        
}


    open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>{
var index = index

    var hashtable: Hashtable<Any, Any> = this.valueList!!.objectArray[index]!! as Hashtable<Any, Any>




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

