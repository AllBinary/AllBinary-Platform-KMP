
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
        
import java.util.Vector
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.io.AbFileLocalInputStream
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class LoggingInitInfo
            : Object
         {
        

        companion object {


    private val INITFILENAME: String = "logConfig.xml"

    private val PACKAGE: String = PATH_GLOBALS.getInstance()!!.INIT_PATH

    private var logConfigInfoList: BasicArrayList = 
                null
            

    private var hasRead: Boolean = false

                @Throws(Exception::class)
            
open fun getDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{
    var path: String = URLGLOBALS.getWebappPath() +PACKAGE


    var FILEABPATH: AbPath = AbPath(path, INITFILENAME)


    var file: AbFile = AbFile(FILEABPATH)


    var document: Document = DomDocumentHelper.create(AbFileLocalInputStream(file))!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            hasRead= false
} catch(e: Exception)
            {


                            throw e
}

}


                @Throws(Exception::class)
            
open fun read()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var document: Document = LoggingInitInfo.getDoc()!!
            


    var logConfigsNodeList: NodeList = document!!.getElementsByTagName(LogConfigsData.getInstance()!!.NAME)!!
            


    var logConfigsNode: Node = logConfigsNodeList!!.item(0)!!
            


    var logConfigNodeVector: Vector = DomSearchHelper.getAllNodes(LogConfigData.getInstance()!!.NAME, logConfigsNode!!.getChildNodes())!!
            

LoggingInitInfo.logConfigInfoList= BasicArrayList()

    var size: Int = logConfigNodeVector!!.size!!
            





                        for (i in 0 until size)


        {
    var node: Node = logConfigNodeVector!!.elementAt(i) as Node


    var logConfigInfo: LogConfig = LogConfig(node)

LoggingInitInfo.logConfigInfoList!!.add(logConfigInfo)
}

} catch(e: Exception)
            {


                            throw e
}

}


open fun setHasRead(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
LoggingInitInfo.hasRead= value
}


                @Throws(Exception::class)
            
open fun updateIfNeeded()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(!hasRead)
                        
                                    {
                                    LoggingInitInfo.read()
hasRead= true

    
                        if(LoggingInitInfo.logConfigInfoList == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "Read Failed")

                                    }
                                

                                    }
                                
}


open fun set(logConfigInfoVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var logConfigInfoVector = logConfigInfoVector
LoggingInitInfo.logConfigInfoList= logConfigInfoVector
}


                @Throws(Exception::class)
            
open fun get()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{LoggingInitInfo.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LoggingInitInfo.logConfigInfoList
}


                @Throws(Exception::class)
            
open fun getTypeNameList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{LoggingInitInfo.updateIfNeeded()

    var allLogTypeVector: BasicArrayList = BasicArrayList()


    var size: Int = LoggingInitInfo.logConfigInfoList!!.size()!!
            





                        for (index in 0 until size)


        {
    var logConfigInfo: LogConfig = LoggingInitInfo.logConfigInfoList!!.objectArray[index]!! as LogConfig


    var logTypeVector: BasicArrayList = logConfigInfo!!.getTypeVector()!!
            


    
                        if(logConfigInfo!!.isEnabled())
                        
                                    {
                                    allLogTypeVector!!.addAll(logTypeVector)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allLogTypeVector
}


                @Throws(Exception::class)
            
open fun getTypeList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{LoggingInitInfo.updateIfNeeded()

    var allLogTypeVector: BasicArrayList = BasicArrayList()


    var size: Int = LoggingInitInfo.logConfigInfoList!!.size()!!
            





                        for (index in 0 until size)


        {
    var logConfigInfo: LogConfig = LoggingInitInfo.logConfigInfoList!!.objectArray[index]!! as LogConfig


    var logTypeVector: BasicArrayList = logConfigInfo!!.getTypeVector()!!
            


    
                        if(logConfigInfo!!.isEnabled())
                        
                                    {
                                    allLogTypeVector!!.addAll(logTypeVector)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allLogTypeVector
}



        }
            public constructor        ()
            : super()
        {}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(Exception::class)
            
open fun getNumberOfLogConfigs()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LoggingInitInfo.logConfigInfoList!!.size()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
        try {
            
    var document: Document = LoggingInitInfo.getDoc()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.toString(document)
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error"
}

}


}
                
            

