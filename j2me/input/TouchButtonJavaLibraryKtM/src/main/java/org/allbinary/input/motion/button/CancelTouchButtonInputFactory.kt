
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

open public class CancelTouchButtonInputFactory
            : Object
         {
        

        companion object {
            
    private val instance: CancelTouchButtonInputFactory = CancelTouchButtonInputFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CancelTouchButtonInputFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val cancelInputArray: Array<TouchButtonInput?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)
private constructor        ()
            : super()
        {
    var basicTouchInputFactory: BasicTouchInputFactory = BasicTouchInputFactory.getInstance()!!
            





                        for (index in cancelInputArray!!.size -1 downTo 0)


        {cancelInputArray[index]= basicTouchInputFactory!!.NONE
}

cancelInputArray[basicTouchInputFactory!!.UP.getSourceId()]= basicTouchInputFactory!!.DOWN
cancelInputArray[basicTouchInputFactory!!.DOWN.getSourceId()]= basicTouchInputFactory!!.UP
cancelInputArray[basicTouchInputFactory!!.LEFT.getSourceId()]= basicTouchInputFactory!!.RIGHT
cancelInputArray[basicTouchInputFactory!!.RIGHT.getSourceId()]= basicTouchInputFactory!!.LEFT
}


open fun getCancel(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
: TouchButtonInput{

                    var touchButtonInput = touchButtonInput



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cancelInputArray[touchButtonInput!!.getSourceId()]!!
}


}
                
            

