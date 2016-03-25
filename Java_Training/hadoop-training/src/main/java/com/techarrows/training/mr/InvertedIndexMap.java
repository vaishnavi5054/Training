package com.techarrows.training.mr;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;

/**
 * Mapper class for inverted index. Emits below details as key/value pair
 *
 * <ul>
 *     <li>word</li>
 *     <li>Originating file name</li>
 * </ul>
 */
public class InvertedIndexMap extends Mapper<LongWritable, Text, Text, Text> {

    private Text fileName;
    private Text word = new Text();

    @Override
    protected void setup(Context context) {
        // captures input file name
        String fileNameString = ((FileSplit) context.getInputSplit()).getPath().getName();
        fileName = new Text(fileNameString);
    }

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        // splits string with whitespace as separator
        for (String token : StringUtils.split(value.toString())) {
            word.set(token);
            // writes name/value pair
            context.write(word, fileName);
        }
    }
}