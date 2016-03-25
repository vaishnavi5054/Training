package com.techarrows.training.mr;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashSet;

/**
 * Reducer class for inverted index. Joins all unique words in input files and emit below key//value pair
 *
 * <ul>
 *     <li>word</li>
 *     <li>Comma separated list of all file names</li>
 * </ul>
 */
public class InvertedIndexReducer extends Reducer<Text, Text, Text, Text> {

    private Text fileNames = new Text();

    @Override
    public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

        // using set to filter duplicates
        HashSet<String> uniqueFileNames = new HashSet<String>();
        for (Text fileName : values) {
            uniqueFileNames.add(fileName.toString());
        }
        // makes list of file names as concatenated string of file names
        fileNames.set(new Text(StringUtils.join(uniqueFileNames, ",")));
        context.write(key, fileNames);
    }
}