package com.techarrows.training.hwmr2;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class WCFileMap extends Mapper<LongWritable, Text, Text, IntWritable> {

	private Text fileName;
	private Text word = new Text();
	private final static IntWritable one = new IntWritable(1);

	
	public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
		String fileNameString = ((FileSplit) context.getInputSplit()).getPath().getName();
		fileName = new Text(fileNameString);
		StringTokenizer token = new StringTokenizer(value.toString());
		while (token.hasMoreTokens()) {
			word.set(token.nextToken());
			context.write(word, one);
		}
	}

}
