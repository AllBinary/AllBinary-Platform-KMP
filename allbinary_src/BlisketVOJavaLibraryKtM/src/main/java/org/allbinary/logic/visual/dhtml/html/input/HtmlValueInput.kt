
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
        
import org.allbinary.logic.string.StringUtil

open public class HtmlValueInput : HtmlInput {
        

    private var value: String

    private val VALUE: String = "VALUE"
public constructor        (before: String, type: String, name: String, value: String, after: String)                        

                            : super(before, type, name, after)

        Updates for KMP build        
        {
var before = before
var type = type
var name = name
var value = value
var after = after


                            //For kotlin this is before the body of the constructor.
                    

    var stringUtil: StringUtil = StringUtil.getInstance()!!

this.value= stringUtil!!.EMPTY_STRING
addAttribute(VALUE, value)
}


}
                
            

