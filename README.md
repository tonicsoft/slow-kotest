This project demostrates the slow start
time for simple kotest unit tests.

the collect-timings.sh script runs a test using
first junit, then kotest, to compare the results.

The script must be run multiple times to ensure that
all compilation is cached by gradle and the timings
refer only to the test run time.

The same behavior can also be observed by eye using
Intellij IDEA IDE GUI test running features.

--------------------------

# Update July 2022

The above issue was raised here: 
https://github.com/kotest/kotest/issues/2765
which led to two new features implemented in KoTest 5.1:

  https://github.com/kotest/kotest/issues/2766
  https://github.com/kotest/kotest/issues/2767

Together, these address the slow test startup issue when using the command
line, and therefore 2765 is now closed. This can be verified by running the tests
in this project (with kotest version now updated) and seeing that the kotest time is
faster when the scanning is disabled (although it's still much slower than junit)

However, when using the GUI-triggered test running
capability in Intellij provided by the Kotest plugin, the issue
remains. This appears to be because system properties
specified in the gradle configuration are not respected
when running the test from the IDE.

To reproduce, open this project in Intellij, and install the KoTest plugin.
That will allow you to run the Kotest test by clicking in the left bar next to the
line number where the test is defined. You can also use Shift+F10 while the cursor
is within the test. You will see that the test still has a long delay of around 4 seconds,
vs 2-3 seconds when the test is run from the command line.
