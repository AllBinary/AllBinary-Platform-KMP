
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList

open public class GameInputProcessorComposite : PlayerGameInput {
        

    private val name: String

    private val gameInputProcessorInterface: GameInputProcessorInterface
public constructor        (name: String, gameInputProcessorInterface: GameInputProcessorInterface)                        

                            : super(BasicArrayList(),  -1)

        Updates for KMP build        
        {
var name = name
var gameInputProcessorInterface = gameInputProcessorInterface


                            //For kotlin this is before the body of the constructor.
                    
this.name= name
this.gameInputProcessorInterface= gameInputProcessorInterface
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            
    var list: BasicArrayList = this.getGameKeyEventList()!!

this.gameInputProcessorInterface!!.onInput(list)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
}

}


    private val NAME_LABEL: String = " GameInputProcessorInterface: "
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append(NAME_LABEL)!!.append(name)!!.toString()
}


}
                
            

