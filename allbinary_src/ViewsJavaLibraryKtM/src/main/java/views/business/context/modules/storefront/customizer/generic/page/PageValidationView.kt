
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
        package views.business.context.modules.storefront.customizer.generic.page




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.transform.info.TransformInfoEntity
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfo
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface
import org.allbinary.logic.visual.transform.template.customizer.page.PageValidation
import org.allbinary.logic.visual.transform.template.customizer.widgets.title.TitleData
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.customizer.CustomizerUtil

open public class PageValidationView : PageView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "PageViewValidation()")

                                    }
                                
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
                                

    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var pageObjectConfigInterface: TransformInfoObjectConfigInterface = this.getTransformInfoInterface()!!.getObjectConfigInterface()!!


    var allViewsToBeModifiedVector: Vector = pageObjectConfigInterface!!.getGroupTransforms()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Views To Be Modified: " +allViewsToBeModifiedVector!!.size, this, "get(transformInfoInterface)")

                                    }
                                

    var size: Int = allViewsToBeModifiedVector!!.size!!





                        for (index in 0 until size)


        {
    var transformInfoInterface: TransformInfo = allViewsToBeModifiedVector!!.get(index) as TransformInfo


    var viewNameOfViewToBeModified: String = transformInfoInterface!!.getName()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getTransformInfoInterface()!!.getName())
stringBuffer!!.append(" is modifying view: ")
stringBuffer!!.append(viewNameOfViewToBeModified)
logUtil!!.put(stringBuffer!!.toString(), this, "insert()")

                                    }
                                

    var httpTransformInfoInterface: TransformInfoHttpInterface = this.getTransformInfoInterface() as TransformInfoHttpInterface


    var specifiedTransformInfoInterface: TransformInfoInterface = transformInfoEntityInterface!!.get(viewNameOfViewToBeModified, httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getTransformInfoInterface()!!.getName())
stringBuffer!!.append(" is adding data to view: ")
stringBuffer!!.append(viewNameOfViewToBeModified)
logUtil!!.put(stringBuffer!!.toString(), this, "insert()")

                                    }
                                

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var title: String = specifiedTransformInfoInterface!!.getName()!!.substring(this.getTransformInfoInterface()!!.getStoreName()!!.length())!!


    
                        if(title.compareTo("index") == 0)
                        
                                    {
                                    hashMap!!.put(TitleData.getInstance()!!.TEXT, this.getTransformInfoInterface()!!.getStoreName() +" - Home Page")

                                    }
                                
                        else {
                            hashMap!!.put(TitleData.getInstance()!!.TEXT, this.getTransformInfoInterface()!!.getStoreName() +" -" +title)

                        }
                            

    var pageValidation: PageValidation = PageValidation(hashMap)


    
                        if(pageValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(isValid == Boolean.TRUE)
                        
                                    {
                                    
    var document: Document = DomDocumentHelper.create()!!

document.appendChild(pageValidation!!.toXmlNode(document))

    var documentString: String = DomDocumentHelper.toString(document)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(viewNameOfViewToBeModified)
stringBuffer!!.append(" is changing data in ")
stringBuffer!!.append(specifiedTransformInfoInterface!!.getDataFilePath()!!.toString())
stringBuffer!!.append(" to the following data:\n")
stringBuffer!!.append(documentString)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                
CustomizerUtil.getInstance()!!.write(specifiedTransformInfoInterface, documentString)

                                    }
                                
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


    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var objectConfig: TransformInfoObjectConfigInterface = this.getTransformInfoInterface()!!.getObjectConfigInterface()!!


    var httpTransformInfoInterface: TransformInfoHttpInterface = this.getTransformInfoInterface() as TransformInfoHttpInterface


    var allViewsToBeModifiedVector: Vector = objectConfig!!.getGroupTransforms()!!


    var size: Int = allViewsToBeModifiedVector!!.size!!





                        for (index in 0 until size)


        {
    var transformInfoInterface: TransformInfo = allViewsToBeModifiedVector!!.get(index) as TransformInfo


    var viewNameOfViewToBeModified: String = transformInfoInterface!!.getName()!!


    var specifiedTransformInfoInterface: TransformInfoInterface = transformInfoEntityInterface!!.get(viewNameOfViewToBeModified, httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())!!


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var title: String = specifiedTransformInfoInterface!!.getName()!!.substring(this.getTransformInfoInterface()!!.getStoreName()!!.length())!!


    
                        if(title.compareTo("index") == 0)
                        
                                    {
                                    hashMap!!.put(TitleData.getInstance()!!.TEXT, this.getTransformInfoInterface()!!.getStoreName() +" - Home Page")

                                    }
                                
                        else {
                            hashMap!!.put(TitleData.getInstance()!!.TEXT, this.getTransformInfoInterface()!!.getStoreName() +" -" +title)

                        }
                            

    var pageValidation: PageValidation = PageValidation(hashMap)


    
                        if(pageValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    stringBuffer!!.append("TransformInfo Name for PageValidation:" +specifiedTransformInfoInterface!!.getName())
stringBuffer!!.append("PageValidation:" +hashMap)
stringBuffer!!.append("PageValidation Info:" +pageValidation!!.validationInfo())

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "An auto generated page name was invalid."
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
                
            

