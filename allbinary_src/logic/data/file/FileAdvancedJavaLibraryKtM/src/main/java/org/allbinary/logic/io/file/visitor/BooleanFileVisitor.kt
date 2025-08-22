
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
        package org.allbinary.logic.io.file.visitor




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.util.visitor.VisitorInterface
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BooleanFileVisitor
            : Object
        
                , VisitorInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var filterStringBasicArrayList: BasicArrayList
public constructor        (filterStringBasicArrayList: BasicArrayList)
            : super()
        {

                    var filterStringBasicArrayList = filterStringBasicArrayList
this.setFilterStringBasicArrayList(filterStringBasicArrayList)
PreLogUtil.put("Filter BasicArrayList: " +this.getFilterStringBasicArrayList()!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)
}


open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.visit(anyType as AbFile) as Object
}


open fun visit(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var file = file

    var list: BasicArrayList = this.getFilterStringBasicArrayList()!!


    var size: Int = list.size()!!


    var nextFileFilterString: String





                        for (index in 0 until size)


        {nextFileFilterString= list.get(index) as String

    
                        if(this.visit(file, nextFileFilterString))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


open fun getFilterStringBasicArrayList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filterStringBasicArrayList
}


open fun setFilterStringBasicArrayList(filterStringBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var filterStringBasicArrayList = filterStringBasicArrayList
this.filterStringBasicArrayList= filterStringBasicArrayList
}


open fun visit(file: AbFile, fileNameString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var file = file


                    var fileNameString = fileNameString



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


}
                
            

