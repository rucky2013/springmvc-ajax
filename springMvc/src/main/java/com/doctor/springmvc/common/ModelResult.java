package com.doctor.springmvc.common;

/**
 * @author doctor
 *
 * @time 2015年9月27日 下午1:58:26
 */
public class ModelResult<T> extends BaseResult {

	private static final long serialVersionUID = 1L;

	private T model;

	public ModelResult() {
		super();
	}

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

}
