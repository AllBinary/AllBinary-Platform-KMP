
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
        package org.allbinary.logic.visual.transform



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import javax.xml.transform.URIResolver
import org.allbinary.data.tree.dom.BasicUriResolver
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.jcehelper.AbCrypt
import org.allbinary.logic.control.crypt.jcehelper.KeySpecFactory
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.io.path.PathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.AbKeys
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.template.TransformInfoTemplateData

open public class BasicTransformer : AbTransformer {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val streamUtil: StreamUtil = StreamUtil.getInstance()!!
            

    private val abeClientInformation: AbeClientInformationInterface
public constructor        (abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
this.setTemplateAsInputStream()
}


                @Throws(Exception::class)
            
open fun setEncryptedTemplateFileAsInputStream(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file

    var outputStream: ByteArrayOutputStream = 
                null
            


    var inputStream: AbFileInputStream = 
                null
            


        try {
            outputStream= ByteArrayOutputStream()
inputStream= AbFileInputStream(file)
outputStream= this.streamUtil!!.get(inputStream, outputStream, ByteArray(16384)) as ByteArrayOutputStream

    var abCrypt: AbCrypt = AbCrypt(KeySpecFactory.DESEDE, AbKeys.getInstance()!!.getKey(abeClientInformation, file.getAbsolutePath()))


    var decrypted: ByteArray = abCrypt!!.decrypt(outputStream!!.toByteArray())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Decrypted Template: \n" +
                                    //Otherwise - right - ObjectCreationExpr
, this, 
                            "setEncryptedTemplateFileAsInputStream(file)")

                                    }
                                
this.setInputStream(ByteArrayInputStream(decrypted) as InputStream)
this.setURIResolver(BasicUriResolver(TransformInfoTemplateData.getInstance()!!.ENCRYPTED_EXTENSION) as URIResolver)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failed to get Encrypted File: ")
stringBuffer!!.append(file.getPath())
stringBuffer!!.append(
                            " \nName:")
stringBuffer!!.append(file.getName())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "setEncryptedTemplateFileAsInputStream()", e)

                                    }
                                



                            throw e
}

         finally {
            this.streamUtil!!.close(outputStream)
this.streamUtil!!.close(inputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun setEncryptedTemplateAsInputStream()
        //nullable = true from not(false or (false and true)) = true
{
    var outputStream: ByteArrayOutputStream = 
                null
            


    var inputStream: ByteArrayInputStream = 
                null
            


        try {
            outputStream= ByteArrayOutputStream()
inputStream= ByteArrayInputStream(this.getTransformInfoInterface()!!.getTemplate()!!.encodeToByteArray())
outputStream= this.streamUtil!!.get(inputStream, outputStream, ByteArray(16384)) as ByteArrayOutputStream

    var abCrypt: AbCrypt = AbCrypt(KeySpecFactory.DESEDE, AbKeys.getInstance()!!.getKey(abeClientInformation, this.getTransformInfoInterface()!!.getName()))


    var decrypted: ByteArray = abCrypt!!.decrypt(outputStream!!.toByteArray())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Decrypted Template: \n" +decrypted.toString(), this, 
                            "setEncryptedTemplateAsInputStream()")

                                    }
                                
this.setInputStream(ByteArrayInputStream(decrypted) as InputStream)
this.setURIResolver(BasicUriResolver(TransformInfoTemplateData.getInstance()!!.ENCRYPTED_EXTENSION) as URIResolver)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put("Failed to set with template: " +this.getTransformInfoInterface()!!.getTemplateFilePath(), this, 
                            "setEncryptedTemplateFileAsInputStream()", e)

                                    }
                                



                            throw e
}

         finally {
            this.streamUtil!!.close(outputStream)
this.streamUtil!!.close(inputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun setTemplateAsInputStream()
        //nullable = true from not(false or (false and true)) = true
{
    var inputStream: AbFileInputStream = 
                null
            


    var outputStream: ByteArrayOutputStream = 
                null
            


        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put(this.getTransformInfoInterface()!!.log(), this, 
                            "setTemplateAsInputStream()")

                                    }
                                

    var transformInfoTemplateData: TransformInfoTemplateData = TransformInfoTemplateData.getInstance()!!
            


    var pathUtil: PathUtil = PathUtil.getInstance()!!
            


    
                        if(this.getTransformInfoInterface()!!.getTemplateFilePath() != 
                                    null
                                )
                        
                                    {
                                    
    var extension: String = pathUtil!!.getExtension(this.getTransformInfoInterface()!!.getTemplateFilePath())!!
            


    var filePath: String = pathUtil!!.getWithoutExtension(this.getTransformInfoInterface()!!.getTemplateFilePath())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put(this.getTransformInfoInterface()!!.log(), this, 
                            "setTemplateAsInputStream()")

                                    }
                                

    
                        if(extension.compareTo(transformInfoTemplateData!!.UNCRYPTED_EXTENSION) == 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(filePath)
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(transformInfoTemplateData!!.ENCRYPTED_EXTENSION)

    var encFile: AbFile = AbFile(stringBuffer!!.toString())


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put(this.getTransformInfoInterface()!!.log(), this, 
                            "setTemplateAsInputStream()")

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    stringBuffer= StringMaker()
stringBuffer!!.append(
                            "Encrypted Template File isFile=")
stringBuffer!!.append(encFile!!.isFile())
stringBuffer!!.append(
                            "\nEncTemplateFilePath: ")
stringBuffer!!.append(encFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "setTemplateAsInputStream()")

                                    }
                                

    
                        if(encFile!!.isFile())
                        
                                    {
                                    this.setEncryptedTemplateFileAsInputStream(encFile)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                        else {
                            
    var file: AbFile = AbFile(this.getTransformInfoInterface()!!.getTemplateFilePath())


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put(this.getTransformInfoInterface()!!.log(), this, 
                            "setTemplateAsInputStream()")

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Template File isFile=" +file.isFile(), this, 
                            "setTemplateAsInputStream()")

                                    }
                                

    
                        if(file.isFile())
                        
                                    {
                                    inputStream= AbFileInputStream(file)
outputStream= ByteArrayOutputStream()
outputStream= this.streamUtil!!.get(inputStream, outputStream, ByteArray(16384)) as ByteArrayOutputStream

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Template: " +outputStream!!.toString(), this, 
                            "getTemplateAsInputStream()")

                                    }
                                
this.setInputStream(ByteArrayInputStream(outputStream!!.toByteArray()) as InputStream)
this.setURIResolver(BasicUriResolver(transformInfoTemplateData!!.UNCRYPTED_EXTENSION) as URIResolver)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

                        }
                            

                                    }
                                
                             else 
    
                        if(extension.compareTo(transformInfoTemplateData!!.ENCRYPTED_EXTENSION) == 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(filePath)
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(transformInfoTemplateData!!.ENCRYPTED_EXTENSION)

    var file: AbFile = AbFile(stringBuffer!!.toString())


    
                        if(file.isFile())
                        
                                    {
                                    this.setEncryptedTemplateFileAsInputStream(file)

                                    }
                                

                                    }
                                
                        else {
                            


                            throw Exception("View Template File Type Is Not Recognized: " +this.getTransformInfoInterface()!!.getTemplateFilePath())

                        }
                            

                                    }
                                
                        else {
                            this.setEncryptedTemplateAsInputStream()

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to get Template Data", this, 
                            "setTemplateAsInputStream()", e)

                                    }
                                



                            throw e
}

         finally {
            this.streamUtil!!.close(outputStream)
this.streamUtil!!.close(inputStream)

         }
        



                            throw Exception(
                            "Error setTemplateAsInputStream()")
}


}
                
            

