
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.DataOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.HashMap
import java.util.Set
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
import org.allbinary.input.automation.module.DefaultListModelHelper
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfiles
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class GenericProfileActions
            : Object
        
                , DomNodeInterface
                , DomDocumentMappingInterface {
        

        companion object {
            
    val DEFAULT_PROFILE_ACTIONS_PATH: String = GenericProfiles.DEFAULT_PROFILES_PATH +"actions/"

open fun getFile(name: String)
        //nullable = true from not(false or (false and false)) = true
: File{
var name = name

    var fileName: String = DEFAULT_PROFILE_ACTIONS_PATH +name +".xml"




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return File(fileName)
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var name: String

    private var genericProfileActionsJPanel: GenericProfileActionsJPanel

    private var actionsDefaultListModelHelper: DefaultListModelHelper

    private var hashMap: HashMap<Any, Any>
public constructor        (genericProfileActionsJPanel: GenericProfileActionsJPanel, name: String)
            : super()
        {
var genericProfileActionsJPanel = genericProfileActionsJPanel
var name = name
this.setName(name)
this.init(genericProfileActionsJPanel)
this.load()
}

public constructor        (genericProfileActionsJPanel: GenericProfileActionsJPanel, abPath: AbPath, name: String)
            : super()
        {
var genericProfileActionsJPanel = genericProfileActionsJPanel
var abPath = abPath
var name = name
this.setName(name)
this.init(genericProfileActionsJPanel)
this.load()
}

public constructor        (genericProfileActionsJPanel: GenericProfileActionsJPanel, fileInputStream: FileInputStream, name: String)
            : super()
        {
var genericProfileActionsJPanel = genericProfileActionsJPanel
var fileInputStream = fileInputStream
var name = name
this.setName(name)
this.init(genericProfileActionsJPanel)
this.fileInit(fileInputStream)
}


                @Throws(Exception::class)
            
open fun init(genericProfileActionsJPanel: GenericProfileActionsJPanel)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfileActionsJPanel = genericProfileActionsJPanel
this.setGenericProfileActionsJPanel(genericProfileActionsJPanel)
this.actionsDefaultListModelHelper= DefaultListModelHelper()
this.setHashMap(HashMap<Any, Any>())
}


                @Throws(Exception::class)
            
open fun save()
        //nullable = true from not(false or (false and true)) = true
{

    var idFile: FileOutputStream = FileOutputStream(DEFAULT_PROFILE_ACTIONS_PATH +getName() +".xml")


    var idOutData: DataOutputStream = DataOutputStream(idFile)

idOutData!!.writeBytes(DomDocumentHelper.toString(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun load()
        //nullable = true from not(false or (false and true)) = true
{

    var file: File = getFile(getName())!!


    
                        if(file.isFile())
                        
                                    {
                                    
    var idFile: FileInputStream = FileInputStream(file)

this.fileInit(idFile)

                                    }
                                
                        else {
                            logUtil!!.put("No Profile: " +file.getAbsolutePath(), this, "Contructor")

                        }
                            
}


                @Throws(Exception::class)
            
open fun fileInit(fileInputStream: FileInputStream)
        //nullable = true from not(false or (false and false)) = true
{
var fileInputStream = fileInputStream

    var bytes: ByteArray = ByteArray(100000)


    var length: Int = fileInputStream!!.read(bytes)!!


    var data: String = bytes.decodeToString()


    var endIndex: Int = data.lastIndexOf('>')!!


    var document: Document = DomDocumentHelper.create(data.substring(0, endIndex +1))!!


    var nameNodeList: NodeList = document.getElementsByTagName(GenericProfileActionsData.NAME)!!

logUtil!!.put("Number Of Profiles Specified: " +nameNodeList!!.getLength(), this, "Contructor")




                        for (index in 0 until nameNodeList!!.getLength()!!)

        {

    var node: Node = nameNodeList!!.item(index)!!


    var nodeList: NodeList = node.getChildNodes()!!


    
                        if(nodeList != 
                                    null
                                )
                        
                                    {
                                    this.initActions(nodeList)

                                    }
                                
                        else {
                            


                            throw Exception(GenericProfileActionData.NAME +" Name Node Node Children")

                        }
                            
}

logUtil!!.put("Loaded: " +this.getHashMap()!!.size +" Configuration Profile Action(s)", this, "Contructor")
this.getDefaultListModelHelper()!!.initDefaultModelList()
}


                @Throws(Exception::class)
            
open fun initActions(nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
{
var nodeList = nodeList




                        for (index in 0 until nodeList!!.getLength()!!)

        {

    var actionNode: Node = nodeList!!.item(index)!!


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var genericConfigurationProfileAction: GenericProfileAction = GenericProfileAction(this.getGenericProfileActionsJPanel()!!.getGenericProfileActionJPanel(), actionNode)

this.getHashMap()!!.put(genericConfigurationProfileAction!!.getName(), genericConfigurationProfileAction)
this.getDefaultListModelHelper()!!.add(genericConfigurationProfileAction!!.getName())

                                    }
                                
                        else {
                            


                            throw Exception(GenericProfileActionData.NAME +" Node Null")

                        }
                            
}

}


open fun getDefaultListModelHelper()
        //nullable = true from not(false or (false and true)) = true
: DefaultListModelHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.actionsDefaultListModelHelper
}


open fun getAction(string: String)
        //nullable = true from not(false or (false and false)) = true
: GenericProfileAction{
var string = string



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getHashMap()!!.get(string as Object) as GenericProfileAction
}


                @Throws(Exception::class)
            
open fun add(name: String)
        //nullable = true from not(false or (false and false)) = true
{
var name = name

    var genericProfileAction: GenericProfileAction = GenericProfileAction(name)

this.getHashMap()!!.put(genericProfileAction!!.getName(), genericProfileAction)
this.getDefaultListModelHelper()!!.add(genericProfileAction!!.getName())
this.getDefaultListModelHelper()!!.initDefaultModelList()
this.save()
}


                @Throws(Exception::class)
            
open fun remove(name: String)
        //nullable = true from not(false or (false and false)) = true
{
var name = name
this.getHashMap()!!.remove(name)
this.getDefaultListModelHelper()!!.remove(name)
this.getDefaultListModelHelper()!!.initDefaultModelList()
this.save()
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

logUtil!!.put("HashMap: " +hashMap!!.toString(), this, "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = document.createElement(GenericProfileActionsData.NAME)!!


    var set: Set = this.getHashMap()!!.keys!!


    var actionNameArray: Array<Any?> = set.toArray()!!


    var size: Int = actionNameArray!!.size
                





                        for (index in 0 until size)

        {

    var nextActionName: String = actionNameArray[index]!! as String


    var nextGenericProfileAction: GenericProfileAction = this.getAction(nextActionName) as GenericProfileAction

node.appendChild(nextGenericProfileAction!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{

    var document: Document = DomDocumentHelper.create()!!


    var node: Node = this.toXmlNode(document)!!

document.appendChild(node)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


open fun getGenericProfileActionsJPanel()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActionsJPanel{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActionsJPanel
}


open fun setGenericProfileActionsJPanel(genericProfileActionsJPanel: GenericProfileActionsJPanel)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfileActionsJPanel = genericProfileActionsJPanel
this.genericProfileActionsJPanel= genericProfileActionsJPanel
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


}
                
            

