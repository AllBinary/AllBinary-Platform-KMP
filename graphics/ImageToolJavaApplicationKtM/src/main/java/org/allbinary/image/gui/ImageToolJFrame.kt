
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
        package org.allbinary.image.gui




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.io.File
import java.util.Arrays
import java.util.Comparator
import javax.imageio.ImageIO
import org.allbinary.gui.dialog.FileJDialog
import org.allbinary.gui.dialog.FileJDialogListenerInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.analysis.ColorRange
import org.allbinary.media.image.analysis.ColorRangeInterface
import org.allbinary.media.image.analysis.ImageAnalysis
import org.allbinary.media.image.analysis.ImageAnalysisResults
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings

open public class ImageToolJFrame : javax.swing.JFrame
                , FileJDialogListenerInterface {
        
companion object {
            
    private var imageProcessorInputCompositeInterface: ImageProcessorInputCompositeInterface

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var fileJDialog: FileJDialog

    private var imageProcessorInput: ImageProcessorInput
public constructor (){
initComponents()

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!

this.setSize(640, 480)
this.getMaxRedJTextField()!!.setText("255")
this.getMaxGreenJTextField()!!.setText("255")
this.getMaxBlueJTextField()!!.setText("255")
this.getMinRedJTextField()!!.setText(commonPhoneStrings!!.ZERO)
this.getMinGreenJTextField()!!.setText(commonPhoneStrings!!.ZERO)
this.getMinBlueJTextField()!!.setText(commonPhoneStrings!!.ZERO)
fileJDialog= FileJDialog()
fileJDialog!!.addFinishedListener(this)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
analysisActionJDialog= javax.swing.JDialog()
titleJLabel= javax.swing.JLabel()
colorRangeJLabel= javax.swing.JLabel()
redJLabel= javax.swing.JLabel()
minJLabel= javax.swing.JLabel()
maxJLabel= javax.swing.JLabel()
greenJLabel= javax.swing.JLabel()
blueJLabel= javax.swing.JLabel()
minRedJTextField= javax.swing.JTextField()
maxRedJTextField= javax.swing.JTextField()
maxGreenJTextField= javax.swing.JTextField()
minBlueJTextField= javax.swing.JTextField()
maxBlueJTextField= javax.swing.JTextField()
okJButton= javax.swing.JButton()
minGreenJTextField= javax.swing.JTextField()
jPanel1= javax.swing.JPanel()
mainJMenuBar= javax.swing.JMenuBar()
fileJMenu= javax.swing.JMenu()
openImageJMenuItem= javax.swing.JMenuItem()
processingJMenu= javax.swing.JMenu()
analyzeJMenuItem= javax.swing.JMenuItem()
generateSpriteSplitterMenuItem= javax.swing.JMenuItem()
generateRotationMenuItem= javax.swing.JMenuItem()
generateMirrorSpriteMenuItem= javax.swing.JMenuItem()
generateRotationSpriteJMenuItem= javax.swing.JMenuItem()
createStripImageJMenuItem= javax.swing.JMenuItem()
mirrorJMenuItem= javax.swing.JMenuItem()
scaleImagesJMenuItem= javax.swing.JMenuItem()
canvasImagesJMenuItem= javax.swing.JMenuItem()
analysisActionJDialog!!.setMinimumSize(java.awt.Dimension(350, 250))
titleJLabel!!.setText("              Color At Action Options            ")
colorRangeJLabel!!.setText("Color Range")
redJLabel!!.setText("Red:")
minJLabel!!.setText("Minimum")
maxJLabel!!.setText("Maximum")
greenJLabel!!.setText("Green:")
blueJLabel!!.setText("Blue:")
okJButton!!.setText("OK")
okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )

    var analysisActionJDialogLayout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(analysisActionJDialog!!.getContentPane())

analysisActionJDialog!!.getContentPane()!!.setLayout(analysisActionJDialogLayout)
analysisActionJDialogLayout!!.setHorizontalGroup(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(analysisActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(analysisActionJDialogLayout!!.createSequentialGroup()!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(blueJLabel)!!.add(greenJLabel)!!.add(redJLabel)!!.add(colorRangeJLabel))!!.add(29, 29, 29)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(org.jdesktop.layout.GroupLayout.TRAILING, minJLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)!!.add(org.jdesktop.layout.GroupLayout.LEADING, minBlueJTextField)!!.add(org.jdesktop.layout.GroupLayout.LEADING, minGreenJTextField)!!.add(org.jdesktop.layout.GroupLayout.LEADING, minRedJTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)!!.add(org.jdesktop.layout.GroupLayout.LEADING, okJButton)))!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)!!.add(org.jdesktop.layout.GroupLayout.LEADING, analysisActionJDialogLayout!!.createSequentialGroup()!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)!!.add(org.jdesktop.layout.GroupLayout.LEADING, maxRedJTextField)!!.add(org.jdesktop.layout.GroupLayout.LEADING, analysisActionJDialogLayout!!.createSequentialGroup()!!.add(1, 1, 1)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(maxBlueJTextField)!!.add(maxGreenJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 17, Short.MAX_VALUE))!!.add(org.jdesktop.layout.GroupLayout.LEADING, maxJLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))!!.addContainerGap())!!.add(org.jdesktop.layout.GroupLayout.TRAILING, analysisActionJDialogLayout!!.createSequentialGroup()!!.add(titleJLabel)!!.add(25, 25, 25)))))
analysisActionJDialogLayout!!.setVerticalGroup(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(analysisActionJDialogLayout!!.createSequentialGroup()!!.add(titleJLabel)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(minJLabel)!!.add(colorRangeJLabel)!!.add(maxJLabel))!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)!!.add(redJLabel)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(minRedJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.add(maxRedJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)!!.add(greenJLabel)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(minGreenJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.add(maxGreenJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)!!.add(blueJLabel)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(minBlueJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.add(maxBlueJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))!!.add(16, 16, 16)!!.add(okJButton)!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
getContentPane()!!.setLayout(java.awt.GridLayout(1, 0))
jPanel1!!.setLayout(java.awt.GridLayout(1, 0))
getContentPane()!!.add(jPanel1)
fileJMenu!!.setText("File")
fileJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fileJMenuActionPerformed(evt)
}

                                }
                            )
