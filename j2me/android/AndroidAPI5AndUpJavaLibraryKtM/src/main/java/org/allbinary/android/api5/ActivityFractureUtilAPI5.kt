
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
        package org.allbinary.android.api5




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.motion.button.TouchScreenTypeFactory
import org.allbinary.android.ActivityFractureUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil
import android.app.Activity
import org.allbinary.input.motion.button.TouchScreenFactory

open public class ActivityFractureUtilAPI5 : ActivityFractureUtil {
        

        companion object {
            
    private val instance: ActivityFractureUtilAPI5 = ActivityFractureUtilAPI5()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ActivityFractureUtilAPI5{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val FEATURE_TOUCHSCREEN_MULTITOUCH: String = "android.hardware.touchscreen.multitouch"

    private val FEATURE_TOUCHSCREEN: String = "android.hardware.touchscreen"

    private val FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT: String = "android.hardware.touchscreen.multitouch.distinct"
override fun process(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
{

                    var activity = activity

    var touchScreenFactory: TouchScreenFactory = TouchScreenFactory.getInstance()!!
            


    var touchScreenTypeFactory: TouchScreenTypeFactory = TouchScreenTypeFactory.getInstance()!!
            

touchScreenFactory!!.setTouch(this.isTouch(activity))
touchScreenFactory!!.setMultiTouch(this.isMultiTouch(activity))
touchScreenFactory!!.setMultiTouchDistinct(this.isMultiTouchDistinct(activity))
touchScreenTypeFactory!!.update(activity)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(touchScreenFactory!!.toString(), this, commonStrings!!.PROCESS)
}


open fun isTouch(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var activity = activity



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isFeature(activity, this.FEATURE_TOUCHSCREEN)
}


open fun isMultiTouch(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var activity = activity



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isFeature(activity, this.FEATURE_TOUCHSCREEN_MULTITOUCH)
}


open fun isMultiTouchDistinct(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var activity = activity



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isFeature(activity, this.FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT)
}


open fun isFeature(activity: Activity, property: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var activity = activity


                    var property = property



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return activity.getPackageManager()!!.hasSystemFeature(property)
}


}
                
            

