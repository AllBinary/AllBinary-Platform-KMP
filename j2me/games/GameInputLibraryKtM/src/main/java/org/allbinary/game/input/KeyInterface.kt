
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

interface KeyInterface {
        

    open fun keyPressed(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun keyReleased(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun keyPressedByDevice(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun keyReleasedByDevice(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

