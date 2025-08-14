
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
        package org.allbinary.logic.io




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileNotFoundException
import java.io.FileOutputStream
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class AbFileOutputStream : FileOutputStream {
        
public constructor        (name: String)                        

                            : super(name){

                    var name = name


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String, append: Boolean)                        

                            : super(name, append){

                    var name = name


                    var append = append


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (file: AbFile)                        

                            : super(AbFileNativeUtil.get(file)){

                    var file = file


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (file: AbFile, append: Boolean)                        

                            : super(AbFileNativeUtil.get(file), append){

                    var file = file


                    var append = append


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            

