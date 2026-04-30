
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.InputFactory
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class BasicTouchInputFactory
            : Object
         {
        
companion object {
            
    private val SINGLETON: BasicTouchInputFactory = BasicTouchInputFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicTouchInputFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicTouchInputFactory.SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val SPECIAL_BUTTON_SIX: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -30, "Button 6")

    val SPECIAL_BUTTON_FIVE: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -31, "Button 5")

    val SPECIAL_BUTTON_FOUR: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -32, "Button 4")

    val SPECIAL_BUTTON_THREE: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -33, "Button 3")

    val SPECIAL_BUTTON_TWO: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -34, "Button 2")

    val SPECIAL_BUTTON_ONE: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -35, "Button 1")

    val UP: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -36, "Up Button")

    val LEFT: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -37, "Left Button")

    val RIGHT: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -38, "Right Button")

    val DOWN: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -39, "Down Button")

    val NONE: TouchButtonInput = TouchButtonInput(InputFactory.getInstance()!!.MAX -40, "No Button")

    private var initialized: Boolean = false

    private val list: BasicArrayList = BasicArrayListD()
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun init(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var inputToGameKeyMapping = inputToGameKeyMapping

    
                        if(!this.initialized)
                        
                                    {
                                    this.initialized= true
this.list.add(this.UP)
this.list.add(this.LEFT)
this.list.add(this.RIGHT)
this.list.add(this.DOWN)
this.list.add(SPECIAL_BUTTON_TWO)
this.list.add(SPECIAL_BUTTON_FOUR)
this.list.add(SPECIAL_BUTTON_THREE)
this.list.add(SPECIAL_BUTTON_ONE)
this.list.add(SPECIAL_BUTTON_FIVE)
this.list.add(SPECIAL_BUTTON_SIX)
this.updateAllList(this.list, inputToGameKeyMapping)
CancelTouchButtonInputFactory.getInstance()

                                    }
                                
}


    open fun updateAll(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var inputToGameKeyMapping = inputToGameKeyMapping
this.updateAllList(this.getList(), inputToGameKeyMapping)
}


    open fun updateAllList(list: BasicArrayList, inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var list = list
var inputToGameKeyMapping = inputToGameKeyMapping
this.logUtil!!.putF(StringMaker().
                            append(CommonLabels.getInstance()!!.START)!!.appendint(list.size())!!.toString(), this, "updateAll")




                        for (index in list.size() -1 downTo 0)

        {

    var touchButtonInput: TouchButtonInput = list.get(index) as TouchButtonInput

touchButtonInput!!.update(inputToGameKeyMapping)
}

}


    open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list
}


}
                
            

