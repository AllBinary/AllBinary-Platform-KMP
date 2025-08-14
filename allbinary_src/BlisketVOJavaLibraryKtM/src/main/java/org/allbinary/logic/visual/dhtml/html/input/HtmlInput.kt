
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
import org.allbinary.logic.visual.dhtml.html.HtmlTag

open public class HtmlInput : HtmlTag {
        

    private val END: String = ">"

    private val STARTINPUT: String = "<INPUT "

    private val ENDINPUT: String = "</INPUT>"

    private val TYPE: String = "TYPE=\""

    private val NAME: String = "NAME=\""

    private var before: String

    private var type: String

    private var name: String

    private var after: String
public constructor        (before: String, type: String, name: String, after: String){

                    var before = before


                    var type = type


                    var name = name


                    var after = after
this.before= before
this.type= type
this.name= name
this.after= after
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var result: String = stringUtil!!.EMPTY_STRING


    var attributeKeys: Array<Any?> = otherAttributes!!.keySet()!!.toArray()!!
            


    var attributeSize: Int = attributeKeys!!.size
                

result= before
result += STARTINPUT
result += TYPE
result += type
result += "\" "
result += NAME
result += name
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

result += END
result += ENDINPUT
result += after



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

