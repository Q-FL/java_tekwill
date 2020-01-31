@FunctionalInterface
public interface PredicateValidator<T> {
	boolean test(T t);
}