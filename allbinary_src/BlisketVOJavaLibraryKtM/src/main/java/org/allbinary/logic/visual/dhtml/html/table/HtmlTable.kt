
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.dhtml.html.HtmlTag
import org.allbinary.string.CommonPhoneStrings

open public class HtmlTable : HtmlTag {
        

    private val END: String = ">"

    private val START: String = "<table "

    private val ENDTAG: String = "</table>"

    private val CLASS: String = "class"

    private val DIRECTION: String = "dir"

    private val ID: String = "id"

    private val LANG: String = "lang"

    private val UNITS: String = "units"

    private val BORDER: String = "border"

    private val CELLPADDING: String = "cellpadding"

    private val CELLSPACING: String = "cellspacing"

    private val COLS: String = "cols"

    private val FLOAT: String = "float"

    private val FRAME: String = "frame"

    private val RULES: String = "rules"

    private val WIDTH: String = "width"

    private val STYLE: String = "style"

    val BORDERCOLLAPSE: String = "border-collapse: collapse"

    private var numberOfColumns: Int = 0

    private var before: String

    private var border: String

    private var cellpadding: String

    private var cellspacing: String

    private var style: String

    private var name: String

    private var after: String

    private var htmlRowsVector: Vector
public constructor        (before: String, cellpadding: String, cellspacing: String, after: String){

                    var before = before


                    var cellpadding = cellpadding


                    var cellspacing = cellspacing


                    var after = after
this.before= before
this.cellpadding= cellpadding
this.cellspacing= cellspacing
this.after= after
this.htmlRowsVector= Vector()
addAttribute(BORDER, CommonPhoneStrings.getInstance()!!.ZERO)
addAttribute(CELLPADDING, this.cellpadding)
addAttribute(CELLSPACING, this.cellspacing)
addAttribute(STYLE, this.BORDERCOLLAPSE)
}


open fun addRow(htmlRow: HtmlRow)
        //nullable = true from not(false or (false and false)) = true
{

                    var htmlRow = htmlRow

    
                        if(this.numberOfColumns < htmlRow!!.getNumberOfColumns())
                        this.numberOfColumns= htmlRow!!.getNumberOfColumns()
this.htmlRowsVector!!.add(htmlRow)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var result: String = stringUtil!!.EMPTY_STRING


    var attributeKeys: Array<Any?> = otherAttributes!!.keySet()!!.toArray()!!

result= before
result += START
result += " "




                        for (i in 0 until attributeKeys!!.size)

        {
    var key: String = attributeKeys[i]!! as String


    var value: String = otherAttributes!!.get(key) as String


    
                        if(value != 
                                    null
                                 && value.compareTo(stringUtil!!.EMPTY_STRING) != 0)
                        
                                    {
                                    result += key
result += "=\""
result += value
result += "\" "

                                    }
                                
}

result += END

    var size: Int = htmlRowsVector!!.size!!





                        for (i in 0 until size)

        {result += htmlRowsVector!!.get(i)!!.toString()
result += " "
}

result += ENDTAG
result += after



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

