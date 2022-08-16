# java-comparator-api

<ol>
	
  <li>public abstract int compare(T, T); <br><br></li>
  <li>public abstract boolean equals(java.lang.Object); <br><br></li>
  <li>public java.util.Comparator<T> reversed(); <br><br></li>
  <li>public java.util.Comparator<T> thenComparing(java.util.Comparator<? super T>); <br><br></li>
  <li>public <U> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U>, java.util.Comparator<? super U>); <br><br></li>
  <li>public <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U>); <br><br></li>
  <li>public java.util.Comparator<T> thenComparingInt(java.util.function.ToIntFunction<? super T>); <br><br></li>
  <li>public java.util.Comparator<T> thenComparingLong(java.util.function.ToLongFunction<? super T>); <br><br></li>
  <li>public java.util.Comparator<T> thenComparingDouble(java.util.function.ToDoubleFunction<? super T>); <br><br></li>
  <li>public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder(); <br><br></li>
  <li>public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder(); <br><br></li>
  <li>public static <T> java.util.Comparator<T> nullsFirst(java.util.Comparator<? super T>); <br><br></li>
  <li>public static <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T>); <br><br></li>
  <li>public static <T, U> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U>, java.util.Comparator<? super U>); <br><br></li>
  <li>public static <T, U extends java.lang.Comparable<? super U>> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U>); <br><br></li>
  <li>public static <T> java.util.Comparator<T> comparingInt(java.util.function.ToIntFunction<? super T>); <br><br></li>
  <li>public static <T> java.util.Comparator<T> comparingLong(java.util.function.ToLongFunction<? super T>); <br><br></li>
  <li>public static <T> java.util.Comparator<T> comparingDouble(java.util.function.ToDoubleFunction<? super T>); <br><br></li>
</ol>
