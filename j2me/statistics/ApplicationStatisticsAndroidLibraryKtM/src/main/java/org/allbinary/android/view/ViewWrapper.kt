
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
        package org.allbinary.android.view




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.view.View

open public class ViewWrapper : BaseViewWrapper {
        

    private val view: View
public constructor (view: View){
    //var view = view
this.view= view
}


    override fun invalidate()
        //nullable = true from not(false or (false and true)) = true
{
this.view.invalidate()
}


    override fun postInvalidate()
        //nullable = true from not(false or (false and true)) = true
{
this.view.postInvalidate()
}


}
                
            

