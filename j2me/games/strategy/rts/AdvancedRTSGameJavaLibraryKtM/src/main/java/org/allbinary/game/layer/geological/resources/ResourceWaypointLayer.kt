
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.geological.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.SelectionHudPaintable
import org.allbinary.game.layer.waypoint.WaypointLayer
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.graphics.Rectangle
import org.allbinary.game.multiplayer.layer.RemoteInfo

open public class ResourceWaypointLayer : WaypointLayer {
        
public constructor (remoteInfo: RemoteInfo, parentLayer: PathFindingLayerInterface, groupInterface: Array<Group?>, rootName: String, name: String, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int)                        

                            : super(remoteInfo, parentLayer, groupInterface, rootName, name, animationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var x = x
    //var y = y


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun createHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{

    var rtsLayerHudPaintable: GeologicalResourceInfoHudPaintable = GeologicalResourceInfoHudPaintableSingleton.getInstance()!!

rtsLayerHudPaintable!!.setBasicColorP(this.allBinaryGameLayerManagerP!!.getForegroundBasicColor())
rtsLayerHudPaintable!!.setRtsLayer(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerHudPaintable
}


    override fun getHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{

    var rtsLayerHudPaintable: GeologicalResourceInfoHudPaintable = GeologicalResourceInfoHudPaintableSingleton.getInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerHudPaintable
}


}
                
            

