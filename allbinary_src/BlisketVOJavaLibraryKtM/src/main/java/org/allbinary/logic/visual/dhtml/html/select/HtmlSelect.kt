
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
        package org.allbinary.logic.visual.dhtml.html.select




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.io.LineReader
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.dhtml.html.HtmlTag

open public class HtmlSelect : HtmlTag {
        

    private val END: String = ">"

    private val STARTSELECT: String = "<SELECT "

    private val ENDSELECT: String = "</SELECT>"

    private val SIZE: String = "SIZE=\""

    private val NAME: String = "NAME=\""

    private val STARTOPTION: String = "<OPTION"

    private val SELETED: String = "SELECTED"

    private val ENDOPTION: String = "</OPTION>"

    private var before: String

    private var name: String

    private var after: String

    private var size: String

    private var selected: String

    private var options: Vector

    private var multiple: String = "multiple"

    private var isMultipleSelect: Boolean = false
public constructor        (before: String, size: String, name: String, after: String){

                    var before = before


                    var size = size


                    var name = name


                    var after = after
this.before= before
this.size= size
this.name= name
this.after= after
this.options= Vector()
}


open fun addOption(key: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var key = key
this.options.add(key)
}


open fun addOptions(fileName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var fileName = fileName

        try {
            
    var lineReader: LineReader = LineReader(fileName)


        while(lineReader!!.hasNext())
        {
    var option: String = lineReader!!.next()!!

this.addOption(option)
}

} catch(e: Exception)
            {this.addOption("Error")
}

}


open fun setSelected(selected: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var selected = selected
this.selected= selected
}


open fun isMultiple()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isMultipleSelect
}


open fun setMultiple(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.isMultipleSelect= value
}


open fun getOptions()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var result: String = stringUtil!!.EMPTY_STRING


    var optionsArray: Array<Any?> = options.toArray()!!


    var optionsSize: Int = optionsArray!!.size
                





                        for (i in 0 until optionsSize)

        {
    var value: String = optionsArray[i]!! as String


    
                        if(value != 
                                    null
                                 && value.compareTo(stringUtil!!.EMPTY_STRING) != 0)
                        
                                    {
                                    result += STARTOPTION
result += END
result += value
result += ENDOPTION

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var result: String = stringUtil!!.EMPTY_STRING


    var attributeKeys: Array<Any?> = otherAttributes!!.keySet()!!.toArray()!!


    var attributeSize: Int = attributeKeys!!.size
                

result= before
result += STARTSELECT
result += NAME
result += name
result += "\" "
result += SIZE
result += size
result += "\" "




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


    
                        if(this.isMultiple())
                        result += " " +multiple +" "
result += END
result += getOptions()
result += ENDSELECT
result += after



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

