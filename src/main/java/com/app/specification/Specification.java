package com.app.specification;

public interface Specification<T> {

    public boolean isSatisfiedBy(T t);
    public Specification<T> and(Specification<T> specification);
}
