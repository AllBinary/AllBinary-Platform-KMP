
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
        package org.allbinary.business.user.commerce.shipping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.DynamicObjectData
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.shipping.modules.BasicWeightShippingModuleView
import org.allbinary.business.user.commerce.shipping.modules.NoShippingModuleView
import org.allbinary.business.user.commerce.shipping.modules.ShippingInterface
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigData
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class ShippingMethodsFactory
            : Object
         {
        

        companion object {
            
    private val SHIPPINGMETHODSFILEPATHSTRING: String

                init{
    var stringBuffer: StringMaker = StringMaker()


    var sep: String = AbPathData.getInstance()!!.SEPARATOR

stringBuffer!!.append(sep)
stringBuffer!!.append("generic")
stringBuffer!!.append(sep)
stringBuffer!!.append("shipping")
stringBuffer!!.append(sep)
SHIPPINGMETHODSFILEPATHSTRING= stringBuffer!!.toString()
}

    private val SHIPPINGMETHODSFILENAME: String = "shippingMethods.xml"

        }
            
    private var defaultShippingMethodInterface: ShippingInterface

    private var document: Document

    private var shippingVector: Vector
public constructor        (abeClientInformation: AbeClientInformationInterface, storeFrontInterface: StoreFrontInterface)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var storeFrontInterface = storeFrontInterface

    var stringBuffer: StringMaker = StringMaker()


    var sep: String = AbPathData.getInstance()!!.SEPARATOR

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(storeFrontInterface!!.getName())
stringBuffer!!.append(sep)
stringBuffer!!.append(this.SHIPPINGMETHODSFILEPATHSTRING)

    var abPath: AbPath = AbPath(stringBuffer!!.toString(), this.SHIPPINGMETHODSFILENAME) as AbPath


    var data: String = CryptFileReader(TransformInfoObjectConfigData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoObjectConfigData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(abPath)!!
            

this.document= DomDocumentHelper.create(data)
this.shippingVector= Vector()

    var nodeList: NodeList = document.getElementsByTagName(ShippingMethodsData.NAME)!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var node: Node = nodeList!!.item(index)!!
            


    var shippingMethodNodeChildren: NodeList = node.getChildNodes()!!
            


    var shippingMethodNameNode: Node = DomSearchHelper.getNode(ShippingMethodData.NAME, shippingMethodNodeChildren)!!
            


    var classNameNode: Node = DomSearchHelper.getNode(DynamicObjectData.NAME, shippingMethodNameNode!!.getChildNodes())!!
            


    var shippingMethodClassName: String = DomNodeHelper.getTextNodeValue(classNameNode)!!
            


    var shippingMethodInterface: ShippingInterface = AbeFactory.getInstance()!!.getInstance(abeClientInformation, shippingMethodClassName) as ShippingInterface

shippingVector!!.add(shippingMethodInterface)

    var defaultShippingMethodNameNode: Node = DomSearchHelper.getNode(ShippingMethodData.DEFAULT, shippingMethodNameNode!!.getChildNodes())!!
            


    var defaultShippingMethodNameNodeValue: String = DomNodeHelper.getTextNodeValue(defaultShippingMethodNameNode)!!
            


    
                        if(defaultShippingMethodNameNodeValue != 
                                    null
                                 && defaultShippingMethodNameNodeValue!!.compareTo(ShippingMethodData.DEFAULT) == 0)
                        this.defaultShippingMethodInterface= shippingMethodInterface
}


    
                        if(shippingVector!!.size < 1)
                        
                                    {
                                    this.defaultShippingMethodInterface= BasicWeightShippingModuleView()
shippingVector!!.add(this.defaultShippingMethodInterface)
shippingVector!!.add(NoShippingModuleView())

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shippingVector
}


open fun getDefaultInstance()
        //nullable = true from not(false or (false and true)) = true
: ShippingInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultShippingMethodInterface
}


}
                
            

