package com.perevillega

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime, Mode.Throughput))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class JMHTest {

  /**
   * This sample test (to get familiar with jmh) tries to compare performance of
   * for comprehension vs their equivalent map/flatMap constructs
   */

  private val testValue = Some("test")
  private val testValue2 = Some("test2")
  private val condition = testValue.get.size > 1

  @Benchmark
  def case1_For: Unit = for (x <- testValue) yield x.toUpperCase()

  @Benchmark
  def case1_Map: Unit = testValue.map(_.toUpperCase())

  @Benchmark
  def case2_For: Unit = for (x <- testValue if condition) yield x.toUpperCase()

  @Benchmark
  def case2_Map: Unit = testValue.filter(_.size > 1) map (_.toUpperCase())

}
