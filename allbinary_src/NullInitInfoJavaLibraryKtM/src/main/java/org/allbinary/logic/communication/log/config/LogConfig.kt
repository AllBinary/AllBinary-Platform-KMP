
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
        package org.allbinary.logic.communication.log.config



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.java.bool.BooleanUtil
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node

open public class LogConfig
            : Object
         {
        

    private var isEnabled: Boolean

    private var name: String

    private var description: String

    private var path: String

    private var fileName: String
public constructor        (aName: String, aDescription: String, aPath: String, aFileName: String)
            : super()
        {

                    var aName = aName


                    var aDescription = aDescription


                    var aPath = aPath


                    var aFileName = aFileName
this.isEnabled= false
this.name= aName
this.description= aDescription
this.path= aPath
this.fileName= aFileName
}

public constructor        (node: Node)
            : super()
        {

                    var node = node

    var enabledValueNode: Node = DomSearchHelper.getNode(EntryData.getInstance()!!.ENABLE, node.getChildNodes())!!
            


    var isEnabledString: String = DomNodeHelper.getTextNodeValue(enabledValueNode)!!
            

this.isEnabled= BooleanUtil.getInstance()!!.getFromString(isEnabledString)

    var logConfigData: LogConfigData = LogConfigData.getInstance()!!
            


    var nameValueNode: Node = DomSearchHelper.getNode(logConfigData!!.NAME, node.getChildNodes())!!
            

this.name= DomNodeHelper.getTextNodeValue(nameValueNode)

    var descriptionValueNode: Node = DomSearchHelper.getNode(logConfigData!!.DESCRIPTION, node.getChildNodes())!!
            

this.description= DomNodeHelper.getTextNodeValue(descriptionValueNode)

    var fileValueNode: Node = DomSearchHelper.getNode(logConfigData!!.FILE, node.getChildNodes())!!
            

this.fileName= DomNodeHelper.getTextNodeValue(fileValueNode)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isEnabled
}


open fun enable()
        //nullable = true from not(false or (false and true)) = true
{this.isEnabled= true
}


open fun disable()
        //nullable = true from not(false or (false and true)) = true
{this.isEnabled= false
}


open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


open fun getFileName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileName
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.name= value
}


open fun setDescription(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.description= value
}


open fun setPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.path= value
}


open fun setFileName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.fileName= value
}


                @Throws(Exception::class)
            
open fun getTypeVector()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
    var logKeyVector: BasicArrayList = BasicArrayList()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return logKeyVector
}


}
                
            

