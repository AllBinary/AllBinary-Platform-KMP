
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventUtil
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.special.SpecialGameInputFactory
import org.allbinary.game.layer.special.SpecialGameInputInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList

open public class CheatGameInputProcessor : PlayerGameInput {
        

        companion object {
            
    var inputProcessor: SpecialGameInputInterface = SpecialGameInputFactory.NO_SPECIAL_GAME_INPUT

        }
            
    private val PROCESS_GAME: String = "processGame"

    private val gameCanvas: AllBinaryGameCanvas
public constructor        (gameCanvas: AllBinaryGameCanvas)                        

                            : super(BasicArrayList(),  -1){

                    var gameCanvas = gameCanvas


                            //For kotlin this is before the body of the constructor.
                    
this.gameCanvas= gameCanvas
}


    private val gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun update()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var gameLayerManager: AllBinaryGameLayerManager = this.gameCanvas!!.getLayerManager()!!


    var list: BasicArrayList = this.getGameKeyEventList()!!


    var size: Int = list.size()!!





                        for (index in 0 until size)


        {
    var anyType: Any = list.objectArray[index]!!


    var key: Int = GameKeyEventUtil.getKey(anyType)!!


    
                        if(key == gameKeyFactory!!.LEVEL_DOWN.getId())
                        
                                    {
                                    inputProcessor!!.strafeLeft()
gameLayerManager!!.getGameInfo()!!.previousGameLevel()
logUtil!!.put(StringMaker().
                            append("Down Level Cheat: ")!!.append(gameLayerManager!!.getGameInfo()!!.getCurrentLevel())!!.toString(), this, PROCESS_GAME)
this.gameCanvas!!.buildGame(true)
break;

                    

                                    }
                                
                             else 
    
                        if(key == gameKeyFactory!!.LEVEL_UP.getId())
                        
                                    {
                                    inputProcessor!!.strafeRight()
gameLayerManager!!.getGameInfo()!!.nextGameLevel()
logUtil!!.put(StringMaker().
                            append("Up Level Cheat: ")!!.append(gameLayerManager!!.getGameInfo()!!.getCurrentLevel())!!.toString(), this, PROCESS_GAME)
this.gameCanvas!!.buildGame(true)
break;

                    

                                    }
                                

    
                        if(key == gameKeyFactory!!.LEFT.getId())
                        
                                    {
                                    inputProcessor!!.left()
break;

                    

                                    }
                                
                             else 
    
                        if(key == gameKeyFactory!!.RIGHT.getId())
                        
                                    {
                                    inputProcessor!!.right()
break;

                    

                                    }
                                
                             else 
    
                        if(key == gameKeyFactory!!.UP.getId())
                        
                                    {
                                    inputProcessor!!.up()
break;

                    

                                    }
                                
                             else 
    
                        if(key == gameKeyFactory!!.DOWN.getId())
                        
                                    {
                                    inputProcessor!!.down()
break;

                    

                                    }
                                
                             else 
    
                        if(key == gameKeyFactory!!.KEY_NUM1.getId())
                        
                                    {
                                    inputProcessor!!.special1(gameLayerManager, GameKeyEvent.NONE)
break;

                    

                                    }
                                
                             else 
    
                        if(key == gameKeyFactory!!.KEY_NUM3.getId())
                        
                                    {
                                    inputProcessor!!.special2(gameLayerManager, GameKeyEvent.NONE)
break;

                    

                                    }
                                
}

list.clear()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
}

}


}
                
            

