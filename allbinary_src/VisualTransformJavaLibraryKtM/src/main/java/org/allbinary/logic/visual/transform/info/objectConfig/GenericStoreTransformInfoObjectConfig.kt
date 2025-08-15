
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
        package org.allbinary.logic.visual.transform.info.objectConfig




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.RootTransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoHttp
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.template.TransformTemplateFactory
import org.allbinary.logic.visual.transform.template.TransformTemplateInterface
import org.allbinary.logic.visual.transform.template.util.TransformTemplateCustomizerUtil
import org.allbinary.string.CommonSeps
import org.w3c.dom.Document

open public class GenericStoreTransformInfoObjectConfig : TransformInfoObjectConfig {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val abeClientInformation: AbeClientInformationInterface
public constructor        (abeClientInformation: Object, transformInfoInterface: Object)                        

                            : super(transformInfoInterface){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
}

public constructor        (abeClientInformation: Object, transformInfoInterface: Object, document: Object)                        

                            : super(transformInfoInterface, document){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var document = document


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
this.setDocument(this.generate(this.toXmlDoc()))
}

public constructor        (abeClientInformation: Object, transformInfoInterface: Object, name: Object, type: Object)                        

                            : super(transformInfoInterface, name, type){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var name = name


                    var type = type


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
this.setDocument(this.generate(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun generate(objectConfigDocument: Document)
        //nullable = true from not(false or (false and false)) = true
: Document{

                    var objectConfigDocument = objectConfigDocument

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TransformInfo: ")

    
                        if(this.getTransformInfoInterface() != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.getTransformInfoInterface()!!.getName())

                                    }
                                
                        else {
                            stringBuffer!!.append("No Owner!?#@")

                        }
                            
logUtil!!.put(stringBuffer!!.toString(), this, "generate()")

                                    }
                                

    var transformInfoHttpStoreInterface: TransformInfoHttp = this.getTransformInfoInterface() as TransformInfoHttp


    var objectConfigDocumentString: String = DomDocumentHelper.toString(objectConfigDocument)!!
            


    var replaceHashMap: HashMap<Any, Any> = this.createReplaceHashMap(transformInfoHttpStoreInterface, objectConfigDocumentString)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.generate(objectConfigDocumentString, replaceHashMap)
}


                @Throws(Exception::class)
            
open fun createReplaceHashMap(transformInfoHttpStoreInterface: TransformInfoHttp, objectConfigDocumentString: String)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var transformInfoHttpStoreInterface = transformInfoHttpStoreInterface


                    var objectConfigDocumentString = objectConfigDocumentString

    var storeName: String = transformInfoHttpStoreInterface!!.getStoreName()!!
            


    var hashMap: HashMap<Any, Any> = this.createHashMap(transformInfoHttpStoreInterface, objectConfigDocumentString)!!
            


    var transformInfoObjectConfigData: TransformInfoObjectConfigData = TransformInfoObjectConfigData.getInstance()!!
            

hashMap!!.put(transformInfoObjectConfigData!!.VARKEY +StoreFrontData.getInstance()!!.NAME, storeName)

    var pageName: String = TransformTemplateCustomizerUtil.getInstance()!!.getPageNameHack(this.getTransformInfoInterface()!!.getName(), storeName)!!
            

hashMap!!.put(transformInfoObjectConfigData!!.VARKEY +TransformInfoData.getInstance()!!.PARTIAL, pageName)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun createHashMap(transformInfoHttpStoreInterface: TransformInfoHttp, objectConfigDocumentString: String)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var transformInfoHttpStoreInterface = transformInfoHttpStoreInterface


                    var objectConfigDocumentString = objectConfigDocumentString

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var storeName: String = transformInfoHttpStoreInterface!!.getStoreName()!!
            


    var propertiesHashMap: HashMap<Any, Any> = transformInfoHttpStoreInterface!!.getPropertiesHashMap()!!
            


    var templateNameOverride: String = StringUtil.getInstance()!!.getInstance(propertiesHashMap!!.get(TransformInfoData.getInstance()!!.PARTIAL) as String)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TemplateNameOverride: " +templateNameOverride, this, "generate()")

                                    }
                                

    var templateNameStringBuffer: StringMaker = StringMaker()

templateNameStringBuffer!!.append(storeName)
templateNameStringBuffer!!.append(templateNameOverride)
templateNameStringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
templateNameStringBuffer!!.append(RootTransformInfoData.NAME)

    var templateNameKey: String = TransformInfoObjectConfigData.getInstance()!!.VARKEY +TransformInfoData.getInstance()!!.OWNER


    
                        if(objectConfigDocumentString!!.indexOf(templateNameKey) !=  -1)
                        
                                    {
                                    
    var templateInterface: TransformTemplateInterface = TransformTemplateFactory.getInstance()!!.getInstance(abeClientInformation, templateNameStringBuffer!!.toString(), transformInfoHttpStoreInterface!!.getPropertiesHashMap(), transformInfoHttpStoreInterface!!.getPageContext())!!
            


    var selectedTemplate: String = templateInterface!!.getName()!!
            

hashMap!!.put(templateNameKey, selectedTemplate)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun generate(objectConfigDocumentString: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Document{

                    var objectConfigDocumentString = objectConfigDocumentString


                    var hashMap = hashMap

    var replace: Replace = Replace(hashMap)


    var newObjectConfigDocument: Document = DomDocumentHelper.create(replace.all(objectConfigDocumentString))!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Final ObjectConfig: " +DomDocumentHelper.toString(newObjectConfigDocument), this, "generate()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newObjectConfigDocument
}


}
                
            

