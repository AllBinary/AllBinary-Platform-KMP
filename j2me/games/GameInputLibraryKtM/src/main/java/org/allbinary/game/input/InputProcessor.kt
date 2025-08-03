
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
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas

open public class InputProcessor
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!
            

open fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId
}


open fun keyReleased(canvas: Canvas, keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var canvas = canvas


                    var keyCode = keyCode


                    var deviceId = deviceId
}


}
                
            

