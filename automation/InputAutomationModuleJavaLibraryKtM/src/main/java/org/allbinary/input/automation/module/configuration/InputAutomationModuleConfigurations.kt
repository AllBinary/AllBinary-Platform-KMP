
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
        package org.allbinary.input.automation.module.configuration



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileInputStream
import java.util.HashMap
import java.util.List
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.input.automation.module.InputAutomationModuleData
import org.allbinary.input.automation.module.NewInputAutomationModulesData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class InputAutomationModuleConfigurations
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var hashMap: HashMap<Any, Any>
public constructor        (abeClientInformation: AbeClientInformationInterface, file: File)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var file = file
this.setHashMap(HashMap<Any, Any>())

    var bytes: ByteArray = ByteArray(100000)


    var idFile: FileInputStream = FileInputStream(file)


    var length: Int = idFile!!.read(bytes)!!
            


    var data: String = bytes.decodeToString()


    var endIndex: Int = data.lastIndexOf(
                            '>')!!
            


    var document: Document = DomDocumentHelper.create(data.substring(0, endIndex +1))!!
            


    var nodeList: NodeList = document.getElementsByTagName(NewInputAutomationModulesData.NAME)!!
            


    
                        if(nodeList!!.getLength() > 0)
                        
                                    {
                                    
    var nameNodeList: NodeList = document.getElementsByTagName(InputAutomationModuleData.NAME)!!
            

logUtil!!.put("Number Of Module(s) Specified: " +nameNodeList!!.getLength(), this, 
                            "Contructor")




                        for (index in 0 until nameNodeList!!.getLength()!!)


        {
    var node: Node = nameNodeList!!.item(index)!!
            

this.add(InputAutomationModuleConfiguration(abeClientInformation, node))
}


                                    }
                                
}

public constructor        (abeClientInformation: AbeClientInformationInterface, document: Document)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var document = document
this.setHashMap(HashMap<Any, Any>())

    var nameNodeList: NodeList = document.getElementsByTagName(InputAutomationModuleData.NAME)!!
            

logUtil!!.put("Number Of Module(s) Specified: " +nameNodeList!!.getLength(), this, 
                            "Contructor")




                        for (index in 0 until nameNodeList!!.getLength()!!)


        {
    var node: Node = nameNodeList!!.item(index)!!
            

this.add(InputAutomationModuleConfiguration(abeClientInformation, node))
}

}

public constructor        (inputAutomationModuleConfigurationList: List<InputAutomationModuleConfiguration>)
            : super()
        {

                    var inputAutomationModuleConfigurationList = inputAutomationModuleConfigurationList
this.setHashMap(HashMap<Any, Any>())

    var size: Int = inputAutomationModuleConfigurationList!!.size()!!
            


    var inputAutomationModuleConfiguration: InputAutomationModuleConfiguration





                        for (index in 0 until size)


        {inputAutomationModuleConfiguration= inputAutomationModuleConfigurationList!!.get(index)
this.add(inputAutomationModuleConfiguration)
}

}

public constructor        ()
            : super()
        {this.setHashMap(HashMap<Any, Any>())
}


open fun add(inputAutomationModuleConfiguration: InputAutomationModuleConfiguration)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationModuleConfiguration = inputAutomationModuleConfiguration
this.getHashMap()!!.put(inputAutomationModuleConfiguration!!.getClassName(), inputAutomationModuleConfiguration)
}


open fun remove(inputAutomationModuleConfiguration: InputAutomationModuleConfiguration)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationModuleConfiguration = inputAutomationModuleConfiguration
this.getHashMap()!!.remove(inputAutomationModuleConfiguration!!.getClassName())
}


open fun getHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun setHashMap(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap
this.hashMap= hashMap
}


}
                
            

