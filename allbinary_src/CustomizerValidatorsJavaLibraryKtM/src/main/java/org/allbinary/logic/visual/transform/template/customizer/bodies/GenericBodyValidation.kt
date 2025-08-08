
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
        package org.allbinary.logic.visual.transform.template.customizer.bodies



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlData
import org.allbinary.logic.control.validate.Validation
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class GenericBodyValidation : Validation
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var body: String
public constructor        (){this.body= StringUtil.getInstance()!!.EMPTY_STRING
}

public constructor        (document: Document){

                    var document = document

    var nodeList: NodeList = document.getElementsByTagName(BodyData.getInstance()!!.NAME)!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var aBodyNode: Node = nodeList!!.item(index)!!
            


    var aBodyValueNode: Node = DomSearchHelper.getNode(DomData.VALUE, aBodyNode!!.getChildNodes())!!
            

this.body= DomNodeHelper.getTextNodeValue(aBodyValueNode)
}

}

public constructor        (hashMap: HashMap<Any, Any>){

                    var hashMap = hashMap
this.getFormData(hashMap)
}


                @Throws(Exception::class)
            
open fun getFormData(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap
this.body= hashMap!!.get(BodyData.getInstance()!!.NAME) as String
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var isValid: Boolean = Boolean.TRUE


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.IS_VALID)

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidNotRequired(this.body, BodyData.getInstance()!!.MIN, AbSqlData.MAXBLOB))
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("BodyValidation: " +isValid, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to validate form", this, commonStrings!!.IS_VALID, e)

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



                            {
                            stringBuffer!!.append(
                            "Error: Data submitted is < ")
stringBuffer!!.append(BodyData.getInstance()!!.MIN)
stringBuffer!!.append(
                            " or > ")
stringBuffer!!.append(AbSqlData.MAXBLOB)

                            }
                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to generate validation error info", this, 
                            "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
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


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = ModDomHelper.createNameValueNodes(document, BodyData.getInstance()!!.NAME, this.body)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

