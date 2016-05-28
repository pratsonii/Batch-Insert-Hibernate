package com.example;

import java.util.Collection;


public interface IProjectCustomdao {

	public <T> Collection<T> bulkSave(Collection<T> entities);
}
