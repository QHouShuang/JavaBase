// Noninstantiable utility class
package ef.main.java.org.effectivejava.examples.chapter02.item04;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	// 改类不能被实例化 私有构造方法
	private UtilityClass() {
		throw new AssertionError();
	}
}
