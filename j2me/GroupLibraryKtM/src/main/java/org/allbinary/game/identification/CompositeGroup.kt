
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
        package org.allbinary.game.identification




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class CompositeGroup
            : Object
         {
        

        companion object {
            
    private val ADDING_LABEL: String = "Adding: "

    private val TO_LABEL: String = " to: "

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val groupInterface: Group

    private val list: BasicArrayList = BasicArrayList()
public constructor        (groupInterface: Group)
            : super()
        {

                    var groupInterface = groupInterface
this.groupInterface= groupInterface
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.list.clear()
}


open fun add(groupInterface: Group)
        //nullable = true from not(false or (false and false)) = true
{

                    var groupInterface = groupInterface

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(ADDING_LABEL)
stringBuffer!!.append(groupInterface!!.toString())
stringBuffer!!.append(TO_LABEL)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.groupInterface))
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.ADD)
this.list.add(groupInterface)
}


open fun isInGroup(groupInterface: Group)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var groupInterface = groupInterface

    
                        if(list.contains(groupInterface))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getGroup()
        //nullable = true from not(false or (false and true)) = true
: Group{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return groupInterface
}


}
                
            

