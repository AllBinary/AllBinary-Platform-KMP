
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
        package views.business.context.modules.storefront.customizer.template.objectConfig




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfig
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigData
import org.allbinary.logic.visual.transform.template.util.TransformTemplateCustomizerUtil
import org.w3c.dom.Document

open public class NoTemplateTransformInfoObjectConfig : TransformInfoObjectConfig {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (transformInfoInterface: Object)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (transformInfoInterface: Object, document: Object)                        

                            : super(transformInfoInterface, document){

                    var transformInfoInterface = transformInfoInterface


                    var document = document


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}

public constructor        (transformInfoInterface: Object, name: Object, type: Object)                        

                            : super(transformInfoInterface, name, type){

                    var transformInfoInterface = transformInfoInterface


                    var name = name


                    var type = type


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun generate(objectConfigDocument: Document)
        //nullable = true from not(false or (false and false)) = true
: Document{

                    var objectConfigDocument = objectConfigDocument

    var docString: String = DomDocumentHelper.toString(objectConfigDocument)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Initial ObjectConfig: " +docString, this, 
                            "generate()")

                                    }
                                

    var storeName: String = this.getTransformInfoInterface()!!.getStoreName()!!
            


    var viewName: String = this.getTransformInfoInterface()!!.getName()!!
            


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var VARKEY: String = TransformInfoObjectConfigData.getInstance()!!.VARKEY

hashMap!!.put(VARKEY +StoreFrontData.getInstance()!!.NAME, storeName)
hashMap!!.put(VARKEY +TransformInfoData.getInstance()!!.OWNER, viewName)

    var pageName: String = TransformTemplateCustomizerUtil.getInstance()!!.getPageNameHack(this.getTransformInfoInterface()!!.getName(), this.getTransformInfoInterface()!!.getStoreName())!!
            

hashMap!!.put(VARKEY +TransformInfoData.getInstance()!!.PARTIAL, pageName)

    var replace: Replace = Replace(hashMap)


    var newObjectConfigDocument: Document = DomDocumentHelper.create(replace.all(docString))!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Final ObjectConfig: " +DomDocumentHelper.toString(newObjectConfigDocument), this, 
                            "generate()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newObjectConfigDocument
}


}
                
            

