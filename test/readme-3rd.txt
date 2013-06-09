On week #5 we wrote most of our code and tests to implement the desired test parser.

In order to do this, first we had to:

-discuss the main flow of code
  --We decided that, in order to parse the csv list of strings we needed to 
  1) read file to memory
  2) parse by line break 
  3) parse by comma
  4) with the file parsed and in memory we would have the ability to manipulate it, like say it is a nielsen file, sum all column 3 numbers and get a total for that column
-how to break the file and what to parse: Slurp function
-created a test methods and write code to parse lines on \r\n : done
-stubbed out the final functions to parse csv from strings and wrote the code : done
-stuck on mapping each array of strings to parseCommas function (how do we loop, how to get the parsed strings and transform to an array ): To be done on Week 6

Next steps
-figure out how to loop over strings  
-work on larger files 
-finalize the source code and talk brainstorm ideas for next project