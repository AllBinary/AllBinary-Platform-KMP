
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
        package org.allbinary.game.paint.help




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.Input
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.mapping.GameInputMapping
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class BasicInputMappingHelpPaintable : HelpPaintable {
        

    private var gameInputMappingArray: Array<GameInputMapping?>

    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE
protected constructor        (gameInputMappingArray: Array<GameInputMapping?>, basicColor: BasicColor)                        

                            : super(basicColor)

        Updates for KMP build        
        {
    //var gameInputMappingArray = gameInputMappingArray
    //var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.gameInputMappingArray= gameInputMappingArray
this.update(NONE, NONE)
}


open fun update(selectedGameKey: GameKey, selectedInput: Input)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var selectedGameKey = selectedGameKey
    //var selectedInput = selectedInput

    var gameKeyMapping: PersistentInputMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!


    var EQUAL: String = " = "


    var stringMaker: StringMaker = StringMaker()


    var size: Int = gameInputMappingArray!!.size
                


    var keyInfo: Array<String?> = arrayOfNulls(size)


    var gameInputMapping: GameInputMapping


    var gameKey: GameKey


    var list: BasicArrayList





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
gameInputMapping= gameInputMappingArray[index]!!
gameKey= gameInputMapping!!.getGameKey()
list= gameKeyMapping!!.getInputMapping()!!.getMappedInput(gameKey)
stringMaker!!.delete(0, stringMaker!!.length())
keyInfo[index]= stringMaker!!.append(gameInputMapping!!.getName())!!.append(EQUAL)!!.append(this.get(list))!!.toString()
}

super.setInputInfoP(keyInfo)
}


open fun get(keyList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var keyList = keyList

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()


    var AND: String = "and "


    var key: Input


    var size: Int = keyList!!.size()!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
key= keyList!!.objectArray[index]!! as Input
stringBuffer!!.append(key.getName())

    
                        if(index +1 < keyList!!.size())
                        
                                    {
                                    
    
                        if(keyList!!.size() == 2)
                        
                                    {
                                    stringBuffer!!.append(commonSeps!!.SPACE)!!.append(AND)

                                    }
                                
                        else {
                            
    
                        if(index +2 == keyList!!.size())
                        
                                    {
                                    stringBuffer!!.append(commonSeps!!.COMMA_SEP)
stringBuffer!!.append(AND)

                                    }
                                
                        else {
                            stringBuffer!!.append(commonSeps!!.COMMA_SEP)

                        }
                            

                        }
                            

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

