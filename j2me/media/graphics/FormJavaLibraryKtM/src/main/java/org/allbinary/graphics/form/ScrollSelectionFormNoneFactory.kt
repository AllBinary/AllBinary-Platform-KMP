
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
        package org.allbinary.graphics.form



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.logic.string.StringUtil

open public class ScrollSelectionFormNoneFactory
            : Object
         {
        

        companion object {


    private val instance: ScrollSelectionForm = ScrollSelectionForm(StringUtil.getInstance()!!.EMPTY_STRING, arrayOfNulls(0), RectangleFactory.SINGLETON, FormTypeFactory.getInstance()!!.HORIZONTAL_FORM, 0, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ScrollSelectionForm{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

