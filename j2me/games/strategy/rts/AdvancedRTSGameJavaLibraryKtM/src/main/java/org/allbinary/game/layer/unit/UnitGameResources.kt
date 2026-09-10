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
package org.allbinary.game.layer.unit

import org.allbinary.AndroidUtil
import org.allbinary.game.configuration.feature.GraphicsFeatureFactory
import org.allbinary.game.layer.resources.BasicGameResources
import org.allbinary.game.layer.resources.GameGraphicsResourceUtil
import org.allbinary.logic.string.StringUtil

open public class UnitGameResources : BasicGameResources {

    companion object {

        private val ICON: String = "_icon"

        private val BUILD: String = "_build"

        private val DESTROY: String = "_destroy"

        private val ICON_BUILD: String = "_icon" + UnitGameResources.BUILD
    }

    var NAME: String = StringUtil.getInstance()!!.EMPTY_STRING

    var RESOURCE_ICON_ANIMATION: String = StringUtil.getInstance()!!.EMPTY_STRING

    var RESOURCE_ICON_BUILD: String = StringUtil.getInstance()!!.EMPTY_STRING

    var RESOURCE_ICON: String = StringUtil.getInstance()!!.EMPTY_STRING

    protected constructor() {}

    private val ICON_SIZE: String = "_64_by_64.png"

    @Throws(Exception::class)
    override fun append(ROOT: String, sizeString: String)
        // nullable = true from not(false or (false and false)) = true
    {
        var ROOT = ROOT
        var sizeString = sizeString
        super.append(ROOT, sizeString)

        var string: String = GameGraphicsResourceUtil.getInstance()!!.getName()!!

        BasicGameResources.stringBuffer!!.delete(0, BasicGameResources.stringBuffer!!.length())
        BasicGameResources.stringBuffer!!.append(ROOT)
        BasicGameResources.stringBuffer!!.append(UnitGameResources.DESTROY)
        BasicGameResources.stringBuffer!!.append(string)
        BasicGameResources.stringBuffer!!.append(sizeString)
        this.RESOURCE_DESTROY = BasicGameResources.stringBuffer!!.toString()
        BasicGameResources.stringBuffer!!.delete(0, BasicGameResources.stringBuffer!!.length())
        BasicGameResources.stringBuffer!!.append(UnitGameResources.ICON)
        BasicGameResources.stringBuffer!!.append(ROOT)
        this.RESOURCE_ICON_ANIMATION = BasicGameResources.stringBuffer!!.toString()
        BasicGameResources.stringBuffer!!.delete(0, BasicGameResources.stringBuffer!!.length())
        BasicGameResources.stringBuffer!!.append(ROOT)
        BasicGameResources.stringBuffer!!.append(UnitGameResources.ICON)
        BasicGameResources.stringBuffer!!.append(string)
        BasicGameResources.stringBuffer!!.append(this.ICON_SIZE)
        this.RESOURCE_ICON = BasicGameResources.stringBuffer!!.toString()
        BasicGameResources.stringBuffer!!.delete(0, BasicGameResources.stringBuffer!!.length())
        BasicGameResources.stringBuffer!!.append(ROOT)
        BasicGameResources.stringBuffer!!.append(UnitGameResources.ICON_BUILD)
        BasicGameResources.stringBuffer!!.append(string)
        BasicGameResources.stringBuffer!!.append(this.ICON_SIZE)
        this.RESOURCE_ICON_BUILD = BasicGameResources.stringBuffer!!.toString()
    }

    @Throws(Exception::class)
    override fun getString()
    // nullable = true from not(false or (false and true)) = true
    : String {

        if (AndroidUtil.isAndroid()) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return GameGraphicsResourceUtil.getInstance()!!.getStringForFeature(
                GraphicsFeatureFactory.getInstance()!!.SPRITE_QUARTER_ROTATION_GRAPHICS
            )
        } else {

            // if statement needs to be on the same line and ternary does not work the same way.
            return super.getString()
        }
    }
}
