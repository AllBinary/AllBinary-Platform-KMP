
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
        package org.allbinary.input.motion.gesture.observer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.AllBinaryEventObjectFactoryInterface

open public class MotionEventFactory
            : Object
        
                , AllBinaryEventObjectFactoryInterface {
        

        companion object {
            
    private var index: Int = 0

        }
            
    private val source: Any

    private val id: Int
public constructor        (source: Any, id: Int)
            : super()
        {

                    var source = source


                    var id = id
this.source= source
this.id= id
index= TouchMotionGestureFactory.getInstance()!!.LAST_MOTION.getId()
}

override fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryEventObject{
    var inputFactory: InputFactory = InputFactory.getInstance()!!


    var input: Input = inputFactory!!.getInstance(index++)!!


    
                        if(input == inputFactory!!.NO_INPUT)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MotionGestureEvent(this.source, this.id, TouchMotionGestureFactory.getInstance()!!.NO_MOTION as MotionGestureInput)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MotionGestureEvent(this.source, this.id, input as MotionGestureInput)

                        }
                            
}


}
                
            

