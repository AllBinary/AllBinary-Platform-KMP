
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class NumberOnOwnGroupSequenceAIFactory
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
    open fun getInstance(hashtable: Hashtable<Any, Any>, artificialIntelligenceInterface: Array<ArtificialIntelligenceInterface?>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)
        //nullable =  from not(true or (false and false)) = 
: ArtificialIntelligenceInterface{
    //var hashtable = hashtable
    //var artificialIntelligenceInterface = artificialIntelligenceInterface
    //var ownerLayerInterface = ownerLayerInterface
    //var gameInput = gameInput

    var integerArray: Array<Integer?> = NumberInSameGroupSequence.getInstance()!!.NUMBER_ON_SAME_TEAM_SEQUENCE


    var list: BasicArrayList = BasicArrayList()





                        for (index in 0 until integerArray!!.size)

        {

    var integerCanBeNull: Any? = hashtable.get(integerArray[index]!! as Object)


    
                        if(integerCanBeNull == 
                                    null
                                )
                        
                                    {
                                    break;

                    

                                    }
                                
list.add(integerCanBeNull)
}


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Total AI Properties: ")
stringBuffer!!.append(list.size())
stringBuffer!!.append(" == Total AI: ")
stringBuffer!!.append(artificialIntelligenceInterface!!.size)
stringBuffer!!.append(" + 1")

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.GET_INSTANCE)

    
                        if(artificialIntelligenceInterface!!.size -1 > list.size())
                        
                                    {
                                    


                            throw Exception("Not enough AI properties.")

                                    }
                                

    
                        if(artificialIntelligenceInterface!!.size -1 < list.size())
                        
                                    {
                                    


                            throw Exception("Too Many AI properties.")

                                    }
                                

    var numberOnSameTeam: Array<Integer?> = arrayOfNulls(list.size())





                        for (index in 0 until numberOnSameTeam!!.size)

        {
numberOnSameTeam[index]= list.objectArray[index]!! as Integer
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NumberOnOwnGroupSequenceAI(numberOnSameTeam, artificialIntelligenceInterface, ownerLayerInterface, gameInput)
}


}
                
            

