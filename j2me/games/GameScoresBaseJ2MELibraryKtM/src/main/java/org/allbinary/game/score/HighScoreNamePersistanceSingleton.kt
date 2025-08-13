
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
        package org.allbinary.game.score



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import javax.microedition.rms.RecordEnumeration
import javax.microedition.rms.RecordStore
import javax.microedition.rms.RecordStoreException
import org.allbinary.game.GameInfo
import org.allbinary.game.configuration.persistance.NullRecordComparator
import org.allbinary.game.configuration.persistance.NullRecordFilter
import org.allbinary.game.configuration.persistance.NullRecordStore
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.java.exception.ExceptionUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.persistance.PlatformRecordIdUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class HighScoreNamePersistanceSingleton
            : Object
         {
        

        companion object {
            
    private var SINGLETON: HighScoreNamePersistanceSingleton = HighScoreNamePersistanceSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HighScoreNamePersistanceSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val platformRecordIdUtil: PlatformRecordIdUtil = PlatformRecordIdUtil.getInstance()!!
            

    private val RECORD_ID: String = "_SN"

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var nameBasicArrayList: BasicArrayList = BasicArrayList()

open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.name= StringUtil.getInstance()!!.EMPTY_STRING
}


                @Throws(Exception::class)
            
open fun deleteAll(abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo

    var size: Int = nameBasicArrayList!!.size()!!
            





                        for (index in 0 until size)


        {
    var integer: Integer = this.nameBasicArrayList!!.objectArray[index]!! as Integer

this.delete(abeClientInformation, gameInfo, integer.toInt())
}

this.clear()
}


open fun getRecordId(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platformRecordIdUtil!!.getRecordId(abeClientInformation, RECORD_ID)
}


                @Throws(Exception::class)
            
open fun delete(abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo, deleteId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo


                    var deleteId = deleteId

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            logUtil!!.put(StringMaker().
                            append(
                            "Deleting: ")!!.append(deleteId)!!.toString(), this, commonStrings!!.delete)
recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)
recordStore!!.deleteRecord(deleteId)
} catch(e: Exception)
            {


                            throw e
}

         finally {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(
                            "Closing RecordStore", this, commonStrings!!.delete)
recordStore!!.closeRecordStore()

                                    }
                                

         }
        
}


open fun getIds()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.nameBasicArrayList
}


open fun load(abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            
    
                        if(this.name == StringUtil.getInstance()!!.EMPTY_STRING)
                        
                                    {
                                    
    var LOADING_ID: String = "Loading id: "

recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var recordEnum: RecordEnumeration = recordStore!!.enumerateRecords(NullRecordFilter.NULL_RECORD_FILTER, NullRecordComparator.NULL_RECORD_COMPARATOR, true)!!
            


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var recordAsBytes: ByteArray


    var byteArrayInputStream: ByteArrayInputStream


    var inputStream: DataInputStream


        while(recordEnum!!.hasNextElement())
        {
    var id: Int = recordEnum!!.nextRecordId()!!
            

logUtil!!.put(StringMaker().
                            append(LOADING_ID)!!.append(id)!!.toString(), this, commonStrings!!.LOAD)
recordAsBytes= recordStore!!.getRecord(id)
byteArrayInputStream= ByteArrayInputStream(recordAsBytes)
inputStream= DataInputStream(byteArrayInputStream)

        while(inputStream!!.available() > 0)
        {this.name= inputStream!!.readUTF()
}

nameBasicArrayList!!.add(smallIntegerSingletonFactory!!.getInstance(id))
}


                                    }
                                
} catch(e: Exception)
            {this.save(abeClientInformation, gameInfo, this.name)
logUtil!!.put(StringMaker().
                            append(commonStrings!!.EXCEPTION_LABEL)!!.append(ExceptionUtil.getInstance()!!.getStackTrace(e))!!.toString(), this, commonStrings!!.LOAD)
}

         finally {
            
        try {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(
                            "Closing RecordStore", this, commonStrings!!.LOAD)
recordStore!!.closeRecordStore()

                                    }
                                
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.LOAD, e)
}


         }
        



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun save(abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo, name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo


                    var name = name

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            logUtil!!.put(StringMaker().
                            append(
                            "Saving: ")!!.append(name)!!.toString(), this, commonStrings!!.SAVE)
recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var outputStream: DataOutputStream = DataOutputStream(byteArrayOutputStream)

outputStream!!.writeUTF(name)

    var savedGameBytes: ByteArray = byteArrayOutputStream!!.toByteArray()!!
            

recordStore!!.addRecord(savedGameBytes, 0, savedGameBytes!!.size)
this.name= name
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.SAVE, e)
}

         finally {
            
        try {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(
                            "Closing RecordStore", this, commonStrings!!.SAVE)
recordStore!!.closeRecordStore()

                                    }
                                
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.SAVE, e)
}


         }
        
}


}
                
            

