
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
        package org.allbinary.game.layer.weapon.mine




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.layer.pickup.CountedPickedUpLayerInterfaceFactory
import org.allbinary.game.layer.pickup.IconLayerFactory
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.game.layer.pickup.PickedUpLayerTypeFactory
import org.allbinary.game.layer.weapon.WeaponLayerCircularPool
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class MineCountedPickedUpLayerInterfaceFactory : CountedPickedUpLayerInterfaceFactory {
        

        companion object {
            
    private var pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface = CountedPickedUpLayerInterfaceFactory.NULL_COUNTED_PICKUP_LAYER_FACTORY

                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{pickedUpLayerInterfaceFactoryInterface= MineCountedPickedUpLayerInterfaceFactory()
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PickedUpLayerInterfaceFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pickedUpLayerInterfaceFactoryInterface
}


        }
            
    private val weaponLayerCircularStaticPool: WeaponLayerCircularPool = MineLayerCircularStaticPool.getInstance()!!
            
private constructor        ()                        

                            : super(PickedUpLayerTypeFactory.getInstance()!!.MINE, IconLayerFactory.getInstance(FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(MineWeaponResources.getInstance()!!.DROP_ICON_RESOURCE)!!.getInstance(0), 10, 10), FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(MineWeaponResources.getInstance()!!.DROP_RESOURCE)!!.getInstance(0)){

                            //For kotlin this is before the body of the constructor.
                    
}

override fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 3
}


    private val weaponProperties: WeaponProperties = WeaponProperties(0, 8000, 10.toShort())

    private val smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            

                @Throws(Exception::class)
            override fun getInstance(hashtable: Hashtable<Any, Any>, x: Int, y: Int, z: Int)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryLayer{

                    var hashtable = hashtable


                    var x = x


                    var y = y


                    var z = z

    var sourceLayerInterface: AllBinaryLayer = hashtable.get(smallIntegerSingletonFactory!!.getInstance(0) as Object) as AllBinaryLayer


    var angle: Integer = hashtable.get(smallIntegerSingletonFactory!!.getInstance(1) as Object) as Integer




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.weaponLayerCircularStaticPool!!.getInstance(sourceLayerInterface, x, y, z, angle.toInt().toInt(), 0, weaponProperties, sourceLayerInterface as ScoreableInterface)
}


}
                
            

