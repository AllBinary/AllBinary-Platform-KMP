
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
        package org.allbinary.input.motion.gesture



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEvent
import org.allbinary.util.BasicArrayList

open public class MotionGestureToMotionGestureActionAssociation
            : Object
         {
        

    private var list: BasicArrayList

    private var motionGestureAction: CompleteMotionGestureInputEvent
public constructor        (list: BasicArrayList, commandAction: CompleteMotionGestureInputEvent)
            : super()
        {

                    var list = list


                    var commandAction = commandAction
this.list= list
this.motionGestureAction= commandAction
}


open fun getMotionGesture()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


open fun setMotionGestures(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list
this.list= list
}


open fun getCommandAction()
        //nullable = true from not(false or (false and true)) = true
: CompleteMotionGestureInputEvent{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionGestureAction
}


open fun setMotionGestureAction(commandAction: CompleteMotionGestureInputEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var commandAction = commandAction
this.motionGestureAction= commandAction
}


open fun isMotionGestureArrayEquals(aList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var aList = aList

    var size: Int = aList!!.size()!!
            


    
                        if(this.list!!.size() != size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                




                        for (i in size -1 downTo 0)


        {
    
                        if(aList!!.objectArray[i] != this.list!!.objectArray[i])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

