
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
        package org.allbinary.android.activity



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface ProgressActivityInterface {
        

open fun runOnUiThread(action: Runnable)
        //nullable = true from not(false or (false and false)) = true


open fun onDismissTitleProgressBar()
        //nullable = true from not(false or (false and true)) = true


open fun onShowTitleProgressBar(value: Int, indeterminate: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun onTitleProgressBarSetProgress(value: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

