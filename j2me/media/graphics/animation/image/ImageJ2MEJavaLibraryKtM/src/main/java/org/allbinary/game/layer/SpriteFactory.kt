
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.logic.communication.log.LogUtil

open public class SpriteFactory
            : Object
         {
        
companion object {
            
    private val instance: SpriteFactory = SpriteFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SpriteFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    open fun create(image: Image, frameWidth: Int, frameHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Sprite{
    //var image = image
    //var frameWidth = frameWidth
    //var frameHeight = frameHeight



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Sprite(image, frameWidth, frameHeight)
}


}
                
            

