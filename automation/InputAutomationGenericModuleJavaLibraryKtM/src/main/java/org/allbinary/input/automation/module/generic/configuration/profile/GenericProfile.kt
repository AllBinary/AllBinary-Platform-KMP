
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
        package org.allbinary.input.automation.module.generic.configuration.profile



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActions
import org.allbinary.logic.communication.log.LogUtil
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class GenericProfile
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var name: String

    private var vector: Vector

    private var genericProfileActions: GenericProfileActions
public constructor        (node: Node)
            : super()
        {

                    var node = node
this.setName(DomNodeHelper.getTextNodeValue(node))
this.vector= Vector()

    var nodeList: NodeList = node!!.getChildNodes()!!
            

logUtil!!.put("Name: " +this.getName() +" Child Nodes: " +nodeList!!.getLength(), this, 
                            "Contructor")




                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var profileNode: Node = nodeList!!.item(index)!!
            


    
                        if(profileNode!!.getNodeName()!!.compareTo(GenericProfileDataWorkerData.NAME) == 0)
                        
                                    {
                                    
    var genericProfileDataWorkerType: GenericProfileDataWorkerType = GenericProfileDataWorkerType.getInstance(profileNode)!!
            

logUtil!!.put("Adding GenericProfileDataWorkerType: " +genericProfileDataWorkerType!!.toString(), this, 
                            "Contructor")
this.vector!!.add(genericProfileDataWorkerType)

                                    }
                                
}

}

public constructor        (name: String)
            : super()
        {

                    var name = name
this.setName(name)
this.vector= Vector()
}


open fun getGenericProfileDataWorkerTypeVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.vector
}


open fun add(genericProfileDataWorkerType: GenericProfileDataWorkerType)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileDataWorkerType = genericProfileDataWorkerType

    
                        if(!this.vector!!.contains(genericProfileDataWorkerType))
                        this.vector!!.add(genericProfileDataWorkerType)
}


open fun remove(genericProfileDataWorkerType: GenericProfileDataWorkerType)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileDataWorkerType = genericProfileDataWorkerType
this.vector!!.remove(genericProfileDataWorkerType)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = ModDomHelper.createTextNode(document, GenericProfileData.NAME, name)!!
            


    var size: Int = vector!!.size!!
            





                        for (index in 0 until size)


        {
    var genericProfileDataWorkerType: GenericProfileDataWorkerType = vector!!.get(index) as GenericProfileDataWorkerType

node!!.appendChild(genericProfileDataWorkerType!!.toXmlNode(document))
}




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
this.name= name
}


open fun getGenericProfileActions()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActions{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActions
}


open fun setGenericProfileActions(genericProfileActions: GenericProfileActions)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileActions = genericProfileActions
this.genericProfileActions= genericProfileActions
}


}
                
            

