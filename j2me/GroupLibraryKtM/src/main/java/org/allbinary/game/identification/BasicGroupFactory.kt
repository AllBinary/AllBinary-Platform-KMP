
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
        

open public class BasicGroupFactory
            : Object
         {
        

        companion object {


    private val instance: BasicGroupFactory = BasicGroupFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicGroupFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NAME: String = "GROUP_NAME"

    val NO_SUCH_GROUP: String = "No Such Group: "

    val GOOD: Group = Group(
                            "Good Guys", 0.toShort())

    val ENEMY: Group = Group(
                            "Bad Guys", 1.toShort())

    val ENEMY_ON_LEVEL: Group = Group(
                            "Bad Guys on Level", 2.toShort())

    val NONE: Group = Group(
                            "Not On A Team", 3.toShort())

    val GOOD_ARRAY: Array<Group?> = arrayOf(this.GOOD)

    val ENEMY_ARRAY: Array<Group?> = arrayOf(this.ENEMY)

    val ENEMY_ON_LEVEL_ARRAY: Array<Group?> = arrayOf(this.ENEMY,this.ENEMY_ON_LEVEL)

    val NONE_ARRAY: Array<Group?> = arrayOf(this.NONE)

}
                
            

