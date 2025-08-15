
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
        package org.allbinary.logic.control.workflow.request




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Set
import java.util.Vector
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.workflow.WorkFlowData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicWorkFlow
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var workFlowDoc: Document

    private var workFlowName: String

    private var storeName: String
public constructor        ()
            : super()
        {this.workFlowName= StringUtil.getInstance()!!.EMPTY_STRING
this.workFlowDoc= DomDocumentHelper.create()

    var workFlowNode: Node = this.workFlowDoc!!.createElement(WorkFlowData.getInstance()!!.WORKFLOW)!!
            

this.workFlowDoc!!.appendChild(workFlowNode)
}

public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)
            : super()
        {

                    var hashMap = hashMap


                    var pageContext = pageContext

    var weblisketSession: WeblisketSession = WeblisketSession(hashMap, pageContext)

this.storeName= weblisketSession!!.getStoreName()

    var requestHashMap: HashMap<Any, Any> = RequestParams(pageContext).
                            toHashMap()!!
            

this.workFlowName= requestHashMap!!.get(WorkFlowData.getInstance()!!.NAME) as String
this.workFlowDoc= DomDocumentHelper.create(requestHashMap!!.get(WorkFlowData.getInstance()!!.DATA) as String)
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.workFlowName= hashMap!!.get(WorkFlowData.getInstance()!!.NAME) as String
this.storeName= hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String
this.workFlowDoc= DomDocumentHelper.create(hashMap!!.get(WorkFlowData.getInstance()!!.DATA) as String)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.workFlowName
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeName
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getName() as Object
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var values: Vector = Vector()

values.add(this.workFlowName)
values.add(this.storeName)
values.add(DomDocumentHelper.toString(this.workFlowDoc))

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.add(time)
values.add(time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(WorkFlowData.getInstance()!!.NAME, this.workFlowName)
hashMap!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)
hashMap!!.put(WorkFlowData.getInstance()!!.DATA, DomDocumentHelper.toString(this.workFlowDoc))

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

hashMap!!.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var hashMap: HashMap<Any, Any> = this.toHashMap()!!
            


    var keySet: Set = hashMap!!.keys!!
            


    var node: Node = document.createElement(WorkFlowData.getInstance()!!.WORKFLOW)!!
            


    var nameArray: Array<Any?> = keySet!!.toArray()!!
            


    var size: Int = nameArray!!.size
                





                        for (index in 0 until size)


        {
    var name: String = nameArray[index]!! as String


    var value: String = hashMap!!.get(name as Object?) as String

node.appendChild(ModDomHelper.createNameValueNodes(document, name, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "toXmlNode()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.workFlowDoc
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "toXmlDoc()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var returnBoolean: Boolean = Boolean.TRUE


    
                        if(this.workFlowName == 
                                    null
                                )
                        
                                    {
                                    returnBoolean= Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return returnBoolean
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(this.workFlowName == 
                                    null
                                )
                        stringBuffer!!.append("No WorkFlow name specified.")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Getting Validation Info"
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

