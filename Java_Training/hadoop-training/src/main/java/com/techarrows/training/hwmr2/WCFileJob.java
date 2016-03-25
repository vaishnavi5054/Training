package com.techarrows.training.hwmr2;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.techarrows.training.hwmr.WordCountJob;
import com.techarrows.training.hwmr.WordCountMap;
import com.techarrows.training.hwmr.WordCountReducer;
import com.techarrows.training.hwmr2.WCFileJob;
import com.techarrows.training.hwmr2.WCFileMap;
import com.techarrows.training.hwmr2.WCFileReducer;

public class WCFileJob {
	public static void main(final String[] args) throws Exception {
	      // captures HDFS path where input files located from command line parameters
	      Path inputPath = new Path(args[0]);

	      // captured HDFS output path where results be stored from command line parameters
	      Path outputPath = new Path(args[1]);

	      // Creates job object
	      Configuration conf = new Configuration();
	      Job job = Job.getInstance(conf, "Word Count");

	      // sets jar by class - tells map reduce engine to identify right jar based on supplied class
	      job.setJarByClass(WCFileJob.class);
	      // Mapper
	      job.setMapperClass(WCFileMap.class);
	      // Reducer
	      job.setReducerClass(WCFileReducer.class);

	      // map output key/value pair
	      job.setMapOutputKeyClass(LongWritable.class);
	      job.setMapOutputValueClass(IntWritable.class);

	      // sets HDFS input directory path
	      FileInputFormat.setInputPaths(job, inputPath);

	      // sets HDFS output directory path
	      FileOutputFormat.setOutputPath(job, outputPath);

	      // Wait for job tio complete - Main thread blocks until job completes
	      if (job.waitForCompletion(true)) {
	          System.out.println("Job completed successfully !!!");
	      }
	  }

}
