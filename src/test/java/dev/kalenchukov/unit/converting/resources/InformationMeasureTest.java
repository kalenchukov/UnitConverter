/*
 * Copyright © 2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.unit.converting.resources;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки констант и методов перечисления {@link InformationMeasure}.
 */
public class InformationMeasureTest
{
	/**
	 * Проверка метода {@link InformationMeasure#getStandard()}.
	 */
	@Test
	public void getStandard()
	{
		assertArrayEquals(
			List.of(Standard.IEC, Standard.SI).toArray(),
			InformationMeasure.BYTE.getStandard().toArray()
		);
	}

	/**
	 * Проверка метода {@link InformationMeasure#getCountMinUnit()}.
	 */
	@Test
	public void getCountMinUnit()
	{
		assertEquals(BigDecimal.valueOf(8), InformationMeasure.BYTE.getCountMinUnit());
	}

	/**
	 * Проверка метода {@link InformationMeasure#getMin()}.
	 */
	@Test
	public void testGetMin()
	{
		assertEquals(InformationMeasure.BIT, InformationMeasure.getMin());
	}

	/**
	 * Проверка метода {@link InformationMeasure#getMax()}.
	 */
	@Test
	public void testGetMax()
	{
		assertEquals(InformationMeasure.YOBIBYTE, InformationMeasure.getMax());
	}

	/**
	 * Проверка метода {@link InformationMeasure#getMin(Standard)}.
	 */
	@Test
	public void testGetMinStandard()
	{
		assertEquals(InformationMeasure.BIT, InformationMeasure.getMin(Standard.IEC));
	}

	/**
	 * Проверка метода {@link InformationMeasure#getMax(Standard)}.
	 */
	@Test
	public void testGetMaxStandard()
	{
		assertEquals(InformationMeasure.YOBIBYTE, InformationMeasure.getMax(Standard.IEC));
	}
}