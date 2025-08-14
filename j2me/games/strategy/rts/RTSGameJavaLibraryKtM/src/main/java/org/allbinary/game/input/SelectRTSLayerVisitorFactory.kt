
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.visitor.Visitor

open public class SelectRTSLayerVisitorFactory
            : Object
        
                , SelectRTSLayerVisitorFactoryInterface {
        

        companion object {
            
    private val instance: SelectRTSLayerVisitorFactory = SelectRTSLayerVisitorFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SelectRTSLayerVisitorFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun getInstance(selectedRTSLayersPlayerGameInput: SelectedRTSLayersPlayerGameInput)
        //nullable =  from not(true or (false and false)) = 
: Visitor{

                    var selectedRTSLayersPlayerGameInput = selectedRTSLayersPlayerGameInput



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SelectRTSLayerVisitor()
}


}
                
            

