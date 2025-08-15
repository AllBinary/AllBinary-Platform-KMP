
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
        package org.allbinary.logic.visual.transform.template.customizer.widgets.logo




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.apache.commons.fileupload.FileItem

open public class LogoImageFileUtil
            : Object
         {
        

    private val directory: Directory = Directory.getInstance()!!
            

    private val fileName: String

    private val imageFileAbPath: AbPath
public constructor        (imageAbPath: AbPath, imageFile: String)
            : super()
        {

                    var imageAbPath = imageAbPath


                    var imageFile = imageFile
this.fileName= imageFile
this.imageFileAbPath= imageAbPath
}


                @Throws(Exception::class)
            
open fun saveFiles(fileItem: FileItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var fileItem = fileItem

    
                        if(fileName == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Image File Name Was Null")

                                    }
                                

    
                        if(!this.directory.create(this.imageFileAbPath))
                        
                                    {
                                    


                            throw Exception("Unable to save file to non creatable directory")

                                    }
                                

    var originalImageFile: AbFile = AbFile(this.imageFileAbPath!!.toString() +fileName)

originalImageFile!!.createNewFile()
FileUtil.getInstance()!!.write(ByteArrayInputStream(fileItem!!.get()), originalImageFile)
}


}
                
            

