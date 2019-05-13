/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 * DATA:  Repository Behaviour Interface
 */

package by.epam.soundstudio.repository;

import by.epam.soundstudio.specification.Specification;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public interface Repository<T> {

    boolean add(T entity);

    boolean remove(T entity);

    boolean removeAll();

    Optional<T> update(T entity);

    List<T> query(Specification<T> specification);

    List<T> sorted(Comparator<T> comparator);

    Optional<T> findOne(Comparator<T> comparator);

    <R> Optional<R> sum(Specification<T> specification, Function<T, R> function, BinaryOperator<R> aggregator);

    long count(Specification<T> specification);
}

