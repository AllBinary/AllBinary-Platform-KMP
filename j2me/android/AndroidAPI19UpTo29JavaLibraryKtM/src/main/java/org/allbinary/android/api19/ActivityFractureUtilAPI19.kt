
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
        package org.allbinary.android.api19




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import android.view.View
import org.allbinary.android.api5.ActivityFractureUtilAPI5

open public class ActivityFractureUtilAPI19 : ActivityFractureUtilAPI5 {
        
companion object {
            
    private val instance: ActivityFractureUtilAPI19 = ActivityFractureUtilAPI19()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ActivityFractureUtilAPI19{



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

    var decorView: View = activity.getWindow()!!.getDecorView()!!


    var visibility: Int = View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN

decorView!!.setSystemUiVisibility(visibility)
}


}
                
            

