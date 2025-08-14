
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
        package org.allbinary.game.configuration.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class GameFeatureEvent : AllBinaryEventObject {
        

    private val whatChanged: String
public constructor        (anyType: Any, whatChanged: String)                        

                            : super(anyType){

                    var anyType = anyType


                    var whatChanged = whatChanged


                            //For kotlin this is before the body of the constructor.
                    
this.whatChanged= whatChanged
}


open fun getWhatChanged()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return whatChanged
}


open fun getGameOption()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSource()
}


}
                
            

