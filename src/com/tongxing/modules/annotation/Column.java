package com.tongxing.modules.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface Column {
	/** 数据库列名，如果不写则用字段名 */
	String value() default "";
	
	/** 插入操作时是否将该值插入（多用于inserttime字段） */
	boolean insertable() default true;
}
