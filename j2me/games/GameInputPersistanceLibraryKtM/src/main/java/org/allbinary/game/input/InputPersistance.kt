
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.util.Hashtable
import javax.microedition.rms.RecordEnumeration
import javax.microedition.rms.RecordStore
import org.allbinary.game.configuration.persistance.BasicPersitance
import org.allbinary.game.configuration.persistance.NullRecordComparator
import org.allbinary.game.configuration.persistance.NullRecordFilter
import org.allbinary.game.configuration.persistance.NullRecordStore
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList
import org.allbinary.util.HashtableUtil

open public class InputPersistance : BasicPersitance {
        

    private val hashtableUtil: HashtableUtil = HashtableUtil.getInstance()!!
            
public constructor        (name: String)                        

                            : super(name){

                    var name = name


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun loadAll(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var recordEnum: RecordEnumeration = recordStore!!.enumerateRecords(NullRecordFilter.NULL_RECORD_FILTER, NullRecordComparator.NULL_RECORD_COMPARATOR, true)!!
            


    var gameActionInputId: Long= 0


    var inputId: Long= 0


    var gameActionInput: Input


    var input: Input


    var hashtable: Hashtable<Any, Any>


    var gameKeyFactory: GameKeyMappingFactory = GameKeyMappingFactory.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()


    var inputFactory: InputFactory = InputFactory.getInstance()!!
            


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


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
hashtable= Hashtable<Any, Any>()

    var value: Int= 0


        while(inputStream!!.available() > 0)
        {
    var gameActionInputIdAsString: String = inputStream!!.readUTF()!!
            

value= Integer.parseInt(gameActionInputIdAsString)
gameActionInputId= value.toLong()
inputStream!!.readUTF()
value= Integer.parseInt(inputStream!!.readUTF())
inputId= value.toLong()
gameActionInput= gameKeyFactory!!.getInstance(gameActionInputId.toInt())
input= inputFactory!!.getInstance(inputId.toInt())

    
                        if(input == 
                                    null
                                 || gameActionInput == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())

    
                        if(input == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.persistanceStrings!!.ERROR_LOADING_ID)
stringBuffer!!.append(inputId)
stringBuffer!!.append(this.persistanceStrings!!.GAME_ACTION_INPUT)
stringBuffer!!.append(gameActionInputId)
PreLogUtil.put(stringBuffer!!.toString(), this, this.persistanceStrings!!.LOAD_ALL)

                                    }
                                

    
                        if(gameActionInput == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(this.persistanceStrings!!.ERROR_LOADING)
stringBuffer!!.append(gameActionInputId)
stringBuffer!!.append(this.persistanceStrings!!.ID)
stringBuffer!!.append(inputId)
PreLogUtil.put(stringBuffer!!.toString(), this, this.persistanceStrings!!.LOAD_ALL)

                                    }
                                

                                    }
                                
                        else {
                            
                        }
                            
hashtable.put(input, gameActionInput)
}

this.valueList!!.add(hashtable)
this.idList!!.add(smallIntegerSingletonFactory!!.getInstance(id))

                                    }
                                
                        else {
                            
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

                    var abeClientInformation = abeClientInformation


                    var hashtable = hashtable

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            
    var stringBuffer: StringMaker = StringMaker()

PreLogUtil.put(stringBuffer!!.append(this.persistanceStrings!!.SAVING)!!.append(StringUtil.getInstance()!!.toString(hashtable))!!.toString(), this, this.commonStrings!!.SAVE)
recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var outputStream: DataOutputStream = DataOutputStream(byteArrayOutputStream)


    var gameActionInput: Input


    var list: BasicArrayList


    var input: Input


    var savedGameBytes: ByteArray


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var inputObjectArray: Array<Any?> = hashtableUtil!!.getKeysAsArray(hashtable)!!
            


    var size: Int = inputObjectArray!!.size
                





                        for (index in 0 until size)


        {gameActionInput= inputObjectArray[index]!! as Input
list= hashtable.get(inputObjectArray[index]!! as Object) as BasicArrayList




                        for (index2 in 0 until list.size()!!)


        {
    var gameActionInputIdAsString: String = smallIntegerSingletonFactory!!.getInstance(gameActionInput!!.getId())!!.toString()!!
            

outputStream!!.writeUTF(gameActionInputIdAsString)
outputStream!!.writeUTF(commonSeps!!.EQUALS)
input= list.objectArray[index2]!! as Input

    var inputIdAsString: String = smallIntegerSingletonFactory!!.getInstance(input.getId())!!.toString()!!
            

outputStream!!.writeUTF(inputIdAsString)
}

}

savedGameBytes= byteArrayOutputStream!!.toByteArray()
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


}
                
            

