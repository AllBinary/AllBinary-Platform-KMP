
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
        package org.allbinary.logic.visual.transform.info.objectConfig.generator



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.HashMap
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.InputOutputTypeData
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoHttpStoreInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfosData
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class StoreFileGenerator : TransformInfoObjectConfigGenerator {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val output: String

    private val fileAbPath: AbPath

    private val file: AbFile
public constructor        (transformInfoInterface: TransformInfoInterface){

                    var transformInfoInterface = transformInfoInterface

    var httpTransformInfoInterface: TransformInfoHttpInterface = transformInfoInterface as TransformInfoHttpInterface


    var weblisketSession: WeblisketSession = WeblisketSession(httpTransformInfoInterface!!.getPropertiesHashMap(), httpTransformInfoInterface!!.getPageContext())


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(weblisketSession!!.getStoreName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var abPath: AbPath = AbPath(stringBuffer!!.toString())


    var fileName: String = httpTransformInfoInterface!!.getPropertiesHashMap()!!.get(InputOutputTypeData.getInstance()!!.FILE) as String


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(stringValidationUtil!!.isEmpty(fileName))
                        
                                    {
                                    
    var transformInfoHttpStoreInterface: TransformInfoHttpStoreInterface = transformInfoInterface as TransformInfoHttpStoreInterface

fileName= transformInfoInterface!!.getName()!!.substring(transformInfoHttpStoreInterface!!.getStoreName()!!.length +1)

    var outputMappingHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

outputMappingHashMap!!.put(TransformInfosData.getInstance()!!.PREVIEW, 
                            "Preview")
outputMappingHashMap!!.put(TransformInfosData.getInstance()!!.SMALL_PREVIEW, 
                            "SmallPreview")
outputMappingHashMap!!.put(CommonSeps.getInstance()!!.SPACE, StringUtil.getInstance()!!.EMPTY_STRING)

    var replace: Replace = Replace(outputMappingHashMap)

fileName= replace.all(fileName)

                                    }
                                

    
                        if(stringValidationUtil!!.isEmpty(fileName))
                        
                                    {
                                    


                            throw Exception(
                            "TransformInfoObjectConfigGenerator FileName Not Specified")

                                    }
                                

    var tempOutput: String = httpTransformInfoInterface!!.getPropertiesHashMap()!!.get(InputOutputTypeData.getInstance()!!.NAME) as String


    
                        if(stringValidationUtil!!.isEmpty(tempOutput))
                        
                                    {
                                    tempOutput= InputOutputTypeData.getInstance()!!.DEFAULT

                                    }
                                
this.output= tempOutput

    
                        if(stringValidationUtil!!.isEmpty(this.output))
                        
                                    {
                                    


                            throw Exception(
                            "TransformInfoObjectConfigGenerator Output=extension Not Specified")

                                    }
                                
stringBuffer= StringMaker()
stringBuffer!!.append(fileName)
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(this.output)
abPath= AbPath(abPath!!.toString(), stringBuffer!!.toString())
this.fileAbPath= abPath
this.file= AbFile(this.fileAbPath)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("File: " +this.fileAbPath!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun process(input: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var input = input

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "Processing", this, commonStrings!!.PROCESS)

                                    }
                                

    
                        if(!this.file.exists())
                        
                                    {
                                    this.file.createNewFile()

                                    }
                                

    
                        if(this.file.exists())
                        
                                    {
                                    
    var inputStream: InputStream = ByteArrayInputStream(input.encodeToByteArray())

FileUtil.getInstance()!!.write(inputStream, this.file)

                                    }
                                
                        else {
                            


                            throw Exception("Could Not Create: " +this.fileAbPath!!.toString())

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "Processed", this, commonStrings!!.PROCESS)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


}
                
            