openImageJMenuItem!!.setText("Open")
openImageJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
openImageJMenuItemActionPerformed(evt)
}

                                }
                            )
fileJMenu!!.add(openImageJMenuItem)
mainJMenuBar!!.add(fileJMenu)
processingJMenu!!.setText("Processing")
processingJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
processingJMenuActionPerformed(evt)
}

                                }
                            )
analyzeJMenuItem!!.setText("Image Analyze")
analyzeJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
analyzeJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(analyzeJMenuItem)
generateMirrorSpriteMenuItem!!.setText("Mirror Sprite Generator")
generateMirrorSpriteMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
generateMirrorSpriteMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateMirrorSpriteMenuItem)
generateRotationSpriteJMenuItem!!.setText("Rotation Sprite Generator")
generateRotationSpriteJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
generateRotationSpriteJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateRotationSpriteJMenuItem)
generateSpriteSplitterMenuItem!!.setText("Sprite Splitter Generator")
generateSpriteSplitterMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
generateSpriteSplitterMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateSpriteSplitterMenuItem)
generateRotationMenuItem!!.setText("Rotate Image Generator")
generateRotationMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
generateRotationMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateRotationMenuItem)
createStripImageJMenuItem!!.setText("Multi Image Unifier")
createStripImageJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
createStripImageJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(createStripImageJMenuItem)
mirrorJMenuItem!!.setText("Mirror Image(s)")
mirrorJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
mirrorJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(mirrorJMenuItem)
scaleImagesJMenuItem!!.setText("Scale Image(s)")
scaleImagesJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
scaleImagesJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(scaleImagesJMenuItem)
canvasImagesJMenuItem!!.setText("Canvas Image(s)")
canvasImagesJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
canvasImagesJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(canvasImagesJMenuItem)
mainJMenuBar!!.add(processingJMenu)
setJMenuBar(mainJMenuBar)
pack()
}


    open fun createStripImageJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var imageUnifierJPanel: ImageUnifierJPanel = ImageUnifierJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(imageUnifierJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= imageUnifierJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "createStripImageJMenuItemActionPerformed", e)
}

}


    open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "okJButtonActionPerformed")

    var imageAnalysisResultsArray: Array<ImageAnalysisResults?> = ImageAnalysis.getInstance()!!.process(imageProcessorInput!!.getBufferedImageArray(), this.getColorRangeInterface())!!

