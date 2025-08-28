
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.configuration.persistance




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PersistanceStrings
            : Object
         {
        

        companion object {
            
    private val instance: PersistanceStrings = PersistanceStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PersistanceStrings

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val SAVING: String = "Saving: "

    val NUMBER_OF_RECORDS: String = "Number of records: "

    val LOADING_ID: String = "Loading data with id: "

    val LOAD_ALL: String = "loadAll"

    val DELETING_WITH_ID: String = "Deleting data with id: "

    val CLOSING_RECORDSTORE: String = "Closing RecordStore"

    val NOT_SAVING: String = "Not Saving: "

    val ERROR_LOADING: String = "Error Loading gameActionInput: "

    val ERROR_LOADING_ID: String = "Error Loading id: "

    val ID: String = " id: "

    val GAME_ACTION_INPUT: String = " GameActionInput: "

}
                
            

