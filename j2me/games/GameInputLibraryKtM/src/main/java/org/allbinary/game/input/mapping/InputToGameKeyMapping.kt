
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
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class InputToGameKeyMapping : InputMapping {
        
companion object {
            
    val NULL_INPUT_TO_GAME_KEY_MAPPING: InputToGameKeyMapping = InputToGameKeyMapping()

        }
            
    private val gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!

    private val mappedGameKeys: Array<GameKey?> = arrayOf(this.gameKeyFactory!!.UP,this.gameKeyFactory!!.DOWN,this.gameKeyFactory!!.LEFT,this.gameKeyFactory!!.RIGHT)

    var negativePlatformToGameKeyMapping: Array<GameKey?> = arrayOfNulls(0)

    private val platformToGameKeyMapping: Array<GameKey?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)
public constructor (){
this.logUtil!!.putF(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.clear()
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{




                        for (index in this.platformToGameKeyMapping!!.size -1 downTo 0)

        {
this.platformToGameKeyMapping[index]= this.gameKeyFactory!!.NONE
}

}


    override fun removeAll()
        //nullable = true from not(false or (false and true)) = true
{
super.removeAll()
this.clear()
}


    override fun addMapping(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputToGameKeyMapping = inputToGameKeyMapping




                        for (index in inputToGameKeyMapping!!.getMaxMappable() -1 downTo 0)

        {

    var input: Input = inputToGameKeyMapping!!.getInstance(index)!!


    
                        if(input != this.gameKeyFactory!!.NONE)
                        
                                    {
                                    this.addAll(input, inputToGameKeyMapping!!.getMappedInput(input))

                                    }
                                
}

}


    open fun addAll(input: Input, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var input = input
var list = list




                        for (index in list.size() -1 downTo 0)

        {

    var mappedToInput: Input = list.objectArray[index]!! as Input

this.add(input, mappedToInput)
}

}


    override fun add(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true
{
var input = input
var mappedToInput = mappedToInput
super.add(input, mappedToInput)
this.set(input, mappedToInput)
}


    override fun remove(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true
{
var input = input
var mappedToInput = mappedToInput
this.logUtil!!.putF(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(StringUtil.getInstance()!!.toString(input))!!.append(" == ")!!.append(StringUtil.getInstance()!!.toString(mappedToInput))!!.toString(), this, "InputToGameKeyMapping::remove")
super.remove(input, mappedToInput)
this.set(input, gameKeyFactory!!.NONE)
}


    open fun set(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true
{
var input = input
var mappedToInput = mappedToInput

    var id: Int = mappedToInput!!.getId()!!


    
                        if(id >= 0 && id < this.platformToGameKeyMapping!!.size)
                        
                                    {
                                    this.platformToGameKeyMapping[id]= input as GameKey

                                    }
                                
}


    open fun getMaxMappable()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.platformToGameKeyMapping!!.size
}


    open fun getReverseInstance(id: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
var id = id

    var list: BasicArrayList = BasicArrayListD()


    var inputFactory: InputFactory = InputFactory.getInstance()!!





                        for (index in 0 until this.platformToGameKeyMapping!!.size)

        {

    
                        if(this.platformToGameKeyMapping[index]!!.getId() == id)
                        
                                    {
                                    
    var input: Input = inputFactory!!.getInstanceById(index)!!


    
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
            
    open fun initGameKey(canvas: Canvas, gameKey: GameKey)
        //nullable = true from not(false or (false and false)) = true
{
var canvas = canvas
var gameKey = gameKey

    var key: Int = canvas.getKeyCode(gameKey!!.getId())!!


    
                        if(key < 0 &&  -key < this.negativePlatformToGameKeyMapping!!.size)
                        
                                    {
                                    this.negativePlatformToGameKeyMapping[ -key]= gameKey

                                    }
                                
                             else 
    
                        if(key > 0)
                        
                                    {
                                    
    
                        if(this.platformToGameKeyMapping[key] == this.gameKeyFactory!!.NONE)
                        
                                    {
                                    this.platformToGameKeyMapping[key]= gameKey

                                    }
                                

                                    }
                                
                        else {
                            PreLogUtil.putOE(StringMaker().
                            append(gameKey!!.toString())!!.append(CommonSeps.getInstance()!!.COLON_SEP)!!.appendint(key)!!.toString(), this, commonStrings!!.INIT, Exception())

                        }
                            
}


                @Throws(Exception::class)
            
    open fun getSmallestCanvasGameKeyCode(canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true
: Int{
var canvas = canvas

    var nextKey: Int = 0


    var smallestKey: Int = 0





                        for (index in this.mappedGameKeys!!.size  - 1  downTo 0)

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

        {
negativePlatformToGameKeyMapping[index]= this.gameKeyFactory!!.NONE
}

this.negativePlatformToGameKeyMapping= negativePlatformToGameKeyMapping

                                    }
                                




                        for (index in mappedGameKeys!!.size  - 1  downTo 0)

        {
this.initGameKey(canvas, mappedGameKeys[index]!!)
}

} catch(t: Throwable)
            {
this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, t)
}

}


    open fun getInstanceForCanvas(canvas: Canvas, id: Int)
        //nullable = true from not(false or (false and false)) = true
: GameKey{
var canvas = canvas
var id = id

    
                        if(id >= 0 && id < this.platformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.platformToGameKeyMapping[id]!!

                                    }
                                
                             else 
    
                        if(id < 0 &&  -id < this.negativePlatformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.negativePlatformToGameKeyMapping[ -id]!!

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gameKeyFactory!!.NONE

                        }
                            
}


    open fun getInstance(id: Int)
        //nullable =  from not(true or (false and false)) = 
: GameKey{
var id = id

    
                        if(id >= 0 && id < this.platformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.platformToGameKeyMapping[id]!!

                                    }
                                
                             else 
    
                        if(id < 0 &&  -id < this.negativePlatformToGameKeyMapping!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.negativePlatformToGameKeyMapping[ -id]!!

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gameKeyFactory!!.NONE

                        }
                            
}


}
                
            

