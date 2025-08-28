
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

open public class HtmlRow : HtmlTag {
        

    private val END: String = ">"

    private val START: String = "<tr "

    private val ENDTAG: String = "</tr>"

    private var numberOfColumns: Int = 0

    private var before: String

    private var after: String

    private var htmlCellsVector: Vector
public constructor        (before: String, after: String){
var before = before
var after = after
this.before= before.toCharArray().concatToString()
this.after= after.toCharArray().concatToString()
this.htmlCellsVector= Vector()
}


open fun addCell(htmlCell: HtmlCell)
        //nullable = true from not(false or (false and false)) = true
{
var htmlCell = htmlCell
this.htmlCellsVector!!.add(htmlCell)
this.numberOfColumns++
}


open fun getNumberOfColumns()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return numberOfColumns
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var result: String = stringUtil!!.EMPTY_STRING


    var attributeKeys: Array<Any?> = otherAttributes!!.keySet()!!.toArray()!!


    var attributeSize: Int = attributeKeys!!.size
                


    var cellSize: Int = htmlCellsVector!!.size!!

result= before
result += START
result += " "




                        for (i in 0 until attributeSize)

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




                        for (i in 0 until cellSize)

        {
result += htmlCellsVector!!.get(i)!!.toString()
result += " "
}

result += ENDTAG
result += after



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

