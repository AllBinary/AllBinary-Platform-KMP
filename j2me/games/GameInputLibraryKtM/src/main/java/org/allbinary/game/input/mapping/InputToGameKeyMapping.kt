
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
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class InputToGameKeyMapping : InputMapping {
        

        companion object {
            
    val NULL_INPUT_TO_GAME_KEY_MAPPING: InputToGameKeyMapping = InputToGameKeyMapping()

        }
            
    private val gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!

    private val mappedGameKeys: Array<GameKey?> = arrayOf(this.gameKeyFactory!!.UP,this.gameKeyFactory!!.DOWN,this.gameKeyFactory!!.LEFT,this.gameKeyFactory!!.RIGHT)

    var negativePlatformToGameKeyMapping: Array<GameKey?> = arrayOfNulls(0)

    private val platformToGameKeyMapping: Array<GameKey?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)
public constructor        ()

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.clear()
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {




                        for (index in platformToGameKeyMapping!!.size -1 downTo 0)

        

        Updates for KMP build        
        {
platformToGameKeyMapping[index]= gameKeyFactory!!.NONE
}

}

override fun removeAll()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
super.removeAll()
this.clear()
}

override fun add(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var inputToGameKeyMapping = inputToGameKeyMapping




                        for (index in inputToGameKeyMapping!!.getMaxMappable() -1 downTo 0)

        

        Updates for KMP build        
        {

    var input: Input = inputToGameKeyMapping!!.getInstance(index)!!


    
                        if(input != gameKeyFactory!!.NONE)
                        
                                    {
                                    this.addAll(input, inputToGameKeyMapping!!.getMappedInput(input))

                                    }
                                
}

}


open fun addAll(input: Input, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var input = input
var list = list




                        for (index in list.size() -1 downTo 0)

        

        Updates for KMP build        
        {

    var mappedToInput: Input = list.objectArray[index]!! as Input

this.add(input, mappedToInput)
}

}

override fun add(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var input = input
var mappedToInput = mappedToInput
super.add(input, mappedToInput)
this.set(input, mappedToInput)
}

override fun remove(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var input = input
var mappedToInput = mappedToInput
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(StringUtil.getInstance()!!.toString(input))!!.append(" == ")!!.append(StringUtil.getInstance()!!.toString(mappedToInput))!!.toString(), this, "InputToGameKeyMapping::remove")
super.remove(input, mappedToInput)
this.set(input, gameKeyFactory!!.NONE)
}


open fun set(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var input = input
var mappedToInput = mappedToInput

    var id: Int = mappedToInput!!.getId()!!


    
                        if(id >= 0 && id < platformToGameKeyMapping!!.size)
                        
                                    {
                                    this.platformToGameKeyMapping[id]= input as GameKey

                                    }
                                
}


open fun getMaxMappable()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platformToGameKeyMapping!!.size
}


open fun getReverseInstance(id: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
var id = id

    var list: BasicArrayList = BasicArrayList()


    var inputFactory: InputFactory = InputFactory.getInstance()!!





                        for (index in 0 until platformToGameKeyMapping!!.size)

        

        Updates for KMP build        
        {

    
                        if(platformToGameKeyMapping[index]!!.getId() == id)
                        
                                    {
                                    
    var input: Input = inputFactory!!.getInstance(index)!!


    
                        if(input != 
                                    null
                                )
                        
                                    {
                                    list.add(input)

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


                @Throws(Exception::class)
            
open fun init(canvas: Canvas, gameKey: GameKey)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var canvas = canvas
var gameKey = gameKey

    var key: Int = canvas.getKeyCode(gameKey!!.getId())!!


    
                        if(key < 0 &&  -key < negativePlatformToGameKeyMapping!!.size)
                        
                                    {
                                    negativePlatformToGameKeyMapping[ -key]= gameKey

                                    }
                                
                             else 
    
                        if(key > 0)
                        
                                    {
                                    
    
                        if(platformToGameKeyMapping[key] == gameKeyFactory!!.NONE)
                        
                                    {
                                    platformToGameKeyMapping[key]= gameKey

                                    }
                                

                                    }
                                
                        else {
                            PreLogUtil.put(StringMaker().
                            append(gameKey!!.toString())!!.append(CommonSeps.getInstance()!!.COLON_SEP)!!.append(key)!!.toString(), this, commonStrings!!.INIT, Exception())

                        }
                            
}


                @Throws(Exception::class)
            
open fun getSmallestCanvasGameKeyCode(canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var canvas = canvas

    var nextKey: Int = 0


    var smallestKey: Int = 0





                        for (index in mappedGameKeys!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
nextKey= canvas.getKeyCode(mappedGameKeys[index]!!.getId())

    
                        if(nextKey < smallestKey)
                        
                                    {
                                    smallestKey= nextKey

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return smallestKey
}


open fun init(canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var canvas = canvas

        try {
            
    var negativePlatformToGameKeyMapping: Array<GameKey?> = arrayOfNulls(0)


    var smallestKey: Int = this.getSmallestCanvasGameKeyCode(canvas)!!


    
                        if(smallestKey < 0)
                        
                                    {
                                    smallestKey--

    
                        if(smallestKey <  -256)
                        
                                    {
                                    smallestKey=  -256

                                    }
                                
negativePlatformToGameKeyMapping= arrayOfNulls( -smallestKey)




                        for (index in negativePlatformToGameKeyMapping!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
negativePlatformToGameKeyMapping[index]= gameKeyFactory!!.NONE
}

this.negativePlatformToGameKeyMapping= negativePlatformToGameKeyMapping

                                    }
                                




                        for (index in mappedGameKeys!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.init(canvas, mappedGameKeys[index]!!)
}

} catch(t: Throwable)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, t)
}

}


open fun getInstance(canvas: Canvas, id: Int)
        //nullable =  from not(true or (false and false)) = 
: GameKey

        Updates for KMP build        
        {
var canvas = canvas
var id = id

    
                        if(id >= 0 && id < platformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platformToGameKeyMapping[id]!!

                                    }
                                
                             else 
    
                        if(id < 0 &&  -id < negativePlatformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.negativePlatformToGameKeyMapping[ -id]!!

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyFactory!!.NONE

                        }
                            
}


open fun getInstance(id: Int)
        //nullable =  from not(true or (false and false)) = 
: GameKey

        Updates for KMP build        
        {
var id = id

    
                        if(id >= 0 && id < platformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platformToGameKeyMapping[id]!!

                                    }
                                
                             else 
    
                        if(id < 0 &&  -id < negativePlatformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.negativePlatformToGameKeyMapping[ -id]!!

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyFactory!!.NONE

                        }
                            
}


}
                
            

