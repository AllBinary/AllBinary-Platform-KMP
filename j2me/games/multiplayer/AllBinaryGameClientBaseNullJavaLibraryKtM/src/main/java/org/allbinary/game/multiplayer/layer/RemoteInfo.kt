
        /*
                *  
                *  To change this license header, choose License Headers in Project Properties. 
                *  To change this template file, choose Tools | Templates  and open the template in the editor.  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.multiplayer.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class RemoteInfo
            : Object
         {
        
companion object {
            
    val REMOTE_INFO: RemoteInfo = RemoteInfo(StringUtil.getInstance()!!.EMPTY_STRING,  -1,  -1, RemoteInfo.NEW_PLAYER_ID)

    val NEW_PLAYER_ID: Int = 0

        }
            public constructor (username: String, actorSessionId: Int, playerInputId: Int, id: Int)
            : super()
        {
var username = username
var actorSessionId = actorSessionId
var playerInputId = playerInputId
var id = id
}


}
                
            

