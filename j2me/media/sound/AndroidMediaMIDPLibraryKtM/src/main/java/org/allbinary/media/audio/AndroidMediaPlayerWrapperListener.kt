/* Generated Code Do Not Modify */
package org.allbinary.media.audio

import android.media.MediaPlayer
import java.lang.Object
import javax.microedition.media.PlayerListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class AndroidMediaPlayerWrapperListener : Object {

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var androidMediaPlayerWrapper: AndroidMediaPlayerWrapper =
        AndroidMediaPlayerWrapper.NULL_ANDROID_MEDIA_PLAYER_WRAPPER

    public constructor(androidMediaPlayerWrapper: AndroidMediaPlayerWrapper) : super() {
        // var androidMediaPlayerWrapper = androidMediaPlayerWrapper

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
            this.androidMediaPlayerWrapper = androidMediaPlayerWrapper

            var mediaPlayer: MediaPlayer = androidMediaPlayerWrapper!!.getMediaPlayer()!!

            mediaPlayer!!.setOnCompletionListener(this.mOnCompletionListener)
            mediaPlayer!!.setOnBufferingUpdateListener(this.mOnBufferingUpdateListener)
            mediaPlayer!!.setOnPreparedListener(this.mOnPreparedListener)
            mediaPlayer!!.setOnErrorListener(this.mOnErrorListener)
        } catch (e: Exception) {
            this.logUtil!!.put(
                this.commonStrings!!.EXCEPTION,
                this,
                this.commonStrings!!.CONSTRUCTOR,
                e,
            )
        }
    }

    open public inner class MediaPlayerOnBufferingUpdateListener :
        Object, MediaPlayer.OnBufferingUpdateListener {

        // Auto Generated
        public constructor() : super() {}

        override fun onBufferingUpdate(mediaPlayer: MediaPlayer, i: Int)
            // nullable = true from not(false or (false and false)) = true
        {
            // var mediaPlayer = mediaPlayer
            // var i = i
        }
    }

    open public inner class MediaPlayerOnPreparedListener : Object, MediaPlayer.OnPreparedListener {

        // Auto Generated
        public constructor() : super() {}

        override fun onPrepared(mp: MediaPlayer)
            // nullable = true from not(false or (false and false)) = true
        {
            // var mp = mp
        }
    }

    open public inner class MediaPlayerOnErrorListener : Object, MediaPlayer.OnErrorListener {

        // Auto Generated
        public constructor() : super() {}

        override fun onError(
            mp: MediaPlayer,
            what: Int,
            extra: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Boolean {
            // var mp = mp
            // var what = what
            // var extra = extra

            // if statement needs to be on the same line and ternary does not work the same way.
            return false
        }
    }

    open public inner class MediaPlayerOnCompletionListener :
        Object, MediaPlayer.OnCompletionListener {

        // Auto Generated
        public constructor() : super() {}

        override fun onCompletion(mp: MediaPlayer)
            // nullable = true from not(false or (false and false)) = true
        {
            // var mp = mp
        }
    }

    open public inner class AndroidMediaPlayerOnBufferingUpdateListener :
        MediaPlayerOnBufferingUpdateListener {

        private val ON_BUFFERING_UPDATE: String = "onBufferingUpdate()"

        private val androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener

        public constructor(androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener) {
            // var androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
            this.androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
        }

        override fun onBufferingUpdate(mediaPlayer: MediaPlayer, i: Int)
            // nullable = true from not(false or (false and false)) = true
        {
            // var mediaPlayer = mediaPlayer
            // var i = i

            var logUtil: LogUtil = LogUtil.getInstance()!!

            logUtil!!.putF(
                StringMaker().append("Update buffer: ")!!.appendint(i)!!.append("%")!!.toString(),
                this,
                this.ON_BUFFERING_UPDATE,
            )
            this.androidMediaPlayerWrapperListener!!
                .androidMediaPlayerWrapper!!
                .update(PlayerListener.DEVICE_UNAVAILABLE)
        }
    }

    private var mOnBufferingUpdateListener: MediaPlayer.OnBufferingUpdateListener =
        AndroidMediaPlayerOnBufferingUpdateListener(this)

    open public inner class AndroidMediaPlayerOnPreparedListener : MediaPlayerOnPreparedListener {

        private val ON_PREPARE: String = "onPrepare()"

        private val androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener

        public constructor(androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener) {
            // var androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
            this.androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
        }

        override fun onPrepared(mp: MediaPlayer)
            // nullable = true from not(false or (false and false)) = true
        {
            // var mp = mp

            var logUtil: LogUtil = LogUtil.getInstance()!!

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            logUtil!!.putF(commonStrings!!.START, this, this.ON_PREPARE)
            this.androidMediaPlayerWrapperListener!!
                .androidMediaPlayerWrapper!!
                .update(PlayerListener.DEVICE_AVAILABLE)
        }
    }

    private var mOnPreparedListener: MediaPlayer.OnPreparedListener =
        AndroidMediaPlayerOnPreparedListener(this)

    open public inner class AndroidMediaPlayerOnErrorListener : MediaPlayerOnErrorListener {

        private val ON_ERROR: String = "onError()"

        private val androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener

        public constructor(androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener) {
            // var androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
            this.androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
        }

        override fun onError(
            mp: MediaPlayer,
            what: Int,
            extra: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Boolean {
            // var mp = mp
            // var what = what
            // var extra = extra

            var logUtil: LogUtil = LogUtil.getInstance()!!

            logUtil!!.putF(
                StringMaker()
                    .append(CommonLabels.getInstance()!!.START_LABEL)!!
                    .append("What: ")!!
                    .appendint(what)!!
                    .append(" Extra: ")!!
                    .appendint(extra)!!
                    .toString(),
                this,
                this.ON_ERROR,
            )
            this.androidMediaPlayerWrapperListener!!
                .androidMediaPlayerWrapper!!
                .update(PlayerListener.ERROR)

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }
    }

    private var mOnErrorListener: MediaPlayer.OnErrorListener =
        AndroidMediaPlayerOnErrorListener(this)

    open public inner class AndroidMediaPlayerOnCompletionListener :
        MediaPlayerOnCompletionListener {

        private val ON_COMPLETE: String = "onComplete()"

        private val androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener

        public constructor(androidMediaPlayerWrapperListener: AndroidMediaPlayerWrapperListener) {
            // var androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
            this.androidMediaPlayerWrapperListener = androidMediaPlayerWrapperListener
        }

        override fun onCompletion(mp: MediaPlayer)
            // nullable = true from not(false or (false and false)) = true
        {
            // var mp = mp

            var logUtil: LogUtil = LogUtil.getInstance()!!

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            logUtil!!.putF(commonStrings!!.START, this, this.ON_COMPLETE)
            this.androidMediaPlayerWrapperListener!!
                .androidMediaPlayerWrapper!!
                .update(PlayerListener.END_OF_MEDIA)
        }
    }

    private var mOnCompletionListener: MediaPlayer.OnCompletionListener =
        AndroidMediaPlayerOnCompletionListener(this)
}