this.jPanel1!!.removeAll()
this.jPanel1!!.add(ImageAnalysisResultsJPanel(imageAnalysisResultsArray))
this.jPanel1!!.updateUI()
this.analysisActionJDialog!!.setVisible(false)
imageProcessorInputCompositeInterface= 
                                        null
                                    
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "okJButtonActionPerformed", e)
}

}


    open fun processingJMenuActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun openImageJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "openImageJMenuItemActionPerformed")
fileJDialog!!.setVisible(true)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "openImageJMenuItemActionPerformed", e)
}

}


    open fun onFiles(files: Array<File?>)
        //nullable = true from not(false or (false and false)) = true
{
var files = files

        try {
            logUtil!!.put("Reading " +files.size +" files.", this, "onFiles")
Arrays.sort(files, object: Comparator<File>()
                                {
                                
    override fun compare(file1: File, file2: File)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var file1 = file1
    //var file2 = file2

    var fileNameIndexValue1: Int = extractIndexNumberIfAnyFromFileName(file1.getName())!!


    var fileNameIndexValue2: Int = extractIndexNumberIfAnyFromFileName(file2.getName())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileNameIndexValue1 -fileNameIndexValue2
}

    open override fun extractIndexNumberIfAnyFromFileName(name: String)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var name = name

    var i: Int = 0


        try {
            
    var start: Int = name.lastIndexOf('_') +1


    var end: Int = name.lastIndexOf('.')!!


    var number: String = name.substring(start, end)!!

i= Integer.parseInt(number)
} catch(e: Exception)
            {
i= 0
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}

                                }
                            )

    var bufferedImageArray: Array<BufferedImage?> = arrayOfNulls(files.size)





                        for (index in 0 until files.size)

        {
bufferedImageArray[index]= ImageIO.read(files[index]!!)

    
                        if(bufferedImageArray[index] == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Unable to read file: " +files[index]!!.getPath())

                                    }
                                
}

this.imageProcessorInput= ImageProcessorInput(files, bufferedImageArray)
this.fileJDialog!!.setVisible(false)

    
                        if(imageProcessorInputCompositeInterface != 
                                    null
                                )
                        
                                    {
                                    imageProcessorInputCompositeInterface!!.setImageProcessorInput(this.imageProcessorInput)

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "onFiles", e)
}

}


    open fun fileJMenuActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun analyzeJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "analyzeJMenuItemActionPerformed")
this.analysisActionJDialog!!.setVisible(true)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "analyzeJMenuItemActionPerformed", e)
}

}


    open fun generateRotationSpriteJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "generateRotationSpriteJMenuItemActionPerformed")

    var spriteImageJPanel: RotationSpriteImageJPanel = RotationSpriteImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(spriteImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= spriteImageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateRotationSpriteJMenuItemActionPerformed", e)
}

}


    open fun generateSpriteSplitterMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "generateRotationSpriteJMenuItemActionPerformed")

    var imageJPanel: SpriteSplitterImageJPanel = SpriteSplitterImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(imageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= imageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateRotationMenuItemActionPerformed", e)
}

}


    open fun generateRotationMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "generateRotationSpriteJMenuItemActionPerformed")

    var rotationImageJPanel: RotationImageJPanel = RotationImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(rotationImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= rotationImageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateRotationMenuItemActionPerformed", e)
}

}


    open fun scaleImagesJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put(this.commonStrings!!.START, this, "scaleImagesJMenuItemActionPerformed")

    var resizeImageJPanel: ResizeImageJPanel = ResizeImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(resizeImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= resizeImageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "scaleImagesJMenuItemActionPerformed", e)
}

}


    open fun canvasImagesJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put(this.commonStrings!!.START, this, "canvasImagesJMenuItemActionPerformed")

    var resizeImageJPanel: CanvasImageJPanel = CanvasImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(resizeImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= resizeImageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "scaleImagesJMenuItemActionPerformed", e)
}

}


    open fun generateMirrorSpriteMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "generateMirrorSpriteJMenuItemActionPerformed")

    var spriteImageJPanel: MirrorSpriteImageJPanel = MirrorSpriteImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(spriteImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= spriteImageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateMirrorSpriteJMenuItemActionPerformed", e)
}

}


    open fun mirrorJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            logUtil!!.put("Starting", this, "generateMirrorJMenuItemActionPerformed")

    var mirrorImageJPanel: MirrorImageJPanel = MirrorImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(mirrorImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= mirrorImageJPanel
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateMirrorJMenuItemActionPerformed", e)
}

}


    open fun getColorRangeInterface()
        //nullable = true from not(false or (false and true)) = true
