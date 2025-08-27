
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.rms.RecordEnumeration
import javax.microedition.rms.RecordStore
import org.allbinary.game.configuration.persistance.BasicPersitance
import org.allbinary.game.configuration.persistance.NullRecordComparator
import org.allbinary.game.configuration.persistance.NullRecordFilter
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
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

    var recordStore: RecordStore = RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)!!


    var recordEnum: RecordEnumeration = recordStore!!.enumerateRecords(NullRecordFilter.NULL_RECORD_FILTER, NullRecordComparator.NULL_RECORD_COMPARATOR, true)!!


    var hashtable: Hashtable<Any, Any>


    var stringBuffer: StringMaker = StringMaker()


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var id: Int= 0


        while(recordEnum!!.hasNextElement())
        {id= recordEnum!!.nextRecordId()
stringBuffer!!.delete(0, stringBuffer!!.length())
logUtil!!.put(stringBuffer!!.append(this.persistanceStrings!!.LOADING_ID)!!.append(id)!!.toString(), this, this.persistanceStrings!!.LOAD_ALL)
hashtable= Hashtable<Any, Any>()
this.valueList!!.add(hashtable)
this.idList!!.add(smallIntegerSingletonFactory!!.getInstance(id))
}

recordStore!!.closeRecordStore()
}


                @Throws(Exception::class)
            
open fun save(abeClientInformation: AbeClientInformationInterface, hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var hashtable = hashtable
PreLogUtil.put(StringMaker().
                            append(this.persistanceStrings!!.NOT_SAVING)!!.append(StringUtil.getInstance()!!.toString(hashtable))!!.toString(), this, this.commonStrings!!.SAVE)

    var recordStore: RecordStore = RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)!!


    var gameActionInput: Input


    var list: BasicArrayList


    var input: Input


    var inputObjectArray: Array<Any?> = this.hashtableUtil!!.getKeysAsArray(hashtable)!!


    var size: Int = inputObjectArray!!.size
                





                        for (index in 0 until size)

        {gameActionInput= inputObjectArray[index]!! as Input
list= hashtable.get(inputObjectArray[index]!!) as BasicArrayList




                        for (index2 in 0 until list.size()!!)

        {input= list.get(index2) as Input
}

}

recordStore!!.closeRecordStore()
}


}
                
            

