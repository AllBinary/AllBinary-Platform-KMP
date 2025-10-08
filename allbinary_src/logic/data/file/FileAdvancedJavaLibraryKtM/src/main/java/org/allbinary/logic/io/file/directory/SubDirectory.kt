
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
        package org.allbinary.logic.io.file.directory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileFilter
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class SubDirectory
            : Object
         {
        
companion object {
            
    private val instance: SubDirectory = SubDirectory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SubDirectory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    open fun toString(files: BasicArrayList)
        //nullable = true from not(false or (true and false)) = true
: String{
var files = files

    var stringBuffer: StringMaker = StringMaker()


    var NEW_LINE: String = CommonSeps.getInstance()!!.NEW_LINE


    var size: Int = files.size()!!





                        for (index in 0 until size)

        {

    var file: AbFile = files.get(index) as AbFile

stringBuffer!!.append(file.getPath())
stringBuffer!!.append(NEW_LINE)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
    private val directory: Directory = Directory.getInstance()!!
private constructor ()
            : super()
        {
}


    open fun search(fileFilter: FileFilter, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
var fileFilter = fileFilter
var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.search(fileFilter, file, true)
}


    open fun search(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.search(file, true)
}


    open fun search(searchValue: String, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
var searchValue = searchValue
var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.search(searchValue, file, true)
}


    open fun search(level: Int, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
var level = level
var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.search(level, file, true)
}


}
                
            

