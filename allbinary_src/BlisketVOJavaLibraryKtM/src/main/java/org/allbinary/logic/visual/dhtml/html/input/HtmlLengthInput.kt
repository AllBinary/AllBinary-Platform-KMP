
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class HtmlLengthInput : HtmlValueInput {
        

    private val MAXLENGTH: String = "MAXLENGTH"

    private val SIZE: String = "SIZE"

    private var length: String

    private var size: String
public constructor        (before: String, type: String, name: String, value: String, after: String)                        

                            : super(before, type, name, value, after){
var before = before
var type = type
var name = name
var value = value
var after = after


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setMaxLength(length: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var length = length
this.length= length.toString().toCharArray().concatToString()
                                
addAttribute(MAXLENGTH, this.length)
}


open fun setSize(size: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var size = size
this.size= size.toString().toCharArray().concatToString()
                                
addAttribute(MAXLENGTH, this.size)
}


}
                
            

