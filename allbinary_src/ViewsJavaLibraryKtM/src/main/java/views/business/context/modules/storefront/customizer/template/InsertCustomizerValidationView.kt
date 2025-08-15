
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
        package views.business.context.modules.storefront.customizer.template




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.info.GeneratorTransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfo
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfosData
import org.allbinary.string.CommonSeps
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView
import views.business.context.modules.storefront.customizer.template.objectConfig.InsertTemplateCustomizerTransformInfoObjectConfig
import views.business.context.modules.storefront.customizer.template.objectConfig.NoTemplateTransformInfoObjectConfig

open public class InsertCustomizerValidationView : HttpStoreComponentView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var viewName: String
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

    var requestHashMap: HashMap<Any, Any> = RequestParams(this.getPageContext()).
                            toHashMap()!!
            

this.viewName= requestHashMap!!.get(TransformInfoData.getInstance()!!.NAME) as String
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Started Validation", this, commonStrings!!.IS_VALID)

                                    }
                                

    var isValid: Boolean = Boolean.TRUE


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.viewName))
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                
                        else {
                            
    var objectConfig: NoTemplateTransformInfoObjectConfig = NoTemplateTransformInfoObjectConfig(this.getTransformInfoInterface(), this.getTransformInfoInterface()!!.getObjectConfigInterface()!!.toXmlDoc())


    var componentVector: Vector = objectConfig!!.getGroupTransforms()!!
            


    var size: Int = componentVector!!.size!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Pointing ")
stringBuffer!!.append(componentVector!!.size)
stringBuffer!!.append(" Components")
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                




                        for (index in 0 until size)


        {
    var transformInfo: TransformInfo = componentVector!!.get(index) as TransformInfo


    var transformInfoName: String = transformInfo!!.getName()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Setting Template Component with ViewName: " +transformInfoName, this, commonStrings!!.IS_VALID)

                                    }
                                

    var componentInterface: TransformInterface = TransformFactory.getInstance()!!.getInstance(this.abeClientInformation, transformInfoName, this.getTransformInfoInterface())!!
            


    var templateViewObjectConfig: InsertTemplateCustomizerTransformInfoObjectConfig = InsertTemplateCustomizerTransformInfoObjectConfig(componentInterface!!.getTransformInfoInterface(), componentInterface!!.getTransformInfoInterface()!!.getObjectConfigInterface()!!.toXmlDoc())


    var storeName: String = this.getTransformInfoInterface()!!.getStoreName()!!
            


    var endIndex: Int = this.viewName!!.indexOf(storeName) +storeName!!.length


    var storePrepend: String = this.viewName!!.substring(0, endIndex)!!
            


    var viewNamePostfix: String = this.viewName!!.substring(endIndex, this.viewName!!.length)!!
            


    var newViewNameStringBuffer: StringMaker = StringMaker()

newViewNameStringBuffer!!.append(storePrepend)

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var transformInfosData: TransformInfosData = TransformInfosData.getInstance()!!
            


    
                        if(transformInfoName!!.indexOf(transformInfosData!!.SMALL_PREVIEW) >= 0)
                        
                                    {
                                    newViewNameStringBuffer!!.append(commonSeps!!.SPACE)
newViewNameStringBuffer!!.append(transformInfosData!!.SMALL_PREVIEW)

                                    }
                                
                             else 
    
                        if(transformInfoName!!.indexOf(transformInfosData!!.PREVIEW) >= 0)
                        
                                    {
                                    newViewNameStringBuffer!!.append(commonSeps!!.SPACE)
newViewNameStringBuffer!!.append(transformInfosData!!.PREVIEW)

                                    }
                                
newViewNameStringBuffer!!.append(commonSeps!!.SPACE)
newViewNameStringBuffer!!.append(viewNamePostfix)

    
                        if(transformInfoName!!.indexOf(GeneratorTransformInfoData.NAME) >= 0)
                        
                                    {
                                    newViewNameStringBuffer!!.append(commonSeps!!.SPACE)
newViewNameStringBuffer!!.append(GeneratorTransformInfoData.NAME)

                                    }
                                

    var newViewName: String = newViewNameStringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Template Component: ")
stringBuffer!!.append(transformInfoName)
stringBuffer!!.append("\n Now Pointing To View Name: ")
stringBuffer!!.append(newViewName)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                
templateViewObjectConfig!!.set(newViewName)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Template Component: ")
stringBuffer!!.append(transformInfoName)
stringBuffer!!.append("\n with ObjectConfig: ")
stringBuffer!!.append(templateViewObjectConfig!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                
componentInterface!!.getTransformInfoInterface()!!.setObjectConfigInterface(templateViewObjectConfig)

    var updatedTransformInfoHashMap: HashMap<Any, Any> = componentInterface!!.getTransformInfoInterface()!!.toHashMap()!!
            

TransformInfoEntityBuilder.getInstance()!!.update(updatedTransformInfoHashMap)
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

stringBuffer!!.append("Error: Template Name Is Empty.")



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


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return views.ValidationOnlyTempUtil.getInstance()!!.view(this)
}


}
                
            

