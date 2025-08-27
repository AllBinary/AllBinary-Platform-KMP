
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
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class GameInput
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val gameKeyEventList: BasicArrayList

    private val removalGameKeyEventList: BasicArrayList

    val isRemoveDuplicateKeyPresses: Boolean
public constructor        (gameKeyEventList: BasicArrayList)                        

                            : this(gameKeyEventList, BasicArrayList()){

                    var gameKeyEventList = gameKeyEventList


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (gameKeyEventList: BasicArrayList, removalGameKeyEventList: BasicArrayList)
            : super()
        {

                    var gameKeyEventList = gameKeyEventList


                    var removalGameKeyEventList = removalGameKeyEventList
this.gameKeyEventList= gameKeyEventList
this.removalGameKeyEventList= removalGameKeyEventList
this.isRemoveDuplicateKeyPresses= Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.REMOVE_DUPLICATE_KEY_PRESSES)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun add(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent

    
                        if(this.isRemoveDuplicateKeyPresses && this.gameKeyEventList!!.contains(gameKeyEvent))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(gameKeyEvent != 
                                    null
                                )
                        
                                    {
                                    this.gameKeyEventList!!.add(gameKeyEvent)

                                    }
                                
                        else {
                            logUtil!!.put("Danger Passed Null GameKeyEvent", this, commonStrings!!.ADD)

                        }
                            
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun addForRemoval(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
this.removalGameKeyEventList!!.add(gameKeyEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun isForRemoval(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var gameKeyEvent = gameKeyEvent



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.removalGameKeyEventList!!.contains(gameKeyEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.gameKeyEventList!!.clear()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun removeNonAIInputGameKeyEvents()
        //nullable = true from not(false or (false and true)) = true
{
    var list: BasicArrayList = this.gameKeyEventList


    var gameKeyEvent: GameKeyEvent





                        for (index in list.size()!!  - 1  downTo 0)


        {gameKeyEvent= list.objectArray[index]!! as GameKeyEvent

    
                        if(gameKeyEvent!!.getSourceId() != 1)
                        
                                    {
                                    list.remove(index)

                                    }
                                
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var removeList: BasicArrayList = this.removalGameKeyEventList


    var list: BasicArrayList = this.gameKeyEventList


    var size: Int = removeList!!.size()!!





                        for (index in 0 until size)


        {
    var anyType: Any = removeList!!.objectArray[index]!!





                        for (index2 in list.size()!!  - 1  downTo 0)


        {
    
                        if(list.objectArray[index2] == anyType)
                        
                                    {
                                    list.remove(index2)

                                    }
                                
}

}

removeList!!.clear()
}


open fun getRemovalGameKeyEventList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.removalGameKeyEventList
}


open fun getGameKeyEventList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEventList
}


}
                
            

