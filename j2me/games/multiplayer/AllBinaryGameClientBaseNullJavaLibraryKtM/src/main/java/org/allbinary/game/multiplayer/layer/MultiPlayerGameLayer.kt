
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
        package org.allbinary.game.multiplayer.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.graphics.Rectangle
import org.allbinary.view.ViewPosition

open public class MultiPlayerGameLayer : CollidableDestroyableDamageableLayer
                , MultiPlayerGameLayerInterface {
        
public constructor        (remoteInfo: RemoteInfo, groupInterface: Array<Group?>, layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(groupInterface, layerInfo, viewPosition){
    //var remoteInfo = remoteInfo
    //var groupInterface = groupInterface
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (remoteInfo: RemoteInfo, groupInterface: Array<Group?>, name: String, layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(groupInterface, name, layerInfo, viewPosition){
    //var remoteInfo = remoteInfo
    //var groupInterface = groupInterface
    //var name = name
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

override fun getMultiplayerBehavior()
        //nullable = true from not(false or (false and true)) = true
: MultiplayerBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MultiplayerBehavior.NULL_MULTIPLAYER_BEHAVIOR
}


open fun setPingInfo(show: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var show = show
}


open fun setFiring(firing: Short)
        //nullable = true from not(false or (false and false)) = true
{
var firing = firing
}


open fun getFiring()
        //nullable = true from not(false or (false and true)) = true
: Short{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

