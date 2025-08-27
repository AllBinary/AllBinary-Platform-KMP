
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
        package org.allbinary.game.input.mapping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import org.allbinary.game.configuration.persistance.GamePersistanceStrings
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputPersistance
import org.allbinary.game.input.mapping.event.InputMappingEvent
import org.allbinary.game.input.mapping.event.InputMappingEventListenerInterface
import org.allbinary.game.input.mapping.event.NullInputMappingEventListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class PersistentInputMapping
            : Object
         {
        

        companion object {
            
    val NULL_PERSISTENT_INPUT_MAPPING: PersistentInputMapping = PersistentInputMapping()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val inputMapping: InputToGameKeyMapping = InputToGameKeyMapping()

    private var inputMappingEventListenerInterface: InputMappingEventListenerInterface = NullInputMappingEventListener.NULL_INPUT_MAPPING_EVENT_LISTENER

    private val inputPersistance: InputPersistance
protected constructor        ()
            : super()
        {inputPersistance= InputPersistance(GamePersistanceStrings.getInstance()!!.SAVED_INPUT_CONFIGURATION_RECORD_ID)
}

protected constructor        (name: String)
            : super()
        {

                    var name = name
inputPersistance= InputPersistance(name)
}


open fun getTotalMapped()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInputMapping()!!.getHashtable()!!.size
}


open fun isDefaultNew()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getDefault()
        //nullable = true from not(false or (false and true)) = true
: InputToGameKeyMapping{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InputToGameKeyMapping.NULL_INPUT_TO_GAME_KEY_MAPPING
}


                @Throws(Exception::class)
            
open fun setDefault(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
this.getInputMapping()!!.removeAll()
this.getInputMapping()!!.add(this.getDefault())
this.save(abeClientInformation)
}


                @Throws(Exception::class)
            
open fun update(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
this.inputPersistance!!.deleteAll(abeClientInformation)
this.save(abeClientInformation)
}


    private var inputMappingEvent: InputMappingEvent = InputMappingEvent(this)

                @Throws(Exception::class)
            
open fun save(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
inputPersistance!!.save(abeClientInformation, this.getInputMapping()!!.getHashtable())
inputMappingEvent!!.setInputToGameKeyMapping(this.getInputMapping())

    
                        if(this.getInputMappingEventListenerInterface() != 
                                    null
                                )
                        
                                    {
                                    this.getInputMappingEventListenerInterface()!!.onInputMappingEvent(inputMappingEvent)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.INIT)

        try {
            inputPersistance!!.loadAll(abeClientInformation)
} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
inputPersistance!!.deleteRecoreStore(abeClientInformation)
this.setDefault(abeClientInformation)
inputPersistance!!.loadAll(abeClientInformation)
}


    var list: BasicArrayList = inputPersistance!!.getList()!!


    var size: Int = list.size()!!


    var totalMappedTo: Int = 0





                        for (index in 0 until size)

        {
    var hashtable: Hashtable<Any, Any> = list.objectArray[index]!! as Hashtable<Any, Any>


    var enumeration: Enumeration<Any?> = hashtable.keys()!!


        while(enumeration.hasMoreElements())
        {
    var mappedToInput: Input = enumeration.nextElement()!! as Input


    var gameActionInput: Input = hashtable.get(mappedToInput as Object) as Input

totalMappedTo++
this.getInputMapping()!!.add(gameActionInput, mappedToInput)
}

}


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("End - Total Loaded Keys Mapped: ")
stringBuffer!!.append(this.getTotalMapped())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(totalMappedTo)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)
}


open fun setInputMappingEventListenerInterface(inputMappingEventListenerInterface: InputMappingEventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputMappingEventListenerInterface = inputMappingEventListenerInterface
this.inputMappingEventListenerInterface= inputMappingEventListenerInterface
}


open fun getInputMappingEventListenerInterface()
        //nullable = true from not(false or (false and true)) = true
: InputMappingEventListenerInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputMappingEventListenerInterface
}


open fun getInputMapping()
        //nullable = true from not(false or (false and true)) = true
: InputToGameKeyMapping{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputMapping
}


                @Throws(Exception::class)
            
open fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var input = input



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun isSystemInput(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var input = input



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


}
                
            

