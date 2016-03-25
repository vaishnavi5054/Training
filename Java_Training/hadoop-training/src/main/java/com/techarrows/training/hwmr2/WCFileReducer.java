package com.techarrows.training.hwmr2;

import java.io.IOException;

import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class WCFileReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	private MultipleOutputs<Text, IntWritable> multipleOutputs;
	private IntWritable totalWordCount = new IntWritable();
	

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		int sum = 0;
		Iterator<IntWritable> iterator = values.iterator();

		while (iterator.hasNext()) {
			sum += iterator.next().get();
		}

		totalWordCount.set(sum);
		// context.write(key, new IntWritable(sum));
		//context.write(key, totalWordCount);
		multipleOutputs.write(key, totalWordCount, generateFileName(key,totalWordCount ));
	}
	
	String generateFileName(Text key, IntWritable value){
		return key.toString() + "_" + value.toString();		
	}

	
	}
