
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
        package views.business.context.modules.storefront.customizer.includes.style.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.store.theme.StoreThemeCategoryFactory
import org.allbinary.business.category.store.theme.StoreThemeCategoryInterface
import org.allbinary.business.category.store.theme.StoreThemeCategoryPathValidationView
import org.allbinary.data.tree.category.CategoryLoaderFactory
import org.allbinary.data.tree.category.CategoryLoaderInterface
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class EditThemeValidationView : ThemeCustomizerView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            
    var isValid: Boolean = Boolean.TRUE


    var categoryFactoryInterface: CategoryFactoryInterface = StoreThemeCategoryFactory(this.getTransformInfoInterface())


    var categoryLoaderInterface: CategoryLoaderInterface = CategoryLoaderFactory.getInstance(categoryFactoryInterface)!!


    var rootStoreThemeCategoryInterface: StoreThemeCategoryInterface = categoryFactoryInterface!!.getRootInstance() as StoreThemeCategoryInterface


    var storeThemeCategoryInterface: StoreThemeCategoryInterface = categoryLoaderInterface!!.getAll(rootStoreThemeCategoryInterface as CategoryInterface) as StoreThemeCategoryInterface

this.validationInterface= StoreThemeCategoryPathValidationView(storeThemeCategoryInterface as StoreThemeCategoryInterface)
isValid= this.validationInterface!!.isValid()

    var domNodeInterface: DomNodeInterface = this.validationInterface as DomNodeInterface


    var document: Document = DomDocumentHelper.create()!!

document.appendChild(domNodeInterface!!.toXmlNode(document))

    var documentString: String = DomDocumentHelper.toString(document)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Setting Data: " +documentString, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.getTransformInfoInterface()!!.setData(documentString)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
} catch(e: Exception)
            

        Updates for KMP build        
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
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.validationInterface!!.validationInfo())



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
                        return "Error Getting Validation Info"
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


}
                
            

