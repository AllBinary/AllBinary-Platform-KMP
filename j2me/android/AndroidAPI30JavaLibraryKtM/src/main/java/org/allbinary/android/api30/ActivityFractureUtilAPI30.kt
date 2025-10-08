
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
        package org.allbinary.android.api30




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import android.view.Window
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import org.allbinary.android.api5.ActivityFractureUtilAPI5

open public class ActivityFractureUtilAPI30 : ActivityFractureUtilAPI5 {
        
companion object {
            
    private val instance: ActivityFractureUtilAPI30 = ActivityFractureUtilAPI30()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ActivityFractureUtilAPI30{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun setFullScreen(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
{
    //var activity = activity

    var window: Window = activity.getWindow()!!


    var windowInsetsController: WindowInsetsControllerCompat = WindowCompat.getInsetsController(window, window.getDecorView())!!

windowInsetsController!!.hide(WindowInsetsCompat.Type.systemBars())
windowInsetsController!!.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE)
}


}
                
            

