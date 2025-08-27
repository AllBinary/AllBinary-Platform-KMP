
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType
import org.allbinary.business.DynamicObjectData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.automation.InputAutomationData
import org.allbinary.input.automation.module.InputAutomationModuleData
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class InputAutomationModuleConfiguration
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var className: String

    private var name: String

    private var inputAutomationModuleInterface: InputAutomationModuleFactoryInterface
public constructor        ()
            : super()
        {}

public constructor        (abeClientInformation: AbeClientInformationInterface, node: Node)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var node = node
this.init(abeClientInformation, node)
}

public constructor        (abeClientInformation: AbeClientInformationInterface, name: String, className: String)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var name = name


                    var className = className
this.setName(name)
this.setClassName(className)
this.init(abeClientInformation)
}

public constructor        (inputAutomationModuleInterface: InputAutomationModuleFactoryInterface)
            : super()
        {

                    var inputAutomationModuleInterface = inputAutomationModuleInterface
this.setInputAutomationModuleInterface(inputAutomationModuleInterface)
this.setClassName(this.inputAutomationModuleInterface!!.::class.toString()!!)
}


                @Throws(Exception::class)
            
open fun init(abeClientInformation: AbeClientInformationInterface, node: Node)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var node = node

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
                                    this.setClassName(DomNodeHelper.getTextNodeValue(classNameNode))
this.init(abeClientInformation)

                                    }
                                
                        else {
                            logUtil!!.put("Class Node Null", this, this.commonStrings!!.INIT)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put(InputAutomationData.NAME +" Node Has No Children", this, "Contructor")

                        }
                            
}


open fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation

        try {
            logUtil!!.put("Name: " +getName(), this, this.commonStrings!!.INIT)
logUtil!!.put("ClassName: " +className, this, this.commonStrings!!.INIT)
this.setInputAutomationModuleInterface(AbeFactory.getInstance()!!.getInstance()!!.getInstance(abeClientInformation, getClassName()) as InputAutomationModuleFactoryInterface)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e)



                            throw RuntimeException()
}

}


                @Throws(Exception::class)
            
open fun toDomNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(InputAutomationModuleData.NAME)!!


    var classNameNode: Node = ModDomHelper.createTextNode(document, DynamicObjectData.NAME, this.getClassName())!!

node.appendChild(classNameNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
logUtil!!.put("Name: " +name, this, "setName")
this.name= name
}


open fun getClassName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return className
}


open fun setClassName(className: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var className = className
logUtil!!.put("ClassName : " +className, this, "setClassName")
this.className= className
}


open fun getInputAutomationModuleInterface()
        //nullable = true from not(false or (false and true)) = true
: InputAutomationModuleFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleInterface
}


open fun setInputAutomationModuleInterface(inputAutomationModuleInterface: InputAutomationModuleFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationModuleInterface = inputAutomationModuleInterface
logUtil!!.put("InputAutomationModuleFactoryInterface : " +inputAutomationModuleInterface, this, "setInputAutomationModuleInterface")
this.inputAutomationModuleInterface= inputAutomationModuleInterface
this.setName(this.inputAutomationModuleInterface!!.getName())
}


}
                
            

