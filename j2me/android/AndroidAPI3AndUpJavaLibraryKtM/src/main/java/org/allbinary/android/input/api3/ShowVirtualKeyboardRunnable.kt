
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
        package org.allbinary.android.input.api3




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import org.allbinary.android.activity.ViewCompositeInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ShowVirtualKeyboardRunnable
            : Object
        
                , Runnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val activity: Activity
public constructor (activity: Activity)
            : super()
        {
    //var activity = activity
this.activity= activity
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var inputMethodManager: InputMethodManager = this.activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager


    var viewCompositeInterface: ViewCompositeInterface = this.activity as ViewCompositeInterface


    
                        if(viewCompositeInterface == 
                                    null
                                )
                        
                                    {
                                    ForcedLogUtil.log("Activity Null", this)

                                    }
                                

    var view: View = viewCompositeInterface!!.getView()!!

inputMethodManager!!.toggleSoftInputFromWindow(view.getWindowToken(), InputMethodManager.SHOW_FORCED, 0)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            

