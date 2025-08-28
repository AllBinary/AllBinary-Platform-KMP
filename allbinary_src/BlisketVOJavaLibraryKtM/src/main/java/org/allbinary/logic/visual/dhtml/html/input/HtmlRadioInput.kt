
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
        package org.allbinary.logic.visual.dhtml.html.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.java.bool.BooleanFactory

open public class HtmlRadioInput : HtmlValueInput {
        

    private val CHECKED: String = "checked"
public constructor        (before: String, name: String, value: String, after: String)                        

                            : super(before, HtmlInputData.getInstance()!!.RADIO, name, value, after)

        Updates for KMP build        
        {
var before = before
var name = name
var value = value
var after = after


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setSelected()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
super.addAttribute(CHECKED, BooleanFactory.getInstance()!!.TRUE_STRING)
}


}
                
            

