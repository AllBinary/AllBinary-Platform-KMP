
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
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActionData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class GenericProfiles
            : Object
        
                , DomNodeInterface
                , DomDocumentMappingInterface {
        

        companion object {
            
    val DEFAULT_PROFILES_PATH: String = "./modules/configs/profiles/"

    val DEFAULT_PROFILE_ACTIONS_PATH: String = DEFAULT_PROFILES_PATH +"actions/"

    val DEFAULT_FILE: String = DEFAULT_PROFILES_PATH +"profiles.xml"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var hashMap: HashMap<Any, Any>

    private var profilesDefaultListModelHelper: DefaultListModelHelper

    private val fileName: String
public constructor        (fileName: String)
            : super()
        {

                    var fileName = fileName
this.fileName= fileName
this.profilesDefaultListModelHelper= DefaultListModelHelper()
this.hashMap= HashMap<Any, Any>()

    
                        if(File(fileName).
                            isFile())
                        
                                    {
                                    
    var bytes: ByteArray = ByteArray(100000)


    var idFile: FileInputStream = FileInputStream(fileName)


    var length: Int = idFile!!.read(bytes)!!


    var data: String = bytes.decodeToString()


    var endIndex: Int = data.lastIndexOf('>')!!


    var document: Document = DomDocumentHelper.create(data.substring(0, endIndex +1))!!


    var nodeList: NodeList = document.getElementsByTagName(GenericProfilesData.NAME)!!

logUtil!!.put("Number Of Profiles Specified: " +nodeList!!.getLength(), this, "Contructor")

    
                        if(nodeList != 
                                    null
                                )
                        
                                    {
                                    this.initProfiles(nodeList!!.item(0))

                                    }
                                
                        else {
                            


                            throw Exception(GenericProfileActionData.NAME +" Name Node Node Children")

                        }
                            
logUtil!!.put("Loaded: " +this.hashMap!!.size +" Configuration Profile Actions", this, "Contructor")

                                    }
                                
                        else {
                            logUtil!!.put("No Generic Profile: " +fileName, this, "Contructor")

                        }
                            
this.getDefaultListModelHelper()!!.initDefaultModelList()
}


                @Throws(Exception::class)
            
open fun initProfiles(node: Node)
        //nullable = true from not(false or (false and false)) = true
{

                    var node = node

    var nodeList: NodeList = node.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)

        {
    var profileNameNode: Node = nodeList!!.item(index)!!


    
                        if(profileNameNode!!.getNodeName()!!.compareTo(GenericProfileData.NAME) == 0)
                        
                                    {
                                    
    var genericProfile: GenericProfile = GenericProfile(profileNameNode)

this.hashMap!!.put(genericProfile!!.getName(), genericProfile)
this.getDefaultListModelHelper()!!.add(genericProfile!!.getName())

                                    }
                                
}

}


open fun getDefaultListModelHelper()
        //nullable = true from not(false or (false and true)) = true
: DefaultListModelHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.profilesDefaultListModelHelper
}


                @Throws(Exception::class)
            
open fun get(name: String)
        //nullable = true from not(false or (false and false)) = true
: GenericProfile{

                    var name = name

    var genericProfile: GenericProfile = this.hashMap!!.get(name as Object) as GenericProfile


    
                        if(genericProfile == 
                                    null
                                )
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("No Generic Profile Named: " +name +" availability was: " +this.hashMap, this, commonStrings!!.GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfile
}


                @Throws(Exception::class)
            
open fun add(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.hashMap!!.put(name, GenericProfile(name))
this.getDefaultListModelHelper()!!.add(name)
this.getDefaultListModelHelper()!!.initDefaultModelList()
this.save()
}


                @Throws(Exception::class)
            
open fun remove(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.hashMap!!.remove(name)
this.getDefaultListModelHelper()!!.remove(name)
this.getDefaultListModelHelper()!!.initDefaultModelList()
this.save()
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(GenericProfilesData.NAME)!!


    var set: Set = this.hashMap!!.keys!!


    var nameArray: Array<Any?> = set.toArray()!!


    var size: Int = nameArray!!.size
                





                        for (index in 0 until size)

        {
    var genericProfile: GenericProfile = this.hashMap!!.get(nameArray[index]!! as String) as GenericProfile

node.appendChild(genericProfile!!.toXmlNode(document))
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


                @Throws(Exception::class)
            
open fun save()
        //nullable = true from not(false or (false and true)) = true
{
    var idFile: FileOutputStream = FileOutputStream(this.fileName)


    var idOutData: DataOutputStream = DataOutputStream(idFile)


    var documentString: String = DomDocumentHelper.toString(this.toXmlDoc())!!

idOutData!!.writeBytes(documentString)
}


}
                
            

