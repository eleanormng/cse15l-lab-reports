# Lab Report 3 - Testing Commands

Hello! I'll be testing some ways to use the command `find`.

## Option #1: `-name`

*Example 1:*
```
$ find . -name *-6708-*.txt
./biomed/1468-6708-3-1.txt
./biomed/1468-6708-3-10.txt
./biomed/1468-6708-3-3.txt 
./biomed/1468-6708-3-4.txt 
./biomed/1468-6708-3-7.txt
```

*Example 2:*
```
$ find -name *report*.txt
./government/About_LSC/commission_report.txt
./government/About_LSC/Progress_report.txt
./government/About_LSC/reporting_system.txt
./government/About_LSC/Special_report_to_congress.txt
./government/About_LSC/Strategic_report.txt
```

Using the `-name` option will look for files that match the expression that I entered, so it will print .txt files found in `./technical` and it subdirectories that have "-6708-" in its name. This is useful for searching in multiple subdirectories for files by their name.

*Source: [Computer Hope](https://www.computerhope.com/unix/ufind.htm)*

***

## Option #2: `-iname`

*Example 1:*
```
$ find . -iname *violence*.txt
./government/Media/Domestic_violence_aid.txt
./government/Media/Domestic_Violence_Ruling.txt
./government/Media/Targeting_Domestic_Violence.txt
```

*Example 2:*
```
$ find -iname *report*.txt
./government/About_LSC/commission_report.txt
./government/About_LSC/Progress_report.txt
./government/About_LSC/reporting_system.txt
./government/About_LSC/Special_report_to_congress.txt
./government/About_LSC/State_Planning_Report.txt
./government/About_LSC/State_Planning_Special_Report.txt
./government/About_LSC/Strategic_report.txt
./government/Post_Rate_Comm/ReportToCongress2002WEB.txt
```

Using the `-iname` option will look for files that match the expression, but the "i" means that it will have case-insensitive matches. This is useful for locating files with a mix of lower- and upper-cases in their names.

*Source: [Computer Hope](https://www.computerhope.com/unix/ufind.htm)*

***

## Option #3: `-size`

*Example 1:*
```
$ find -size -100c
.
./911report
./biomed
./government
./government/About_LSC
./government/Alcohol_Problems
./government/Env_Prot_Agen
./government/Gen_Account_Office
./government/Media
./government/Post_Rate_Comm
./plos
```

*Example 2:*
```
$ find -size +300k -ls
281474977028942    304 -rw-r--r--   1 Eleanor  197121     307735 Apr 27 12:13 ./government/Gen_Account_Office/d01591sp.txt
281474977028930    308 -rw-r--r--   1 Eleanor  197121     312125 Apr 27 12:13 ./government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
```

Using the `-size` option with an expression that consists of either "+" or "-" combined with *n* units and a suffix that that specifies the space on the disk, and adding -ls at the end will specify the sizes of these files. This command is useful for finding files of certain sizes, and also identifying what your largest files are.

*Source: [Computer Hope](https://www.computerhope.com/unix/ufind.htm)*

***

## Option #4: `-cmin`

*Example 1:*
```
$ touch 911report/chapter-1.txt
$ find -cmin 1
./911report/chapter-1.txt
```

*Example 2:*
```
$ touch 911report/chapter-2.txt
$ find -cmin -5
./911report/chapter-1.txt
./911report/chapter-2.txt
```

Using the `-cmin` option followed by a number *n* will return the names of files that were changed in the last *n* minutes. This is useful for when you want to keep track of your recently modified files.

*Source: [Computer Hope](https://www.computerhope.com/unix/ufind.htm)*