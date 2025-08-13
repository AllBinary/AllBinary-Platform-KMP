
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
        package org.allbinary.android.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.android.AndroidInfoFactory
import org.allbinary.android.input.api1.VirtualKeyboardAPI1
import org.allbinary.android.input.api3.VirtualKeyboardAPI3
import android.app.Activity

open public class VirtualKeyboardFactory
            : Object
         {
        

        companion object {
            
    private var virtualKeyboard: VirtualKeyboard = VirtualKeyboard.NULL_VIRTUAL_KEYBOARD

open fun init(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
{

                    var activity = activity

    var SDK_VERSION: Int = AndroidInfoFactory.getInstance()!!.getVersion()!!
            


    
                        if(SDK_VERSION <= 2)
                        
                                    {
                                    virtualKeyboard= VirtualKeyboardAPI1(activity)

                                    }
                                
                        else {
                            virtualKeyboard= VirtualKeyboardAPI3(activity)

                        }
                            
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VirtualKeyboard{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return virtualKeyboard
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

