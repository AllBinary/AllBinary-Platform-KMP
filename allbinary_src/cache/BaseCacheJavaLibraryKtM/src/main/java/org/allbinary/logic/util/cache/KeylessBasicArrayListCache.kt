
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
        package org.allbinary.logic.util.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class KeylessBasicArrayListCache : IndexedBasicArrayListCache {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!
            
public constructor        (){}

public constructor        (size: Int)                        

                            : super(size){

                    var size = size


                            //For kotlin this is before the body of the constructor.
                    
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
        try {
            
    
                        if(this.index >= this.list.size())
                        
                                    {
                                    this.add()

                                    }
                                

    var list: BasicArrayList = this.get(this.index++) as BasicArrayList




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicArrayListUtil!!.getImmutableInstance()
}

}

override fun clear()
        //nullable = true from not(false or (false and true)) = true
{super.clear()

    var basicArrayList: BasicArrayList





                        for (index in this.list.size() -1 downTo 0)


        {basicArrayList= (this.list.objectArray[index]!! as BasicArrayList)
basicArrayList!!.clear()
}

}

override fun log()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("S: ")
stringBuffer!!.append(this.list.size())

    var basicArrayList: BasicArrayList





                        for (index in this.list.size() -1 downTo 0)


        {stringBuffer!!.append(" s: ")
basicArrayList= (this.list.objectArray[index]!! as BasicArrayList)
stringBuffer!!.append(basicArrayList!!.size())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

