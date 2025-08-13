
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class GroupFactory
            : Object
         {
        

        companion object {
            
    private var instance: GroupFactory = GroupFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GroupFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val list: BasicArrayList = BasicArrayList()

    private var index: Int = 0

open fun getNextGroup()
        //nullable = true from not(false or (false and true)) = true
: Group{
    var group: Group = list.objectArray[index]!! as Group

index++



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return group
}


open fun getNextGroup(name: String)
        //nullable = true from not(false or (false and false)) = true
: Group{

                    var name = name

    var group: Group = this.getNextGroup()!!
            

group.setName(name)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return group
}


open fun init(groups: Short, nameArray: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var groups = groups


                    var nameArray = nameArray

    var stringMaker: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var TEAM: String = "Team "

list.clear()
index= 0

    var size: Int = list.size()!!
            


        while(size < groups)
        {
    var name: String = stringUtil!!.EMPTY_STRING


    
                        if(size < nameArray!!.size)
                        
                                    {
                                    name= nameArray[size]!!

                                    }
                                
                        else {
                            stringMaker!!.delete(0, stringMaker!!.length())
name= stringMaker!!.append(TEAM)!!.append(size)!!.toString()

                        }
                            
list.add(Group(name, (size +3).toShort()))
size++
}

}


}
                
            

