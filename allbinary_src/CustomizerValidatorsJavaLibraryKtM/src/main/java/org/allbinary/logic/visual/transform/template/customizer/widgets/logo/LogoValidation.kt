
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
        package org.allbinary.logic.visual.transform.template.customizer.widgets.logo




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.http.request.HttpRequestUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.Validation
import org.allbinary.logic.io.file.FileData
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.apache.commons.fileupload.FileItem
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class LogoValidation : Validation
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var logoFileItem: FileItem

    private var logoAbPath: AbPath

    private var logoFile: String

    private var isFile: Boolean
public constructor        (){this.isFile= false
this.logoAbPath= 
                                        null
                                    
this.logoFile= 
                                        null
                                    
}

public constructor        (node: Node){

                    var node = node
this.isFile= false
this.logoAbPath= AbPath(DomSearchHelper.getNode(LogoData.getInstance()!!.IMAGEPATH, node.getChildNodes())!!.getNodeValue())
this.logoFile= DomSearchHelper.getNode(LogoData.getInstance()!!.IMAGEFILENAME, node.getChildNodes())!!.getNodeValue()
}

public constructor        (hashMap: HashMap<Any, Any>){

                    var hashMap = hashMap
this.isFile= true
this.getFormData(hashMap)
}


                @Throws(Exception::class)
            
open fun getFormData(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap
this.logoFileItem= hashMap!!.get(LogoData.getInstance()!!.IMAGE) as FileItem
this.logoAbPath= AbPath(hashMap!!.get(LogoData.getInstance()!!.IMAGEPATH) as String)

    
                        if(this.logoFileItem != 
                                    null
                                )
                        
                                    {
                                    this.logoFile= HttpRequestUtil.getInstance()!!.generateFileName(this.logoFileItem!!.getName())

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "HashMap: ")
stringBuffer!!.append(hashMap!!.toString())
stringBuffer!!.append(
                            "\nLogoFileName: ")
stringBuffer!!.append(this.logoFile)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "getFormData()")

                                    }
                                
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var valid: Boolean = Boolean.TRUE


    var fileData: FileData = FileData.getInstance()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "LogoValidation", this, commonStrings!!.IS_VALID)

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.logoAbPath!!.toString(), 0, 512))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("logoPath is invalid: " +this.logoAbPath!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.logoFile, fileData!!.MINLEN, fileData!!.MAXLEN))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("logoFile is invalid: " +this.logoFile, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(this.isFile)
                        
                                    {
                                    
    
                        if(this.logoFileItem == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(this.logoFileItem!!.getSize() > fileData!!.MAXIMAGEFILESIZE || logoFileItem!!.getSize() < fileData!!.MINIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Image File Is Not The Right Size. " +fileData!!.MINIMAGEFILESIZE +"< > " +fileData!!.MAXIMAGEFILESIZE, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Logo Validation: " +valid, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to validate form", this, commonStrings!!.IS_VALID, e)

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

stringBuffer!!.append(
                            "Logo is not valid.")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to generate validation error info", this, 
                            "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
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


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(LogoData.getInstance()!!.IMAGE, stringUtil!!.EMPTY_STRING)

    
                        if(this.logoFile != 
                                    null
                                )
                        
                                    {
                                    hashMap!!.put(LogoData.getInstance()!!.IMAGEPATH, this.logoAbPath!!.toString())
hashMap!!.put(LogoData.getInstance()!!.IMAGEFILENAME, this.logoFile)

                                    }
                                
                        else {
                            hashMap!!.put(LogoData.getInstance()!!.IMAGEPATH, 
                            null)
hashMap!!.put(LogoData.getInstance()!!.IMAGEFILENAME, this.logoFile)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = this.toHashMap()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, LogoData.getInstance()!!.NAME, hashMap)
}


                @Throws(Exception::class)
            
open fun processLogoFile()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Processing logoFile: ")
stringBuffer!!.append(this.logoAbPath!!.toString())
stringBuffer!!.append(this.logoFile)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "processLogoFile()")

                                    }
                                
LogoImageFileUtil(this.logoAbPath, this.logoFile).
                            saveFiles(this.logoFileItem)
}


}
                
            

