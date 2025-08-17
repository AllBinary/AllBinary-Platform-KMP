
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
        package org.allbinary.logic.communication.http.request




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Map
import java.util.Set
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class RequestParams
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var map: Map
public constructor        ()
            : super()
        {logUtil!!.put("New RequestParams Size: 0", this, this.commonStrings!!.CONSTRUCTOR)
}

public constructor        (request: HttpServletRequest)
            : super()
        {

                    var request = request
map= request.getParameterMap()
logUtil!!.put("RequestParams Size: " +this.getMap()!!.keySet()!!.size(), this, this.commonStrings!!.CONSTRUCTOR)
}

public constructor        (pageContext: PageContext)
            : super()
        {

                    var pageContext = pageContext
map= pageContext!!.getRequest()!!.getParameterMap()
logUtil!!.put("Request Params Size: " +this.getMap()!!.keySet()!!.size(), this, this.commonStrings!!.CONSTRUCTOR)
}


open fun setMap(map: Map)
        //nullable = true from not(false or (false and false)) = true
{

                    var map = map
this.map= map
}


open fun getMap()
        //nullable = true from not(false or (false and true)) = true
: Map{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.map
}


    private val KEY: String = "Key: "

    private val VALUE: String = " Value: "

open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var node: Node = document.createElement(RequestData.REQUEST)!!
            


    var stringBuffer: StringMaker = StringMaker()


    var keys: Set = map.keySet()!!
            


    var keyArray: Array<Any?> = keys.toArray()!!
            


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var key: String = keyArray[i]!! as String


    var values: Array<String?> = map.get(key) as Array<String?>

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(KEY)
stringBuffer!!.append(key)
stringBuffer!!.append(VALUE)
stringBuffer!!.append(values[0]!!)
logUtil!!.put(stringBuffer!!.toString(), this, "toXmlNode(document)")
node.appendChild(ModDomHelper.createNameValueNodes(document, RequestData.PARAMETER, key.toCharArray().concatToString(), .toCharArray()))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "toXmlNode(document)", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var keys: Set = map.keySet()!!
            


    var keyArray: Array<Any?> = keys.toArray()!!
            


    var size: Int = keyArray!!.size
                


    var stringBuffer: StringMaker = StringMaker()





                        for (i in 0 until size)


        {
    var key: String = keyArray[i]!! as String


    var values: Array<String?> = map.get(key) as Array<String?>

hashMap!!.put(key.toCharArray().concatToString(), .toCharArray())
}

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("RequestParams: ")
stringBuffer!!.append(this.map.toString())
stringBuffer!!.append("\ntoHashMap: ")
stringBuffer!!.append(hashMap!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


}
                
            

