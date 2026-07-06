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
package org.allbinary.game.commands

import java.lang.Object
import javax.microedition.lcdui.Command
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class GameCommandsFactory : Object {

    companion object {

        private val instance: GameCommandsFactory = GameCommandsFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : GameCommandsFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return GameCommandsFactory.instance
        }
    }

    val TOGGLE_FULLSCREEN: Command =
        Command("Toggle FullScreen", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val TOGGLE_KEYBOARD: Command =
        Command("Keyboard", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val SET_MENU_DISPLAYABLE: Command =
        Command("Set Menu Displayable", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val APPLICATION_UPDATE: Command =
        Command(
            CommonStrings.getInstance()!!.UPDATE,
            StringUtil.getInstance()!!.EMPTY_STRING,
            Command.SCREEN,
            1,
        )

    val DISPLAY_ABOUT: Command =
        Command(
            CanvasStrings.getInstance()!!.ABOUT,
            StringUtil.getInstance()!!.EMPTY_STRING,
            Command.SCREEN,
            2,
        )

    val OPEN_WEB_URL: Command =
        Command("Open Web URL", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 2)

    val CLOSE_OPTIONS: Command =
        Command("Back", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val DISPLAY_OPTIONS: Command =
        Command(
            CanvasStrings.getInstance()!!.OPTIONS,
            StringUtil.getInstance()!!.EMPTY_STRING,
            Command.SCREEN,
            2,
        )

    val START_TRACE: Command =
        Command("Start Trace", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val STOP_TRACE: Command =
        Command("Stop Trace", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val DEFAULT_OPTIONS: Command =
        Command("Default", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val SHOW_GAME_CANVAS: Command =
        Command("Back to Game", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val CLOSE_AND_SHOW_GAME_CANVAS: Command =
        Command("Back", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val QUIT_COMMAND: Command =
        Command("Quit", StringUtil.getInstance()!!.EMPTY_STRING, Command.STOP, 1)

    val RESTART_COMMAND: Command =
        Command("Restart", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 0)

    val DISPLAY_SAVE_FORM: Command =
        Command("Save To", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 3)

    val SAVE: Command = Command("Save", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 3)

    val DISPLAY_LOAD_FORM: Command =
        Command("Load", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 3)

    val LOAD_FILE: Command =
        Command("Load File", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 3)

    val DELETE_FILE: Command =
        Command("Delete File", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val EXIT_COMMAND: Command =
        Command("Exit", StringUtil.getInstance()!!.EMPTY_STRING, Command.EXIT, 2)

    val EXIT_WITHOUT_PROGRESS_COMMAND: Command =
        Command("Exit Without Progress", StringUtil.getInstance()!!.EMPTY_STRING, Command.EXIT, 2)

    val START_COMMAND: Command =
        Command(
            CommonStrings.getInstance()!!.START,
            StringUtil.getInstance()!!.EMPTY_STRING,
            Command.SCREEN,
            1,
        )

    val CONTINUE_COMMAND: Command =
        Command("Continue", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val SELECT_COMMAND: Command =
        Command("Select", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val FEATURE_UPDATE: Command =
        Command("Feature Update", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val BUY_COMMAND: Command =
        Command("BUY", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    protected constructor() : super() {}
}
