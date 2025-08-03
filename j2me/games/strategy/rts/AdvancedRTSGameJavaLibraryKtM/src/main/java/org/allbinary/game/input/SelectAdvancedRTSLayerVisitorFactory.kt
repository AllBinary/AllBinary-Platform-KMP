
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.visitor.Visitor

open public class SelectAdvancedRTSLayerVisitorFactory
            : Object
        
                , SelectRTSLayerVisitorFactoryInterface {
        

        companion object {


    private val instance: SelectAdvancedRTSLayerVisitorFactory = SelectAdvancedRTSLayerVisitorFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SelectAdvancedRTSLayerVisitorFactory{


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
                        return SelectAdvancedRTSLayerVisitor(selectedRTSLayersPlayerGameInput)
}


}
                
            

