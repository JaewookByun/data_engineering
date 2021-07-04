package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample32 {

	public static void main(String[] args) {
		String str = "A sequence of elements supporting sequential and parallel aggregateoperations. The following example illustrates an aggregate operation using Stream and IntStream: \r\n"
				+ "int sum = widgets.stream()\r\n" + "                      .filter(w -> w.getColor() == RED)\r\n"
				+ "                      .mapToInt(w -> w.getWeight())\r\n" + "                      .sum();\r\n"
				+ "In this example, widgets is a Collection<Widget>. We createa stream of Widget objects via Collection.stream(),filter it to produce a stream containing only the red widgets, and thentransform it into a stream of int values representing the weight ofeach red widget. Then this stream is summed to produce a total weight. \r\n"
				+ "In addition to Stream, which is a stream of object references,there are primitive specializations for IntStream, LongStream,and DoubleStream, all of which are referred to as \"streams\" andconform to the characteristics and restrictions described here. \r\n"
				+ "\r\n"
				+ "To perform a computation, stream operations are composed into a stream pipeline. A stream pipeline consists of a source (whichmight be an array, a collection, a generator function, an I/O channel,etc), zero or more intermediate operations (which transform astream into another stream, such as Stream.filter(Predicate)), and a terminal operation (which produces a result or side-effect, suchas Stream.count() or Stream.forEach(Consumer)).Streams are lazy; computation on the source data is only performed when theterminal operation is initiated, and source elements are consumed onlyas needed. \r\n"
				+ "\r\n"
				+ "A stream implementation is permitted significant latitude in optimizingthe computation of the result. For example, a stream implementation is freeto elide operations (or entire stages) from a stream pipeline -- andtherefore elide invocation of behavioral parameters -- if it can prove thatit would not affect the result of the computation. This means thatside-effects of behavioral parameters may not always be executed and shouldnot be relied upon, unless otherwise specified (such as by the terminaloperations forEach and forEachOrdered). (For a specificexample of such an optimization, see the API note documented on the count operation. For more detail, see the side-effects section of thestream package documentation.) \r\n"
				+ "\r\n"
				+ "Collections and streams, while bearing some superficial similarities,have different goals. Collections are primarily concerned with the efficientmanagement of, and access to, their elements. By contrast, streams do notprovide a means to directly access or manipulate their elements, and areinstead concerned with declaratively describing their source and thecomputational operations which will be performed in aggregate on that source.However, if the provided stream operations do not offer the desiredfunctionality, the iterator() and spliterator() operationscan be used to perform a controlled traversal. \r\n"
				+ "\r\n"
				+ "A stream pipeline, like the \"widgets\" example above, can be viewed asa query on the stream source. Unless the source was explicitlydesigned for concurrent modification (such as a ConcurrentHashMap),unpredictable or erroneous behavior may result from modifying the streamsource while it is being queried. \r\n"
				+ "\r\n"
				+ "Most stream operations accept parameters that describe user-specifiedbehavior, such as the lambda expression w -> w.getWeight() passed to mapToInt in the example above. To preserve correct behavior,these behavioral parameters: \r\n"
				+ "•must be non-interfering(they do not modify the stream source); and\r\n"
				+ "•in most cases must be stateless(their result should not depend on any state that might change during executionof the stream pipeline).\r\n"
				+ "\r\n"
				+ "Such parameters are always instances of a functional interface suchas java.util.function.Function, and are often lambda expressions ormethod references. Unless otherwise specified these parameters must be non-null. \r\n"
				+ "\r\n"
				+ "A stream should be operated on (invoking an intermediate or terminal streamoperation) only once. This rules out, for example, \"forked\" streams, wherethe same source feeds two or more pipelines, or multiple traversals of thesame stream. A stream implementation may throw IllegalStateExceptionif it detects that the stream is being reused. However, since some streamoperations may return their receiver rather than a new stream object, it maynot be possible to detect reuse in all cases. \r\n"
				+ "\r\n"
				+ "Streams have a close() method and implement AutoCloseable.Operating on a stream after it has been closed will throw IllegalStateException.Most stream instances do not actually need to be closed after use, as theyare backed by collections, arrays, or generating functions, which require nospecial resource management. Generally, only streams whose source is an IO channel,such as those returned by Files.lines(Path), will require closing. If astream does require closing, it must be opened as a resource within a try-with-resourcesstatement or similar control structure to ensure that it is closed promptly after itsoperations have completed. \r\n"
				+ "\r\n"
				+ "Stream pipelines may execute either sequentially or in parallel. Thisexecution mode is a property of the stream. Streams are createdwith an initial choice of sequential or parallel execution. (For example, Collection.stream() creates a sequential stream,and Collection.parallelStream() createsa parallel one.) This choice of execution mode may be modified by the sequential() or parallel() methods, and may be queried withthe isParallel() method.\r\n"
				+ "Type Parameters:<T> the type of the stream elementsSince:1.8See Also:IntStreamLongStreamDoubleStreamjava.util.stream";
		Stream<String> s = Stream.of(str);

		s = s.flatMap(e -> Arrays.stream(e.split("\\s")));
		HashMap<String, Integer> wordCount = s.collect(Collectors.toMap(new Function<String, String>() {
			@Override
			public String apply(String t) {
				return t;
			}
		}, new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return 1;
			}
		}, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		}, HashMap<String, Integer>::new));

		wordCount.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
