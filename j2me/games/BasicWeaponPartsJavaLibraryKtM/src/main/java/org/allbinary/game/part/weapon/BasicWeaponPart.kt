
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
        package org.allbinary.game.part.weapon




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.part.PartInterface
import org.allbinary.game.score.Scoreable
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.string.CommonStrings
import org.allbinary.view.ViewPosition

open public class BasicWeaponPart
            : Object
        
                , PartInterface
                , SalvoInterface {
        
companion object {
            
    val NULL_BASIC_WEAPON_PART: BasicWeaponPart = BasicWeaponPart(NullAnimationFactory.getFactoryInstance()!!.getInstance(0))

        }
            
    private var animationInterface: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!

    private var ownerLayerInterface: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER

    private var weaponProperties: WeaponProperties = WeaponProperties.NULL_WEAPON_PROPERTIES

    private var scoreableInterface: ScoreableInterface = Scoreable.NULL_SCOREABLE

    var relativeRelationship: RelativeRelationship = RelativeRelationship.NULL_RELATIVE_RELATIONSHIP
public constructor (animationInterface: Animation)
            : super()
        {
    //var animationInterface = animationInterface
this.setAnimationInterface(animationInterface)
}

public constructor (animationInterface: Animation, sourceLayerInterface: AllBinaryLayer, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface, relativeRelationship: RelativeRelationship)
            : super()
        {
    //var animationInterface = animationInterface
    //var sourceLayerInterface = sourceLayerInterface
    //var weaponProperties = weaponProperties
    //var scoreableInterface = scoreableInterface
    //var relativeRelationship = relativeRelationship
this.init(sourceLayerInterface, weaponProperties, scoreableInterface, relativeRelationship)
this.setAnimationInterface(animationInterface)
}


    open fun init(sourceLayerInterface: AllBinaryLayer, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface, relativeRelationship: RelativeRelationship)
        //nullable = true from not(false or (false and false)) = true
{
    //var sourceLayerInterface = sourceLayerInterface
    //var weaponProperties = weaponProperties
    //var scoreableInterface = scoreableInterface
    //var relativeRelationship = relativeRelationship
this.setOwnerLayerInterface(sourceLayerInterface)
this.setWeaponProperties(weaponProperties)
this.scoreableInterface= scoreableInterface
this.relativeRelationship= relativeRelationship
}


                @Throws(Exception::class)
            
    override fun process(allbinaryLayerManager: AllBinaryLayerManager, angle: Short, otherAngle: Short)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var angle = angle
    //var otherAngle = otherAngle
this.process(allbinaryLayerManager, angle, otherAngle, this.getWeaponProperties(), this.scoreableInterface)
}


                @Throws(Exception::class)
            
    override fun process(allbinaryLayerManager: AllBinaryLayerManager, angle: Short, otherAngle: Short, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var angle = angle
    //var otherAngle = otherAngle
    //var weaponProperties = weaponProperties
    //var scoreableInterface = scoreableInterface



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


    open fun getOwnerLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ownerLayerInterface
}


    open fun setOwnerLayerInterface(ownerLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayerInterface = ownerLayerInterface
this.ownerLayerInterface= ownerLayerInterface
}


    override fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}


    open fun setAnimationInterface(animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{
    //var animationInterface = animationInterface
this.animationInterface= animationInterface
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var viewPosition: ViewPosition = this.getOwnerLayerInterface()!!.getViewPosition()!!


    var viewX: Int = viewPosition!!.getX()!!


    var viewY: Int = viewPosition!!.getY()!!

this.animationInterface!!.paint(graphics, viewX, viewY)
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
}


    open fun getWeaponProperties()
        //nullable = true from not(false or (false and true)) = true
: WeaponProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return weaponProperties
}


    open fun setWeaponProperties(weaponProperties: WeaponProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var weaponProperties = weaponProperties
this.weaponProperties= weaponProperties
}


}
                
            

