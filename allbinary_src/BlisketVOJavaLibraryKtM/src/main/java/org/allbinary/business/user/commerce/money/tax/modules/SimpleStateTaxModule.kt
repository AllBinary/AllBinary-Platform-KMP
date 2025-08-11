
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
        package org.allbinary.business.user.commerce.money.tax.modules



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.address.StreetAddressData
import org.allbinary.business.user.commerce.money.tax.components.TaxData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigData
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class SimpleStateTaxModule
            : Object
        
                , TaxModuleInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var streetAddress: StreetAddress

    private var storeFrontInterface: StoreFrontInterface

    private val ALL: String = CommonPhoneStrings.getInstance()!!.STAR

    private val STATETAXPATH: String = "/generic/taxes/"

    private val STATETAXFILE: String = "stateTaxation.xml"

    private var document: Document
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getTaxRate(streetAddress: StreetAddress, storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Float{

                    var streetAddress = streetAddress


                    var storeFrontInterface = storeFrontInterface
this.streetAddress= streetAddress
this.storeFrontInterface= storeFrontInterface

    var fileAbPath: AbPath = AbPath(URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH +this.storeFrontInterface!!.getName() +this.STATETAXPATH, this.STATETAXFILE)


    var data: String = CryptFileReader(TransformInfoObjectConfigData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoObjectConfigData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(fileAbPath)!!
            

this.document= DomDocumentHelper.create(data)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAX))
                        
                                    {
                                    logUtil!!.put("Tax Doc: " +DomDocumentHelper.toString(document), this, 
                            "getTaxRate")

                                    }
                                

    var state: String = this.streetAddress!!.getState()!!
            


    var country: String = this.streetAddress!!.getCountry()!!
            

state= state.toUpperCase()

    var nodeList: NodeList = document.getElementsByTagName(TaxData.NAME)!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var node: Node = nodeList!!.item(index)!!
            


    var taxNodeChildren: NodeList = node.getChildNodes()!!
            


    var streetAddressNode: Node = DomSearchHelper.getNode(StreetAddressData.NAME, taxNodeChildren)!!
            


    var taxableStreetAddress: StreetAddress = StreetAddress(streetAddressNode)


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isEmpty(country) && !stringValidationUtil!!.isEmpty(taxableStreetAddress!!.getCountry()) && country.compareTo(taxableStreetAddress!!.getCountry()) == 0)
                        
                                    {
                                    
    
                        if(state != 
                                    null
                                 && taxableStreetAddress!!.getState() != 
                                    null
                                 && state.compareTo(taxableStreetAddress!!.getState()) == 0)
                        
                                    {
                                    
    var rateNode: Node = DomSearchHelper.getNode(TaxData.RATE, taxNodeChildren)!!
            


    var taxRate: String = DomNodeHelper.getTextNodeValue(rateNode)!!
            


    var taxRateFloat: Float = Float(Float(taxRate).
                            toFloat() *.01)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return taxRateFloat

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Float(0)
}


open fun isValid(streetAddress: StreetAddress, storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var streetAddress = streetAddress


                    var storeFrontInterface = storeFrontInterface

        try {
            this.streetAddress= streetAddress
this.storeFrontInterface= storeFrontInterface

    var fileAbPath: AbPath = AbPath(URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH +this.storeFrontInterface!!.getName() +this.STATETAXPATH, this.STATETAXFILE)


    var data: String = CryptFileReader(TransformInfoObjectConfigData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoObjectConfigData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(fileAbPath)!!
            

this.document= DomDocumentHelper.create(data)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAX))
                        
                                    {
                                    logUtil!!.put("Tax Doc: " +DomDocumentHelper.toString(document), this, commonStrings!!.IS_VALID)

                                    }
                                

    var country: String = this.streetAddress!!.getCountry()!!
            


    var rootNode: Node = this.document.getElementsByTagName(TransformInfoObjectConfigData.getInstance()!!.NAME)!!.item(0)!!
            


    var nodeList: NodeList = document.getElementsByTagName(TaxData.NAME)!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var node: Node = nodeList!!.item(index)!!
            


    var taxNodeChildren: NodeList = node.getChildNodes()!!
            


    var streetAddressNode: Node = DomSearchHelper.getNode(StreetAddressData.NAME, taxNodeChildren)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAX))
                        
                                    {
                                    
    var stringBuffer: StringBuilder = StringBuilder()

stringBuffer!!.append(
                            "StreetAddress Node: ")
stringBuffer!!.append(streetAddressNode!!.getNodeName())
stringBuffer!!.append(
                            " Value: ")
stringBuffer!!.append(streetAddressNode!!.getNodeValue())
stringBuffer!!.append(
                            " Number Of Children: ")
stringBuffer!!.append(streetAddressNode!!.getChildNodes()!!.getLength())
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                

    var taxableStreetAddress: StreetAddress = StreetAddress(streetAddressNode)


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isEmpty(country) && !stringValidationUtil!!.isEmpty(taxableStreetAddress!!.getCountry()) && taxableStreetAddress!!.getCountry()!!.compareTo(ALL) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

    
                        if(!stringValidationUtil!!.isEmpty(country) && !stringValidationUtil!!.isEmpty(taxableStreetAddress!!.getCountry()) && country.compareTo(taxableStreetAddress!!.getCountry()) == 0)
                        
                                    {
                                    
    var state: String = this.streetAddress!!.getState()!!
            


    
                        if(state != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to validate", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

