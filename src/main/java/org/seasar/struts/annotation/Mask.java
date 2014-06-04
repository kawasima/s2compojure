/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.struts.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 正規表現に一致するどうかを指定するためのアノテーションです。
 *
 * @author higa
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Validator("mask")
public @interface Mask {

    /**
     * 正規表現です。
     *
     */
    String mask();

    /**
     * メッセージです。
     *
     */
    Msg msg() default @Msg(key = "errors.invalid");

    /**
     * メッセージの最初の引数です。
     *
     */
    Arg arg0() default @Arg(key = "");

    /**
     * メッセージの引数の配列です。
     *
     */
    Arg[] args() default {};

    /**
     * 検証の対象となるメソッド名を指定します。 複数ある場合はカンマで区切ります。
     *
     */
    String target() default "";
}
