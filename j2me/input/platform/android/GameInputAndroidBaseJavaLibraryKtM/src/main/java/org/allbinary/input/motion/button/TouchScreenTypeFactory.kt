
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import android.content.res.Configuration
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil

open public class TouchScreenTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: TouchScreenTypeFactory = TouchScreenTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TouchScreenTypeFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun update(activity: Activity)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var activity = activity

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var touchScreenFactory: TouchScreenFactory = TouchScreenFactory.getInstance()!!


    var touchScreenTypesFactory: TouchScreenTypesFactory = TouchScreenTypesFactory.getInstance()!!


    var configuration: Configuration = activity.getResources()!!.getConfiguration()!!


    var touchScreen: Int = configuration.touchscreen


    
                        if(touchScreen == Configuration.TOUCHSCREEN_FINGER)
                        
                                    {
                                    touchScreenFactory!!.setTouchScreenType(touchScreenTypesFactory!!.FINGER)

    
                        if(!touchScreenFactory!!.isTouch())
                        
                                    {
                                    PreLogUtil.put("Not Really Exception: This indicates that a touch screen does exist but is not API8 so we will try it", this, commonStrings!!.PROCESS)
touchScreenFactory!!.setTouch(true)

                                    }
                                

                                    }
                                
                             else 
    
                        if(touchScreen == Configuration.TOUCHSCREEN_STYLUS)
                        
                                    {
                                    touchScreenFactory!!.setTouchScreenType(touchScreenTypesFactory!!.STYLUS)

    
                        if(!touchScreenFactory!!.isTouch())
                        
                                    {
                                    PreLogUtil.put("Not Really Exception: This indicates that a touch screen does exist but is not API8 so we will try it", this, commonStrings!!.PROCESS)
touchScreenFactory!!.setTouch(true)

                                    }
                                

                                    }
                                
                             else 
    
                        if(touchScreen == Configuration.TOUCHSCREEN_NOTOUCH)
                        
                                    {
                                    touchScreenFactory!!.setTouchScreenType(touchScreenTypesFactory!!.NOTOUCH)

                                    }
                                
                             else 
    
                        if(touchScreen == Configuration.TOUCHSCREEN_UNDEFINED)
                        
                                    {
                                    touchScreenFactory!!.setTouchScreenType(touchScreenTypesFactory!!.UNDEFINED)

                                    }
                                
}


}
                
            

