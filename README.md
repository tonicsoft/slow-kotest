This project demostrates the slow start
time for simple kotest unit tests.

the collect-timings.sh script runs a test using
first junit, then kotest, to compare the results.

The script must be run multiple times to ensure that
all compilation is cached by gradle and the timings
refer only to the test run time.

The same behavior can also be observed by eye using
Intellij IDEA IDE GUI test running features.