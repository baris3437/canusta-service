package com.canusta.canusta.web.mapper;

import com.canusta.canusta.service.entity.ListOptions;
import com.canusta.canusta.web.bean.ListOptionsBean;

public class ListOptionsMapper {
	public static ListOptions controllerBeanToServiceBean(ListOptionsBean input) {
		ListOptions out = new ListOptions();

		if (input != null) {
			out.setOrderByFieldNum(input.getOrderByFieldNum());
			out.setScrollAmount(input.getScrollAmount());
			out.setScrollType(input.getScrollType());
			out.setSortOption(input.getSortOption());
		}

		return out;
	}

	public static ListOptionsBean serviceBeanToControllerBean(ListOptions input) {
		ListOptionsBean out = new ListOptionsBean();

		out.setOrderByFieldNum(input.getOrderByFieldNum());
		out.setScrollAmount(input.getScrollAmount());
		out.setScrollType(input.getScrollType());
		out.setSortOption(input.getSortOption());

		return out;
	}
}
