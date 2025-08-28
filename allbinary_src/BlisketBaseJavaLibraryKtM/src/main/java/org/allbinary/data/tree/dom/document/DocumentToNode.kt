
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
        package org.allbinary.data.tree.dom.document




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.regex.replace.Replace

open public class DocumentToNode
            : Object
         {
        

        companion object {
            
    private val XMLROOT: String = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"

    private val XMLROOTSTART: String = "<?xml"

    private val XMLROOTEND: String = "?>"

    private val XMLJSPROOTSTART: String = "<jsp:root"

    private val XMLEND: String = ">"

    private val XMLJSPROOTENDSTART: String = "</jsp:root"

                @Throws(Exception::class)
            
open fun convertDocumentToNodeString(documentString: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var documentString = documentString
documentString= remove(documentString, XMLJSPROOTSTART, XMLEND)
documentString= remove(documentString, XMLJSPROOTENDSTART, XMLEND)

    var replaceXmlRoot: Replace = Replace(XMLROOT, StringUtil.getInstance()!!.EMPTY_STRING)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return replaceXmlRoot!!.all(documentString)
}


open fun removeXmlDefinitionFromDocumentString(documentString: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var documentString = documentString



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return remove(documentString, XMLROOTSTART, XMLROOTEND)
}


open fun remove(documentString: String, start: String, end: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var documentString = documentString
var start = start
var end = end

    var startIndex: Int= 0


        while((startIndex= documentString!!.indexOf(start)) !=  -1)
        {

    
                        if(startIndex >= 0)
                        
                                    {
                                    
    var endIndex: Int = documentString!!.indexOf(end, startIndex)!!


    
                        if(endIndex >= 0)
                        
                                    {
                                    
    var startString: String = documentString!!.substring(0, startIndex)!!


    var resultString: String = documentString!!.substring(endIndex +1)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startString +resultString

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return documentString
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

