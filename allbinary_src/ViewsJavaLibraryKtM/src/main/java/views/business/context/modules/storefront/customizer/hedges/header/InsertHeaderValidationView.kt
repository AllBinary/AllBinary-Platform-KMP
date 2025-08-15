
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
        package views.business.context.modules.storefront.customizer.hedges.header




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.MultipartRequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.template.customizer.hedges.heading.HeadingValidation
import org.allbinary.logic.visual.transform.template.customizer.widgets.logo.LogoData
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.customizer.CustomizerUtil

open public class InsertHeaderValidationView : TopBarView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val LOGOPATH: String = "logo/"
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    var multipartRequestHashMap: HashMap<Any, Any> = MultipartRequestParams(this.getPageContext()).
                            toHashMap()!!
            


    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!
            


    var fullPath: String = URLGLOBALS.getWebappPath() +storeFrontInterface!!.getCurrentHostNamePath() +LOGOPATH

multipartRequestHashMap!!.put(LogoData.getInstance()!!.IMAGEPATH, fullPath)
this.heading= HeadingValidation(multipartRequestHashMap)
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("topbarValidation", this, commonStrings!!.IS_VALID)

                                    }
                                

    var isValid: Boolean = this.heading.isValid()!!
            


    
                        if(isValid == Boolean.TRUE)
                        
                                    {
                                    CustomizerUtil.getInstance()!!.insert(this.getTransformInfoInterface(), this as DomNodeInterface)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
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

stringBuffer!!.append(this.heading.validationInfo())



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
                
            