: ColorRangeInterface{

    var colorRangeInterface: ColorRangeInterface = ColorRange() as ColorRangeInterface

colorRangeInterface!!.setMinRed(Integer(this.getMinRedJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMaxRed(Integer(this.getMaxRedJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMinGreen(Integer(this.getMinGreenJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMaxGreen(Integer(this.getMaxGreenJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMinBlue(Integer(this.getMinBlueJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMaxBlue(Integer(this.getMaxBlueJTextField()!!.getText()).
                            toInt())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorRangeInterface
}


    open fun getMaxBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxBlueJTextField
}


    open fun setMaxBlueJTextField(maxBlueJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var maxBlueJTextField = maxBlueJTextField
this.maxBlueJTextField= maxBlueJTextField
}


    open fun getMaxGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxGreenJTextField
}


    open fun setMaxGreenJTextField(maxGreenJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var maxGreenJTextField = maxGreenJTextField
this.maxGreenJTextField= maxGreenJTextField
}


    open fun getMaxRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxRedJTextField
}


    open fun setMaxRedJTextField(maxRedJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var maxRedJTextField = maxRedJTextField
this.maxRedJTextField= maxRedJTextField
}


    open fun getMinBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minBlueJTextField
}


    open fun setMinBlueJTextField(minBlueJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var minBlueJTextField = minBlueJTextField
this.minBlueJTextField= minBlueJTextField
}


    open fun getMinGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minGreenJTextField
}


    open fun setMinGreenJTextField(minGreenJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var minGreenJTextField = minGreenJTextField
this.minGreenJTextField= minGreenJTextField
}


    open fun getMinRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minRedJTextField
}


    open fun setMinRedJTextField(minRedJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var minRedJTextField = minRedJTextField
this.minRedJTextField= minRedJTextField
}


    private var analysisActionJDialog: javax.swing.JDialog

    private var analyzeJMenuItem: javax.swing.JMenuItem

    private var blueJLabel: javax.swing.JLabel

    private var colorRangeJLabel: javax.swing.JLabel

    private var createStripImageJMenuItem: javax.swing.JMenuItem

    private var fileJMenu: javax.swing.JMenu

    private var generateSpriteSplitterMenuItem: javax.swing.JMenuItem

    private var generateRotationMenuItem: javax.swing.JMenuItem

    private var generateMirrorSpriteMenuItem: javax.swing.JMenuItem

    private var generateRotationSpriteJMenuItem: javax.swing.JMenuItem

    private var greenJLabel: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var mainJMenuBar: javax.swing.JMenuBar

    private var maxBlueJTextField: javax.swing.JTextField

    private var maxGreenJTextField: javax.swing.JTextField

    private var maxJLabel: javax.swing.JLabel

    private var maxRedJTextField: javax.swing.JTextField

    private var minBlueJTextField: javax.swing.JTextField

    private var minGreenJTextField: javax.swing.JTextField

    private var minJLabel: javax.swing.JLabel

    private var minRedJTextField: javax.swing.JTextField

    private var mirrorJMenuItem: javax.swing.JMenuItem

    private var okJButton: javax.swing.JButton

    private var openImageJMenuItem: javax.swing.JMenuItem

    private var processingJMenu: javax.swing.JMenu

    private var redJLabel: javax.swing.JLabel

    private var scaleImagesJMenuItem: javax.swing.JMenuItem

    private var canvasImagesJMenuItem: javax.swing.JMenuItem

    private var titleJLabel: javax.swing.JLabel

}
                
            

