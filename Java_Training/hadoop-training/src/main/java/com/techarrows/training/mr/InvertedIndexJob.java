package com.techarrows.training.mr;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
import java.util.HashSet;

/**
 * Driver class that runs map/reduce job.
 */
public class InvertedIndexJob {

  /**
   * Main entry point to launch job.
   *
   * @param args command line arguments
   * @throws Exception
   */
  public static void main(final String[] args) throws Exception {
      // captures HDFS path where input files located from command line parameters
      Path inputPath = new Path(args[0]);

      // captured HDFS output path where results be stored from command line parameters
      Path outputPath = new Path(args[1]);

      // Creates job object
      Configuration conf = new Configuration();
      Job job = Job.getInstance(conf, "Inverted Index");

      // sets jar by class - tells map reduce engine to identify right jar based on supplied class
      job.setJarByClass(InvertedIndexJob.class);
      // Mapper
      job.setMapperClass(InvertedIndexMap.class);
      // Reducer
      job.setReducerClass(InvertedIndexReducer.class);

      // map output key/value pair
      job.setMapOutputKeyClass(Text.class);
      job.setMapOutputValueClass(Text.class);

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
