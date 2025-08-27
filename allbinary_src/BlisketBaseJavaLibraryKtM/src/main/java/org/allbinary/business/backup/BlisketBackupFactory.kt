
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
        package org.allbinary.business.backup




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntity
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntityFactory
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.file.zip.ZipFileUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BlisketBackupFactory
            : Object
         {
        

        companion object {
            
    private val instance: BlisketBackupFactory = BlisketBackupFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BlisketBackupFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val directory: Directory = Directory.getInstance()!!

                @Throws(Exception::class)
            
open fun getFileBasicArrayList(pathString: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var pathString = pathString

    var path: AbPath = AbPath(pathString)


    var file: AbFile = AbFile(path)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.search(file, true)
}


open fun backup()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, "backup()")

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.BACKUP_PATH)

    var backupPath: String = stringBuffer!!.toString()!!


    var path: AbPath = AbPath(backupPath)


    var fileBasicArrayList: BasicArrayList = this.getFileBasicArrayList(backupPath)!!

this.backup(fileBasicArrayList, path.toFileSystemString() +"backup.zip")
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "backup()", e)
}

}


open fun backupViews()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, "backupViews()")

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.BACKUP_PATH)

    var backupPath: String = stringBuffer!!.toString()!!


    var path: AbPath = AbPath(backupPath)


    var fileBasicArrayList: BasicArrayList = BasicArrayList()


    var storeFrontsEntity: StoreFrontsEntity = StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!


    var storeFrontNamesBasicArrayList: Vector = storeFrontsEntity!!.getStoreFrontNames()!!


    var size: Int = storeFrontNamesBasicArrayList!!.size!!





                        for (index in 0 until size)

        {
    var nextStore: String = storeFrontNamesBasicArrayList!!.get(index) as String

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.VIEWS_PATH)
stringBuffer!!.append(nextStore)

    var viewsPath: String = stringBuffer!!.toString()!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Backup Store Views: ")
stringBuffer!!.append(nextStore)
stringBuffer!!.append(" from: ")
stringBuffer!!.append(viewsPath)
PreLogUtil.put(stringBuffer!!.toString(), this, "backupViews()")
fileBasicArrayList!!.addAll(this.getFileBasicArrayList(viewsPath))
}

this.backup(fileBasicArrayList, path.toFileSystemString() +"backupViews.zip")
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "backupViews()", e)
}

}


open fun backupResources()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, "backupResources()")

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.BACKUP_PATH)

    var backupPath: String = stringBuffer!!.toString()!!


    var path: AbPath = AbPath(backupPath)


    var fileBasicArrayList: BasicArrayList = BasicArrayList()


    var storeFrontsEntity: StoreFrontsEntity = StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!


    var storeFrontNamesBasicArrayList: Vector = storeFrontsEntity!!.getStoreFrontNames()!!


    var size: Int = storeFrontNamesBasicArrayList!!.size!!





                        for (index in 0 until size)

        {
    var nextStore: String = storeFrontNamesBasicArrayList!!.get(index) as String


    var storeFrontInterface: StoreFrontInterface = storeFrontsEntity!!.getStoreFrontInterface(nextStore)!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(storeFrontInterface!!.getCurrentHostNamePath())
stringBuffer!!.append(storeFrontInterface!!.getCategoryPath())

    var resourcesPath: String = stringBuffer!!.toString()!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Backup Store Resrouces: ")
stringBuffer!!.append(nextStore)
stringBuffer!!.append(" from: ")
stringBuffer!!.append(resourcesPath)
PreLogUtil.put(stringBuffer!!.toString(), this, "backupResources()")
fileBasicArrayList!!.addAll(this.getFileBasicArrayList(resourcesPath))
}

this.backup(fileBasicArrayList, path.toFileSystemString() +"backupResources.zip")
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "backupResources()", e)
}

}


open fun backupJsps()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, "backupJsps()")

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.BACKUP_PATH)

    var backupPath: String = stringBuffer!!.toString()!!


    var path: AbPath = AbPath(backupPath)


    var fileBasicArrayList: BasicArrayList = BasicArrayList()


    var storeFrontsEntity: StoreFrontsEntity = StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!


    var storeFrontNamesBasicArrayList: Vector = storeFrontsEntity!!.getStoreFrontNames()!!


    var size: Int = storeFrontNamesBasicArrayList!!.size!!





                        for (index in 0 until size)

        {
    var nextStore: String = storeFrontNamesBasicArrayList!!.get(index) as String

PreLogUtil.put("Backup Store Jsps: " +nextStore, this, "backupJsps()")
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(nextStore)
fileBasicArrayList!!.addAll(this.getFileBasicArrayList(stringBuffer!!.toString()))
}

this.backup(fileBasicArrayList, path.toFileSystemString() +"backupJsps.zip")
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "backupJsps()", e)
}

}


open fun backup(fileBasicArrayList: BasicArrayList, zipFile: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var fileBasicArrayList = fileBasicArrayList


                    var zipFile = zipFile

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("ZipFile: ")
stringBuffer!!.append(zipFile)
stringBuffer!!.append(" BasicArrayList: ")
stringBuffer!!.append(fileBasicArrayList!!.size())
PreLogUtil.put("Creating Backup Zip File: " +stringBuffer!!.toString(), this, "backup()")
ZipFileUtil.getInstance()!!.create(zipFile, fileBasicArrayList)
logUtil!!.put("Created Backup Zip File", this, "backup()")
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "backup()", e)
}

}


}
                
            

