
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
        package org.allbinary.game.midlet



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class DemoGameMidletEvent : AllBinaryEventObject {
        

    private var demoGameMidletState: DemoGameMidletState
public constructor        (anyType: Any, demoGameMidletState: DemoGameMidletState)                        

                            : super(anyType){

                    var anyType = anyType


                    var demoGameMidletState = demoGameMidletState


                            //For kotlin this is before the body of the constructor.
                    
this.demoGameMidletState= demoGameMidletState
}


open fun init(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
this.setSource(anyType)
}


open fun setDemoGameMidletState(demoGameMidletState: DemoGameMidletState)
        //nullable = true from not(false or (false and false)) = true
{

                    var demoGameMidletState = demoGameMidletState
this.demoGameMidletState= demoGameMidletState
}


open fun getDemoGameMidletState()
        //nullable = true from not(false or (false and true)) = true
: DemoGameMidletState{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return demoGameMidletState
}


}
                
            

