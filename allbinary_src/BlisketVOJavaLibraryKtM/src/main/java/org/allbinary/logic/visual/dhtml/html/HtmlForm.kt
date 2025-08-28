
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
        package org.allbinary.logic.visual.dhtml.html




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.dhtml.html.input.HtmlInput
import org.allbinary.logic.visual.dhtml.html.table.HtmlTable

open public class HtmlForm
            : Object
         {
        

    private val FORMBEGIN: String = "<form "

    private val END: String = ">"

    private val FORMEND: String = "</form>"

    private val ACTION: String = "ACTION=\""

    private val GET: String = "GET\""

    private val POST: String = "POST\""

    private val METHODS: Array<String?> = arrayOf(GET,POST)

    private val METHOD: String = "METHOD=\""

    private var method: String

    private var action: String

    var inputs: Vector
public constructor        (action: String)
            : super()
        {
var action = action
this.action= action
inputs= Vector()
}


open fun setPost()
        //nullable = true from not(false or (false and true)) = true
{
method= POST
}


open fun setGet()
        //nullable = true from not(false or (false and true)) = true
{
method= GET
}


open fun addInput(htmlInput: HtmlInput)
        //nullable = true from not(false or (false and false)) = true
{
var htmlInput = htmlInput
inputs.add(htmlInput)
}


open fun addTable(htmlTable: HtmlTable)
        //nullable = true from not(false or (false and false)) = true
{
var htmlTable = htmlTable
inputs.add(htmlTable)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var result: String = stringUtil!!.EMPTY_STRING


    var inputArray: Array<Any?> = inputs.toArray()!!


    var inputSize: Int = inputArray!!.size
                

result= FORMBEGIN
result += METHOD
result += method
result += "\" "
result += ACTION
result += action
result += "\" "
result += END




                        for (i in 0 until inputSize)

        {
result += inputArray[i]!!.toString()
result += " "
}

result += FORMEND



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

