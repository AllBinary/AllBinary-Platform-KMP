
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
        package org.allbinary.input.automation.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.util.List
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType
import org.allbinary.data.tree.dom.document.DomDocumentFileHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfiguration
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.file.FileWrapperUtil
import org.allbinary.logic.io.path.AbPath
import org.w3c.dom.Document

open public class InputAutomationConfiguration
            : Object
         {
        
companion object {
            
    private val FILENAME: String = "InputAutomationConfig.xml"

    open fun getFile()
        //nullable = true from not(false or (false and true)) = true
: File{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return File(FILENAME)
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var installed: Boolean= false

    private var inputAutomationModuleConfigurationList: List<InputAutomationModuleConfiguration>
public constructor ()
            : super()
        {
}


    open fun isInstalled()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return installed
}


    open fun setInstalled(installed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var installed = installed
this.installed= installed
logUtil!!.put("Installed: " +installed, this, "setIntalled")
}


    open fun getInputAutomationModuleConfigurationList()
        //nullable = true from not(false or (false and true)) = true
: List<InputAutomationModuleConfiguration>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleConfigurationList
}


                @Throws(Exception::class)
            
    open fun save()
        //nullable = true from not(false or (false and true)) = true
{

    var document: Document = DomDocumentHelper.create()!!


                    //Otherwise - statement - EmptyStmt


    var file: File = File(FILENAME)

FileUtil.getInstance()!!.copy(AbPath(file.getAbsolutePath()), AbPath(file.getAbsolutePath() +".bak.xml"))

    var jaxbContext: JAXBContext = JAXBContext.newInstance(InputAutomationConfiguration::class)!!


    var marshaller: Marshaller = jaxbContext!!.createMarshaller()!!

marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
marshaller.marshal(this, document)
DomDocumentFileHelper.save(FileWrapperUtil.wrapFile(file), document)
}


}
                
            

