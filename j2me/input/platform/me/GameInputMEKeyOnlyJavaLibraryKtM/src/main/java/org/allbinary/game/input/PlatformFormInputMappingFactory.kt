
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class PlatformFormInputMappingFactory
            : Object
         {
        

        companion object {


    private val instance: PlatformFormInputMappingFactory = PlatformFormInputMappingFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlatformFormInputMappingFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private var SINGLETON: InputToGameKeyMapping = InputToGameKeyMapping.NULL_INPUT_TO_GAME_KEY_MAPPING


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

open fun getOrCreate()
        //nullable = true from not(false or (false and true)) = true
: InputToGameKeyMapping{
        try {
            
    
                        if(SINGLETON == 
                                    null
                                )
                        
                                    {
                                    
    var inputToGameKeyMapping: InputToGameKeyMapping = InputToGameKeyMapping()


    var gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!
            

inputToGameKeyMapping!!.add(gameKeyFactory!!.UP, gameKeyFactory!!.UP)
inputToGameKeyMapping!!.add(gameKeyFactory!!.DOWN, gameKeyFactory!!.DOWN)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEFT, gameKeyFactory!!.LEFT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.RIGHT, gameKeyFactory!!.RIGHT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM1, gameKeyFactory!!.GAME_A)
SINGLETON= inputToGameKeyMapping

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


}
                
            

