
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
                *  II
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.visual.transform.template.customizer.includes.meta




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.Validation
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.dhtml.html.head.meta.HtmlMetaAttributeDataFactory
import org.allbinary.logic.visual.dhtml.html.head.meta.HtmlMetaAttributeValuesData
import org.allbinary.logic.visual.dhtml.html.head.meta.HtmlMetasData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class MetasValidation : Validation
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var storeFrontInterface: StoreFrontInterface

    private var metaValidationVector: Vector
public constructor        (storeName: String){

                    var storeName = storeName
this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)
this.metaValidationVector= Vector()

    var contentValue: String = this.storeFrontInterface!!.getName() +" E-Commerce Site"


    var keywordsMetaValidation: MetaValidation = MetaValidation(HtmlMetaAttributeDataFactory.getInstance()!!.NAME, "Keywords", HtmlMetaAttributeValuesData.getInstance()!!.KEYWORDS, contentValue)


    var abstractMetaValidation: MetaValidation = MetaValidation(HtmlMetaAttributeDataFactory.getInstance()!!.NAME, "Abstract", HtmlMetaAttributeValuesData.getInstance()!!.ABSTRACT, contentValue)


    var descriptionMetaValidation: MetaValidation = MetaValidation(HtmlMetaAttributeDataFactory.getInstance()!!.NAME, "Description", HtmlMetaAttributeValuesData.getInstance()!!.DESCRIPTION, contentValue)

this.metaValidationVector!!.add(keywordsMetaValidation)
this.metaValidationVector!!.add(abstractMetaValidation)
this.metaValidationVector!!.add(descriptionMetaValidation)
}

public constructor        (document: Document){

                    var document = document



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var valid: Boolean = Boolean.TRUE




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate form", this, commonStrings!!.IS_VALID, e)

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




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

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

    var node: Node = document.createElement(HtmlMetasData.getInstance()!!.NAME)!!


    var metaArray: Array<MetaValidation?> = this.metaValidationVector!!.toArray(arrayOfNulls(0)) as Array<MetaValidation?>


    var size: Int = metaArray!!.size
                





                        for (i in 0 until size)


        {
    var metaValidation: MetaValidation = metaArray[i]!!

node.appendChild(metaValidation!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

