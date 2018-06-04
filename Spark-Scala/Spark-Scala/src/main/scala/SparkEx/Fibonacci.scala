package SparkEx

object Fibonacci extends App {
var pre = 0
var curr = 1
println("previous="+pre)
println("current="+curr)
var res = 0
print("Enter a number to calcluate Fibonacci series ")
val num = readInt()
for(e <- 2 to num ) {
  res = pre + curr
  println(res)
  pre = curr
  curr = res
}
}