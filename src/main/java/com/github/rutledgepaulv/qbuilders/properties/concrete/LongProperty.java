/*
 *
 *  *  com.github.rutledgepaulv.qbuilders.properties.concrete.LongProperty
 *  *  *
 *  *  * Copyright (C) 2016 Paul Rutledge <paul.v.rutledge@gmail.com>
 *  *  *
 *  *  * This software may be modified and distributed under the terms
 *  *  * of the MIT license.  See the LICENSE file for details.
 *  *
 *
 */

package com.github.rutledgepaulv.qbuilders.properties.concrete;

import com.github.rutledgepaulv.qbuilders.builders.QBuilder;
import com.github.rutledgepaulv.qbuilders.properties.virtual.NumberProperty;

/**
 * A property view for fields with {@link Long} values.
 *
 * @param <T> The type of the final builder.
 */
public interface LongProperty<T extends QBuilder<T>> extends NumberProperty<T, Long> {}
