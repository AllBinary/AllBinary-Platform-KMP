
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
        package org.allbinary.input.motion.gesture.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEvent
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.input.motion.gesture.MotionGestureToMotionGestureActionAssociation
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class MotionGestureConfiguration
            : Object
         {
        

    private var diagonalMotionGestureAllowed: Boolean = true

    private var diagonalTolerance: Int = 7

    private var minimumMotionGesture: Int = 9

    private var button: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var color: BasicColor = BasicColorFactory.getInstance()!!.BLUE

    private var executingActions: Boolean = true

    private var mouseButtonMask: Int = 0

    private var activeCommands: BasicArrayList = BasicArrayList()
public constructor ()
            : super()
        {
}


    open fun getMotionGestureAction(index: Int)
        //nullable = true from not(false or (false and false)) = true
: CompleteMotionGestureInputEvent{
var index = index

    
                        if(index >= activeCommands!!.size())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CompleteMotionGestureInputEvent.NULL_COMPLETE_MOTION_GESTURE_INPUT_EVENT

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return activeCommands!!.objectArray[index]!! as CompleteMotionGestureInputEvent
}


    open fun addMotionGestureAction(list: BasicArrayList, commandAction: CompleteMotionGestureInputEvent)
        //nullable = true from not(false or (false and false)) = true
{
var list = list
var commandAction = commandAction
activeCommands!!.add(MotionGestureToMotionGestureActionAssociation(list, commandAction))
}


    open fun clearMotionGestureAction()
        //nullable = true from not(false or (false and true)) = true
{
activeCommands!!.clear()
}


    open fun getAssociateCommandActionsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return activeCommands
}


    open fun isDiagonalMotionGestureAllowed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return diagonalMotionGestureAllowed
}


    open fun isExecutingActionsAllowed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return executingActions
}


    open fun setExecutingActionsAllowed(executingActionAllowed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var executingActionAllowed = executingActionAllowed
this.executingActions= executingActionAllowed
}


    open fun setDiagonalMotionGestureAllowed(diagonalMotionGestureAllowed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var diagonalMotionGestureAllowed = diagonalMotionGestureAllowed
this.diagonalMotionGestureAllowed= diagonalMotionGestureAllowed
}


    open fun getDiagonalTolerance()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return diagonalTolerance
}


    open fun setDiagonalTolerance(diagonalTolerance: Int)
        //nullable = true from not(false or (false and false)) = true
{
var diagonalTolerance = diagonalTolerance
this.diagonalTolerance= diagonalTolerance
}


    open fun getMinimumMotionGesture()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minimumMotionGesture
}


    open fun setMinimumMotionGesture(minimumMotionGesture: Int)
        //nullable = true from not(false or (false and false)) = true
{
var minimumMotionGesture = minimumMotionGesture
this.minimumMotionGesture= minimumMotionGesture
}


    open fun getButton()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return button
}


    open fun setButton(button: String)
        //nullable = true from not(false or (false and false)) = true
{
var button = button
this.button= button
}


    open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


    open fun setColor(color: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
var color = color
this.color= color
}


    open fun getMouseButtonMask()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mouseButtonMask
}


    open fun setMouseButtonMask(mouseButtonMask: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mouseButtonMask = mouseButtonMask
this.mouseButtonMask= mouseButtonMask
}


}
                
            

