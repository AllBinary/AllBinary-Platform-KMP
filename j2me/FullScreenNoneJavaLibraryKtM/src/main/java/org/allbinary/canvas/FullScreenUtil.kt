
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
        package org.allbinary.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.CommandListener
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory

open public class FullScreenUtil
            : Object
         {
        

        companion object {
            
    private val instance: FullScreenUtil = FullScreenUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FullScreenUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun init(fullScreenInterface: Canvas, commandListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var fullScreenInterface = fullScreenInterface


                    var commandListener = commandListener

    
                        if(commandListener != 
                                    null
                                )
                        
                                    {
                                    this.init(fullScreenInterface)

                                    }
                                
}


open fun init(fullScreenInterface: Canvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var fullScreenInterface = fullScreenInterface
}


open fun isScreenChange(isFullScreen: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var isFullScreen = isFullScreen

    var mainFeatureFactory: MainFeatureFactory = MainFeatureFactory.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            


    
                        if(features.isFeature(mainFeatureFactory!!.FULL_SCREEN) != isFullScreen)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isScreenChange(fullScreenInterface: Canvas)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var fullScreenInterface = fullScreenInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isScreenChange(false)
}


}
                
            

