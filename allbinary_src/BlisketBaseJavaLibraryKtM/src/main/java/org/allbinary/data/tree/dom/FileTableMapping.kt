
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
        package org.allbinary.data.tree.dom




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileData
import org.allbinary.logic.io.path.PathUtil

open public class FileTableMapping
            : Object
        
                , TableMappingInterface {
        

    private var file: AbFile
public constructor        (file: AbFile)
            : super()
        {

                    var file = file
this.file= file
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getPath() as Object
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var filePropertyVector: Vector = Vector()

filePropertyVector!!.add(file.getAbsolutePath())
filePropertyVector!!.add(file.getCanonicalPath())
filePropertyVector!!.add(file.getName())
filePropertyVector!!.add(file.getParent())
filePropertyVector!!.add(file.getPath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filePropertyVector
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var filePropertyHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var pathUtil: PathUtil = PathUtil.getInstance()!!


    var rootFileName: String = pathUtil!!.getNameFromPath(pathUtil!!.getWithoutExtension(file.getPath()))!!


    var fileData: FileData = FileData.getInstance()!!

filePropertyHashMap!!.put(fileData!!.ROOT_NAME, rootFileName)
filePropertyHashMap!!.put(fileData!!.ISFILE, Boolean.valueOf(file.isFile())!!.toString())
filePropertyHashMap!!.put(fileData!!.ISDIRECTORY, Boolean.valueOf(file.isDirectory())!!.toString())
filePropertyHashMap!!.put(fileData!!.ISHIDDEN, Boolean.valueOf(file.isHidden())!!.toString())
filePropertyHashMap!!.put(fileData!!.ISABSOLUTE, Boolean.valueOf(file.isAbsolute())!!.toString())
filePropertyHashMap!!.put(fileData!!.ABSOLUTE_PATH, file.getAbsolutePath())
filePropertyHashMap!!.put(fileData!!.CANONICAL_PATH, file.getCanonicalPath())
filePropertyHashMap!!.put(fileData!!.NAME, file.getName())
filePropertyHashMap!!.put(fileData!!.PARENT, file.getParent())
filePropertyHashMap!!.put(fileData!!.PATH, file.getPath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filePropertyHashMap
}


}
                
            

