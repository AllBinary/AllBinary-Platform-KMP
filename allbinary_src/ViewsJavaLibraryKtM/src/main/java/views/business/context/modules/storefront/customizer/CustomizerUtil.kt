
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
        package views.business.context.modules.storefront.customizer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tables.transform.info.TransformInfoEntity
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfo
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface
import org.w3c.dom.Document

open public class CustomizerUtil
            : Object
         {
        
companion object {
            
    private val instance: CustomizerUtil = CustomizerUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CustomizerUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getTransformInfoInterfaceToCustomize(customizerTransformInfoInterface: TransformInfoInterface, transformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
: TransformInfoInterface{
var customizerTransformInfoInterface = customizerTransformInfoInterface
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +customizerTransformInfoInterface!!.getName(), this, "getTransformInfoInterfaceToCustomize()")

                                    }
                                

    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var viewName: String = transformInfoInterface!!.getName()!!


    var httpTransformInfoInterface: TransformInfoHttpInterface = customizerTransformInfoInterface as TransformInfoHttpInterface


    var customizedTransformInfoInterface: TransformInfoInterface = transformInfoEntityInterface!!.get(viewName, httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return customizedTransformInfoInterface
}


                @Throws(Exception::class)
            
    open fun getTransformInfoObjectConfigComponentNodesToCustomize(customizerTransformInfoInterface: Object, transformInfoInterface: Object)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var customizerTransformInfoInterface = customizerTransformInfoInterface
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +customizerTransformInfoInterface!!.getName(), this, "getTransformInfoObjectConfigComponentNodesToCustomize()")

                                    }
                                

    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var viewName: String = transformInfoInterface!!.getName()!!


    var httpTransformInfoInterface: TransformInfoHttpInterface = customizerTransformInfoInterface as TransformInfoHttpInterface


    var customizedTransformInfoInterface: TransformInfoInterface = transformInfoEntityInterface!!.get(viewName, httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransformInfoObjectConfigComponentNodes(customizedTransformInfoInterface)
}


                @Throws(Exception::class)
            
    open fun getTransformInfoObjectConfigComponentNodes(transformInfoInterface: Object)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "getTransformInfoObjectConfigComponentNodes()")

                                    }
                                

    var transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface = transformInfoInterface!!.getObjectConfigInterface()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoObjectConfigInterface!!.getTransforms()
}


                @Throws(Exception::class)
            
    open fun getTransformInfoObjectConfigGroupComponentNodes(transformInfoInterface: Object)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "getTransformInfoObjectConfigComponentNodes()")

                                    }
                                

    var transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface = transformInfoInterface!!.getObjectConfigInterface()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoObjectConfigInterface!!.getGroupTransforms()
}


                @Throws(Exception::class)
            
    open fun insert(transformInfoInterface: TransformInfoInterface, domNodeInterface: DomNodeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var transformInfoInterface = transformInfoInterface
var domNodeInterface = domNodeInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "insert()")

                                    }
                                

    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var allViewsToBeModified: Vector = this.getTransformInfoObjectConfigGroupComponentNodes(transformInfoInterface)!!


    var document: Document = DomDocumentHelper.create()!!

document.appendChild(domNodeInterface!!.toXmlNode(document))

    var documentString: String = DomDocumentHelper.toString(document)!!


    var stringBuffer: StringMaker = StringMaker()


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    stringBuffer!!.append("Total Views For Modification: ")
stringBuffer!!.append(allViewsToBeModified!!.size)
stringBuffer!!.append(" New Xml/Data: ")
stringBuffer!!.append(documentString)
logUtil!!.put(stringBuffer!!.toString(), this, "insert()")

                                    }
                                
transformInfoInterface!!.setData(documentString)

    var size: Int = allViewsToBeModified!!.size!!





                        for (index in 0 until size)

        {

    var transformInfo: TransformInfo = allViewsToBeModified!!.get(index) as TransformInfo


    var viewNameOfViewToBeModified: String = transformInfo!!.getName()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(transformInfoInterface!!.getName())
stringBuffer!!.append(" is modifying view: ")
stringBuffer!!.append(viewNameOfViewToBeModified)
logUtil!!.put(stringBuffer!!.toString(), this, "insert()")

                                    }
                                

    var httpTransformInfoInterface: TransformInfoHttpInterface = transformInfoInterface as TransformInfoHttpInterface


    var specifiedTransformInfoInterface: TransformInfoInterface = transformInfoEntityInterface!!.get(viewNameOfViewToBeModified, httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())!!


    
                        if(specifiedTransformInfoInterface == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(transformInfoInterface!!.getName())
stringBuffer!!.append(" is unable to add data to view: ")
stringBuffer!!.append(viewNameOfViewToBeModified)
stringBuffer!!.append(" since it does not exist")
logUtil!!.put(stringBuffer!!.toString(), this, "insert()")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(transformInfoInterface!!.getName() +" is adding data to view: " +viewNameOfViewToBeModified, this, "insert()")

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(viewNameOfViewToBeModified)
stringBuffer!!.append(" is changing data in ")
stringBuffer!!.append(specifiedTransformInfoInterface!!.getDataFilePath()!!.toString())
stringBuffer!!.append(" to the following data:\n")
stringBuffer!!.append(documentString)
logUtil!!.put(stringBuffer!!.toString(), this, "insert()")

                                    }
                                
this.write(specifiedTransformInfoInterface, documentString)

                        }
                            
}

}


                @Throws(Exception::class)
            
    open fun write(specifiedTransformInfoInterface: TransformInfoInterface, documentString: String)
        //nullable = true from not(false or (false and false)) = true
{
var specifiedTransformInfoInterface = specifiedTransformInfoInterface
var documentString = documentString

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +specifiedTransformInfoInterface!!.getName(), this, "write()")

                                    }
                                

    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!

specifiedTransformInfoInterface!!.setData(documentString)
transformInfoEntityInterface!!.update(specifiedTransformInfoInterface!!.toHashMap())
}


                @Throws(Exception::class)
            
    open fun getViewDataForComponentsInObjectConfig(transformInfoInterface: Object)
        //nullable = true from not(false or (false and false)) = true
: Document{
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "getViewDataForComponentsInObjectConfig()")

                                    }
                                

    var transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface = transformInfoInterface!!.getObjectConfigInterface()!!


    var allViewsToBeModified: Vector = transformInfoObjectConfigInterface!!.getGroupTransforms()!!


    var transformInfoEntityInterface: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var size: Int = allViewsToBeModified!!.size!!





                        for (index in 0 until size)

        {

    var nextTransformInfoInterface: TransformInfo = allViewsToBeModified!!.get(index) as TransformInfo


    var viewNameOfViewToBeModified: String = nextTransformInfoInterface!!.getName()!!


    var httpTransformInfoInterface: TransformInfoHttpInterface = transformInfoInterface as TransformInfoHttpInterface


    var specifiedTransformInfoInterface: TransformInfoInterface = transformInfoEntityInterface!!.get(viewNameOfViewToBeModified, httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return specifiedTransformInfoInterface!!.getDataDocument()
}




                            throw Exception("No Components Specified in ObjectConfig")
}


}
                
            

