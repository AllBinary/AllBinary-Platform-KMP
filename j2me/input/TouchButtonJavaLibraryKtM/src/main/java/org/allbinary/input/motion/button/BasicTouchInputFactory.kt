
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

open public class BasicTouchInputFactory
            : Object
         {
        
companion object {
            
    private val SINGLETON: BasicTouchInputFactory = BasicTouchInputFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicTouchInputFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val SPECIAL_BUTTON_SEVEN_TESTING_ONLY: TouchButtonInput

    val SPECIAL_BUTTON_EIGHT_TESTING_ONLY: TouchButtonInput

    val SPECIAL_BUTTON_SIX: TouchButtonInput

    val SPECIAL_BUTTON_FIVE: TouchButtonInput

    val SPECIAL_BUTTON_FOUR: TouchButtonInput

    val SPECIAL_BUTTON_THREE: TouchButtonInput

    val SPECIAL_BUTTON_TWO: TouchButtonInput

    val SPECIAL_BUTTON_ONE: TouchButtonInput

    val UP: TouchButtonInput

    val LEFT: TouchButtonInput

    val RIGHT: TouchButtonInput

    val DOWN: TouchButtonInput

    val NONE: TouchButtonInput

    private var initialized: Boolean = false

    private val list: BasicArrayList = BasicArrayList()
private constructor ()
            : super()
        {

    var MAX: Int = InputFactory.getInstance()!!.MAX

SPECIAL_BUTTON_SEVEN_TESTING_ONLY= TouchButtonInput(MAX -41, "Button 7 - Testing Only May Cross Over Key Values")
SPECIAL_BUTTON_EIGHT_TESTING_ONLY= TouchButtonInput(MAX -42, "Button 8 - Testing Only May Cross Over Key Values")
SPECIAL_BUTTON_SIX= TouchButtonInput(MAX -30, "Button 6")
SPECIAL_BUTTON_FIVE= TouchButtonInput(MAX -31, "Button 5")
SPECIAL_BUTTON_FOUR= TouchButtonInput(MAX -32, "Button 4")
SPECIAL_BUTTON_THREE= TouchButtonInput(MAX -33, "Button 3")
SPECIAL_BUTTON_TWO= TouchButtonInput(MAX -34, "Button 2")
SPECIAL_BUTTON_ONE= TouchButtonInput(MAX -35, "Button 1")
UP= TouchButtonInput(MAX -36, "Up Button")
LEFT= TouchButtonInput(MAX -37, "Left Button")
RIGHT= TouchButtonInput(MAX -38, "Right Button")
DOWN= TouchButtonInput(MAX -39, "Down Button")
NONE= TouchButtonInput(MAX -40, "No Button")
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun init(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var inputToGameKeyMapping = inputToGameKeyMapping

    
                        if(!initialized)
                        
                                    {
                                    initialized= true
list.add(UP)
list.add(LEFT)
list.add(RIGHT)
list.add(DOWN)
list.add(SPECIAL_BUTTON_TWO)
list.add(SPECIAL_BUTTON_FOUR)
list.add(SPECIAL_BUTTON_THREE)
list.add(SPECIAL_BUTTON_ONE)
list.add(SPECIAL_BUTTON_FIVE)
list.add(SPECIAL_BUTTON_SIX)
list.add(SPECIAL_BUTTON_SIX)
list.add(SPECIAL_BUTTON_SEVEN_TESTING_ONLY)
list.add(SPECIAL_BUTTON_EIGHT_TESTING_ONLY)
this.updateAll(list, inputToGameKeyMapping)
CancelTouchButtonInputFactory.getInstance()

                                    }
                                
}


    open fun updateAll(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var inputToGameKeyMapping = inputToGameKeyMapping
this.updateAll(this.list, inputToGameKeyMapping)
}


    open fun updateAll(list: BasicArrayList, inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var list = list
var inputToGameKeyMapping = inputToGameKeyMapping
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(list.size())!!.toString(), this, "updateAll")

    var touchButtonInput: TouchButtonInput





                        for (index in list.size() -1 downTo 0)

        {
touchButtonInput= list.objectArray[index]!! as TouchButtonInput
touchButtonInput!!.update(inputToGameKeyMapping)
}

}


    open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

