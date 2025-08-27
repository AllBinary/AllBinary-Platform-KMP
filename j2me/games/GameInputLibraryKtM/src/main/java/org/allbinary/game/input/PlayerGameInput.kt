
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
        
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventListenerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonLabels
import org.allbinary.util.BasicArrayList

open public class PlayerGameInput : GameInput
                , GameKeyEventListenerInterface {
        

    val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!

    private val playerInputId: Int
public constructor        (gameKeyEventList: BasicArrayList, playerInputId: Int)                        

                            : this(gameKeyEventList, BasicArrayList(), playerInputId){

                    var gameKeyEventList = gameKeyEventList


                    var playerInputId = playerInputId


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (gameKeyEventList: BasicArrayList, removalGameKeyEventList: BasicArrayList, playerInputId: Int)                        

                            : super(gameKeyEventList, removalGameKeyEventList){

                    var gameKeyEventList = gameKeyEventList


                    var removalGameKeyEventList = removalGameKeyEventList


                    var playerInputId = playerInputId


                            //For kotlin this is before the body of the constructor.
                    
this.playerInputId= playerInputId
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onPressGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
super.add(gameKeyEvent)
this.addForRemoval(gameKeyEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onDownGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
super.add(gameKeyEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun onDownKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
super.add(gameKeyEvent)
this.addForRemoval(gameKeyEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun onDownKeyEvent(gameKeyEvent: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
PreLogUtil.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(gameKeyEvent!!.toString())!!.toString(), this, gameInputStrings!!.ON_DOWN_GAME_KEY)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onUpGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
this.addForRemoval(gameKeyEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun onUpKeyEvent(gameKeyEvent: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


open fun getPlayerInputId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return playerInputId
}


}
                
            

