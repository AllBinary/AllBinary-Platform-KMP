
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.string.StringUtil

open public class NullPlayerGameInputComposite
            : Object
        
                , PlayerGameInputCompositeInterface {
        

        companion object {


    val NULL_PLAYER_GAME_INPUT_COMPOSITE: NullPlayerGameInputComposite = NullPlayerGameInputComposite()


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


                @Throws(Exception::class)
            override fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager
}

override fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{}

override fun getPlayerGameInput()
        //nullable = true from not(false or (false and true)) = true
: PlayerGameInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoPlayerGameInput.getInstance()
}


}
                
            

