
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
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.logic.io.file.FileWrapperUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.util.BasicArrayList

open public class Directory
            : Object
         {
        

        companion object {
            
    private val instance: Directory = Directory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Directory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun create(directoryAbPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var directoryAbPath = directoryAbPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.create(directoryAbPath!!.toFileSystemString())
}


                @Throws(Exception::class)
            
open fun remove(existingDirectoryAbPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
{

                    var existingDirectoryAbPath = existingDirectoryAbPath
this.remove(existingDirectoryAbPath!!.toFileSystemString())
}


open fun create(directory: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var directory = directory

        try {
            
    var directoryFile: AbFile = FileFactory.getInstance()!!.getInstance(directory)!!


    
                        if(!directoryFile!!.isDirectory())
                        
                                    {
                                    PreLogUtil.put("Creating Directories: " +directory, this, "create")

    
                        if(!directoryFile!!.mkdirs())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {PreLogUtil.put("Error Creating Directories: " +directory, this, "create", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(Exception::class)
            
open fun remove(existingDirectory: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var existingDirectory = existingDirectory

    var existingDirectoryFile: AbFile = FileFactory.getInstance()!!.getInstance(existingDirectory)!!


    
                        if(existingDirectoryFile!!.isDirectory())
                        
                                    {
                                    
    
                        if(existingDirectoryFile!!.list()!!.length > 0)
                        
                                    {
                                    


                            throw Exception("Did not remove category: " +existingDirectory +" because files exist")

                                    }
                                
                             else 
    
                        if(existingDirectoryFile!!.delete())
                        
                                    {
                                    PreLogUtil.put("Successfully Removed: " +existingDirectory, "Directory", "remove")

                                    }
                                

                                    }
                                
                        else {
                            


                            throw Exception("Category Directory Is Missing:" +existingDirectory)

                        }
                            
}


open fun search(fileFilter: FileFilter, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var fileFilter = fileFilter


                    var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.search(fileFilter, file, false)
}


open fun search(fileFilter: FileFilter, file: AbFile, isRecursiveSearch: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var fileFilter = fileFilter


                    var file = file


                    var isRecursiveSearch = isRecursiveSearch

    var fileList: BasicArrayList = BasicArrayList()


    var recursiveFileList: BasicArrayList


    
                        if(file.isDirectory())
                        
                                    {
                                    
    var fileArray: Array<Any?> = file.listFiles(fileFilter)!!


    
                        if(fileArray == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                

    var files: Array<AbFile?> = FileWrapperUtil.wrapFiles(fileArray)!!


    
                        if(files == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                

    var size: Int = files.size
                





                        for (index in 0 until size)


        {fileList!!.add(files[index]!!)

    
                        if(isRecursiveSearch)
                        
                                    {
                                    recursiveFileList= this.search(fileFilter, files[index]!!, isRecursiveSearch)
fileList!!.addAll(recursiveFileList)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList
}


open fun search(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.search(file, false)
}


open fun search(file: AbFile, isRecursiveSearch: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var file = file


                    var isRecursiveSearch = isRecursiveSearch

    var fileList: BasicArrayList = BasicArrayList()


    var recursiveFileList: BasicArrayList


    
                        if(file.isDirectory())
                        
                                    {
                                    
    var fileArray: Array<Any?> = file.listFiles()!!


    
                        if(fileArray == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                

    var files: Array<AbFile?> = FileWrapperUtil.wrapFiles(fileArray)!!


    
                        if(files == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                




                        for (index in 0 until files.size)


        {fileList!!.add(files[index]!!)

    
                        if(isRecursiveSearch)
                        
                                    {
                                    recursiveFileList= this.search(files[index]!!, isRecursiveSearch)
fileList!!.addAll(recursiveFileList)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList
}


open fun search(searchValue: String, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var searchValue = searchValue


                    var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.search(searchValue, file, false)
}


open fun search(searchValue: String, file: AbFile, isRecursiveSearch: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var searchValue = searchValue


                    var file = file


                    var isRecursiveSearch = isRecursiveSearch

    var fileList: BasicArrayList = BasicArrayList()


    var recursiveFileList: BasicArrayList


    
                        if(file.isDirectory())
                        
                                    {
                                    
    var fileArray: Array<Any?> = file.listFiles()!!


    
                        if(fileArray == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                

    var files: Array<AbFile?> = FileWrapperUtil.wrapFiles(fileArray)!!


    
                        if(files == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                




                        for (index in 0 until files.size)


        {
    
                        if(files[index]!!.getPath()!!.indexOf(searchValue) >= 0)
                        
                                    {
                                    fileList!!.add(files[index]!!)

                                    }
                                

    
                        if(isRecursiveSearch)
                        
                                    {
                                    recursiveFileList= this.search(searchValue, files[index]!!, isRecursiveSearch)
fileList!!.addAll(recursiveFileList)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList
}


open fun search(level: Int, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var level = level


                    var file = file



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.search(level, file, false)
}


open fun search(level: Int, file: AbFile, isRecursiveSearch: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var level = level


                    var file = file


                    var isRecursiveSearch = isRecursiveSearch

    var fileList: BasicArrayList = BasicArrayList()


    var recursiveFileList: BasicArrayList


    
                        if(file.isDirectory())
                        
                                    {
                                    
    var fileArray: Array<Any?> = file.listFiles()!!


    
                        if(fileArray == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                

    var files: Array<AbFile?> = FileWrapperUtil.wrapFiles(fileArray)!!


    
                        if(files == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                




                        for (index in 0 until files.size)


        {fileList!!.add(files[index]!!)

    
                        if(level <= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList

                                    }
                                
recursiveFileList= this.search(level -1, files[index]!!, isRecursiveSearch)
fileList!!.addAll(recursiveFileList)
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileList
}


}
                
            

