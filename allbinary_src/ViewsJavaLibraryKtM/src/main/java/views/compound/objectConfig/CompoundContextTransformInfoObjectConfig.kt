
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
        package views.compound.objectConfig



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.Vector
import org.allbinary.data.tree.dom.document.DocumentToNode
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.info.RootTransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoDomNode
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.GenericStoreTransformInfoObjectConfig
import org.allbinary.string.CommonSeps
import org.w3c.dom.Document

open public class CompoundContextTransformInfoObjectConfig : GenericStoreTransformInfoObjectConfig {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (abeClientInformation: Object, transformInfoInterface: Object)                        

                            : super(abeClientInformation, transformInfoInterface){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (abeClientInformation: Object, transformInfoInterface: Object, document: Object)                        

                            : super(abeClientInformation, transformInfoInterface, document){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var document = document


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}

public constructor        (abeClientInformation: Object, transformInfoInterface: Object, name: Object, type: Object)                        

                            : super(abeClientInformation, transformInfoInterface, name, type){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var name = name


                    var type = type


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun get()
        //nullable = true from not(false or (false and true)) = true
: String{
    var storeName: String = this.getTransformInfoInterface()!!.getStoreName()!!
            


    var httpTransformInfoInterface: TransformInfoHttpInterface = this.getTransformInfoInterface() as TransformInfoHttpInterface


    var templateNameOverride: String = StringUtil.getInstance()!!.getInstance(httpTransformInfoInterface!!.getPropertiesHashMap()!!.get(TransformInfoData.getInstance()!!.PARTIAL) as String)!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(storeName)
stringBuffer!!.append(templateNameOverride)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(RootTransformInfoData.NAME)

    var rootComponentInterface: TransformInterface = TransformFactory.getInstance()!!.getInstance(abeClientInformation, stringBuffer!!.toString(), this.getTransformInfoInterface())!!
            


    var viewVector: Vector = this.getTransformDomNodes()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Root View Called with: " +viewVector!!.size, this, 
                            "get(transformInfoInterface)")

                                    }
                                

    var rootView: String = rootComponentInterface!!.view()!!
            


    var startXMLHeader: String = "<xsl:text disable-output-escaping=\"yes\" ><![CDATA["


    var endXMLHeader: String = "]]></xsl:text>"


    var size: Int = viewVector!!.size!!
            





                        for (index in 0 until size)


        {
    var objectConfigTransformInfoDomNode: TransformInfoDomNode = viewVector!!.get(index) as TransformInfoDomNode


    var templateKey: String = objectConfigTransformInfoDomNode!!.getReplaceKey()!!
            


    var componentInterface: TransformInterface = TransformFactory.getInstance()!!.getInstance(abeClientInformation, objectConfigTransformInfoDomNode!!.getTransformInfoInterface()!!.getName(), this.getTransformInfoInterface())!!
            


    var replacementViewString: String = componentInterface!!.view()!!
            

replacementViewString= DocumentToNode.convertDocumentToNodeString(replacementViewString)
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(startXMLHeader)
stringBuffer!!.append(replacementViewString)
stringBuffer!!.append(endXMLHeader)

    var templateValue: String = stringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(
                            "Replacing: ")
stringBuffer!!.append(templateKey)
stringBuffer!!.append(
                            " with ")
stringBuffer!!.append(templateValue)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "get()")

                                    }
                                

    var replace: Replace = Replace(templateKey, templateValue)

rootView= replace.all(rootView)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("End: Result of a compound view: " +rootView, this, 
                            "get()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rootView
}


                @Throws(Exception::class)
            
open fun createInputStream()
        //nullable = true from not(false or (false and true)) = true
: InputStream{
    var completeTemplateViewBytes: ByteArray = this.get()!!.encodeToByteArray()!!
            


    var bais: ByteArrayInputStream = ByteArrayInputStream(completeTemplateViewBytes)


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Template: " +String(completeTemplateViewBytes).
                            toString(), this, 
                            "createInputStream()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bais
}


}
                
            

