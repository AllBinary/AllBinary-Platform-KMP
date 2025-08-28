
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
        package views.admin.storefront




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.HttpContextView

open public class AddValidationStoreFrontView : HttpContextView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var newStoreFrontInterface: StoreFrontInterface
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.newStoreFrontInterface= StoreFront(this.getPageContext()!!.getRequest() as HttpServletRequest) as StoreFrontInterface

    
                        if(this.newStoreFrontInterface!!.getName() == 
                                    null
                                )
                        this.newStoreFrontInterface!!.setName(this.getWeblisketSession()!!.getStoreName())
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            
    var valid: Boolean = Boolean.TRUE


    
                        if(this.newStoreFrontInterface!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(StoreFrontFactory.getInstance(this.newStoreFrontInterface!!.getName()) != 
                                    null
                                )
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(AbFile(AbPath(this.getStoreViewsPath())).
                            isFile())
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate form", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


                @Throws(Exception::class)
            
open fun getStoreViewsPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(this.newStoreFrontInterface!!.getName())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(this.newStoreFrontInterface!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    stringBuffer!!.append(this.newStoreFrontInterface!!.validationInfo())

                                    }
                                

    
                        if(StoreFrontFactory.getInstance(this.newStoreFrontInterface!!.getName()) != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("Store name already used<br/>")

                                    }
                                

    
                        if(AbFile(AbPath(this.getStoreViewsPath())).
                            isFile())
                        
                                    {
                                    stringBuffer!!.append("Store name clashes with template name<br/>")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return views.ValidationOnlyTempUtil.getInstance()!!.view(this)
}


}
                
            

