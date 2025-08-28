
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory

open public class MotionGestureInput : Input {
        
public constructor        (id: Int, name: String)                        

                            : super(id, name){
var id = id
var name = name


                            //For kotlin this is before the body of the constructor.
                    

    var inputFactory: InputFactory = InputFactory.getInstance()!!

inputFactory!!.add(this.getId(), this)
}


}
                
            

