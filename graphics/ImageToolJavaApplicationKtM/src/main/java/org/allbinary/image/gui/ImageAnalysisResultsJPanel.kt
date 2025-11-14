
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.image.analysis.ImageAnalysisResults
import org.allbinary.media.image.analysis.ImageColorRangeResults
import org.allbinary.media.image.analysis.ImageColorResults
import org.allbinary.string.CommonPhoneStrings

open public class ImageAnalysisResultsJPanel : javax.swing.JPanel {
        
public constructor (imageAnalysisResultsArray: Array<ImageAnalysisResults?>){
    //var imageAnalysisResultsArray = imageAnalysisResultsArray
initComponents()

    var imageAnalysisResults: ImageAnalysisResults = imageAnalysisResultsArray[0]!!

this.updateImageColorRangeResults(imageAnalysisResults)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
jLabel1= javax.swing.JLabel()
jLabel2= javax.swing.JLabel()
jLabel3= javax.swing.JLabel()
percentMatchingJTextField= javax.swing.JTextField()
totalPixelsJTextField= javax.swing.JTextField()
matchingPixelsJTextField= javax.swing.JTextField()
jComboBox1= javax.swing.JComboBox()
jLabel4= javax.swing.JLabel()
jLabel5= javax.swing.JLabel()
jLabel6= javax.swing.JLabel()
jLabel7= javax.swing.JLabel()
avgRedJTextField= javax.swing.JTextField()
avgGreenJTextField= javax.swing.JTextField()
avgBlueJTextField= javax.swing.JTextField()
minGreenJTextField= javax.swing.JTextField()
jLabel8= javax.swing.JLabel()
jLabel9= javax.swing.JLabel()
jLabel10= javax.swing.JLabel()
minRedJTextField= javax.swing.JTextField()
minBlueJTextField= javax.swing.JTextField()
jLabel11= javax.swing.JLabel()
jLabel12= javax.swing.JLabel()
jLabel13= javax.swing.JLabel()
maxRedJTextField= javax.swing.JTextField()
maxGreenJTextField= javax.swing.JTextField()
maxBlueJTextField= javax.swing.JTextField()
jLabel1!!.setText("Matching Pixels:")
jLabel2!!.setText("Total Pixels:")
jLabel3!!.setText("Percent Matching:")
percentMatchingJTextField!!.setEditable(false)
totalPixelsJTextField!!.setEditable(false)
matchingPixelsJTextField!!.setEditable(false)
jComboBox1!!.setModel(javax.swing.DefaultComboBoxModel(arrayOf(CommonPhoneStrings.getInstance()!!.ONE)))
jComboBox1!!.setEnabled(false)
jLabel4!!.setText("Image:")
jLabel5!!.setText("Average Red:")
jLabel6!!.setText("Average Green:")
jLabel7!!.setText("Average Blue:")
avgRedJTextField!!.setEditable(false)
avgGreenJTextField!!.setEditable(false)
avgBlueJTextField!!.setEditable(false)
minGreenJTextField!!.setEditable(false)
jLabel8!!.setText("Min Red:")
jLabel9!!.setText("Min Green:")
jLabel10!!.setText("Min Blue:")
minRedJTextField!!.setEditable(false)
minBlueJTextField!!.setEditable(false)
jLabel11!!.setText("Max Red:")
jLabel12!!.setText("Max Green:")
jLabel13!!.setText("Max Blue:")
maxRedJTextField!!.setEditable(false)
maxGreenJTextField!!.setEditable(false)
maxBlueJTextField!!.setEditable(false)

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel3)!!.addComponent(jLabel2)!!.addComponent(jLabel1)!!.addComponent(jLabel5)!!.addComponent(jLabel6)!!.addComponent(jLabel7)!!.addComponent(jLabel4))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(avgBlueJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgGreenJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgRedJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(totalPixelsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(percentMatchingJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(matchingPixelsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel12)!!.addComponent(jLabel13)!!.addComponent(jLabel8)!!.addComponent(jLabel9)!!.addComponent(jLabel10)!!.addComponent(jLabel11))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(minRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(minGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(minBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addContainerGap(18, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel4)!!.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(matchingPixelsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel8)!!.addComponent(minRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(totalPixelsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel9)!!.addComponent(minGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(percentMatchingJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel10)!!.addComponent(minBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(avgRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel11)!!.addComponent(maxRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(avgGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel12))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel7)!!.addComponent(avgBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel13)!!.addComponent(maxBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
}


    open fun updateImageColorRangeResults(imageAnalysisResults: ImageAnalysisResults)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageAnalysisResults = imageAnalysisResults

    var imageColorRangeResults: ImageColorRangeResults = imageAnalysisResults!!.getImageColorRangeResults()!!

this.matchingPixelsJTextField!!.setText(imageColorRangeResults!!.getMatchingPixelsChecked() as Long.
                            toString())
this.totalPixelsJTextField!!.setText(imageColorRangeResults!!.getTotalPixelsChecked() as Long.
                            toString())
this.percentMatchingJTextField!!.setText(Float(imageColorRangeResults!!.getPercent()).
                            toString())

    var imageColorResults: ImageColorResults = imageAnalysisResults!!.getImageColorResults()!!

this.avgRedJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgRed()).
                            toString())
this.avgGreenJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgGreen()).
                            toString())
this.avgBlueJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgBlue()).
                            toString())
this.minRedJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMinRed() as Long.
                            toString())
this.minGreenJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMinGreen() as Long.
                            toString())
this.minBlueJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMinBlue() as Long.
                            toString())
this.maxRedJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMaxRed() as Long.
                            toString())
this.maxGreenJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMaxGreen() as Long.
                            toString())
this.maxBlueJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMaxBlue() as Long.
                            toString())
}


    private var avgBlueJTextField: javax.swing.JTextField

    private var avgGreenJTextField: javax.swing.JTextField

    private var avgRedJTextField: javax.swing.JTextField

    private var jComboBox1: javax.swing.JComboBox

    private var jLabel1: javax.swing.JLabel

    private var jLabel10: javax.swing.JLabel

    private var jLabel11: javax.swing.JLabel

    private var jLabel12: javax.swing.JLabel

    private var jLabel13: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jLabel4: javax.swing.JLabel

    private var jLabel5: javax.swing.JLabel

    private var jLabel6: javax.swing.JLabel

    private var jLabel7: javax.swing.JLabel

    private var jLabel8: javax.swing.JLabel

    private var jLabel9: javax.swing.JLabel

    private var matchingPixelsJTextField: javax.swing.JTextField

    private var maxBlueJTextField: javax.swing.JTextField

    private var maxGreenJTextField: javax.swing.JTextField

    private var maxRedJTextField: javax.swing.JTextField

    private var minBlueJTextField: javax.swing.JTextField

    private var minGreenJTextField: javax.swing.JTextField

    private var minRedJTextField: javax.swing.JTextField

    private var percentMatchingJTextField: javax.swing.JTextField

    private var totalPixelsJTextField: javax.swing.JTextField

}
                
            

