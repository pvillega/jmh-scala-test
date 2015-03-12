#!/usr/bin/env bash

# runs jmh with 20 warm-up iterations, measuring 20 iterations, forking the jvm (to avoid benchmark impact) and using only 1 thread
activator run  -wi 20 -i 20 -f1 -t1 .*
