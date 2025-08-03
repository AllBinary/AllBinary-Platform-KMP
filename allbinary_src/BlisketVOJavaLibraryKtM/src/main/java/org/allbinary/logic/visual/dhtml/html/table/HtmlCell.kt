
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
        package org.allbinary.logic.visual.dhtml.html.table



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.dhtml.html.HtmlTag

open public class HtmlCell : HtmlTag {
        

    private val END: String = ">"

    private val START: String = "<td "

    private val ENDTAG: String = "</td>"

    private val HEIGHT: String = "height"

    private val WIDTH: String = "width"

    private var height: String

    private var width: String

    private var before: String

    private var body: String

    private var after: String
public constructor        (before: String, width: String, height: String, after: String){

                    var before = before


                    var width = width


                    var height = height


                    var after = after
this.before= before.concatToString()
this.after= after.concatToString()
this.height= height.concatToString()
this.width= width.concatToString()
addAttribute(HEIGHT, this.height)
addAttribute(WIDTH, this.width)
}


open fun addText(body: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var body = body
this.body= body
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var result: String = stringUtil!!.EMPTY_STRING


    var attributeKeys: Array<Any?> = otherAttributes!!.keySet()!!.toArray()!!
            


    var attributeSize: Int = attributeKeys!!.size
                

result= before
result += START
result += 
                                    //Otherwise - expression - AssignExpr - value - StringLiteralExpr





                        for (i in 0 until attributeSize)


        {
    var key: String = attributeKeys[i]!! as String


    var value: String = otherAttributes!!.get(key) as String


    
                        if(value != 
                                    null
                                 && value!!.compareTo(stringUtil!!.EMPTY_STRING) != 0)
                        
                                    {
                                    result += key
result += 
                                    //Otherwise - expression - AssignExpr - value - StringLiteralExpr

result += value
result += 
                                    //Otherwise - expression - AssignExpr - value - StringLiteralExpr


                                    }
                                
}

result += END
result += body
result += ENDTAG
result += after



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

