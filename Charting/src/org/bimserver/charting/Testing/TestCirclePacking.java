package org.bimserver.charting.Testing;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

import org.bimserver.charting.Charts.Packing;
import org.bimserver.charting.ColorScales.LinearColorScale;

public class TestCirclePacking extends BaseChartTest {

	public static void main(String[] args) {
		//
		getMusicData(rawData);
		//
		Packing chart = new Packing();
		chart.setDimensionLookupKeys("hierarchy", Arrays.asList("B", "A"));
		chart.setDimensionLookupKey("size", "C");
		chart.setDimensionLookupKey("color", "C");
		//chart.setDimensionLookupKey("label", "C");
		chart.setOption("Diameter", 700);
		chart.setOption("Padding", 5);
		chart.setOption("Show Labels", true);
		chart.setOption("Color Scale", new LinearColorScale());
		// Save chart.
		chart.saveToSVGInUserDirectory(rawData, "test.svg");
		// Print data.
		System.out.println(chart.getRawTextDataSet(rawData));
	}

	public static void getMusicData(ArrayList<LinkedHashMap<String, Object>> rawData) {
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1980);
				put("B", "8-track");
				put("C", 14.3);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1981);
				put("B", "8-track");
				put("C", 7.9);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1982);
				put("B", "8-track");
				put("C", 1.0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1980);
				put("B", "Cassete");
				put("C", 19.1);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1981);
				put("B", "Cassete");
				put("C", 26.7);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1982);
				put("B", "Cassete");
				put("C", 38.2);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1980);
				put("B", "CD");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1981);
				put("B", "CD");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1982);
				put("B", "CD");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1980);
				put("B", "CD single");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1981);
				put("B", "CD single");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1982);
				put("B", "CD single");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1980);
				put("B", "Download Album");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1981);
				put("B", "Download Album");
				put("C", 0);
			}
		});
		rawData.add(new LinkedHashMap<String, Object>() {
			{
				put("A", 1982);
				put("B", "Download Album");
				put("C", 0);
			}
		});
	}
}