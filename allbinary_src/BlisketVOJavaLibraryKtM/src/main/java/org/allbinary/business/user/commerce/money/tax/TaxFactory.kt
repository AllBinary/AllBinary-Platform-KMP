
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
        package org.allbinary.business.user.commerce.money.tax




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.DynamicObjectData
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.money.tax.components.TaxData
import org.allbinary.business.user.commerce.money.tax.modules.SimpleStateTaxModule
import org.allbinary.business.user.commerce.money.tax.modules.TaxModuleInterface
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class TaxFactory
            : Object
         {
        

        companion object {
            
    private val instance: TaxFactory = TaxFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TaxFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val TAXATIONFILENAME: String = "taxationMethod.xml"
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, storeFrontInterface: StoreFrontInterface)
        //nullable =  from not(true or (false and false)) = 
: TaxModuleInterface{

                    var abeClientInformation = abeClientInformation


                    var storeFrontInterface = storeFrontInterface

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(storeFrontInterface!!.getName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append("generic")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append("taxes")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var abPath: AbPath = AbPath(stringBuffer!!.toString(), TAXATIONFILENAME)


    var transformInfoObjectConfigData: TransformInfoObjectConfigData = TransformInfoObjectConfigData.getInstance()!!


    var data: String = CryptFileReader(transformInfoObjectConfigData!!.UNCRYPTED_EXTENSION, transformInfoObjectConfigData!!.ENCRYPTED_EXTENSION).
                            get(abPath)!!


    var document: Document = DomDocumentHelper.create(data)!!


    var taxNameNodeList: NodeList = document.getElementsByTagName(TaxData.NAME)!!





                        for (index in 0 until taxNameNodeList!!.getLength()!!)


        {
    var node: Node = taxNameNodeList!!.item(index)!!


    var nodeList: NodeList = node.getChildNodes()!!


    
                        if(nodeList != 
                                    null
                                )
                        
                                    {
                                    
    var classNameNode: Node = DomSearchHelper.getNode(DynamicObjectData.NAME, nodeList)!!


    
                        if(classNameNode != 
                                    null
                                )
                        
                                    {
                                    
    var className: String = DomNodeHelper.getTextNodeValue(classNameNode)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbeFactory.getInstance()!!.getInstance(abeClientInformation, className) as TaxModuleInterface

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAX))
                        
                                    {
                                    logUtil!!.put("Class Node Null", this, commonStrings!!.GET_INSTANCE)

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAX))
                        
                                    {
                                    logUtil!!.put("Tax Name Node Node Children", this, commonStrings!!.GET_INSTANCE)

                                    }
                                

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SimpleStateTaxModule() as TaxModuleInterface
}


}
                
            

