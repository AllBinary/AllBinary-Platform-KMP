
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.rms.RecordStore
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.persistance.PlatformRecordIdUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BasicPersitance
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val persistanceStrings: PersistanceStrings = PersistanceStrings.getInstance()!!
            

    private val platformRecordIdUtil: PlatformRecordIdUtil = PlatformRecordIdUtil.getInstance()!!
            

    private val recordId: String

    val valueList: BasicArrayList = BasicArrayList()

    val idList: BasicArrayList = BasicArrayList()
protected constructor        (recordId: String)
            : super()
        {

                    var recordId = recordId
this.recordId= recordId
}


                @Throws(Exception::class)
            
open fun deleteRecoreStore(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
RecordStore.deleteRecordStore(this.getRecordId(abeClientInformation))
}


                @Throws(Exception::class)
            
open fun deleteAll(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation

    var size: Int = idList!!.size()!!
            





                        for (index in 0 until size)


        {
    var integer: Integer = this.idList!!.objectArray[index]!! as Integer

this.delete(abeClientInformation, integer.toInt())
}

this.clear()
}


                @Throws(Exception::class)
            
open fun delete(abeClientInformation: AbeClientInformationInterface, deleteId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var deleteId = deleteId

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            logUtil!!.put(StringMaker().
                            append(this.persistanceStrings!!.DELETING_WITH_ID)!!.append(deleteId)!!.toString(), this, this.commonStrings!!.delete)
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
                                    PreLogUtil.put(this.persistanceStrings!!.CLOSING_RECORDSTORE, this, this.commonStrings!!.delete)
recordStore!!.closeRecordStore()

                                    }
                                

         }
        
}


open fun getRecordId(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platformRecordIdUtil!!.getRecordId(abeClientInformation, recordId)
}


open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.valueList
}


open fun getIds()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.idList
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.valueList!!.clear()
this.idList!!.clear()
}


}
                
            

