
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class Group
            : Object
        
                , GroupInterface {
        

        companion object {
            
    val ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(10)!!

    private val GROUP_NAME_LABEL: String = "Group Name: "

    private val ID_LABEL: String = " Id: "

        }
            
    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val teamId: Short

    private var string: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (teamName: String, teamId: Short)
            : super()
        

        Updates for KMP build        
        {
var teamName = teamName
var teamId = teamId
this.setName(teamName)
this.teamId= teamId
}

override fun getGroupName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var name = name
this.name= name

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(GROUP_NAME_LABEL)
stringBuffer!!.append(this.name)
stringBuffer!!.append(ID_LABEL)
stringBuffer!!.append(this.teamId)
this.string= stringBuffer!!.toString()
}

override fun getGroupId()
        //nullable = true from not(false or (false and true)) = true
: Short

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return teamId
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return string
}


}
                
            

