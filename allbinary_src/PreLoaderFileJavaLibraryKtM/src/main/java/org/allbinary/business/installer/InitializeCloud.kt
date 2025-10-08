
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
        package org.allbinary.business.installer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbFileSystem
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList

open public class InitializeCloud
            : Object
         {
        
companion object {
            
    val CLOUD: String = "cloud/"

    val CLOUD_UPDATE: String = "cloudupdate/"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor ()
            : super()
        {
}


    open fun initialize(cloud: String, overwriteNewer: Boolean, overwriteAll: Boolean, current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var cloud = cloud
var overwriteNewer = overwriteNewer
var overwriteAll = overwriteAll
var current = current
var total = total

        try {
            
    
                        if(AbFileSystem.getInstance()!!.isType("com.vobject.appengine.java.io"))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(cloud)
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.DATA_PATH)

    var path: AbPath = AbPath(stringBuffer!!.toString())

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(URLGLOBALS.getWebappPath())

    var realPath: AbPath = AbPath(stringBuffer!!.toString())


    var file: AbFile = AbFile(path)


    var fileBasicArrayList: BasicArrayList = Directory.getInstance()!!.search(file, true)!!


    var size: Int = fileBasicArrayList!!.size()!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Searched: ")
stringBuffer!!.append(path.toFileSystemString())
stringBuffer!!.append(" BasicArrayList: ")
stringBuffer!!.append(size)

    var portion: Int = size /total +1


    var start: Int = portion *current


    var end: Int = start +portion


    
                        if(end > size)
                        
                                    {
                                    end= size

                                    }
                                
stringBuffer!!.append(" Section: ")
stringBuffer!!.append(start)
stringBuffer!!.append(" - ")
stringBuffer!!.append(end)
logUtil!!.put(stringBuffer!!.toString(), this, "initialize()")




                        for (index in start until end)

        {

    var nextFile: AbFile = fileBasicArrayList!!.get(index) as AbFile


    
                        if(nextFile!!.isDirectory())
                        
                                    {
                                    
                                    }
                                
                        else {
                            FileUtil.getInstance()!!.copyToCloud(nextFile, path, realPath, cloud, overwriteNewer, overwriteAll)

                        }
                            
}

logUtil!!.put("Copied Files To Cloud", this, "initialize()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
logUtil!!.put("Unable to copy installer files into cloud", this, "initialize()", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

